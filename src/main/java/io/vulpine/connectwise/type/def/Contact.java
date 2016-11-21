/*
 * Copyright 2016 Elizabeth Harper
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.vulpine.connectwise.type.def;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.def.gen.*;

import java.util.Date;
import java.util.List;

public interface Contact
  extends
  HasId,
  HasCompanyIdentifier,
  HasType,
  HasUpdatedBy,
  HasLastUpdated,
  HasInactive
{
  @JsonGetter( "FirstName" )
  String firstName();

  @JsonSetter( "FirstName" )
  Contact firstName( final String s );

  @JsonGetter( "LastName" )
  String lastName();

  @JsonSetter( "LastName" )
  Contact lastName( final String s );

  @JsonGetter( "Email" )
  String email();

  @JsonSetter( "Email" )
  Contact email( final String s );

  @JsonGetter( "SID" )
  String sid();

  @JsonSetter( "SID" )
  Contact sid( final String s );

  @JsonGetter( "ManagerId" )
  Integer managerId();

  @JsonSetter( "ManagerId" )
  Contact managerId( final Integer s );

  @JsonGetter( "AssistantId" )
  Integer assistantId();

  @JsonSetter( "AssistantId" )
  Contact assistantId( final Integer s );

  @JsonGetter( "Relationship" )
  String relationship();

  @JsonSetter( "Relationship" )
  Contact relationship( final String s );

  @JsonGetter( "Phone" )
  String phone();

  @JsonSetter( "Phone" )
  Contact phone( final String s );

  @JsonGetter( "PhoneExt" )
  String phoneExt();

  @JsonSetter( "PhoneExt" )
  Contact phoneExt( final String s );

  @JsonGetter( "Fax" )
  String fax();

  @JsonSetter( "Fax" )
  Contact fax( final String s );

  @JsonGetter( "FaxExt" )
  String faxExt();

  @JsonSetter( "FaxExt" )
  Contact faxExt( final String s );

  @JsonGetter( "Title" )
  String title();

  @JsonSetter( "Title" )
  Contact title( final String s );

  @JsonGetter( "School" )
  String school();

  @JsonSetter( "School" )
  Contact school( final String s );

  @JsonGetter( "NickName" )
  String nickName();

  @JsonSetter( "NickName" )
  Contact nickName( final String s );

  @JsonGetter( "Married" )
  Boolean married();

  @JsonSetter( "Married" )
  Contact married( final Boolean s );

  @JsonGetter( "Children" )
  Boolean children();

  @JsonSetter( "Children" )
  Contact children( final Boolean s );

  @JsonGetter( "SignificantOther" )
  String significantOther();

  @JsonSetter( "SignificantOther" )
  Contact significantOther( final String s );

  @JsonGetter( "PortalPassword" )
  String portalPassword();

  @JsonSetter( "PortalPassword" )
  Contact portalPassword( final String s );

  @JsonGetter( "PortalSecurityLevel" )
  Short portalSecurityLevel();

  @JsonSetter( "PortalSecurityLevel" )
  Contact portalSecurityLevel( final Short s );

  @JsonGetter( "DisablePortalLogin" )
  Boolean disablePortalLogin();

  @JsonSetter( "DisablePortalLogin" )
  Contact disablePortalLogin( final Boolean s );

  @JsonGetter( "UnsubscribeFlag" )
  Boolean unsubscribeFlag();

  @JsonSetter( "UnsubscribeFlag" )
  Contact unsubscribeFlag( final Boolean s );

  @JsonGetter( "PersonalAddressFlag" )
  Boolean personalAddressFlag();

  @JsonSetter( "PersonalAddressFlag" )
  Contact personalAddressFlag( final Boolean s );

  @JsonGetter( "Gender" )
  String gender();

  @JsonSetter( "Gender" )
  Contact gender( final String s );

  @JsonGetter( "PersonalAddress" )
  Address personalAddress();

  @JsonSetter( "PersonalAddress" )
  Contact personalAddress( final Address a );

  @JsonGetter( "CompanyAddressInfo" )
  CompanyAddressInfo companyAddressInfo();

  @JsonSetter( "CompanyAddressInfo" )
  Contact companyAddressInfo( final CompanyAddressInfo c );

  @JsonGetter( "Phones" )
  List < ContactCommunicationItem > phones();

  @JsonSetter( "Phones" )
  Contact phones( final List < ContactCommunicationItem > l );

  @JsonGetter( "Emails" )
  List < ContactCommunicationItem > emails();

  @JsonSetter( "Emails" )
  Contact emails( final List < ContactCommunicationItem > l );

  @JsonGetter( "Faxes" )
  List < ContactCommunicationItem > faxes();

  @JsonSetter( "Faxes" )
  Contact faxes( List < ContactCommunicationItem > l );

  @JsonGetter( "BirthDay" )
  Date birthDay();

  @JsonSetter( "BirthDay" )
  Contact birthDay( final Date d );

  @JsonGetter( "Anniversary" )
  Date anniversary();

  @JsonSetter( "Anniversary" )
  Contact anniversary( final Date d );

  @JsonGetter( "AddressId" )
  Integer addressId();

  @JsonSetter( "AddressId" )
  Contact addressId( final Integer s );

  @JsonGetter( "SiteName" )
  String siteName();

  @JsonSetter( "SiteName" )
  Contact siteName( final String s );
}
