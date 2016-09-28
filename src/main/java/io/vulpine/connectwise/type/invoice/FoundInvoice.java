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
package io.vulpine.connectwise.type.invoice;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Date;

public class FoundInvoice
{
  private Integer     id;
  private String  billingTypeIdentifier;
  private String  agreementName;
  private String  agreementType;
  private String  businessUnit;
  private String  location;
  private String  companyName;
  private Integer     TicketNumber;
  private String  ticketSummary;
  private Date    invoiceDate;
  private Date    dueDate;
  private String  status;
  private String  invoiceType;
  private String  projectName;
  private String  phaseName;
  private String  territory;
  private Boolean closed;
  private Boolean email;
  private String  invoiceNumber;
  private Boolean glPosted;
  private String  glBatchIdentifier;
  private String  billingDelivery;
  private String  routedMemberIdentifier;
  private String  routedMemberName;
  private Double  invoiceAmount;
  private Integer     contactId;
  private Integer     companyId;
  private Integer     statusId;
  private Double  paidAmount;
  private Date    paidDate;
  private Integer     projectId;
  private Integer     agreementId;
  private String  updatedBy;
  private Date    lastUpdated;

  @JsonGetter( "AgreementId" )
  public Integer agreementId()
  {
    return this.agreementId;
  }

  @JsonSetter( "AgreementId" )
  public void agreementId( final Integer agreementId )
  {
    this.agreementId = agreementId;
  }

  @JsonGetter( "AgreementName" )
  public String agreementName()
  {
    return this.agreementName;
  }

  @JsonSetter( "AgreementName" )
  public void agreementName( final String agreementName )
  {
    this.agreementName = agreementName;
  }

  @JsonGetter( "AgreementType" )
  public String agreementType()
  {
    return this.agreementType;
  }

  @JsonSetter( "AgreementType" )
  public void agreementType( final String agreementType )
  {
    this.agreementType = agreementType;
  }

  @JsonGetter( "BillingDelivery" )
  public String billingDelivery()
  {
    return this.billingDelivery;
  }

  @JsonSetter( "BillingDelivery" )
  public void billingDelivery( final String billingDelivery )
  {
    this.billingDelivery = billingDelivery;
  }

  @JsonGetter( "BillingTypeIdentifier" )
  public String billingTypeIdentifier()
  {
    return this.billingTypeIdentifier;
  }

  @JsonSetter( "BillingTypeIdentifier" )
  public void billingTypeIdentifier( final String billingTypeIdentifier )
  {
    this.billingTypeIdentifier = billingTypeIdentifier;
  }

  @JsonGetter( "BusinessUnit" )
  public String businessUnit()
  {
    return this.businessUnit;
  }

  @JsonSetter( "BusinessUnit" )
  public void businessUnit( final String businessUnit )
  {
    this.businessUnit = businessUnit;
  }

  @JsonGetter( "Closed" )
  public Boolean closed()
  {
    return this.closed;
  }

  @JsonSetter( "Closed" )
  public void closed( final Boolean closed )
  {
    this.closed = closed;
  }

  @JsonGetter( "CompanyId" )
  public Integer companyId()
  {
    return this.companyId;
  }

  @JsonSetter( "CompanyId" )
  public void companyId( final Integer companyId )
  {
    this.companyId = companyId;
  }

  @JsonGetter( "CompanyName" )
  public String companyName()
  {
    return this.companyName;
  }

  @JsonSetter( "CompanyName" )
  public void companyName( final String companyName )
  {
    this.companyName = companyName;
  }

  @JsonGetter( "ContactId" )
  public Integer contactId()
  {
    return this.contactId;
  }

  @JsonSetter( "ContactId" )
  public void contactId( final Integer contactId )
  {
    this.contactId = contactId;
  }

  @JsonGetter( "DueDate" )
  public Date dueDate()
  {
    return this.dueDate;
  }

  @JsonSetter( "DueDate" )
  public void dueDate( final Date dueDate )
  {
    this.dueDate = dueDate;
  }

  @JsonGetter( "Email" )
  public Boolean email()
  {
    return this.email;
  }

  @JsonSetter( "Email" )
  public void email( final Boolean email )
  {
    this.email = email;
  }

  @JsonGetter( "GlBatchIdentifier" )
  public String glBatchIdentifier()
  {
    return this.glBatchIdentifier;
  }

  @JsonSetter( "GlBatchIdentifier" )
  public void glBatchIdentifier( final String glBatchIdentifier )
  {
    this.glBatchIdentifier = glBatchIdentifier;
  }

  @JsonGetter( "GlPosted" )
  public Boolean glPosted()
  {
    return this.glPosted;
  }

  @JsonSetter( "GlPosted" )
  public void glPosted( final Boolean glPosted )
  {
    this.glPosted = glPosted;
  }

  @JsonGetter( "Id" )
  public Integer id()
  {
    return this.id;
  }

  @JsonSetter( "Id" )
  public void id( final Integer id )
  {
    this.id = id;
  }

  @JsonGetter( "InvoiceAmount" )
  public Double invoiceAmount()
  {
    return this.invoiceAmount;
  }

  @JsonSetter( "InvoiceAmount" )
  public void invoiceAmount( final Double invoiceAmount )
  {
    this.invoiceAmount = invoiceAmount;
  }

  @JsonGetter( "InvoiceDate" )
  public Date invoiceDate()
  {
    return this.invoiceDate;
  }

  @JsonSetter( "InvoiceDate" )
  public void invoiceDate( final Date invoiceDate )
  {
    this.invoiceDate = invoiceDate;
  }

  @JsonGetter( "InvoiceNumber" )
  public String invoiceNumber()
  {
    return this.invoiceNumber;
  }

  @JsonSetter( "InvoiceNumber" )
  public void invoiceNumber( final String invoiceNumber )
  {
    this.invoiceNumber = invoiceNumber;
  }

  @JsonGetter( "InvoiceType" )
  public String invoiceType()
  {
    return this.invoiceType;
  }

  @JsonSetter( "InvoiceType" )
  public void invoiceType( final String invoiceType )
  {
    this.invoiceType = invoiceType;
  }

  @JsonGetter( "LastUpdated" )
  public Date lastUpdated()
  {
    return this.lastUpdated;
  }

  @JsonSetter( "LastUpdated" )
  public void lastUpdated( final Date lastUpdated )
  {
    this.lastUpdated = lastUpdated;
  }

  @JsonGetter( "Location" )
  public String location()
  {
    return this.location;
  }

  @JsonSetter( "Location" )
  public void location( final String location )
  {
    this.location = location;
  }

  @JsonGetter( "PaidAmount" )
  public Double paidAmount()
  {
    return this.paidAmount;
  }

  @JsonSetter( "PaidAmount" )
  public void paidAmount( final Double paidAmount )
  {
    this.paidAmount = paidAmount;
  }

  @JsonGetter( "PaidDate" )
  public Date paidDate()
  {
    return this.paidDate;
  }

  @JsonSetter( "PaidDate" )
  public void paidDate( final Date paidDate )
  {
    this.paidDate = paidDate;
  }

  @JsonGetter( "PhaseName" )
  public String phaseName()
  {
    return this.phaseName;
  }

  @JsonSetter( "PhaseName" )
  public void phaseName( final String phaseName )
  {
    this.phaseName = phaseName;
  }

  @JsonGetter( "ProjectId" )
  public Integer projectId()
  {
    return this.projectId;
  }

  @JsonSetter( "ProjectId" )
  public void projectId( final Integer projectId )
  {
    this.projectId = projectId;
  }

  @JsonGetter( "ProjectName" )
  public String projectName()
  {
    return this.projectName;
  }

  @JsonSetter( "ProjectName" )
  public void projectName( final String projectName )
  {
    this.projectName = projectName;
  }

  @JsonGetter( "RoutedMemberIdentifier" )
  public String routedMemberIdentifier()
  {
    return this.routedMemberIdentifier;
  }

  @JsonSetter( "RoutedMemberIdentifier" )
  public void routedMemberIdentifier( final String routedMemberIdentifier )
  {
    this.routedMemberIdentifier = routedMemberIdentifier;
  }

  @JsonGetter( "RoutedMemberName" )
  public String routedMemberName()
  {
    return this.routedMemberName;
  }

  @JsonSetter( "RoutedMemberName" )
  public void routedMemberName( final String routedMemberName )
  {
    this.routedMemberName = routedMemberName;
  }

  @JsonGetter( "Status" )
  public String status()
  {
    return this.status;
  }

  @JsonSetter( "Status" )
  public void status( final String status )
  {
    this.status = status;
  }

  @JsonGetter( "StatusId" )
  public Integer statusId()
  {
    return this.statusId;
  }

  @JsonSetter( "StatusId" )
  public void statusId( final Integer statusId )
  {
    this.statusId = statusId;
  }

  @JsonGetter( "Territory" )
  public String territory()
  {
    return this.territory;
  }

  @JsonSetter( "Territory" )
  public void territory( final String territory )
  {
    this.territory = territory;
  }

  @JsonGetter( "TicketSummary" )
  public String ticketSummary()
  {
    return this.ticketSummary;
  }

  @JsonSetter( "TicketSummary" )
  public void ticketSummary( final String ticketSummary )
  {
    this.ticketSummary = ticketSummary;
  }

  @JsonGetter( "UpdatedBy" )
  public String updatedBy()
  {
    return this.updatedBy;
  }

  @JsonSetter( "UpdatedBy" )
  public void updatedBy( final String updatedBy )
  {
    this.updatedBy = updatedBy;
  }

}
