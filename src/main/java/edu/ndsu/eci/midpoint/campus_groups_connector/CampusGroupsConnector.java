/*
 * Copyright (c) 2026 North Dakota State University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.ndsu.eci.midpoint.campus_groups_connector;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.NamedValue;
import org.apache.axis2.kernel.http.HTTPConstants;
import org.identityconnectors.common.CollectionUtil;
import org.identityconnectors.framework.common.exceptions.ConnectionFailedException;
import org.identityconnectors.framework.common.exceptions.ConnectorException;
import org.identityconnectors.framework.common.exceptions.UnknownUidException;
import org.identityconnectors.framework.common.objects.Attribute;
import org.identityconnectors.framework.common.objects.AttributeInfoBuilder;
import org.identityconnectors.framework.common.objects.AttributesAccessor;
import org.identityconnectors.framework.common.objects.ConnectorObject;
import org.identityconnectors.framework.common.objects.ConnectorObjectBuilder;
import org.identityconnectors.framework.common.objects.Name;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.ObjectClassInfoBuilder;
import org.identityconnectors.framework.common.objects.OperationOptions;
import org.identityconnectors.framework.common.objects.ResultsHandler;
import org.identityconnectors.framework.common.objects.Schema;
import org.identityconnectors.framework.common.objects.SchemaBuilder;
import org.identityconnectors.framework.common.objects.Uid;
import org.identityconnectors.framework.common.objects.filter.EqualsFilter;
import org.identityconnectors.framework.common.objects.filter.Filter;
import org.identityconnectors.framework.common.objects.filter.FilterTranslator;
import org.identityconnectors.framework.spi.Configuration;
import org.identityconnectors.framework.spi.ConnectorClass;
import org.identityconnectors.framework.spi.PoolableConnector;
import org.identityconnectors.framework.spi.operations.CreateOp;
import org.identityconnectors.framework.spi.operations.DeleteOp;
import org.identityconnectors.framework.spi.operations.SchemaOp;
import org.identityconnectors.framework.spi.operations.SearchOp;
import org.identityconnectors.framework.spi.operations.TestOp;
import org.identityconnectors.framework.spi.operations.UpdateOp;

import edu.ndsu.eci.midpoint.campus_groups_connector.rss.User;
import edu.ndsu.eci.midpoint.campus_groups_connector.stub.CampusGroupsStub;

@ConnectorClass(displayNameKey = "campusgroups.connector.display", configurationClass = CampusGroupsConfiguration.class)
public class CampusGroupsConnector implements PoolableConnector, TestOp, SchemaOp, SearchOp<Filter>, CreateOp, UpdateOp, DeleteOp {

  private static final String CLEAR_VALUE_STRING = "[[CLEAR]]";
  // values used in the update API, RSS is camelCase
  private static final String FIRST = "first_name";
  private static final String LAST = "last_name";
  private static final String ACCOUNT_TYPE = "account_type_lookup";
  private static final String NETID = "netid";
  private static final String NETID2 = "netid2";
  private static final String NETID3 = "netid3";
  private static final String RFID = "rfid";
  // no idea why this is camel case in update API
  private static final String SWIPE_ID = "swipeId";

  // from RSS and matches that attribute format
  private static final String CREATED = "createdOn";
  private static final String LAST_UPDATED = "lastUpdatedOn";

  private CampusGroupsConfiguration configuration;
  private UserRSSService rssService;

  @Override
  public Configuration getConfiguration() {
    return configuration;
  }

  @Override
  public void init(Configuration configuration) {
    this.configuration = (CampusGroupsConfiguration) configuration;
    rssService = new UserRSSService((CampusGroupsConfiguration) configuration);
  }

  @Override
  public Schema schema() {
    ObjectClassInfoBuilder objectClassBuilder = new ObjectClassInfoBuilder();
    objectClassBuilder.setType("campusGroupsAccount");

    // effectively remote system id
    AttributeInfoBuilder uidAib = new AttributeInfoBuilder(Uid.NAME);
    uidAib.setNativeName("cg_id");
    uidAib.setRequired(true);
    uidAib.setCreateable(false);
    uidAib.setUpdateable(false);
    objectClassBuilder.addAttributeInfo(uidAib.build());

    // email is require to create, so make it the Name.NAME
    AttributeInfoBuilder emailAib = new AttributeInfoBuilder(Name.NAME);
    emailAib.setNativeName("email");
    emailAib.setRequired(true);
    objectClassBuilder.addAttributeInfo(emailAib.build());

    
    objectClassBuilder.addAttributeInfo(AttributeInfoBuilder.define(NETID).build());
    objectClassBuilder.addAttributeInfo(AttributeInfoBuilder.define(FIRST).setRequired(true).build());
    objectClassBuilder.addAttributeInfo(AttributeInfoBuilder.define(LAST).setRequired(true).build());
    objectClassBuilder.addAttributeInfo(AttributeInfoBuilder.define(NETID2).setUpdateable(false).build());
    objectClassBuilder.addAttributeInfo(AttributeInfoBuilder.define(NETID3).setUpdateable(false).build());
    objectClassBuilder.addAttributeInfo(AttributeInfoBuilder.define(ACCOUNT_TYPE).setRequired(true).build());
    objectClassBuilder.addAttributeInfo(AttributeInfoBuilder.define(CREATED).setUpdateable(false).setCreateable(false).build());
    objectClassBuilder.addAttributeInfo(AttributeInfoBuilder.define(LAST_UPDATED).setUpdateable(false).setCreateable(false).build());
    objectClassBuilder.addAttributeInfo(AttributeInfoBuilder.define(RFID).build());
    objectClassBuilder.addAttributeInfo(AttributeInfoBuilder.define(SWIPE_ID).build());
    
    SchemaBuilder schemaBuilder = new SchemaBuilder(CampusGroupsConnector.class);
    schemaBuilder.defineObjectClass(objectClassBuilder.build());
    return schemaBuilder.build();
  }

  @Override
  public void dispose() {
    // TODO Auto-generated method stub

  }

  @Override
  public Uid update(ObjectClass objectClass, Uid uid, Set<Attribute> replaceAttributes, OperationOptions options) {
    CampusGroupsStub.CreateUpdateUser user = new CampusGroupsStub.CreateUpdateUser();
    user.setCg_id(uid.getUidValue());
    // otherwise will disable, and this system uses the delete path to disable
    user.setAccount_status(1);
    
    // blanking out requires setting the value to [[CLEAR]]
    AttributesAccessor accessor = new AttributesAccessor(replaceAttributes);
    
    if (accessor.getName() != null) {
      user.setEmail(accessor.getName().getNameValue());
    }
    
    if (accessor.hasAttribute(FIRST)) {
      user.setFirst_name(accessor.findString(FIRST));
    }
    
    if (accessor.hasAttribute(LAST)) {
      user.setLast_name(accessor.findString(LAST));
    }
    
    if (accessor.hasAttribute(NETID)) {
      if (accessor.findString(NETID) == null) {
        user.setNetid(CLEAR_VALUE_STRING);
      } else {
        user.setNetid(accessor.findString(NETID));
      }
    }
    
    if (accessor.hasAttribute(NETID2)) {
      user.setNetid2(accessor.findString(NETID2));
    }
    
    if (accessor.hasAttribute(NETID3)) {
      user.setNetid3(accessor.findString(NETID3));
    }
    
    if (accessor.hasAttribute(ACCOUNT_TYPE)) {
      user.setAccount_type_lookup(accessor.findString(ACCOUNT_TYPE));
    }
    
    // blanking out requires setting the value to [[CLEAR]]
    if (accessor.hasAttribute(RFID)) {
      if (accessor.findString(RFID) == null) {
        user.setRfid(CLEAR_VALUE_STRING);
      } else {
        user.setRfid(accessor.findString(RFID));
      }
    }
    
    if (accessor.hasAttribute(SWIPE_ID)) {
      if (accessor.findString(SWIPE_ID) == null) {
        user.setSwipeId(CLEAR_VALUE_STRING);
      } else {
        user.setSwipeId(accessor.findString(SWIPE_ID));
      }
    }
    
    CampusGroupsStub.CreateUpdateUserResponse response = sendUserChange(user);
    

    
    return uid;
  }

  @Override
  public Uid create(ObjectClass objectClass, Set<Attribute> attrs, OperationOptions options) {
    CampusGroupsStub.CreateUpdateUser user = new CampusGroupsStub.CreateUpdateUser();
    AttributesAccessor accessor = new AttributesAccessor(attrs);
    user.setNetid(accessor.findString(NETID));
    user.setNetid2(accessor.findString(NETID2));
    user.setNetid3(accessor.findString(NETID3));
    user.setEmail(accessor.getName().getNameValue());
    user.setFirst_name(accessor.findString(FIRST));
    user.setLast_name(accessor.findString(LAST));
    user.setPreferred_email("Email");
    user.setRfid(accessor.findString(RFID));
    user.setSwipeId(accessor.findString(SWIPE_ID));
    // will reactivate users if they have been disabled.
    // since this system will ignore deactivated users when reading all users, this is required
    user.setCheck_existing_deactivated_users_if_needed("1");
    // required otherwise will create deactivated
    user.setAccount_status(1);
    user.setAccount_type_lookup(accessor.findString(ACCOUNT_TYPE));
    CampusGroupsStub.CreateUpdateUserResponse response = sendUserChange(user);
    
    return new Uid(String.valueOf(response.getCreateUpdateUserResult().getCg_id()));
  }

  private CampusGroupsStub.CreateUpdateUserResponse sendUserChange(CampusGroupsStub.CreateUpdateUser user) {
    // shared across all users in our system
    user.setSchool(configuration.getSchool());
    configuration.getApiKey().access(chars -> user.setApi_key(new String(chars)));
    
    // NOT THREAD SAFE, so has to be here
    CampusGroupsStub stub;
    try {
      stub = new CampusGroupsStub("https://" + configuration.getDomain() + "/WebServices/campusgroups.asmx");
    } catch (AxisFault e) {
      // need a better exception handling here, but really have no idea what can trigger this
      throw new ConnectionFailedException(e);
    }
    ServiceClient client = stub._getServiceClient();
    Options opts = client.getOptions();

    List<NamedValue> headers = new ArrayList<>();
    
    configuration.getApiSecret().access(chars -> headers.add(new NamedValue("X-CG-API-Secret", new String(chars))));
    headers.add(new NamedValue("X-CG-School", configuration.getSchool()));
    opts.setProperty(HTTPConstants.HTTP_HEADERS, headers);
    CampusGroupsStub.CreateUpdateUserResponse response;
    try {
      response = stub.createUpdateUser(user);
    } catch (RemoteException e) {
      // these are all connection exceptions
      throw new ConnectionFailedException(e);
    }
    
    // 0 failure, 1 success, 2 partial success
    // TODO probably move 2 over to an error, but can't do that right now as we can't update netid2,
    // which causes our entire system to break. So can't throw error on that.
    if (response.getCreateUpdateUserResult().getMessage_code() == 0) {
      if (response.getCreateUpdateUserResult().getMessage().contains("No user found")) {
        throw new UnknownUidException(response.getCreateUpdateUserResult().getMessage());
      }
      throw new ConnectorException(response.getCreateUpdateUserResult().getMessage());
    }
    
    return response;
  }

  @Override
  public FilterTranslator<Filter> createFilterTranslator(ObjectClass objectClass, OperationOptions options) {
    return new FilterTranslator<Filter>() {
      public List<Filter> translate(Filter filter) {
          return CollectionUtil.newList(filter);
      }
    };
  }

  @Override
  public void executeQuery(ObjectClass objectClass, Filter query, ResultsHandler handler, OperationOptions options) {
    if (query instanceof EqualsFilter && ((EqualsFilter) query).getAttribute() instanceof Uid) {
      // get one user using the search mechanism. don't search for disabled accounts because that could make things odd
      User user = rssService.getUserByCgId(((Uid)((EqualsFilter)query).getAttribute()).getUidValue());
      if (user == null) {
        return;
      }
      
      handler.handle(convertUserToConnectorObject(user));
      
      return;
    }

    // get all of the users;
    for (User user : rssService.getAllActiveUsers()) {
      handler.handle(convertUserToConnectorObject(user));
    }
    
    
  }



  @Override
  public void test() {
    rssService = new UserRSSService((CampusGroupsConfiguration) configuration);
    // will only test secret, not key and school, those two require a writable change
    // will throw exception if url and secret aren't correct
    // picking an id that doesn't exist to make it quick, as actual user doesn't matter
    // so also ignoring return result
    rssService.getUserByCgId("1");    
  }

  @Override
  public void checkAlive() {
    // from poolable, noop as there isn't any persistent connection
  }

  @Override
  public void delete(ObjectClass objectClass, Uid uid, OperationOptions options) {
    CampusGroupsStub.CreateUpdateUser user = new CampusGroupsStub.CreateUpdateUser();
    user.setCg_id(uid.getUidValue());
    user.setAccount_status(0);
    
    sendUserChange(user);    
  }

  private ConnectorObject convertUserToConnectorObject(User user) {
    return new ConnectorObjectBuilder()
        .setUid(user.getCgId())
        .setName(user.getEmail())
        .addAttribute(FIRST, user.getFirstName())
        .addAttribute(LAST, user.getLastName())
        .addAttribute(NETID, user.getNetId())
        .addAttribute(NETID2, user.getNetId2())
        .addAttribute(NETID3, user.getNetId3())
        .addAttribute(RFID, user.getRfid())
        .addAttribute(SWIPE_ID, user.getSwipeId())
        .addAttribute(ACCOUNT_TYPE, user.getAccountType())
        .addAttribute(CREATED, user.getCreatedOn())
        .addAttribute(LAST_UPDATED, user.getLastUpdatedOn())
        .build();
  }
  
}
