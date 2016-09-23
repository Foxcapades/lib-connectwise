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
  String companyIdentifier();

  @JsonIgnore
  Field < String > companyIdentifierField();

  @JsonSetter( "CompanyIdentifier" )
  Company companyIdentifier( String companyIdentifier );

  @JsonGetter( "CompanyName" )
  String companyName();

  Field < String > companyNameField();

  @JsonSetter( "CompanyName" )
  Company companyName( String companyName );

  @JsonGetter( "DefaultAddress" )
  Address defaultAddress();

  @JsonIgnore
  Field < Address > defaultAddressField();

  @JsonSetter( "DefaultAddress" )
  Company defaultAddress( Address defaultAddress );

  @JsonGetter( "DefaultBillingContactId" )
  Integer defaultBillingContactId();

  Field < Integer > defaultBillingContactIdField();

  @JsonSetter( "DefaultBillingContactId" )
  Company defaultBillingContactId( Integer defaultBillingContactId );

  @JsonGetter( "DefaultContactId" )
  Integer defaultContactId();

  Field < Integer > defaultContactIdField();

  @JsonSetter( "DefaultContactId" )
  Company defaultContactId( Integer defaultContactId );

  @JsonGetter( "FaxNumber" )
  String faxNumber();

  Field < String > faxNumberField();

  @JsonSetter( "FaxNumber" )
  Company faxNumber( String faxNumber );

  @JsonGetter( "Market" )
  String market();

  Field < String > marketField();

  @JsonSetter( "Market" )
  Company market( String market );

  @JsonGetter( "PhoneNumber" )
  String phoneNumber();

  Field < String > phoneNumberField();

  @JsonSetter( "PhoneNumber" )
  Company phoneNumber( String phoneNumber );

  @JsonGetter( "Status" )
  String status();

  Field < String > statusField();

  @JsonSetter( "Status" )
  Company status( String status );

  @JsonGetter( "Territory" )
  String territory();

  Field < String >  territoryField();

  @JsonSetter( "Territory" )
  Company territory( String territory );

  @JsonGetter( "Type" )
  String type();

  Field < String > typeField();

  @JsonSetter( "Type" )
  Company type( String type );

  @JsonGetter( "WebSite" )
  String webSite();

  Field < String > webSiteField();

  @JsonSetter( "WebSite" )
  Company webSite( String webSite );

  @JsonIgnore
  Field < Boolean > inactiveField();

  @JsonSetter( "InactiveFlag" )
  Company inactive( Boolean inactive );

  @JsonGetter( "InactiveFlag" )
  Boolean inactive();

}
