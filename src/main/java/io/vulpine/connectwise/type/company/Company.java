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
package io.vulpine.connectwise.type.company;

import io.vulpine.connectwise.type.ConnectwiseCommon;
import io.vulpine.connectwise.util.*;

import java.util.List;

public class Company extends ConnectwiseCommon implements io.vulpine.connectwise.type.def.Company
{
  private final Field < Address > defaultAddress = new SimpleField < Address >("DefaultAddress");

  private List < Address > addresses;

  private final Field < String > accountNumber = new StringField("AccountNumber");

  private final Field < String > webSite = new StringField("WebSite");

  private final Field < Boolean > inactive = new BooleanField("InactiveFlag");

  private final Field < String > companyName = new StringField("CompanyName");

  private final Field < String > companyIdentifier = new StringField("CompanyIdentifier");

  private final Field < String > phoneNumber = new StringField("PhoneNumber");

  private final Field < String > faxNumber = new StringField("FaxNumber");

  private final Field < String > territory = new StringField("Territory");

  private final Field < Integer > defaultBillingContactId = new IntegerField("DefaultBillingContactId");

  private final Field < Integer > defaultContactId = new IntegerField("DefaultContactId");

  private final Field < String > status = new StringField("Status");

  private final Field < String > type = new StringField("Type");

  private final Field < String > market = new StringField("Market");

  @Override
  public Address defaultAddress()
  {
    return defaultAddress.get();
  }

  @Override
  public Field < Address > defaultAddressField()
  {
    return defaultAddress;
  }

  @Override
  public io.vulpine.connectwise.type.def.Company defaultAddress( Address a )
  {
    defaultAddress.set(a);
    return this;
  }

  @Override
  public List < Address > getAddresses()
  {
    return addresses;
  }

  @Override
  public io.vulpine.connectwise.type.def.Company setAddresses( List < Address > addresses )
  {
    this.addresses = addresses;
    return this;
  }

  @Override
  public String accountNumber()
  {
    return accountNumber.get();
  }

  @Override
  public Field < String > accountNumberField()
  {
    return accountNumber;
  }

  @Override
  public io.vulpine.connectwise.type.def.Company accountNumber( final String s )
  {
    accountNumber.set(s);
    return this;
  }

  @Override
  public String webSite()
  {
    return webSite.get();
  }

  @Override
  public Field < String > webSiteField()
  {
    return webSite;
  }

  @Override
  public io.vulpine.connectwise.type.def.Company webSite( final String s )
  {
    webSite.set(s);
    return this;
  }

  @Override
  public Boolean inactive()
  {
    return inactive.get();
  }

  @Override
  public Field < Boolean > inactiveField()
  {
    return inactive;
  }

  @Override
  public io.vulpine.connectwise.type.def.Company inactive( final Boolean b )
  {
    inactive.set(b);
    return this;
  }

  @Override
  public String companyName()
  {
    return companyName.get();
  }

  @Override
  public Field < String > companyNameField()
  {
    return companyName;
  }

  @Override
  public io.vulpine.connectwise.type.def.Company companyName( final String s )
  {
    companyName.set(s);
    return this;
  }

  @Override
  public String companyIdentifier()
  {
    return companyIdentifier.get();
  }

  @Override
  public Field < String > companyIdentifierField()
  {
    return companyIdentifier;
  }

  @Override
  public io.vulpine.connectwise.type.def.Company companyIdentifier( final String s )
  {
    companyIdentifier.set(s);
    return this;
  }

  @Override
  public String phoneNumber()
  {
    return phoneNumber.get();
  }

  @Override
  public Field < String > phoneNumberField()
  {
    return phoneNumber;
  }

  @Override
  public io.vulpine.connectwise.type.def.Company phoneNumber( final String p )
  {
    phoneNumber.set(p);
    return this;
  }

  @Override
  public String faxNumber()
  {
    return faxNumber.get();
  }

  @Override
  public Field < String > faxNumberField()
  {
    return faxNumber;
  }

  @Override
  public io.vulpine.connectwise.type.def.Company faxNumber( final String s )
  {
    faxNumber.set(s);
    return this;
  }

  @Override
  public String territory()
  {
    return territory.get();
  }

  @Override
  public Field < String > territoryField()
  {
    return this.territory;
  }

  @Override
  public io.vulpine.connectwise.type.def.Company territory( final String s )
  {
    territory.set(s);
    return this;
  }

  @Override
  public String market()
  {
    return market.get();
  }

  @Override
  public Field < String > marketField()
  {
    return this.market;
  }

  @Override
  public io.vulpine.connectwise.type.def.Company market( final String s )
  {
    market.set(s);
    return this;
  }

  @Override
  public String type()
  {
    return type.get();
  }

  @Override
  public Field < String > typeField()
  {
    return type;
  }

  @Override
  public io.vulpine.connectwise.type.def.Company type( final String s )
  {
    type.set(s);
    return this;
  }

  @Override
  public String status()
  {
    return status.get();
  }

  @Override
  public Field < String > statusField()
  {
    return status;
  }

  @Override
  public io.vulpine.connectwise.type.def.Company status( final String s )
  {
    status.set(s);
    return this;
  }

  @Override
  public Integer defaultContactId()
  {
    return defaultContactId.get();
  }

  @Override
  public Field < Integer > defaultContactIdField()
  {
    return defaultContactId;
  }

  @Override
  public io.vulpine.connectwise.type.def.Company defaultContactId( final Integer i )
  {
    defaultContactId.set(i);
    return this;
  }

  @Override
  public Integer defaultBillingContactId()
  {
    return defaultBillingContactId.get();
  }

  @Override
  public Field < Integer > defaultBillingContactIdField()
  {
    return defaultBillingContactId;
  }

  @Override
  public io.vulpine.connectwise.type.def.Company defaultBillingContactId( final Integer i )
  {
    defaultBillingContactId.set(i);
    return this;
  }

  @Override
  public String toXml( final String name )
  {
    return "<" + name + ">" +
      defaultAddress.toXml() +
      accountNumber.toXml() +
      webSite.toXml() +
      inactive.toXml() +
      companyName.toXml() +
      companyIdentifier.toXml() +
      phoneNumber.toXml() +
      faxNumber.toXml() +
      territory.toXml() +
      defaultBillingContactId.toXml() +
      defaultContactId.toXml() +
      status.toXml() +
      type.toXml() +
      market.toXml() +
      "</" + name + '>';
  }
}
