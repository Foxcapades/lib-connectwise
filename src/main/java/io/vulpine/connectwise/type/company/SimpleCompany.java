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
import io.vulpine.connectwise.type.def.Company;
import io.vulpine.connectwise.util.*;

import java.util.List;

/**
 * = ConnectWise Company Object
 *
 * @since 0.0.1
 * @version 3.0.0
 */
public class SimpleCompany extends ConnectwiseCommon implements Company
{
  private final Field < Address > defaultAddress = new SimpleObjectField<>("DefaultAddress");

  private List < Address > addresses;

  private final Field < String >
    accountNumber     = new SimpleStringField("AccountNumber"),
    companyName       = new SimpleStringField("CompanyName"),
    companyIdentifier = new SimpleStringField("CompanyIdentifier"),
    faxNumber         = new SimpleStringField("FaxNumber"),
    market            = new SimpleStringField("Market"),
    phoneNumber       = new SimpleStringField("PhoneNumber"),
    status            = new SimpleStringField("Status"),
    territory         = new SimpleStringField("Territory"),
    type              = new SimpleStringField("Type"),
    webSite           = new SimpleStringField("WebSite");

  private final Field < Integer > defaultBillingContactId = new SimpleIntegerField("DefaultBillingContactId");

  private final Field < Integer > defaultContactId = new SimpleIntegerField("DefaultContactId");

  @Override
  public Company setAddresses( List < Address > addresses )
  {
    this.addresses = addresses;

    return this;
  }

  @Override
  public Field < Address > defaultAddressField()
  {
    return defaultAddress;
  }

  @Override
  public List < Address > getAddresses()
  {
    return addresses;
  }

  @Override
  public Field < String > accountNumberField()
  {
    return accountNumber;
  }

  @Override
  public Field < String > webSiteField()
  {
    return webSite;
  }

  @Override
  public Field < String > companyNameField()
  {
    return companyName;
  }

  @Override
  public Field < String > companyIdentifierField()
  {
    return companyIdentifier;
  }

  @Override
  public Field < String > phoneNumberField()
  {
    return phoneNumber;
  }

  @Override
  public Field < String > faxNumberField()
  {
    return faxNumber;
  }

  @Override
  public Field < String > territoryField()
  {
    return this.territory;
  }

  @Override
  public Field < String > marketField()
  {
    return this.market;
  }

  @Override
  public Field < String > typeField()
  {
    return type;
  }

  @Override
  public Field < String > statusField()
  {
    return status;
  }

  @Override
  public Field < Integer > defaultContactIdField()
  {
    return defaultContactId;
  }

  @Override
  public Field < Integer > defaultBillingContactIdField()
  {
    return defaultBillingContactId;
  }

  @Override
  public String toXml( final String name )
  {
    return "<" + name + ">"
      + id.toXml()
      + companyName.toXml()
      + companyIdentifier.toXml()
      + defaultAddress.toXml()
      + phoneNumber.toXml()
      + faxNumber.toXml()
      + webSite.toXml()
      + territory.toXml()
      + market.toXml()
      + type.toXml()
      + status.toXml()
      + accountNumber.toXml()
      + defaultContactId.toXml()
      + defaultBillingContactId.toXml()
      + lastUpdated.toXml()
      + "</" + name + '>';
  }
}
