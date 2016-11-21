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
package io.vulpine.connectwise.type.def.invoice;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.contact.Contact;
import io.vulpine.connectwise.type.def.Address;
import io.vulpine.connectwise.type.def.Company;
import io.vulpine.connectwise.type.def.gen.*;

import java.util.Date;
import java.util.List;

public interface Invoice
  extends
  HasId,
  HasTaxable,
  HasDueDate,
  HasInvoiceAmount,
  HasAgreementName,
  HasAgreementType,
  HasInvoiceType,
  HasGlPosted,
  HasBillingDelivery,
  HasBusinessUnit,
  HasTopComment,
  HasBottomComment,
  HasInvoiceNumber,
  HasLocation,
  HasProjectName,
  HasProjectNumber,
  HasPhaseName,
  HasRoutedMemberIdentifier,
  HasRoutedMemberName,
  HasStatus,
  HasTerritory,
  HasTicketNumber,
  HasTicketSummary,
  HasPaidDate,
  HasPaidAmount,
  HasLastUpdated,
  HasUpdatedBy
{
  @JsonGetter( "IsClientLocation" )
  Boolean isClientLocation();

  @JsonSetter( "IsClientLocation" )
  Invoice isClientLocation( final Boolean b );

  @JsonGetter( "Email" )
  Boolean email();

  @JsonSetter( "Email" )
  Invoice email( final Boolean b );

  @JsonGetter( "Closed" )
  Boolean closed();

  @JsonSetter( "Closed" )
  Invoice closed( final Boolean b );

  @JsonGetter( "Sent" )
  Boolean sent();

  @JsonSetter( "Sent" )
  Invoice sent( final Boolean b );

  @JsonGetter( "DownpaymentAmount" )
  Double downpaymentAmount();

  @JsonSetter( "DownpaymentAmount" )
  Invoice downpaymentAmount( final Double d );

  @JsonGetter( "ProjectBillingAmount" )
  Double projectBillingAmount();

  @JsonSetter( "ProjectBillingAmount" )
  Invoice projectBillingAmount( final Double d );

  @JsonGetter( "ProjectBillingRate" )
  Double projectBillingRate();

  @JsonSetter( "ProjectBillingRate" )
  Invoice projectBillingRate( final Double d );

  @JsonGetter( "SalesTaxAmount" )
  Double salesTaxAmount();

  @JsonSetter( "SalesTaxAmount" )
  Invoice salesTaxAmount( final Double d );

  @JsonGetter( "TaxableAmount" )
  Double taxableAmount();

  @JsonSetter( "TaxableAmount" )
  Invoice taxableAmount( final Double d );

  @JsonGetter( "TaxRate" )
  Double taxRate();

  @JsonSetter( "TaxRate" )
  Invoice taxRate( final Double d );

  @JsonGetter( "TicketBillingAmount" )
  Double ticketBillingAmount();

  @JsonSetter( "TicketBillingAmount" )
  Invoice ticketBillingAmount( final Double d );

  @JsonGetter( "DueDays" )
  Integer dueDays();

  @JsonSetter( "DueDays" )
  Invoice dueDays( final Integer i );

  @JsonGetter( "BillingMethod" )
  String billingMethod();

  @JsonSetter( "BillingMethod" )
  Invoice billingMethod( final String s );

  @JsonGetter( "BillingTerms" )
  String billingTerms();

  @JsonSetter( "BillingTerms" )
  Invoice billingTerms( final String s );

  @JsonGetter( "BillingTermsXref" )
  String billingTermsXref();

  @JsonSetter( "BillingTermsXref" )
  Invoice billingTermsXref( final String s );

  @JsonGetter( "CurrencyName" )
  String currencyName();

  @JsonSetter( "CurrencyName" )
  Invoice currencyName( final String s );

  @JsonGetter( "CurrencySymbol" )
  String currencySymbol();

  @JsonSetter( "CurrencySymbol" )
  Invoice currencySymbol( final String s );

  @JsonGetter( "GlBatchId" )
  String glBatchId();

  @JsonSetter( "GlBatchId" )
  Invoice glBatchId( final String s );

  @JsonGetter( "PoNumber" )
  String poNumber();

  @JsonSetter( "PoNumber" )
  Invoice poNumber( final String s );

  @JsonGetter( "RemitName" )
  String remitName();

  @JsonSetter( "RemitName" )
  Invoice remitName( final String s );

  @JsonGetter( "RemitPhone" )
  String remitPhone();

  @JsonSetter( "RemitPhone" )
  Invoice remitPhone( final String s );

  @JsonGetter( "SalesRepIdentifier" )
  String salesRepIdentifier();

  @JsonSetter( "SalesRepIdentifier" )
  Invoice salesRepIdentifier( final String s );

  @JsonGetter( "TaxCodeDescription" )
  String taxCodeDescription();

  @JsonSetter( "TaxCodeDescription" )
  Invoice taxCodeDescription( final String s );

  @JsonGetter( "TaxCode" )
  String taxCode();

  @JsonSetter( "TaxCode" )
  Invoice taxCode( final String s );

  @JsonGetter( "TicketResolution" )
  String ticketResolution();

  @JsonSetter( "TicketResolution" )
  Invoice ticketResolution( final String s );

  @JsonGetter( "Company" )
  Company company();

  @JsonSetter( "Company" )
  Invoice company( final Company c );

  @JsonGetter( "BillToCompany" )
  Company billToCompany();

  @JsonSetter( "BillToCompany" )
  Invoice billToCompany( final Company c );

  @JsonGetter( "Contact" )
  Contact contact();

  @JsonSetter( "Contact" )
  Invoice contact( final Contact c );

  @JsonGetter( "BillingAddress" )
  Address billingAddress();

  @JsonSetter( "BillingAddress" )
  Invoice billingAddress( final Address a );

  @JsonGetter( "RemitAddress" )
  Address remitAddress();

  @JsonSetter( "RemitAddress" )
  Invoice remitAddress( final Address a );

  @JsonGetter( "ExpenseDetails" )
  List < ExpenseDetail > expenseDetails();

  @JsonSetter( "ExpenseDetails" )
  Invoice expenseDetails( final List < ExpenseDetail > l );

  @JsonGetter( "ProductDetails" )
  List < ProductDetail > productDetails();

  @JsonSetter( "ProductDetails" )
  Invoice productDetails( final List < ProductDetail > l );

  @JsonGetter( "TimeDetails" )
  List < TimeDetail > timeDetails();

  @JsonSetter( "TimeDetails" )
  Invoice timeDetails( final List < TimeDetail > l );

  @JsonGetter( "SalesTaxDetails" )
  List < SalesTaxDetail > salesTaxDetails();

  @JsonSetter( "SalesTaxDetails" )
  Invoice salesTaxDetails( final List < SalesTaxDetail > l );

  @JsonGetter( "AgreementDetails" )
  List < AgreementDetail > agreementDetails();

  @JsonSetter( "AgreementDetails" )
  Invoice agreementDetails( final List < AgreementDetail > l );

  @JsonGetter( "ProcessingFlag" )
  Boolean processingFlag();

  @JsonSetter( "ProcessingFlag" )
  Invoice processingFlag( final Boolean b );

  @JsonGetter( "ProcessingDate" )
  Date processingDate();

  @JsonSetter( "ProcessingDate" )
  Invoice processingDate( final Date d );

  @JsonGetter( "SalesRepFullName" )
  String salesRepFullName();

  @JsonSetter( "SalesRepFullName" )
  Invoice salesRepFullName( final String s );
}
