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
package io.vulpine.connectwise.type.time;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.ConnectwiseCommon;

import java.util.Date;

@JsonRootName( "TimeEntry" )
@JsonIgnoreProperties( { "Description", "LastUpdate" } )
public class Entry extends ConnectwiseCommon
{
  private Boolean addNotesToDetailDescription;

  private Boolean addNotesToInternalAnalysis;

  private Boolean addNotesToResolution;

  private Boolean overnight;

  private Date dateStart;

  private Date timeStart;

  private Date timeEnd;

  private Double actualHours;

  private Double hoursBilled;

  private Double hoursDeduct;

  private Integer activityId;

  private Integer agreementId;

  private Integer ticketId;

  private String chargeCode;

  private String internalNotes;

  private String memberIdentifier;

  private String notes;

  private String lastUpdatedUTC;

  private String lastUpdated;

  private String responseMessage;

  private String workType;

  private String workRole;

  @JsonGetter( "ActivityId" )
  public Integer activityId()
  {
    return this.activityId;
  }

  @JsonSetter( "ActivityId" )
  public Entry activityId( final Integer activityId )
  {
    this.activityId = activityId;

    return this;
  }

  @JsonGetter( "ActualHours" )
  public Double actualHours()
  {
    return this.actualHours;
  }

  @JsonSetter( "ActualHours" )
  public Entry actualHours( final Double actualHours )
  {
    this.actualHours = actualHours;

    return this;
  }

  @JsonGetter( "AddNotesToDetailDescription" )
  public Boolean addNotesToDetailDescription()
  {
    return this.addNotesToDetailDescription;
  }

  @JsonSetter( "AddNotesToDetailDescription" )
  public Entry addNotesToDetailDescription( final Boolean addNotesToDetailDescription )
  {
    this.addNotesToDetailDescription = addNotesToDetailDescription;

    return this;
  }

  @JsonGetter( "AddNotesToInternalAnalysis" )
  public Boolean addNotesToInternalAnalysis()
  {
    return this.addNotesToInternalAnalysis;
  }

  @JsonSetter( "AddNotesToInternalAnalysis" )
  public Entry addNotesToInternalAnalysis( final Boolean addNotesToInternalAnalysis )
  {
    this.addNotesToInternalAnalysis = addNotesToInternalAnalysis;

    return this;
  }

  @JsonGetter( "AddNotesToResolution" )
  public Boolean addNotesToResolution()
  {
    return this.addNotesToResolution;
  }

  @JsonSetter( "AddNotesToResolution" )
  public Entry addNotesToResolution( final Boolean addNotesToResolution )
  {
    this.addNotesToResolution = addNotesToResolution;

    return this;
  }

  @JsonGetter( "AgreementId" )
  public Integer agreementId()
  {
    return this.agreementId;
  }

  @JsonSetter( "AgreementId" )
  public Entry agreementId( final Integer agreementId )
  {
    this.agreementId = agreementId;

    return this;
  }

  @JsonGetter( "ChargeCode" )
  public String chargeCode()
  {
    return this.chargeCode;
  }

  @JsonSetter( "ChargeCode" )
  public Entry chargeCode( final String chargeCode )
  {
    this.chargeCode = chargeCode;

    return this;
  }

  @JsonGetter( "DateStart" )
  public Date dateStart()
  {
    return this.dateStart;
  }

  @JsonSetter( "DateStart" )
  public Entry dateStart( final Date dateStart )
  {
    this.dateStart = dateStart;

    return this;
  }

  @JsonGetter( "HoursBilled" )
  public Double hoursBilled()
  {
    return this.hoursBilled;
  }

  @JsonSetter( "HoursBilled" )
  public Entry hoursBilled( final Double hoursBilled )
  {
    this.hoursBilled = hoursBilled;

    return this;
  }

  @JsonGetter( "HoursDeduct" )
  public Double hoursDeduct()
  {
    return this.hoursDeduct;
  }

  @JsonSetter( "HoursDeduct" )
  public Entry hoursDeduct( final Double hoursDeduct )
  {
    this.hoursDeduct = hoursDeduct;

    return this;
  }

  @JsonGetter( "InternalNotes" )
  public String internalNotes()
  {
    return this.internalNotes;
  }

  @JsonSetter( "InternalNotes" )
  public Entry internalNotes( final String internalNotes )
  {
    this.internalNotes = internalNotes;

    return this;
  }

  @JsonGetter( "LastUpdated" )
  public String lastUpdatedString()
  {
    return this.lastUpdated;
  }

  @JsonSetter( "LastUpdated" )
  public Entry lastUpdatedString( final String lastUpdated )
  {
    this.lastUpdated = lastUpdated;

    return this;
  }

  @JsonGetter( "LastUpdatedUTC" )
  public String lastUpdatedUTC()
  {
    return this.lastUpdatedUTC;
  }

  @JsonSetter( "LastUpdatedUTC" )
  public Entry lastUpdatedUTC( final String lastUpdatedUTC )
  {
    this.lastUpdatedUTC = lastUpdatedUTC;

    return this;
  }

  @JsonGetter( "MemberIdentifier" )
  public String memberIdentifier()
  {
    return this.memberIdentifier;
  }

  @JsonSetter( "MemberIdentifier" )
  public Entry memberIdentifier( final String memberIdentifier )
  {
    this.memberIdentifier = memberIdentifier;

    return this;
  }

  @JsonGetter( "Notes" )
  public String notes()
  {
    return this.notes;
  }

  @JsonSetter( "Notes" )
  public Entry notes( final String notes )
  {
    this.notes = notes;

    return this;
  }

  @JsonGetter( "Overnight" )
  public Boolean overnight()
  {
    return this.overnight;
  }

  @JsonSetter( "Overnight" )
  public Entry overnight( final Boolean overnight )
  {
    this.overnight = overnight;

    return this;
  }

  @JsonGetter( "ResponseMessage" )
  public String responseMessage()
  {
    return this.responseMessage;
  }

  @JsonSetter( "ResponseMessage" )
  public Entry responseMessage( final String responseMessage )
  {
    this.responseMessage = responseMessage;

    return this;
  }

  @JsonGetter( "TicketId" )
  public Integer ticketId()
  {
    return this.ticketId;
  }

  @JsonSetter( "TicketId" )
  public Entry ticketId( final Integer ticketId )
  {
    this.ticketId = ticketId;

    return this;
  }

  @JsonGetter( "TimeEnd" )
  public Date timeEnd()
  {
    return this.timeEnd;
  }

  @JsonSetter( "TimeEnd" )
  public Entry timeEnd( final Date timeEnd )
  {
    this.timeEnd = timeEnd;

    return this;
  }

  @JsonGetter( "TimeStart" )
  public Date timeStart()
  {
    return this.timeStart;
  }

  @JsonSetter( "TimeStart" )
  public Entry timeStart( final Date timeStart )
  {
    this.timeStart = timeStart;

    return this;
  }

  @JsonGetter( "WorkRole" )
  public String workRole()
  {
    return this.workRole;
  }

  @JsonSetter( "WorkRole" )
  public Entry workRole( final String workRole )
  {
    this.workRole = workRole;

    return this;
  }

  @JsonGetter( "WorkType" )
  public String workType()
  {
    return this.workType;
  }

  @JsonSetter( "WorkType" )
  public Entry workType( final String workType )
  {
    this.workType = workType;

    return this;
  }
}
