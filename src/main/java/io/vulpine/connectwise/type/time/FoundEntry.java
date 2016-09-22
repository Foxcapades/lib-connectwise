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

import com.fasterxml.jackson.annotation.*;
import io.vulpine.connectwise.type.ConnectwiseCommon;

import java.util.Date;

@JsonRootName( "TimeEntryFindResult" )
@JsonIgnoreProperties( { "LastUpdate", "Description" } )
public class FoundEntry extends ConnectwiseCommon
{
  private String memberName;

  private String memberIdentifier;

  private Date startDate;

  private Date startTime;

  private Date endTime;

  private Double hoursActual;

  private Double hoursInvoiced;

  private Double hourlyRate;

  private String notes;

  private String internalNotes;

  private Integer ticketId;

  private String workRole;

  private String workType;

  private String billableOption;

  private String invoiceNumber;

  private Double hoursBilled;

  private Double hoursDeduct;

  private Integer agreementId;

  @JsonGetter( "AgreementId" )
  public Integer agreementId()
  {
    return this.agreementId;
  }

  @JsonSetter( "AgreementId" )
  public FoundEntry agreementId( final Integer agreementId )
  {
    this.agreementId = agreementId;

    return this;
  }

  @JsonGetter( "BillableOption" )
  public String billableOption()
  {
    return this.billableOption;
  }

  @JsonSetter( "BillableOption" )
  public FoundEntry billableOption( final String billableOption )
  {
    this.billableOption = billableOption;

    return this;
  }

  @JsonGetter( "EndTime" )
  public Date endTime()
  {
    return this.endTime;
  }

  @JsonSetter( "EndTime" )
  public FoundEntry endTime( final Date endTime )
  {
    this.endTime = endTime;

    return this;
  }

  @JsonGetter( "HourlyRate" )
  public Double hourlyRate()
  {
    return this.hourlyRate;
  }

  @JsonSetter( "HourlyRate" )
  public FoundEntry hourlyRate( final Double hourlyRate )
  {
    this.hourlyRate = hourlyRate;

    return this;
  }

  @JsonGetter( "HoursActual" )
  public Double hoursActual()
  {
    return this.hoursActual;
  }

  @JsonSetter( "HoursActual" )
  public FoundEntry hoursActual( final Double hoursActual )
  {
    this.hoursActual = hoursActual;

    return this;
  }

  @JsonGetter( "HoursBilled" )
  public Double hoursBilled()
  {
    return this.hoursBilled;
  }

  @JsonSetter( "HoursBilled" )
  public FoundEntry hoursBilled( final Double hoursBilled )
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
  public FoundEntry hoursDeduct( final Double hoursDeduct )
  {
    this.hoursDeduct = hoursDeduct;

    return this;
  }

  @JsonGetter( "HoursInvoiced" )
  public Double hoursInvoiced()
  {
    return this.hoursInvoiced;
  }

  @JsonSetter( "HoursInvoiced" )
  public FoundEntry hoursInvoiced( final Double hoursInvoiced )
  {
    this.hoursInvoiced = hoursInvoiced;

    return this;
  }

  @JsonGetter( "InternalNotes" )
  public String internalNotes()
  {
    return this.internalNotes;
  }

  @JsonSetter( "InternalNotes" )
  public FoundEntry internalNotes( final String internalNotes )
  {
    this.internalNotes = internalNotes;

    return this;
  }

  @JsonGetter( "InvoiceNumber" )
  public String invoiceNumber()
  {
    return this.invoiceNumber;
  }

  @JsonSetter( "InvoiceNumber" )
  public FoundEntry invoiceNumber( final String invoiceNumber )
  {
    this.invoiceNumber = invoiceNumber;

    return this;
  }

  @JsonGetter( "MemberIdentifier" )
  public String memberIdentifier()
  {
    return this.memberIdentifier;
  }

  @JsonSetter( "MemberIdentifier" )
  public FoundEntry memberIdentifier( final String memberIdentifier )
  {
    this.memberIdentifier = memberIdentifier;

    return this;
  }

  @JsonGetter( "MemberName" )
  public String memberName()
  {
    return this.memberName;
  }

  @JsonSetter( "MemberName" )
  public FoundEntry memberName( final String memberName )
  {
    this.memberName = memberName;

    return this;
  }

  @JsonGetter( "Notes" )
  public String notes()
  {
    return this.notes;
  }

  @JsonSetter( "Notes" )
  public FoundEntry notes( final String notes )
  {
    this.notes = notes;

    return this;
  }

  @JsonGetter( "StartDate" )
  public Date startDate()
  {
    return this.startDate;
  }

  @JsonSetter( "StartDate" )
  public FoundEntry startDate( final Date startDate )
  {
    this.startDate = startDate;

    return this;
  }

  @JsonGetter( "StartTime" )
  public Date startTime()
  {
    return this.startTime;
  }

  @JsonSetter( "StartTime" )
  public FoundEntry startTime( final Date startTime )
  {
    this.startTime = startTime;

    return this;
  }

  @JsonGetter( "TicketId" )
  public Integer ticketId()
  {
    return this.ticketId;
  }

  @JsonSetter( "TicketId" )
  public FoundEntry ticketId( final Integer ticketId )
  {
    this.ticketId = ticketId;

    return this;
  }

  @JsonGetter( "WorkRole" )
  public String workRole()
  {
    return this.workRole;
  }

  @JsonSetter( "WorkRole" )
  public FoundEntry workRole( final String workRole )
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
  public FoundEntry workType( final String workType )
  {
    this.workType = workType;

    return this;
  }

}
