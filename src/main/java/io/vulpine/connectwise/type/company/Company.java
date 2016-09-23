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

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.ConnectwiseCommon;
import io.vulpine.connectwise.util.BooleanField;
import io.vulpine.connectwise.util.Field;
import io.vulpine.connectwise.util.SimpleField;
import io.vulpine.connectwise.util.StringField;

import java.util.List;

public class Company extends ConnectwiseCommon implements io.vulpine.connectwise.type.def.Company
{
  private final Field < Address > defaultAddress = new SimpleField < Address >();

  private List < Address > addresses;

  private final Field < String > accountNumber = new StringField("AccountNumber");

  private final Field < String > webSite = new StringField("WebSite");

  private final Field < Boolean > inactive = new BooleanField();

  private final Field < String > companyName = new StringField("CompanyName");

  private final Field < String > companyIdentifier = new StringField("CompanyIdentifier");

  private final Field < String > phoneNumber = new StringField("PhoneNumber");

  private final Field < String > faxNumber = new StringField("FaxNumber");

  private final Field < String > territory = new StringField("Territory");

  private Integer defaultBillingContactId;

  private Integer defaultContactId;

  private final Field < String > status = new StringField("Status");

  private final Field < String > type = new StringField("Type");

  private final Field < String > market = new StringField("Market");

  @Override public Address defaultAddress() { return defaultAddress.get(); }
  @Override public Field < Address > defaultAddressField() { return defaultAddress; }
  @Override public Company defaultAddress( Address a ) { defaultAddress.set(a); return this; }

  @Override
  public List < Address > getAddresses()
  {
    return addresses;
  }

  @Override
  public Company setAddresses( List < Address > addresses )
  {
    this.addresses = addresses;
    return this;
  }

  @Override public String accountNumber() { return accountNumber.get(); }
  @Override public Field < String > accountNumberField() { return accountNumber; }
  @Override public Company accountNumber( final String s ) { accountNumber.set(s); return this; }

  @Override public String webSite() { return webSite.get(); }
  @Override public Field < String > webSiteField() { return webSite; }
  @Override public Company setWebSite( final String s ) { webSite.set(s); return this; }

  @Override public Boolean inactive() { return inactive.get(); }
  @Override public Field < Boolean > inactiveField() { return inactive; }
  @Override public Company inactive( final Boolean b ) { inactive.set(b); return this; }

  @Override public Company companyName( final String s ) { companyName.set(s); return this; }

  @Override public String companyIdentifier() { return companyIdentifier.get(); }
  @Override public Field < String > companyIdentifierField() { return companyIdentifier; }
  @Override public Company companyIdentifier( final String s ) { companyIdentifier.set(s); return this; }

  @JsonGetter( "PhoneNumber" )
  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  @JsonSetter( "PhoneNumber" )
  public void setPhoneNumber( final String phoneNumber )
  {
    this.phoneNumber = phoneNumber;
  }

  @JsonGetter( "FaxNumber" )
  public String getFaxNumber()
  {
    return faxNumber;
  }

  @JsonSetter( "FaxNumber" )
  public void setFaxNumber( final String faxNumber )
  {
    this.faxNumber = faxNumber;
  }

  @JsonGetter( "Territory" )
  public String getTerritory()
  {
    return territory;
  }

  @JsonSetter( "Territory" )
  public void setTerritory( final String territory )
  {
    this.territory = territory;
  }

  @JsonGetter( "Market" )
  public String getMarket()
  {
    return market;
  }

  @JsonSetter( "Market" )
  public Company setMarket( final String market )
  {
    this.market = market;

  }

  @Override public String getType() { return type.get(); }
  @Override public Field < String > typeField() { return type; }
  @Override public Company type( final String s ) { type.set(s); return this; }

  @Override public String status() { return status.get(); }
  @Override public Field < String > statusField() { return status; }
  @Override public Company status( final String s ) { status.set(s); return this; }

  @JsonGetter( "DefaultContactId" )
  public Integer getDefaultContactId()
  {
    return defaultContactId;
  }

  @JsonSetter( "DefaultContactId" )
  public void setDefaultContactId( final Integer i )
  {
    defaultContactId = i;
  }

  @JsonGetter( "DefaultBillingContactId" )
  public Integer getDefaultBillingContactId()
  {
    return defaultBillingContactId;
  }

  @JsonSetter( "DefaultBillingContactId" )
  public void setDefaultBillingContactId( final Integer i )
  {
    defaultBillingContactId = i;
  }


  @Override public String getCompanyName() { return companyName.get(); }
}
