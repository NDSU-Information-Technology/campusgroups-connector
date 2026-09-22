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

import org.identityconnectors.common.logging.Log;
import org.identityconnectors.common.security.GuardedString;
import org.identityconnectors.framework.common.exceptions.ConfigurationException;
import org.identityconnectors.framework.spi.AbstractConfiguration;
import org.identityconnectors.framework.spi.ConfigurationProperty;

public class CampusGroupsConfiguration extends AbstractConfiguration {
  private static final Log LOG = Log.getLog(CampusGroupsConfiguration.class);

  private String domain;
  private String school;
  private GuardedString apiSecret;
  private GuardedString apiKey;
  
  @Override
  public void validate() {
    if (domain == null) {
      LOG.error("URL can't be blank");
      throw new ConfigurationException("URL can't be blank");
    }
    if (school == null) {
      LOG.error("School can't be blank");
      throw new ConfigurationException("School can't be blank");
    }
    if (apiSecret == null) {
      LOG.error("Secret can't be blank");
      throw new ConfigurationException("Secret can't be blank");
    }
    
    if (apiKey == null) {
      LOG.error("Key can't be blank");
      throw new ConfigurationException("Key can't be blank");
    }
  }

  @ConfigurationProperty(displayMessageKey = "campusGroups.config.api.domain")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  @ConfigurationProperty(displayMessageKey = "campusGroups.config.api.school")
  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  @ConfigurationProperty(displayMessageKey = "campusGroups.config.api.secret")
  public GuardedString getApiSecret() {
    return apiSecret;
  }

  public void setApiSecret(GuardedString apiSecret) {
    this.apiSecret = apiSecret;
  }

  @ConfigurationProperty(displayMessageKey = "campusGroups.config.api.key")
  public GuardedString getApiKey() {
    return apiKey;
  }

  public void setApiKey(GuardedString apiKey) {
    this.apiKey = apiKey;
  }
  
  

}
