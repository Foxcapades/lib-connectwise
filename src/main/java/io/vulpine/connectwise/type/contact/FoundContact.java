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
package io.vulpine.connectwise.type.contact;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.ConnectwiseCommon;

public class FoundContact extends ConnectwiseCommon
{

  @JacksonXmlProperty( localName = "FirstName" )
  private String firstName;

  @JacksonXmlProperty( localName = "LastName" )
  private String lastName;

  @JacksonXmlProperty( localName = "CompanyName" )
  private String companyName;

  @JacksonXmlProperty( localName = "CompanyId" )
  private int companyId;

  @JacksonXmlProperty( localName = "Phone" )
  private String phone;

  @JacksonXmlProperty( localName = "Email" )
  private String email;

  @JacksonXmlProperty( localName = "Type" )
  private String type;

  @JacksonXmlProperty( localName = "Relationship" )
  private String relationship;

  @JacksonXmlProperty( localName = "DefaultFlag" )
  private boolean isDefault;

  @JacksonXmlProperty( localName = "AddressLine1" )
  private String addressLine1;

  @JacksonXmlProperty( localName = "AddressLine2" )
  private String addressLine2;

  @JacksonXmlProperty( localName = "City" )
  private String city;

  @JacksonXmlProperty( localName = "State" )
  private String state;

  @JacksonXmlProperty( localName = "Zip" )
  private String zip;

  @JacksonXmlProperty( localName = "Country" )
  private String country;

  @JacksonXmlProperty( localName = "PortalSecurityLevel" )
  private int portalSecurityLevel;

  @JacksonXmlProperty( localName = "DisablePortalLogin" )
  private boolean isPortalLoginDisabled;

  @JacksonXmlProperty( localName = "PortalSecurityCaption" )
  private String portalSecurityCaption;

  @JacksonXmlProperty( localName = "SID" )
  private String sid;

  @JacksonXmlProperty( localName = "ManagerId" )
  private int managerId;

  @JacksonXmlProperty( localName = "AssistantId" )
  private int assistantId;

  public FoundContact()
  {
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName( final String firstName )
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName( final String lastName )
  {
    this.lastName = lastName;
  }

  public String getCompanyName()
  {
    return companyName;
  }

  public void setCompanyName( final String companyName )
  {
    this.companyName = companyName;
  }

  public int getCompanyId()
  {
    return companyId;
  }

  public void setCompanyId( final int companyId )
  {
    this.companyId = companyId;
  }

  public String getPhone()
  {
    return phone;
  }

  public void setPhone( final String phone )
  {
    this.phone = phone;
  }

  public String getEmail()
  {
    return email;
  }

  public void setEmail( final String email )
  {
    this.email = email;
  }

  public String getType()
  {
    return type;
  }

  public void setType( final String type )
  {
    this.type = type;
  }

  public String getRelationship()
  {
    return relationship;
  }

  public void setRelationship( final String relationship )
  {
    this.relationship = relationship;
  }

  public boolean isDefault()
  {
    return isDefault;
  }

  public void setDefault( final boolean aDefault )
  {
    isDefault = aDefault;
  }

  public String getAddressLine1()
  {
    return addressLine1;
  }

  public void setAddressLine1( final String addressLine1 )
  {
    this.addressLine1 = addressLine1;
  }

  public String getAddressLine2()
  {
    return addressLine2;
  }

  public void setAddressLine2( final String addressLine2 )
  {
    this.addressLine2 = addressLine2;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity( final String city )
  {
    this.city = city;
  }

  public String getState()
  {
    return state;
  }

  public void setState( final String state )
  {
    this.state = state;
  }

  public String getZip()
  {
    return zip;
  }

  public void setZip( final String zip )
  {
    this.zip = zip;
  }

  public String getCountry()
  {
    return country;
  }

  public void setCountry( final String country )
  {
    this.country = country;
  }

  public int getPortalSecurityLevel()
  {
    return portalSecurityLevel;
  }

  public void setPortalSecurityLevel( final int portalSecurityLevel )
  {
    this.portalSecurityLevel = portalSecurityLevel;
  }

  public boolean isPortalLoginDisabled()
  {
    return isPortalLoginDisabled;
  }

  public void setPortalLoginDisabled( final boolean portalLoginDisabled )
  {
    isPortalLoginDisabled = portalLoginDisabled;
  }

  public String getPortalSecurityCaption()
  {
    return portalSecurityCaption;
  }

  public void setPortalSecurityCaption( final String portalSecurityCaption )
  {
    this.portalSecurityCaption = portalSecurityCaption;
  }

  public String getSid()
  {
    return sid;
  }

  public void setSid( final String sid )
  {
    this.sid = sid;
  }

  public int getManagerId()
  {
    return managerId;
  }

  public void setManagerId( final int managerId )
  {
    this.managerId = managerId;
  }

  public int getAssistantId()
  {
    return assistantId;
  }

  public void setAssistantId( final int assistantId )
  {
    this.assistantId = assistantId;
  }
}
