<!--
Copyright (c) 2026 North Dakota State University

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
-->
# Campus Groups connector for ConnID and midPoint

## Overview

Connector for Ready Education's [CampusGroups](https://www.readyeducation.com/campusgroups/) using ConnId. This is provided as-is.

Copyright 2026 North Dakota State University and released under the Apache License, Version 2.0.

Used by NDSU to manage CampusGroups. For support see a midPoint support organization like Unicon. Pull requests welcome.

Deployed on midPoint 4.10. 

## Assumptions

This is setup to operate in the way required by NDSU. If that doesn't work for your institution, pull requests to add functionality are welcome. 

It is not possible to fully delete a user in CampusGroups. So once created, they will always exist in the system. To allow for cleanup in this connector, only active users are returned by the search methods. This connector will reactivate users on "create" if they are deactivated. See API documentation for all of the matching paths and how it aligns to your populated identifiers. And immediate deactivate with easy reactivate means no delayed delete needed. This all also means that administrative status isn't supported.

Sets preferred email to the email value being passed in by this connector, rather than a user changeable field. If employees are in the system, open records requests probably apply. So limiting to campus controlled email.

For anything controlled by the connector, it needs to be set as a "Read-Only Field" or "Hidden Fields" under Field Permissions. Otherwise API won't allow for updating the value.

While there isn't an API throttle, it is recommended to use shadow caching to remove need for remote reads during other operations.

## Limitations

NetId2 and NetId3 can't be changed due to limitation in vendor's API. 

# Setup

Needs API access to both CreateUpdateUser and RSSUsers.

## Configuration

<table>
  <tr>
    <th>Key</th>
    <th>Value</th>
  </tr>
  <tr>
    <td>apiKey</td>
    <td>API Key value from platform</td>
  </tr>
  <tr>
    <td>apiSecret</td>
    <td>API Secret value from platform</td>
  </tr>
  <tr>
    <td>domain</td>
    <td>API domain</td>
  </tr>
  <tr>
    <td>school</td>
    <td>School value to set for the user and for the X-CG-API-Secret header</td>
  </tr>
</table>

## Schema
<table>
  <tr>
    <th>Attribute</th>
    <th>Type</th>
    <th>Comment</th>
  </tr>
  <tr>
    <td>first_name</td>
    <td>String</td>
    <td>First name. Required</td>
  </tr>
  <tr>
    <td>last_name</td>
    <td>String</td>
    <td>Last name. Required</td>
  </tr>
  <tr>
    <td>email</td>
    <td>String</td>
    <td>__NAME__ Required</td>
  </tr>
  <tr>
    <td>cg_id</td>
    <td>String</td>
    <td>__UID__</td>
  </tr>
  <tr>
    <td>netid</td>
    <td>String</td>
    <td>Mutable unique ID. Can be used to match for reactivation.</td>
  </tr>
  <tr>
    <td>netid2</td>
    <td>String</td>
    <td>Immutable unique ID. Can be used to match for reactivation.</td>
  </tr>
  <tr>
    <td>netid3</td>
    <td>String</td>
    <td>Immutable unique ID. Can be used to match for reactivation.</td>
  </tr>  
  <tr>
    <td>rfid</td>
    <td>String</td>
    <td>RFID from campus card</td>
  </tr>
   <tr>
    <td>swipeId</td>
    <td>String</td>
    <td>Magstripe from campus card</td>
  </tr>
   <tr>
    <td>account_type_lookup</td>
    <td>String</td>
    <td>String value from the account type set of values. Required.</td>
  </tr>
  <tr>
    <td>createdOn</td>
    <td>String</td>
    <td>Creation time</td>
  </tr>
  <tr>
    <td>lastUpdatedOn</td>
    <td>String</td>
    <td>Last updated time</td>
  </tr>
</table>
