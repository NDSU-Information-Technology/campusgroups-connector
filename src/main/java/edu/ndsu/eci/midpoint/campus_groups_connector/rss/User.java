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
package edu.ndsu.eci.midpoint.campus_groups_connector.rss;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

  private String cgId;
  private String firstName;
  private String lastName;
  private String email;
  private int deactivated;
  private String netId;
  private String netId2;
  private String netId3;
  private String createdOn;
  private String lastUpdatedOn;
  private String accountType;
  private String rfid;
  private String swipeId;
  
  

  public String getRfid() {
    return rfid;
  }
  public void setRfid(String rfid) {
    this.rfid = rfid;
  }
  public String getSwipeId() {
    return swipeId;
  }
  public void setSwipeId(String swipeId) {
    this.swipeId = swipeId;
  }
  public String getAccountType() {
    return accountType;
  }
  public void setAccountType(String accountType) {
    this.accountType = "".equals(accountType) ? null : accountType;;
  }
  public String getNetId3() {
    return netId3;
  }
  public void setNetId3(String netId3) {
    this.netId3 = "".equals(netId3) ? null : netId3;;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = "".equals(lastName) ? null : lastName;;
  }
  public int getDeactivated() {
    return deactivated;
  }
  public void setDeactivated(int deactivated) {
    this.deactivated = deactivated;
  }
  public String getNetId() {
    return netId;
  }
  public void setNetId(String netId) {
    this.netId = "".equals(netId) ? null : netId;;
  }
  public String getNetId2() {
    return netId2;
  }
  public void setNetId2(String netId2) {
    this.netId2 = "".equals(netId2) ? null : netId2;;
  }
  public String getCreatedOn() {
    return createdOn;
  }
  public void setCreatedOn(String createdOn) {
    this.createdOn = "".equals(createdOn) ? null : createdOn;;
  }
  public String getLastUpdatedOn() {
    return lastUpdatedOn;
  }
  public void setLastUpdatedOn(String lastUpdatedOn) {
    this.lastUpdatedOn = "".equals(lastUpdatedOn) ? null : lastUpdatedOn;;
  }
  public String getCgId() {
    return cgId;
  }
  public void setCgId(String cgId) {
    this.cgId = "".equals(cgId) ? null : cgId;;
  }
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = "".equals(firstName) ? null : firstName;;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = "".equals(email) ? null : email;;
  }
  
  
}
