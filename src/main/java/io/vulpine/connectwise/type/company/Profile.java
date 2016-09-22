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

public class Profile
{
  protected String sicCode;

  protected String sicDescription;

  protected Integer revenueYear;

  protected Double annualRevenue;

  protected Integer numberOfEmployees;

  protected Integer parentCompanyId;

  protected String ownershipType;

  protected String timeZone;

  protected String leadSource;

  protected Boolean isLead;

  protected Boolean isUnsubscribedFromEmail;

  protected String userField1;

  protected String userField2;

  protected String userField3;

  protected String userField4;

  protected String userField5;

  protected String userField6;

  protected String userField7;

  protected String userField8;

  protected String userField9;

  protected String userField10;

  protected Integer calendarId;

  @JsonGetter( "AnnualRevenue" )
  public Double annualRevenue()
  {
    return annualRevenue;
  }

  @JsonSetter( "AnnualRevenue" )
  public Profile annualRevenue( final Double annualRevenue )
  {
    this.annualRevenue = annualRevenue;

    return this;
  }

  @JsonGetter( "CalendarId" )
  public Integer calendarId()
  {
    return calendarId;
  }

  @JsonSetter( "CalendarId" )
  public Profile calendarId( final Integer calendarId )
  {
    this.calendarId = calendarId;

    return this;
  }

  @JsonGetter( "LeadSource" )
  public String leadSource()
  {
    return leadSource;
  }

  @JsonSetter( "LeadSource" )
  public Profile leadSource( final String leadSource )
  {
    this.leadSource = leadSource;

    return this;
  }

  @JsonGetter( "NumberOfEmployees" )
  public Integer numberOfEmployees()
  {
    return numberOfEmployees;
  }

  @JsonSetter( "NumberOfEmployees" )
  public Profile numberOfEmployees( final Integer numberOfEmployees )
  {
    this.numberOfEmployees = numberOfEmployees;

    return this;
  }

  @JsonGetter( "OwnershipType" )
  public String ownershipType()
  {
    return ownershipType;
  }

  @JsonSetter( "OwnershipType" )
  public Profile ownershipType( final String ownershipType )
  {
    this.ownershipType = ownershipType;

    return this;
  }

  @JsonGetter( "ParentCompanyId" )
  public Integer parentCompanyId()
  {
    return parentCompanyId;
  }

  @JsonSetter( "ParentCompanyId" )
  public Profile parentCompanyId( final Integer parentCompanyId )
  {
    this.parentCompanyId = parentCompanyId;

    return this;
  }

  @JsonGetter( "RevenueYear" )
  public Integer revenueYear()
  {
    return revenueYear;
  }

  @JsonSetter( "RevenueYear" )
  public Profile revenueYear( final Integer revenueYear )
  {
    this.revenueYear = revenueYear;

    return this;
  }

  @JsonGetter( "SicCode" )
  public String sicCode()
  {
    return sicCode;
  }

  @JsonSetter( "SicCode" )
  public Profile sicCode( final String sicCode )
  {
    this.sicCode = sicCode;

    return this;
  }

  @JsonGetter( "SicDescription" )
  public String sicDescription()
  {
    return sicDescription;
  }

  @JsonSetter( "SicDescription" )
  public Profile sicDescription( final String sicDescription )
  {
    this.sicDescription = sicDescription;

    return this;
  }

  @JsonGetter( "TimeZone" )
  public String timeZone()
  {
    return timeZone;
  }

  @JsonSetter( "TimeZone" )
  public Profile timeZone( final String timeZone )
  {
    this.timeZone = timeZone;

    return this;
  }

  @JsonGetter( "UserField1" )
  public String userField1()
  {
    return userField1;
  }

  @JsonSetter( "UserField1" )
  public Profile userField1( final String userField1 )
  {
    this.userField1 = userField1;

    return this;
  }

  @JsonGetter( "UserField10" )
  public String userField10()
  {
    return userField10;
  }

  @JsonSetter( "UserField10" )
  public Profile userField10( final String userField10 )
  {
    this.userField10 = userField10;

    return this;
  }

  @JsonGetter( "UserField2" )
  public String userField2()
  {
    return userField2;
  }

  @JsonSetter( "UserField2" )
  public Profile userField2( final String userField2 )
  {
    this.userField2 = userField2;

    return this;
  }

  @JsonGetter( "UserField3" )
  public String userField3()
  {
    return userField3;
  }

  @JsonSetter( "UserField3" )
  public Profile userField3( final String userField3 )
  {
    this.userField3 = userField3;

    return this;
  }

  @JsonGetter( "UserField4" )
  public String userField4()
  {
    return userField4;
  }

  @JsonSetter( "UserField4" )
  public Profile userField4( final String userField4 )
  {
    this.userField4 = userField4;

    return this;
  }

  @JsonGetter( "UserField5" )
  public String userField5()
  {
    return userField5;
  }

  @JsonSetter( "UserField5" )
  public Profile userField5( final String userField5 )
  {
    this.userField5 = userField5;

    return this;
  }

  @JsonGetter( "UserField6" )
  public String userField6()
  {
    return userField6;
  }

  @JsonSetter( "UserField6" )
  public Profile userField6( final String userField6 )
  {
    this.userField6 = userField6;

    return this;
  }

  @JsonGetter( "UserField7" )
  public String userField7()
  {
    return userField7;
  }

  @JsonSetter( "UserField7" )
  public Profile userField7( final String userField7 )
  {
    this.userField7 = userField7;

    return this;
  }

  @JsonGetter( "UserField8" )
  public String userField8()
  {
    return userField8;
  }

  @JsonSetter( "UserField8" )
  public Profile userField8( final String userField8 )
  {
    this.userField8 = userField8;

    return this;
  }

  @JsonGetter( "UserField9" )
  public String userField9()
  {
    return userField9;
  }

  @JsonSetter( "UserField9" )
  public Profile userField9( final String userField9 )
  {
    this.userField9 = userField9;

    return this;
  }

  @JsonGetter( "IsLead" )
  public Boolean lead()
  {
    return isLead;
  }

  @JsonSetter( "IsLead" )
  public Profile lead( final Boolean lead )
  {
    isLead = lead;

    return this;
  }

  @JsonGetter( "IsUnsubscribedFromEmail" )
  public Boolean unsubscribedFromEmail()
  {
    return isUnsubscribedFromEmail;
  }

  @JsonSetter( "IsUnsubscribedFromEmail" )
  public Profile unsubscribedFromEmail( final Boolean unsubscribedFromEmail )
  {
    isUnsubscribedFromEmail = unsubscribedFromEmail;

    return this;
  }
}
