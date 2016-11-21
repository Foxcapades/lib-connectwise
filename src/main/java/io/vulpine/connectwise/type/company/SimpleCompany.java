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
import io.vulpine.connectwise.type.def.FieldCompany;
import io.vulpine.connectwise.util.*;

/**
 * = ConnectWise Company Object
 *
 * @since 0.0.1
 * @version 3.0.0
 */
public class SimpleCompany extends ConnectwiseCommon implements FieldCompany
{
  private final Field < Address > defaultAddress = new SimpleObjectField<>("DefaultAddress");

  private ListField < Address > addresses = new ArrayListField<>();

  private final StringField
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

  private final NumberField < Integer > defaultBillingContactId = new SimpleIntegerField("DefaultBillingContactId");

  private final NumberField < Integer > defaultContactId = new SimpleIntegerField("DefaultContactId");

  @Override
  public ListField < Address > addressesField()
  {
    return addresses;
  }

  @Override
  public Field < Address > defaultAddressField()
  {
    return defaultAddress;
  }

  @Override
  public StringField accountNumberField()
  {
    return accountNumber;
  }

  @Override
  public StringField webSiteField()
  {
    return webSite;
  }

  @Override
  public StringField companyNameField()
  {
    return companyName;
  }

  @Override
  public StringField companyIdentifierField()
  {
    return companyIdentifier;
  }

  @Override
  public StringField phoneNumberField()
  {
    return phoneNumber;
  }

  @Override
  public StringField faxNumberField()
  {
    return faxNumber;
  }

  @Override
  public StringField territoryField()
  {
    return this.territory;
  }

  @Override
  public StringField marketField()
  {
    return this.market;
  }

  @Override
  public StringField typeField()
  {
    return type;
  }

  @Override
  public StringField statusField()
  {
    return status;
  }

  @Override
  public NumberField < Integer > defaultContactIdField()
  {
    return defaultContactId;
  }

  @Override
  public NumberField < Integer > defaultBillingContactIdField()
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
      + addresses.toXml()
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
