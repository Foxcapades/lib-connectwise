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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.ConnectwiseCommon;

import java.util.Date;

public class Invoice extends ConnectwiseCommon
{
  private Boolean isClientLocation;

  private Boolean taxable;

  private Boolean email;

  private Boolean closed;

  private Boolean sent;

  private Boolean glPosted;

  private Date dueDate;

  private Date invoiceDate;

  private String invoiceType;

  private Double downpaymentAmount;

  private Double invoiceAmount;

  private Double projectBillingAmount;

  private Double projectBillingRate;

  private Double salesTaxAmount;

  private Double taxableAmount;

  private Double taxRate;

  private Double ticketBillingAmount;

  private Integer dueDays;

  private String agreementName;

  private String agreementType;

  private String billingDelivery;

  private String billingMethod;

  private String billingTerms;

  private String billingTermsXref;

  private String businessUnit;

  private String currencyName;

  private String currencySymbol;

  private String glBatchId;

  private String topComment;

  private String bottomComment;

  private String invoiceNumber;

  private String location;

  private String poNumber;

  private String projectName;

  private Integer projectNumber;

  private String phaseName;

  private String routedMemberIdentifier;

  private String routedMemberName;

  private String remitName;

  private String remitPhone;

  private String salesRepIdentifier;

  private String status;

  private String taxCodeDescription;

  private String taxCode;

  private String territory;

  private Integer ticketNumber;

  private String ticketResolution;

  private String ticketSummary;

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

  @JsonGetter( "BillingMethod" )
  public String billingMethod()
  {
    return this.billingMethod;
  }

  @JsonSetter( "BillingMethod" )
  public void billingMethod( final String billingMethod )
  {
    this.billingMethod = billingMethod;
  }

  @JsonGetter( "BillingTerms" )
  public String billingTerms()
  {
    return this.billingTerms;
  }

  @JsonSetter( "BillingTerms" )
  public void billingTerms( final String billingTerms )
  {
    this.billingTerms = billingTerms;
  }

  @JsonGetter( "BillingTermsXref" )
  public String billingTermsXref()
  {
    return this.billingTermsXref;
  }

  @JsonSetter( "BillingTermsXref" )
  public void billingTermsXref( final String billingTermsXref )
  {
    this.billingTermsXref = billingTermsXref;
  }

  @JsonGetter( "BottomComment" )
  public String bottomComment()
  {
    return this.bottomComment;
  }

  @JsonSetter( "BottomComment" )
  public void bottomComment( final String bottomComment )
  {
    this.bottomComment = bottomComment;
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

  @JsonGetter( "CurrencyName" )
  public String currencyName()
  {
    return this.currencyName;
  }

  @JsonSetter( "CurrencyName" )
  public void currencyName( final String currencyName )
  {
    this.currencyName = currencyName;
  }

  @JsonGetter( "CurrencySymbol" )
  public String currencySymbol()
  {
    return this.currencySymbol;
  }

  @JsonSetter( "CurrencySymbol" )
  public void currencySymbol( final String currencySymbol )
  {
    this.currencySymbol = currencySymbol;
  }

  @JsonGetter( "DownpaymentAmount" )
  public Double downpaymentAmount()
  {
    return this.downpaymentAmount;
  }

  @JsonSetter( "DownpaymentAmount" )
  public void downpaymentAmount( final Double downpaymentAmount )
  {
    this.downpaymentAmount = downpaymentAmount;
  }

  @JsonGetter( "DueDate" )
  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  public Date dueDate()
  {
    return this.dueDate;
  }

  @JsonSetter( "DueDate" )
  public void dueDate( final Date dueDate )
  {
    this.dueDate = dueDate;
  }

  @JsonGetter( "DueDays" )
  public Integer dueDays()
  {
    return this.dueDays;
  }

  @JsonSetter( "DueDays" )
  public void dueDays( final Integer dueDays )
  {
    this.dueDays = dueDays;
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

  @JsonGetter( "GlBatchId" )
  public String glBatchId()
  {
    return this.glBatchId;
  }

  @JsonSetter( "GlBatchId" )
  public void glBatchId( final String glBatchId )
  {
    this.glBatchId = glBatchId;
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
  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
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

  @JsonGetter( "IsClientLocation" )
  public Boolean isClientLocation()
  {
    return this.isClientLocation;
  }

  @JsonSetter( "IsClientLocation" )
  public void isClientLocation( final Boolean isClientLocation )
  {
    this.isClientLocation = isClientLocation;
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

  @JsonGetter( "PoNumber" )
  public String poNumber()
  {
    return this.poNumber;
  }

  @JsonSetter( "PoNumber" )
  public void poNumber( final String poNumber )
  {
    this.poNumber = poNumber;
  }

  @JsonGetter( "ProjectBillingAmount" )
  public Double projectBillingAmount()
  {
    return this.projectBillingAmount;
  }

  @JsonSetter( "ProjectBillingAmount" )
  public void projectBillingAmount( final Double projectBillingAmount )
  {
    this.projectBillingAmount = projectBillingAmount;
  }

  @JsonGetter( "ProjectBillingRate" )
  public Double projectBillingRate()
  {
    return this.projectBillingRate;
  }

  @JsonSetter( "ProjectBillingRate" )
  public void projectBillingRate( final Double projectBillingRate )
  {
    this.projectBillingRate = projectBillingRate;
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

  @JsonGetter( "ProjectNumber" )
  public Integer projectNumber()
  {
    return this.projectNumber;
  }

  @JsonSetter( "ProjectNumber" )
  public void projectNumber( final Integer projectNumber )
  {
    this.projectNumber = projectNumber;
  }

  @JsonGetter( "RemitName" )
  public String remitName()
  {
    return this.remitName;
  }

  @JsonSetter( "RemitName" )
  public void remitName( final String remitName )
  {
    this.remitName = remitName;
  }

  @JsonGetter( "RemitPhone" )
  public String remitPhone()
  {
    return this.remitPhone;
  }

  @JsonSetter( "RemitPhone" )
  public void remitPhone( final String remitPhone )
  {
    this.remitPhone = remitPhone;
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

  @JsonGetter( "SalesRepIdentifier" )
  public String salesRepIdentifier()
  {
    return this.salesRepIdentifier;
  }

  @JsonSetter( "SalesRepIdentifier" )
  public void salesRepIdentifier( final String salesRepIdentifier )
  {
    this.salesRepIdentifier = salesRepIdentifier;
  }

  @JsonGetter( "SalesTaxAmount" )
  public Double salesTaxAmount()
  {
    return this.salesTaxAmount;
  }

  @JsonSetter( "SalesTaxAmount" )
  public void salesTaxAmount( final Double salesTaxAmount )
  {
    this.salesTaxAmount = salesTaxAmount;
  }

  @JsonGetter( "Sent" )
  public Boolean sent()
  {
    return this.sent;
  }

  @JsonSetter( "Sent" )
  public void sent( final Boolean sent )
  {
    this.sent = sent;
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

  @JsonGetter( "TaxCode" )
  public String taxCode()
  {
    return this.taxCode;
  }

  @JsonSetter( "TaxCode" )
  public void taxCode( final String taxCode )
  {
    this.taxCode = taxCode;
  }

  @JsonGetter( "TaxCodeDescription" )
  public String taxCodeDescription()
  {
    return this.taxCodeDescription;
  }

  @JsonSetter( "TaxCodeDescription" )
  public void taxCodeDescription( final String taxCodeDescription )
  {
    this.taxCodeDescription = taxCodeDescription;
  }

  @JsonGetter( "TaxRate" )
  public Double taxRate()
  {
    return this.taxRate;
  }

  @JsonSetter( "TaxRate" )
  public void taxRate( final Double taxRate )
  {
    this.taxRate = taxRate;
  }

  @JsonGetter( "Taxable" )
  public Boolean taxable()
  {
    return this.taxable;
  }

  @JsonSetter( "Taxable" )
  public void taxable( final Boolean taxable )
  {
    this.taxable = taxable;
  }

  @JsonGetter( "TaxableAmount" )
  public Double taxableAmount()
  {
    return this.taxableAmount;
  }

  @JsonSetter( "TaxableAmount" )
  public void taxableAmount( final Double taxableAmount )
  {
    this.taxableAmount = taxableAmount;
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

  @JsonGetter( "TicketBillingAmount" )
  public Double ticketBillingAmount()
  {
    return this.ticketBillingAmount;
  }

  @JsonSetter( "TicketBillingAmount" )
  public void ticketBillingAmount( final Double ticketBillingAmount )
  {
    this.ticketBillingAmount = ticketBillingAmount;
  }

  @JsonGetter( "TicketNumber" )
  public Integer ticketNumber()
  {
    return this.ticketNumber;
  }

  @JsonSetter( "TicketNumber" )
  public void ticketNumber( final Integer ticketNumber )
  {
    this.ticketNumber = ticketNumber;
  }

  @JsonGetter( "TicketResolution" )
  public String ticketResolution()
  {
    return this.ticketResolution;
  }

  @JsonSetter( "TicketResolution" )
  public void ticketResolution( final String ticketResolution )
  {
    this.ticketResolution = ticketResolution;
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

  @JsonGetter( "TopComment" )
  public String topComment()
  {
    return this.topComment;
  }

  @JsonSetter( "TopComment" )
  public void topComment( final String topComment )
  {
    this.topComment = topComment;
  }
}
