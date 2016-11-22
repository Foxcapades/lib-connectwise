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

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.vulpine.connectwise.type.contact.Contact;
import io.vulpine.connectwise.type.def.Address;
import io.vulpine.connectwise.type.def.Company;
import io.vulpine.connectwise.type.def.gen.field.*;
import io.vulpine.connectwise.util.*;

import java.util.Date;
import java.util.List;

public interface FieldInvoice
extends
  Invoice,
  HasIdField,
  HasTaxableField,
  HasDueDateField,
  HasAgreementNameField,
  HasAgreementTypeField,
  HasGlPostedField,
  HasBillingDeliveryField,
  HasBusinessUnitField,
  HasTopCommentField < String >,
  HasBottomCommentField < String >,
  HasLocationField,
  HasProjectNameField,
  HasProjectNumberField,
  HasPhaseNameField,
  HasStatusField,
  HasTicketNumberField,
  HasTicketSummaryField,
  HasPaidDateField,
  HasPaidAmountField,
  HasInvoiceAmountField,
  HasInvoiceNumberField,
  HasInvoiceTypeField,
  HasLastUpdatedField,
  HasRoutedMemberIdentifierField,
  HasRoutedMemberNameField,
  HasTerritoryField,
  HasUpdatedByField,
  HasEmailField < Boolean >
{
  @Override
  default FieldInvoice lastUpdated( final Date d )
  {
    lastUpdatedField().set(d);
    return this;
  }

  @Override
  default FieldInvoice invoiceAmount( final Double d )
  {
    invoiceAmountField().set(d);
    return this;
  }

  @Override
  default FieldInvoice businessUnit( final String s )
  {
    businessUnitField().set(s);
    return this;
  }

  @Override
  default FieldInvoice routedMemberIdentifier( final String s )
  {
    routedMemberIdentifierField().set(s);
    return this;
  }

  @Override
  default FieldInvoice routedMemberName( final String s )
  {
    routedMemberNameField().set(s);
    return this;
  }

  @Override
  default FieldInvoice projectNumber( final Integer i )
  {
    projectNumberField().set(i);
    return this;
  }

  @Override
  default FieldInvoice invoiceNumber( final String s )
  {
    invoiceNumberField().set(s);
    return this;
  }

  @Override
  default FieldInvoice paidDate( final Date d )
  {
    paidDateField().set(d);
    return this;
  }

  @Override
  default FieldInvoice projectName( final String s )
  {
    projectNameField().set(s);
    return this;
  }

  @Override
  default FieldInvoice invoiceType( final String s )
  {
    invoiceTypeField().set(s);
    return this;
  }

  @Override
  default FieldInvoice paidAmount( final Double d )
  {
    paidAmountField().set(d);
    return this;
  }

  @Override
  default FieldInvoice phaseName( final String s )
  {
    phaseNameField().set(s);
    return this;
  }

  @Override
  default FieldInvoice status( final String s )
  {
    statusField().set(s);
    return this;
  }

  @Override
  default FieldInvoice glPosted( final Boolean b )
  {
    glPostedField().set(b);
    return this;
  }

  @Override
  default FieldInvoice bottomComment( final String s )
  {
    bottomCommentField().set(s);
    return this;
  }

  @Override
  default FieldInvoice billingDelivery( final String s )
  {
    billingDeliveryField().set(s);
    return this;
  }

  @Override
  default FieldInvoice id( final Integer i )
  {
    idField().set(i);
    return this;
  }

  @Override
  default FieldInvoice agreementName( final String s )
  {
    agreementNameField().set(s);
    return this;
  }

  @Override
  default FieldInvoice taxable( final Boolean b )
  {
    taxableField().set(b);
    return this;
  }

  @Override
  default FieldInvoice territory( final String t )
  {
    territoryField().set(t);
    return this;
  }

  @Override
  default FieldInvoice updatedBy( final String s )
  {
    updatedByField().set(s);
    return this;
  }

  @Override
  default FieldInvoice topComment( final String s )
  {
    topCommentField().set(s);
    return this;
  }

  @Override
  default FieldInvoice ticketNumber( final Integer i )
  {
    ticketNumberField().set(i);
    return this;
  }

  @Override
  default FieldInvoice ticketSummary( final String s )
  {
    ticketSummaryField().set(s);
    return this;
  }

  @Override
  default FieldInvoice location( final String s )
  {
    locationField().set(s);
    return this;
  }

  @Override
  default FieldInvoice dueDate( final Date d )
  {
    dueDateField().set(d);
    return this;
  }

  @Override
  default FieldInvoice agreementType( final String s )
  {
    agreementTypeField().set(s);
    return this;
  }

  @Override
  default FieldInvoice email( final Boolean b )
  {
    emailField().set(b);
    return this;
  }

  @JsonIgnore
  BooleanField isClientLocationField();

  @Override
  default Boolean isClientLocation()
  {
    return isClientLocationField().get();
  }

  @Override
  default Invoice isClientLocation( final Boolean b )
  {
    isClientLocationField().set(b);
    return this;
  }

  @JsonIgnore
  BooleanField closedField();

  @Override
  default Boolean closed()
  {
    return closedField().get();
  }

  @Override
  default Invoice closed( final Boolean b )
  {
    closedField().set(b);
    return this;
  }

  @JsonIgnore
  BooleanField sentField();

  @Override
  default Boolean sent()
  {
    return sentField().get();
  }

  @Override
  default Invoice sent( final Boolean b )
  {
    sentField().set(b);
    return this;
  }

  @JsonIgnore
  NumberField < Double > downpaymentAmountField();

  @Override
  default Double downpaymentAmount()
  {
    return downpaymentAmountField().get();
  }

  @Override
  default Invoice downpaymentAmount( final Double d )
  {
    downpaymentAmountField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Double > projectBillingAmountField();

  @Override
  default Double projectBillingAmount()
  {
    return projectBillingAmountField().get();
  }

  @Override
  default Invoice projectBillingAmount( final Double d )
  {
    projectBillingAmountField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Double > projectBillingRateField();

  @Override
  default Double projectBillingRate()
  {
    return projectBillingRateField().get();
  }

  @Override
  default Invoice projectBillingRate( final Double d )
  {
    projectBillingRateField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Double > salesTaxAmountField();

  @Override
  default Double salesTaxAmount()
  {
    return salesTaxAmountField().get();
  }

  @Override
  default Invoice salesTaxAmount( final Double d )
  {
    salesTaxAmountField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Double > taxableAmountField();

  @Override
  default Double taxableAmount()
  {
    return taxableAmountField().get();
  }

  @Override
  default Invoice taxableAmount( final Double d )
  {
    taxableAmountField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Double > taxRateField();

  @Override
  default Double taxRate()
  {
    return taxRateField().get();
  }

  @Override
  default Invoice taxRate( final Double d )
  {
    taxRateField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Double > ticketBillingAmountField();

  @Override
  default Double ticketBillingAmount()
  {
    return ticketBillingAmountField().get();
  }

  @Override
  default Invoice ticketBillingAmount( final Double d )
  {
    ticketBillingAmountField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Integer > dueDaysField();

  @Override
  default Integer dueDays()
  {
    return dueDaysField().get();
  }

  @Override
  default Invoice dueDays( final Integer i )
  {
    dueDaysField().set(i);
    return this;
  }

  @JsonIgnore
  StringField billingMethodField();

  @Override
  default String billingMethod()
  {
    return billingMethodField().get();
  }

  @Override
  default Invoice billingMethod( final String s )
  {
    billingMethodField().set(s);
    return this;
  }

  @JsonIgnore
  StringField billingTermsField();

  @Override
  default String billingTerms()
  {
    return billingTermsField().get();
  }

  @Override
  default Invoice billingTerms( final String s )
  {
    billingTermsField().set(s);
    return this;
  }

  @JsonIgnore
  StringField billingTermsXrefField();

  @Override
  default String billingTermsXref()
  {
    return billingTermsXrefField().get();
  }

  @Override
  default Invoice billingTermsXref( final String s )
  {
    billingTermsXrefField().set(s);
    return this;
  }

  @JsonIgnore
  StringField currencyNameField();

  @Override
  default String currencyName()
  {
    return currencyNameField().get();
  }

  @Override
  default Invoice currencyName( final String s )
  {
    currencyNameField().set(s);
    return this;
  }

  @JsonIgnore
  StringField currencySymbolField();

  @Override
  default String currencySymbol()
  {
    return currencySymbolField().get();
  }

  @Override
  default Invoice currencySymbol( final String s )
  {
    currencySymbolField().set(s);
    return this;
  }

  @JsonIgnore
  StringField glBatchIdField();

  @Override
  default String glBatchId()
  {
    return glBatchIdField().get();
  }

  @Override
  default Invoice glBatchId( final String s )
  {
    glBatchIdField().set(s);
    return this;
  }

  @JsonIgnore
  StringField poNumberField();

  @Override
  default String poNumber()
  {
    return poNumberField().get();
  }

  @Override
  default Invoice poNumber( final String s )
  {
    poNumberField().set(s);
    return this;
  }

  @JsonIgnore
  StringField remitNameField();

  @Override
  default String remitName()
  {
    return remitNameField().get();
  }

  @Override
  default Invoice remitName( final String s )
  {
    remitNameField().set(s);
    return this;
  }

  @JsonIgnore
  StringField remitPhoneField();

  @Override
  default String remitPhone()
  {
    return remitPhoneField().get();
  }

  @Override
  default Invoice remitPhone( final String s )
  {
    remitPhoneField().set(s);
    return this;
  }

  @JsonIgnore
  StringField salesRepIdentifierField();

  @Override
  default String salesRepIdentifier()
  {
    return salesRepIdentifierField().get();
  }

  @Override
  default Invoice salesRepIdentifier( final String s )
  {
    salesRepIdentifierField().set(s);
    return this;
  }

  @JsonIgnore
  StringField taxCodeDescriptionField();

  @Override
  default String taxCodeDescription()
  {
    return taxCodeDescriptionField().get();
  }

  @Override
  default Invoice taxCodeDescription( final String s )
  {
    taxCodeDescriptionField().set(s);
    return this;
  }

  @JsonIgnore
  StringField taxCodeField();

  @Override
  default String taxCode()
  {
    return taxCodeField().get();
  }

  @Override
  default Invoice taxCode( final String s )
  {
    taxCodeField().set(s);
    return this;
  }

  @JsonIgnore
  StringField ticketResolutionField();

  @Override
  default String ticketResolution()
  {
    return ticketResolutionField().get();
  }

  @Override
  default Invoice ticketResolution( final String s )
  {
    ticketResolutionField().set(s);
    return this;
  }

  @JsonIgnore
  Field < Company > companyField();

  @Override
  default Company company()
  {
    return companyField().get();
  }

  @Override
  default Invoice company( final Company c )
  {
    companyField().set(c);
    return this;
  }

  @JsonIgnore
  Field < Company > billToCompanyField();

  @Override
  default Company billToCompany()
  {
    return billToCompanyField().get();
  }

  @Override
  default Invoice billToCompany( final Company c )
  {
    billToCompanyField().set(c);
    return this;
  }

  @JsonIgnore
  Field < Contact > contactField();

  @Override
  default Contact contact()
  {
    return contactField().get();
  }

  @Override
  default Invoice contact( final Contact c )
  {
    contactField().set(c);
    return this;
  }

  @JsonIgnore
  Field < Address > billingAddressField();

  @Override
  default Address billingAddress()
  {
    return billingAddressField().get();
  }

  @Override
  default Invoice billingAddress( final Address a )
  {
    billingAddressField().set(a);
    return this;
  }

  @JsonIgnore
  Field < Address > remitAddressField();

  @Override
  default Address remitAddress()
  {
    return remitAddressField().get();
  }

  @Override
  default Invoice remitAddress( final Address a )
  {
    remitAddressField().set(a);
    return this;
  }

  @JsonIgnore
  ListField < ExpenseDetail > expenseDetailsField();

  @Override
  default List < ExpenseDetail > expenseDetails()
  {
    return expenseDetailsField().get();
  }

  @Override
  default Invoice expenseDetails( final List < ExpenseDetail > l )
  {
    expenseDetailsField().set(l);
    return this;
  }

  @JsonIgnore
  ListField < ProductDetail > productDetailsField();

  @Override
  default List < ProductDetail > productDetails()
  {
    return productDetailsField().get();
  }

  @Override
  default Invoice productDetails( final List < ProductDetail > l )
  {
    productDetailsField().set(l);
    return this;
  }

  @JsonIgnore
  ListField < TimeDetail > timeDetailsField();

  @Override
  default List < TimeDetail > timeDetails()
  {
    return timeDetailsField().get();
  }

  @Override
  default Invoice timeDetails( final List < TimeDetail > l )
  {
    timeDetailsField().set(l);
    return this;
  }

  @JsonIgnore
  ListField < SalesTaxDetail > salesTaxDetailsField();

  @Override
  default List < SalesTaxDetail > salesTaxDetails()
  {
    return salesTaxDetailsField().get();
  }

  @Override
  default Invoice salesTaxDetails( final List < SalesTaxDetail > l )
  {
    salesTaxDetailsField().set(l);
    return this;
  }

  @JsonIgnore
  ListField < AgreementDetail > agreementDetailsField();

  @Override
  default List < AgreementDetail > agreementDetails()
  {
    return agreementDetailsField().get();
  }

  @Override
  default Invoice agreementDetails( final List < AgreementDetail > l )
  {
    agreementDetailsField().set(l);
    return this;
  }

  @JsonIgnore
  BooleanField processingFlagField();

  @Override
  default Boolean processingFlag()
  {
    return processingFlagField().get();
  }

  @Override
  default Invoice processingFlag( final Boolean b )
  {
    processingFlagField().set(b);
    return this;
  }

  @JsonIgnore
  DateField processingDateField();

  @Override
  default Date processingDate()
  {
    return processingDateField().get();
  }

  @Override
  default Invoice processingDate( final Date d )
  {
    processingDateField().set(d);
    return this;
  }

  @JsonIgnore
  StringField salesRepFullNameField();

  @Override
  default String salesRepFullName()
  {
    return salesRepFullNameField().get();
  }

  @Override
  default Invoice salesRepFullName( final String s )
  {
    salesRepFullNameField().set(s);
    return this;
  }
}
