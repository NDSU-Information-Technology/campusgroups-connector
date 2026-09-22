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

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.ClassicHttpRequest;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.support.ClassicRequestBuilder;
import org.apache.hc.core5.http.message.BasicHeader;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.identityconnectors.framework.common.exceptions.ConnectionFailedException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import edu.ndsu.eci.midpoint.campus_groups_connector.rss.User;
import edu.ndsu.eci.midpoint.campus_groups_connector.rss.Rss;

public class UserRSSService {

  private CloseableHttpClient httpClient;
  private CampusGroupsConfiguration configuration;
  private XmlMapper mapper = new XmlMapper();
  
  
  public UserRSSService(CampusGroupsConfiguration configuration) {
    this.configuration = configuration;
    
    HttpClientBuilder builder = HttpClientBuilder.create();
    configuration.getApiSecret().access(chars -> builder.setDefaultHeaders(Arrays.asList(new BasicHeader("X-CG-API-Secret", new String(chars)))));

    // thread safe
    httpClient = builder.build();
  }
  
  public User getUserByEmail(String email) {
    Rss result = sendRequest(new BasicNameValuePair("email", email));
    
    if (result.getChannel().getItems() == null) {
      return null;
    }
    
    if (result.getChannel().getItems().size() > 1) {
      // NO IDEA
    }
    
    return result.getChannel().getItems().get(0);
  }

  public User getUserByCgId(String cgId) {
    Rss result = sendRequest(new BasicNameValuePair("cg_id", cgId));
    
    if (result.getChannel().getItems() == null) {
      return null;
    }
    
    if (result.getChannel().getItems().size() > 1) {
      // NO IDEA
    }
    
    return result.getChannel().getItems().get(0);
  }
  
  public List<User> getAllActiveUsers() {
    Rss rss = sendRequest(null);
    
    return rss.getChannel().getItems();
  }
  
  private Rss sendRequest(NameValuePair query) {
    ClassicRequestBuilder getBuilder = ClassicRequestBuilder.get("https://" + configuration.getDomain() + "/rss_users").addParameter(new BasicNameValuePair("include_deleted", "0")); 
    if (query != null) {
      getBuilder.addParameter(query);
    }
    
    ClassicHttpRequest get = getBuilder.build();
    String xml;
    try {
      xml = httpClient.execute(get, response -> {
        HttpEntity entity = response.getEntity();
        String body = EntityUtils.toString(entity);
        EntityUtils.consume(entity);
        return body;
      });
    } catch (IOException e) {
      throw new ConnectionFailedException(e);
    }
    
    Rss rss;
    try {
      rss = mapper.readValue(xml, Rss.class);
    } catch (JsonProcessingException e) {
      // it will only fail to parse if we get nonsense back from the remote side, which can happen if creds are wrong on setup
      throw new ConnectionFailedException("Failed to parse: " + xml, e);
    }
    
    if (rss.getChannel() == null) {
      // only will happen if we get valid XML, but nonsense back from remote, like say a cloudflare HTML page
      throw new ConnectionFailedException("Failed to get RSS from: " + xml);
    }
    
    return rss;
  }
  
}
