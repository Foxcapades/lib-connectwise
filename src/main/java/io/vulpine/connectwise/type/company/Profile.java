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
 *
 */

package io.vulpine.connectwise.type.company;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@SuppressWarnings( "unused" )
public class Profile
{
  @JacksonXmlProperty( localName = "SicCode" )
  protected String sicCode;

  @JacksonXmlProperty( localName = "SicDescription" )
  protected String sicDescription;

  @JacksonXmlProperty( localName = "RevenueYear" )
  protected int revenueYear;

  @JacksonXmlProperty( localName = "AnnualRevenue" )
  protected double annualRevenue;

  @JacksonXmlProperty( localName = "NumberOfEmployees" )
  protected int numberOfEmployees;

  @JacksonXmlProperty( localName = "ParentCompanyId" )
  protected int parentCompanyId;

  @JacksonXmlProperty( localName = "OwnershipType" )
  protected String ownershipType;

  @JacksonXmlProperty( localName = "TimeZone" )
  protected String timeZone;

  @JacksonXmlProperty( localName = "LeadSource" )
  protected String leadSource;

  @JacksonXmlProperty( localName = "IsLead" )
  protected boolean isLead;

  @JacksonXmlProperty( localName = "IsUnsubscribedFromEmail" )
  protected boolean isUnsubscribedFromEmail;

  @JacksonXmlProperty( localName = "UserField1" )
  protected String userField1;

  @JacksonXmlProperty( localName = "UserField2" )
  protected String userField2;

  @JacksonXmlProperty( localName = "UserField3" )
  protected String userField3;

  @JacksonXmlProperty( localName = "UserField4" )
  protected String userField4;

  @JacksonXmlProperty( localName = "UserField5" )
  protected String userField5;

  @JacksonXmlProperty( localName = "UserField6" )
  protected String userField6;

  @JacksonXmlProperty( localName = "UserField7" )
  protected String userField7;

  @JacksonXmlProperty( localName = "UserField8" )
  protected String userField8;

  @JacksonXmlProperty( localName = "UserField9" )
  protected String userField9;

  @JacksonXmlProperty( localName = "UserField10" )
  protected String userField10;

  @JacksonXmlProperty( localName = "CalendarId" )
  protected int calendarId;

  public String getSicCode ()
  {
    return sicCode;
  }

  public void setSicCode ( final String sicCode )
  {
    this.sicCode = sicCode;
  }

  public String getSicDescription ()
  {
    return sicDescription;
  }

  public void setSicDescription ( final String sicDescription )
  {
    this.sicDescription = sicDescription;
  }

  public int getRevenueYear ()
  {
    return revenueYear;
  }

  public void setRevenueYear ( final int revenueYear )
  {
    this.revenueYear = revenueYear;
  }

  public double getAnnualRevenue ()
  {
    return annualRevenue;
  }

  public void setAnnualRevenue ( final double annualRevenue )
  {
    this.annualRevenue = annualRevenue;
  }

  public int getNumberOfEmployees ()
  {
    return numberOfEmployees;
  }

  public void setNumberOfEmployees ( final int numberOfEmployees )
  {
    this.numberOfEmployees = numberOfEmployees;
  }

  public int getParentCompanyId ()
  {
    return parentCompanyId;
  }

  public void setParentCompanyId ( final int parentCompanyId )
  {
    this.parentCompanyId = parentCompanyId;
  }

  public String getOwnershipType ()
  {
    return ownershipType;
  }

  public void setOwnershipType ( final String ownershipType )
  {
    this.ownershipType = ownershipType;
  }

  public String getTimeZone ()
  {
    return timeZone;
  }

  public void setTimeZone ( final String timeZone )
  {
    this.timeZone = timeZone;
  }

  public String getLeadSource ()
  {
    return leadSource;
  }

  public void setLeadSource ( final String leadSource )
  {
    this.leadSource = leadSource;
  }

  public boolean isLead ()
  {
    return isLead;
  }

  public void setLead ( final boolean lead )
  {
    isLead = lead;
  }

  public boolean isUnsubscribedFromEmail ()
  {
    return isUnsubscribedFromEmail;
  }

  public void setUnsubscribedFromEmail ( final boolean unsubscribedFromEmail )
  {
    isUnsubscribedFromEmail = unsubscribedFromEmail;
  }

  public String getUserField1 ()
  {
    return userField1;
  }

  public void setUserField1 ( final String userField1 )
  {
    this.userField1 = userField1;
  }

  public String getUserField2 ()
  {
    return userField2;
  }

  public void setUserField2 ( final String userField2 )
  {
    this.userField2 = userField2;
  }

  public String getUserField3 ()
  {
    return userField3;
  }

  public void setUserField3 ( final String userField3 )
  {
    this.userField3 = userField3;
  }

  public String getUserField4 ()
  {
    return userField4;
  }

  public void setUserField4 ( final String userField4 )
  {
    this.userField4 = userField4;
  }

  public String getUserField5 ()
  {
    return userField5;
  }

  public void setUserField5 ( final String userField5 )
  {
    this.userField5 = userField5;
  }

  public String getUserField6 ()
  {
    return userField6;
  }

  public void setUserField6 ( final String userField6 )
  {
    this.userField6 = userField6;
  }

  public String getUserField7 ()
  {
    return userField7;
  }

  public void setUserField7 ( final String userField7 )
  {
    this.userField7 = userField7;
  }

  public String getUserField8 ()
  {
    return userField8;
  }

  public void setUserField8 ( final String userField8 )
  {
    this.userField8 = userField8;
  }

  public String getUserField9 ()
  {
    return userField9;
  }

  public void setUserField9 ( final String userField9 )
  {
    this.userField9 = userField9;
  }

  public String getUserField10 ()
  {
    return userField10;
  }

  public void setUserField10 ( final String userField10 )
  {
    this.userField10 = userField10;
  }

  public int getCalendarId ()
  {
    return calendarId;
  }

  public void setCalendarId ( final int calendarId )
  {
    this.calendarId = calendarId;
  }
}
