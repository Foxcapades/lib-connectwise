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

import io.vulpine.connectwise.type.def.company.FieldCompanyFindResult;
import io.vulpine.connectwise.util.*;

public class SimpleFoundCompany implements FieldCompanyFindResult
{
  public final NumberField < Integer > id = new SimpleIntegerField("Id");

  public final DateField lastUpdated = new SimpleDateField("LastUpdated");

  public final StringField companyIdentifier = new SimpleStringField("CompanyIdentifier");

  public final StringField updatedBy = new SimpleStringField("UpdatedBy");

  public final StringField zip = new SimpleStringField("Zip");

  public final StringField city = new SimpleStringField("City");

  public final StringField country = new SimpleStringField("Country");

  public final StringField state = new SimpleStringField("State");

  public final StringField market = new SimpleStringField("Market");

  public final StringField website = new SimpleStringField("Website");

  public final StringField faxNumber = new SimpleStringField("FaxNumber");

  public final StringField phoneNumber = new SimpleStringField("PhoneNumber");

  public final StringField territory = new SimpleStringField("Territory");

  public final StringField companyName = new SimpleStringField("CompanyName");

  public final StringField addressLine1 = new SimpleStringField("AddressLine1");

  public final StringField addressLine2 = new SimpleStringField("AddressLine2");

  public final StringField type = new SimpleStringField("Type");

  public final NumberField < Integer > defaultBillingContactId = new SimpleIntegerField("DefaultBillingContactId");

  public final NumberField < Integer > defaultContactId = new SimpleIntegerField("DefaultContactId");

  public final StringField status = new SimpleStringField("Status");

  @Override
  public StringField typeField()
  {
    return type;
  }

  @Override
  public NumberField < Integer > defaultBillingContactIdField()
  {
    return defaultBillingContactId;
  }

  @Override
  public NumberField < Integer > defaultContactIdField()
  {
    return defaultContactId;
  }

  @Override
  public StringField companyIdentifierField()
  {
    return companyIdentifier;
  }

  @Override
  public NumberField < Integer > idField()
  {
    return id;
  }

  @Override
  public DateField lastUpdatedField()
  {
    return lastUpdated;
  }

  @Override
  public StringField updatedByField()
  {
    return updatedBy;
  }

  @Override
  public StringField zipField()
  {
    return zip;
  }

  @Override
  public StringField cityField()
  {
    return city;
  }

  @Override
  public StringField stateField()
  {
    return state;
  }

  @Override
  public StringField marketField()
  {
    return market;
  }

  @Override
  public StringField countryField()
  {
    return country;
  }

  @Override
  public StringField websiteField()
  {
    return website;
  }

  @Override
  public StringField faxNumberField()
  {
    return faxNumber;
  }

  @Override
  public StringField territoryField()
  {
    return territory;
  }

  @Override
  public StringField companyNameField()
  {
    return companyName;
  }

  @Override
  public StringField phoneNumberField()
  {
    return phoneNumber;
  }

  @Override
  public StringField addressLine1Field()
  {
    return addressLine1;
  }

  @Override
  public StringField addressLine2Field()
  {
    return addressLine2;
  }

  @Override
  public StringField statusField()
  {
    return status;
  }
}
