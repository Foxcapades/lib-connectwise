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
package io.vulpine.connectwise.type.def.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.vulpine.connectwise.type.def.gen.HasCompanyIdentifier;
import io.vulpine.connectwise.type.def.gen.field.*;
import io.vulpine.connectwise.util.NumberField;
import io.vulpine.connectwise.util.StringField;

import java.util.Date;

public interface FieldCompanyFindResult
  extends
  CompanyFindResult,
  HasIdField,
  HasCompanyNameField,
  HasCompanyIdentifierField,
  HasStatusField,
  HasLastUpdatedField,
  HasTerritoryField,
  HasUpdatedByField
{
  @JsonIgnore
  StringField zipField();

  @JsonIgnore
  NumberField < Integer > defaultBillingContactIdField();

  @JsonIgnore
  NumberField < Integer > defaultContactIdField();

  @Override
  default HasCompanyIdentifier companyIdentifier( final String s )
  {
    companyIdentifierField().set(s);

    return this;
  }

  @Override
  default String zip()
  {
    return zipField().get();
  }

  @Override
  default FieldCompanyFindResult zip( final String s )
  {
    zipField().set(s);

    return this;
  }

  @Override
  default FieldCompanyFindResult city( final String s )
  {
    cityField().set(s);

    return this;
  }

  @Override
  default FieldCompanyFindResult state( final String s )
  {
    stateField().set(s);

    return this;
  }

  @Override
  default FieldCompanyFindResult market( final String s )
  {
    marketField().set(s);

    return this;
  }

  @Override
  default FieldCompanyFindResult country( final String s )
  {
    countryField().set(s);

    return this;
  }

  @Override
  default FieldCompanyFindResult website( final String s )
  {
    websiteField().set(s);

    return this;
  }

  @Override
  default FieldCompanyFindResult faxNumber( final String s )
  {
    faxNumberField().set(s);

    return this;
  }

  @Override
  default FieldCompanyFindResult territory( final String t )
  {
    territoryField().set(t);

    return this;
  }

  @Override
  default FieldCompanyFindResult updatedBy( final String s )
  {
    updatedByField().set(s);

    return this;
  }

  @Override
  default FieldCompanyFindResult companyName( final String s )
  {
    companyNameField().set(s);

    return this;
  }

  @Override
  default FieldCompanyFindResult phoneNumber( final String s )
  {
    phoneNumberField().set(s);

    return this;
  }

  @Override
  default FieldCompanyFindResult addressLine1( final String s )
  {
    addressLine1Field().set(s);

    return this;
  }

  @Override
  default FieldCompanyFindResult addressLine2( final String s )
  {
    addressLine2Field().set(s);

    return this;
  }

  @Override
  default FieldCompanyFindResult id( final Integer i )
  {
    idField().set(i);

    return this;
  }

  @Override
  default FieldCompanyFindResult lastUpdated( Date d )
  {
    lastUpdatedField().set(d);

    return this;
  }

  @JsonIgnore
  StringField cityField();

  @JsonIgnore
  StringField stateField();

  @JsonIgnore
  StringField marketField();

  @Override
  default String city()
  {
    return cityField().get();
  }

  @Override
  default String state()
  {
    return stateField().get();
  }

  @Override
  default String market()
  {
    return marketField().get();
  }

  @JsonIgnore
  StringField countryField();

  @Override
  default String country()
  {
    return countryField().get();
  }

  @JsonIgnore
  StringField websiteField();

  @Override
  default String website()
  {
    return websiteField().get();
  }

  @JsonIgnore
  StringField faxNumberField();

  @Override
  default String faxNumber()
  {
    return faxNumberField().get();
  }

  @JsonIgnore
  StringField phoneNumberField();

  @Override
  default String phoneNumber()
  {
    return phoneNumberField().get();
  }

  @JsonIgnore
  StringField addressLine1Field();

  @Override
  default String addressLine1()
  {
    return addressLine1Field().get();
  }

  @JsonIgnore
  StringField addressLine2Field();

  @Override
  default String addressLine2()
  {
    return addressLine2Field().get();
  }

  @JsonIgnore
  StringField typeField();

  @Override
  default String type()
  {
    return typeField().get();
  }

  @Override
  default FieldCompanyFindResult type( final String s )
  {
    typeField().set(s);

    return this;
  }

  @Override
  default FieldCompanyFindResult status( final String s )
  {
    statusField().set(s);

    return this;
  }

  @Override
  default Integer defaultBillingContactId()
  {
    return defaultBillingContactIdField().get();
  }

  @Override
  default FieldCompanyFindResult defaultBillingContactId( final Integer i )
  {
    defaultBillingContactIdField().set(i);

    return this;
  }

  @Override
  default Integer defaultContactId()
  {
    return defaultContactIdField().get();
  }

  @Override
  default FieldCompanyFindResult defaultContactId( final Integer i )
  {
    defaultContactIdField().set(i);

    return this;
  }
}
