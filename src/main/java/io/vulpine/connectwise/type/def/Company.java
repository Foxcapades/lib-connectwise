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
import io.vulpine.connectwise.type.def.gen.*;
import io.vulpine.connectwise.util.Field;
import io.vulpine.connectwise.util.ListField;

import java.util.Date;
import java.util.List;

public interface Company
  extends
  XmlSerializable,
  HasAccountNumber,
  HasId,
  HasLastUpdated,
  HasStatus,
  HasType,
  HasTerritory
{
  Field < String > companyIdentifierField();

  Field < String > companyNameField();

  Field < Address > defaultAddressField();

  Field < Integer > defaultBillingContactIdField();

  Field < Integer > defaultContactIdField();

  Field < String > faxNumberField();

  Field < String > marketField();

  Field < String > phoneNumberField();

  Field < String > webSiteField();

  ListField < Address > addressesField();

  /*

  Default Implementations

   */

  default List < Address > addresses()
  {
    return addressesField().get();
  }

  default Company addresses( List < Address > addresses )
  {
    addressesField().get().clear();
    addressesField().get().addAll(addresses);

    return this;
  }

  default String companyIdentifier()
  {
    return companyIdentifierField().get();
  }

  default Company companyIdentifier( final String s )
  {
    companyIdentifierField().set(s);
    return this;
  }

  default String companyName()
  {
    return companyNameField().get();
  }

  default Company companyName( final String s )
  {
    companyNameField().set(s);
    return this;
  }

  default Address defaultAddress()
  {
    return defaultAddressField().get();
  }

  default Company defaultAddress( final Address a )
  {
    defaultAddressField().set(a);
    return this;
  }

  default Integer defaultBillingContactId()
  {
    return defaultBillingContactIdField().get();
  }

  default Company defaultBillingContactId( final Integer i )
  {
    defaultBillingContactIdField().set(i);
    return this;
  }

  default Integer defaultContactId()
  {
    return defaultContactIdField().get();
  }

  default Company defaultContactId( final Integer i )
  {
    defaultContactIdField().set(i);
    return this;
  }

  default String faxNumber()
  {
    return faxNumberField().get();
  }

  default Company faxNumber( final String s )
  {
    faxNumberField().set(s);
    return this;
  }

  default String market()
  {
    return marketField().get();
  }

  default Company market( final String s )
  {
    marketField().set(s);
    return this;
  }

  default String phoneNumber()
  {
    return phoneNumberField().get();
  }

  default Company phoneNumber( final String s )
  {
    phoneNumberField().set(s);
    return this;
  }

  default String webSite()
  {
    return webSiteField().get();
  }

  default Company webSite( final String s )
  {
    webSiteField().set(s);
    return this;
  }

  /*

  Interface Overrides

   */

  @Override
  Company status( final String s );

  @Override
  Company lastUpdated( final Date d );

  @Override
  Company id( final Integer i );

  @Override
  Company accountNumber( final String s );

  @Override
  Company territory( final String s );

  @Override
  Company type( final String s );
}
