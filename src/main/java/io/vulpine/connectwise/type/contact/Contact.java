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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.ConnectwiseCommon;

import java.util.Date;
import java.util.List;

@SuppressWarnings( "unused" )
public class Contact extends ConnectwiseCommon
{
  public enum Gender
  {
    Male, Female, Unspecified
  }

  @JacksonXmlProperty( localName = "FirstName" )
  protected String firstName;

  @JacksonXmlProperty( localName = "LastName" )
  protected String lastName;

  @JacksonXmlProperty( localName = "Email" )
  protected String email;

  @JacksonXmlProperty( localName = "CompanyIdentifier" )
  protected String companyIdentifier;

  @JacksonXmlProperty( localName = "Inactive" )
  protected boolean inactive;

  @JacksonXmlProperty( localName = "SID" )
  protected String sID;

  @JacksonXmlProperty( localName = "ManagerId" )
  protected int managerId;

  @JacksonXmlProperty( localName = "AssistantId" )
  protected int assistantId;

  @JacksonXmlProperty( localName = "Relationship" )
  protected String relationship;

  @JacksonXmlProperty( localName = "Type" )
  protected String type;

  @JacksonXmlProperty( localName = "Phone" )
  protected String phone;

  @JacksonXmlProperty( localName = "PhoneExt" )
  protected String phoneExt;

  @JacksonXmlProperty( localName = "Fax" )
  protected String fax;

  @JacksonXmlProperty( localName = "FaxExt" )
  protected String faxExt;

  @JacksonXmlProperty( localName = "Title" )
  protected String title;

  @JacksonXmlProperty( localName = "School" )
  protected String school;

  @JacksonXmlProperty( localName = "NickName" )
  protected String nickName;

  @JacksonXmlProperty( localName = "Married" )
  protected boolean married;

  @JacksonXmlProperty( localName = "Children" )
  protected boolean children;

  @JacksonXmlProperty( localName = "SignificantOther" )
  protected String significantOther;

  @JacksonXmlProperty( localName = "PortalSecurityLevel" )
  protected short portalSecurityLevel;

  @JacksonXmlProperty( localName = "DisablePortalLogin" )
  protected boolean disablePortalLogin;

  @JacksonXmlProperty( localName = "UnsubscribeFlag" )
  protected boolean unsubscribeFlag;

  @JacksonXmlProperty( localName = "PersonalAddressFlag" )
  protected boolean personalAddressFlag;

  @JacksonXmlProperty( localName = "Gender" )
  protected Gender gender;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty( localName = "BirthDay" )
  protected Date birthDay;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty( localName = "Anniversary" )
  protected Date anniversary;

  @JacksonXmlProperty( localName = "AddressId" )
  protected int addressId;

  @JacksonXmlProperty( localName = "SiteName" )
  protected String siteName;

  @JacksonXmlProperty( localName = "CompanyAddressInfo" )
  protected CompanyAddressInfo companyAddressInfo;

  @JacksonXmlProperty( localName = "Phones" )
  protected List < ContactCommunicationItem > phones;

  @JacksonXmlProperty( localName = "Emails" )
  protected List < ContactCommunicationItem > emails;

  @JacksonXmlProperty( localName = "Faxes" )
  protected List < ContactCommunicationItem > faxes;

  public String getFirstName ()
  {
    return firstName;
  }

  public void setFirstName ( String firstName )
  {
    this.firstName = firstName;
  }

  public String getLastName ()
  {
    return lastName;
  }

  public void setLastName ( String lastName )
  {
    this.lastName = lastName;
  }

  public String getEmail ()
  {
    return email;
  }

  public void setEmail ( String email )
  {
    this.email = email;
  }

  public String getCompanyIdentifier ()
  {
    return companyIdentifier;
  }

  public void setCompanyIdentifier ( String companyIdentifier )
  {
    this.companyIdentifier = companyIdentifier;
  }

  public boolean isInactive ()
  {
    return inactive;
  }

  public void setInactive ( boolean inactive )
  {
    this.inactive = inactive;
  }

  public String getsID ()
  {
    return sID;
  }

  public void setsID ( String sID )
  {
    this.sID = sID;
  }

  public int getManagerId ()
  {
    return managerId;
  }

  public void setManagerId ( int managerId )
  {
    this.managerId = managerId;
  }

  public int getAssistantId ()
  {
    return assistantId;
  }

  public void setAssistantId ( int assistantId )
  {
    this.assistantId = assistantId;
  }

  public String getRelationship ()
  {
    return relationship;
  }

  public void setRelationship ( String relationship )
  {
    this.relationship = relationship;
  }

  public String getType ()
  {
    return type;
  }

  public void setType ( String type )
  {
    this.type = type;
  }

  public String getPhone ()
  {
    return phone;
  }

  public void setPhone ( String phone )
  {
    this.phone = phone;
  }

  public String getPhoneExt ()
  {
    return phoneExt;
  }

  public void setPhoneExt ( String phoneExt )
  {
    this.phoneExt = phoneExt;
  }

  public String getFax ()
  {
    return fax;
  }

  public void setFax ( String fax )
  {
    this.fax = fax;
  }

  public String getFaxExt ()
  {
    return faxExt;
  }

  public void setFaxExt ( String faxExt )
  {
    this.faxExt = faxExt;
  }

  public String getTitle ()
  {
    return title;
  }

  public void setTitle ( String title )
  {
    this.title = title;
  }

  public String getSchool ()
  {
    return school;
  }

  public void setSchool ( String school )
  {
    this.school = school;
  }

  public String getNickName ()
  {
    return nickName;
  }

  public void setNickName ( String nickName )
  {
    this.nickName = nickName;
  }

  public boolean isMarried ()
  {
    return married;
  }

  public void setMarried ( boolean married )
  {
    this.married = married;
  }

  public boolean isChildren ()
  {
    return children;
  }

  public void setChildren ( boolean children )
  {
    this.children = children;
  }

  public String getSignificantOther ()
  {
    return significantOther;
  }

  public void setSignificantOther ( String significantOther )
  {
    this.significantOther = significantOther;
  }

  public short getPortalSecurityLevel ()
  {
    return portalSecurityLevel;
  }

  public void setPortalSecurityLevel ( short portalSecurityLevel )
  {
    this.portalSecurityLevel = portalSecurityLevel;
  }

  public boolean isDisablePortalLogin ()
  {
    return disablePortalLogin;
  }

  public void setDisablePortalLogin ( boolean disablePortalLogin )
  {
    this.disablePortalLogin = disablePortalLogin;
  }

  public boolean isUnsubscribeFlag ()
  {
    return unsubscribeFlag;
  }

  public void setUnsubscribeFlag ( boolean unsubscribeFlag )
  {
    this.unsubscribeFlag = unsubscribeFlag;
  }

  public boolean isPersonalAddressFlag ()
  {
    return personalAddressFlag;
  }

  public void setPersonalAddressFlag ( boolean personalAddressFlag )
  {
    this.personalAddressFlag = personalAddressFlag;
  }

  public Gender getGender ()
  {
    return gender;
  }

  public void setGender ( Gender gender )
  {
    this.gender = gender;
  }

  public Date getBirthDay ()
  {
    return birthDay;
  }

  public void setBirthDay ( Date birthDay )
  {
    this.birthDay = birthDay;
  }

  public Date getAnniversary ()
  {
    return anniversary;
  }

  public void setAnniversary ( Date anniversary )
  {
    this.anniversary = anniversary;
  }

  public int getAddressId ()
  {
    return addressId;
  }

  public void setAddressId ( int addressId )
  {
    this.addressId = addressId;
  }

  public String getSiteName ()
  {
    return siteName;
  }

  public void setSiteName ( String siteName )
  {
    this.siteName = siteName;
  }

  public CompanyAddressInfo getCompanyAddressInfo ()
  {
    return companyAddressInfo;
  }

  public void setCompanyAddressInfo ( CompanyAddressInfo companyAddressInfo )
  {
    this.companyAddressInfo = companyAddressInfo;
  }

  public List < ContactCommunicationItem > getPhones ()
  {
    return phones;
  }

  public void setPhones ( List < ContactCommunicationItem > phones )
  {
    this.phones = phones;
  }

  public List < ContactCommunicationItem > getEmails ()
  {
    return emails;
  }

  public void setEmails ( List < ContactCommunicationItem > emails )
  {
    this.emails = emails;
  }

  public List < ContactCommunicationItem > getFaxes ()
  {
    return faxes;
  }

  public void setFaxes ( List < ContactCommunicationItem > faxes )
  {
    this.faxes = faxes;
  }
}
