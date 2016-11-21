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

import io.vulpine.connectwise.type.company.Address;
import io.vulpine.connectwise.util.*;

import java.util.Date;
import java.util.List;

public interface FieldCompany extends Company
{
  StringField accountNumberField();
  @Override default String accountNumber() { return accountNumberField().get(); }
  @Override default Company accountNumber( final String s ) { accountNumberField().set(s); return this; }

  ListField < Address > addressesField();
  @Override default List < Address > addresses() { return addressesField().get(); }
  @Override default Company addresses( List < Address > addresses ) { addressesField().get().clear(); addressesField().get().addAll(addresses); return this; }

  StringField companyIdentifierField();
  @Override default String companyIdentifier() { return companyIdentifierField().get(); }
  @Override default Company companyIdentifier( final String s ) { companyIdentifierField().set(s); return this; }

  StringField companyNameField();
  @Override default String companyName() { return companyNameField().get(); }
  @Override default Company companyName( final String s ) { companyNameField().set(s); return this; }

  Field < Address > defaultAddressField();
  @Override default Address defaultAddress() { return defaultAddressField().get(); }
  @Override default Company defaultAddress( final Address a ) { defaultAddressField().set(a); return this; }

  NumberField < Integer > defaultBillingContactIdField();
  @Override default Integer defaultBillingContactId() { return defaultBillingContactIdField().get(); }
  @Override default Company defaultBillingContactId( final Integer i ) { defaultBillingContactIdField().set(i); return this; }

  NumberField < Integer > defaultContactIdField();
  @Override default Integer defaultContactId() { return defaultContactIdField().get(); }
  @Override default Company defaultContactId( final Integer i ) { defaultContactIdField().set(i); return this; }

  StringField faxNumberField();
  @Override default String faxNumber() { return faxNumberField().get(); }
  @Override default Company faxNumber( final String s ) { faxNumberField().set(s); return this; }

  NumberField < Integer > idField();
  @Override default Integer id() { return idField().get(); }
  @Override default Company id( final Integer i ) { idField().set(i); return this; }

  StringField marketField();
  @Override default String market() { return marketField().get(); }
  @Override default Company market( final String s ) { marketField().set(s); return this; }

  StringField phoneNumberField();
  @Override default String phoneNumber() { return phoneNumberField().get(); }
  @Override default Company phoneNumber( final String s ) { phoneNumberField().set(s); return this; }

  StringField statusField();
  @Override default String status() { return statusField().get(); }
  @Override default Company status( final String s ) { statusField().set(s); return this; }

  StringField territoryField();
  @Override default String territory() { return territoryField().get(); }
  @Override default Company territory( final String s ) { territoryField().set(s); return this; }

  StringField typeField();
  @Override default String type() { return typeField().get(); }
  @Override default Company type( final String s ) { typeField().set(s); return this; }

  StringField webSiteField();
  @Override default String webSite() { return webSiteField().get(); }
  @Override default Company webSite( final String s ) { webSiteField().set(s); return this; }

  DateField lastUpdatedField();
  @Override default Date lastUpdated() { return lastUpdatedField().get(); }
  @Override default Company lastUpdated( final Date d ) { lastUpdatedField().set(d); return this; }
}
