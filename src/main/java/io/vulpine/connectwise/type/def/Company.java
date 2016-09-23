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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.company.Address;
import io.vulpine.connectwise.util.Field;

import java.util.List;

public interface Company extends ConnectwiseSerializable
{
  @JsonGetter( "AccountNumber" )
  String accountNumber();

  @JsonIgnore
  Field< String > accountNumberField();

  @JsonSetter( "AccountNumber" )
  Company accountNumber( String accountNumber );

  @JsonGetter( "Addresses" )
  List < Address > getAddresses();

  @JsonSetter( "Addresses" )
  Company setAddresses( List < Address > addresses );

  @JsonGetter( "CompanyIdentifier" )
  String getCompanyIdentifier();

  Field < String > companyIdentifierField();

  @JsonSetter( "CompanyIdentifier" )
  Company setCompanyIdentifier( String companyIdentifier );

  @JsonGetter( "CompanyName" )
  String getCompanyName();

  @JsonSetter( "CompanyName" )
  Company setCompanyName( String companyName );

  @JsonGetter( "DefaultAddress" )
  Address defaultAddress();

  @JsonIgnore
  Field < Address > defaultAddressField();

  @JsonSetter( "DefaultAddress" )
  Company defaultAddress( Address defaultAddress );

  @JsonGetter( "DefaultBillingContactId" )
  Integer getDefaultBillingContactId();

  @JsonSetter( "DefaultBillingContactId" )
  Company setDefaultBillingContactId( Integer defaultBillingContactId );

  @JsonGetter( "DefaultContactId" )
  Integer getDefaultContactId();

  @JsonSetter( "DefaultContactId" )
  Company setDefaultContactId( Integer defaultContactId );

  @JsonGetter( "FaxNumber" )
  String getFaxNumber();

  @JsonSetter( "FaxNumber" )
  Company setFaxNumber( String faxNumber );

  @JsonGetter( "Market" )
  String getMarket();

  @JsonSetter( "Market" )
  Company setMarket( String market );

  @JsonGetter( "PhoneNumber" )
  String getPhoneNumber();

  @JsonSetter( "PhoneNumber" )
  Company setPhoneNumber( String phoneNumber );

  @JsonGetter( "Status" )
  String status();

  Field < String > statusField();

  @JsonSetter( "Status" )
  Company status( String status );

  @JsonGetter( "Territory" )
  String getTerritory();

  @JsonSetter( "Territory" )
  Company setTerritory( String territory );

  @JsonGetter( "Type" )
  String getType();

  Field < String > typeField();

  @JsonSetter( "Type" )
  Company type( String type );

  @JsonGetter( "WebSite" )
  String webSite();

  Field < String > webSiteField();

  @JsonSetter( "WebSite" )
  Company setWebSite( String webSite );

  @JsonIgnore
  Field < Boolean > inactiveField();

  @JsonSetter( "InactiveFlag" )
  Company inactive( Boolean inactive );

  @JsonGetter( "InactiveFlag" )
  Boolean inactive();

}
