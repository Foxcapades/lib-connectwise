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

import io.vulpine.connectwise.type.company.Address;
import io.vulpine.connectwise.type.contact.Contact;
import io.vulpine.connectwise.type.def.Company;
import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.type.def.gen.*;
import io.vulpine.connectwise.util.DateField;
import io.vulpine.connectwise.util.Field;
import io.vulpine.connectwise.util.ListField;
import io.vulpine.connectwise.util.NumberField;

import java.util.Date;
import java.util.List;

public interface Invoice
  extends
  HasAgreementName,
  HasAgreementType,
  HasBusinessUnit,
  HasId,
  HasLastUpdated,
  HasLocation,
  HasPhaseName,
  HasProjectName,
  HasProjectNumber,
  HasStatus,
  HasTaxable,
  HasTerritory,
  HasTicketNumber,
  HasTicketSummary,
  HasUpdatedBy,
  XmlSerializable
{
  Field < Boolean > clientLocationField();

  default Boolean clientLocation()
  {
    return clientLocationField().get();
  }

  default Invoice clientLocation( final Boolean v )
  {
    clientLocationField().set(v);
    return this;
  }

  Field < Boolean > emailField();

  default Boolean email()
  {
    return emailField().get();
  }

  default Invoice email( final Boolean v )
  {
    emailField().set(v);
    return this;
  }

  Field < Boolean > closedField();

  default Boolean closed()
  {
    return closedField().get();
  }

  default Invoice closed( final Boolean v )
  {
    closedField().set(v);
    return this;
  }

  Field < Boolean > sentField();

  default Boolean sent()
  {
    return sentField().get();
  }

  default Invoice sent( final Boolean v )
  {
    sentField().set(v);
    return this;
  }

  Field < Boolean > glPostedField();

  default Boolean glPosted()
  {
    return glPostedField().get();
  }

  default Invoice glPosted( final Boolean v )
  {
    glPostedField().set(v);
    return this;
  }

  DateField dueDateField();

  default Date dueDate()
  {
    return dueDateField().get();
  }

  default Invoice dueDate( final Date v )
  {
    dueDateField().set(v);
    return this;
  }

  DateField invoiceDateField();

  default Date invoiceDate()
  {
    return invoiceDateField().get();
  }

  default Invoice invoiceDate( final Date v )
  {
    invoiceDateField().set(v);
    return this;
  }

  Field < String > invoiceTypeField();

  default String invoiceType()
  {
    return invoiceTypeField().get();
  }

  default Invoice invoiceType( final String v )
  {
    invoiceTypeField().set(v);
    return this;
  }

  NumberField < Double > downpaymentAmountField();

  default Double downpaymentAmount()
  {
    return downpaymentAmountField().get();
  }

  default Invoice downpaymentAmount( final Double v )
  {
    downpaymentAmountField().set(v);
    return this;
  }

  NumberField < Double > invoiceAmountField();

  default Double invoiceAmount()
  {
    return invoiceAmountField().get();
  }

  default Invoice invoiceAmount( final Double v )
  {
    invoiceAmountField().set(v);
    return this;
  }

  NumberField < Double > projectBillingAmountField();

  default Double projectBillingAmount()
  {
    return projectBillingAmountField().get();
  }

  default Invoice projectBillingAmount( final Double v )
  {
    projectBillingAmountField().set(v);
    return this;
  }

  NumberField < Double > projectBillingRateField();

  default Double projectBillingRate()
  {
    return projectBillingRateField().get();
  }

  default Invoice projectBillingRate( final Double v )
  {
    projectBillingRateField().set(v);
    return this;
  }

  NumberField < Double > salesTaxAmountField();

  default Double salesTaxAmount()
  {
    return salesTaxAmountField().get();
  }

  default Invoice salesTaxAmount( final Double v )
  {
    salesTaxAmountField().set(v);
    return this;
  }

  NumberField < Double > taxableAmountField();

  default Double taxableAmount()
  {
    return taxableAmountField().get();
  }

  default Invoice taxableAmount( final Double v )
  {
    taxableAmountField().set(v);
    return this;
  }

  NumberField < Double > taxRateField();

  default Double taxRate()
  {
    return taxRateField().get();
  }

  default Invoice taxRate( final Double v )
  {
    taxRateField().set(v);
    return this;
  }

  NumberField < Double > ticketBillingAmountField();

  default Double ticketBillingAmount()
  {
    return ticketBillingAmountField().get();
  }

  default Invoice ticketBillingAmount( final Double v )
  {
    ticketBillingAmountField().set(v);
    return this;
  }

  DateField dueDaysField();

  default Date dueDays()
  {
    return dueDaysField().get();
  }

  default Invoice dueDays( final Date v )
  {
    dueDaysField().set(v);
    return this;
  }

  Field < String > billingDeliveryField();

  default String billingDelivery()
  {
    return billingDeliveryField().get();
  }

  default Invoice billingDelivery( final String v )
  {
    billingDeliveryField().set(v);
    return this;
  }

  Field < String > billingMethodField();

  default String billingMethod()
  {
    return billingMethodField().get();
  }

  default Invoice billingMethod( final String v )
  {
    billingMethodField().set(v);
    return this;
  }

  Field < String > billingTermsField();

  default String billingTerms()
  {
    return billingTermsField().get();
  }

  default Invoice billingTerms( final String v )
  {
    billingTermsField().set(v);
    return this;
  }

  Field < String > billingTermsXrefField();

  default String billingTermsXref()
  {
    return billingTermsXrefField().get();
  }

  default Invoice billingTermsXref( final String v )
  {
    billingTermsXrefField().set(v);
    return this;
  }

  Field < String > currencyNameField();

  default String currencyName()
  {
    return currencyNameField().get();
  }

  default Invoice currencyName( final String v )
  {
    currencyNameField().set(v);
    return this;
  }

  Field < String > currencySymbolField();

  default String currencySymbol()
  {
    return currencySymbolField().get();
  }

  default Invoice currencySymbol( final String v )
  {
    currencySymbolField().set(v);
    return this;
  }

  Field < String > glBatchIdField();

  default String glBatchId()
  {
    return glBatchIdField().get();
  }

  default Invoice glBatchId( final String v )
  {
    glBatchIdField().set(v);
    return this;
  }

  Field < String > topCommentField();

  default String topComment()
  {
    return topCommentField().get();
  }

  default Invoice topComment( final String v )
  {
    topCommentField().set(v);
    return this;
  }

  Field < String > bottomCommentField();

  default String bottomComment()
  {
    return bottomCommentField().get();
  }

  default Invoice bottomComment( final String v )
  {
    bottomCommentField().set(v);
    return this;
  }

  Field < String > invoiceNumberField();

  default String invoiceNumber()
  {
    return invoiceNumberField().get();
  }

  default Invoice invoiceNumber( final String v )
  {
    invoiceNumberField().set(v);
    return this;
  }

  Field < String > poNumberField();

  default String poNumber()
  {
    return poNumberField().get();
  }

  default Invoice poNumber( final String v )
  {
    poNumberField().set(v);
    return this;
  }

  Field < String > routedMemberIdentifierField();

  default String routedMemberIdentifier()
  {
    return routedMemberIdentifierField().get();
  }

  default Invoice routedMemberIdentifier( final String v )
  {
    routedMemberIdentifierField().set(v);
    return this;
  }

  Field < String > routedMemberNameField();

  default String routedMemberName()
  {
    return routedMemberNameField().get();
  }

  default Invoice routedMemberName( final String v )
  {
    routedMemberNameField().set(v);
    return this;
  }

  Field < String > remitNameField();

  default String remitName()
  {
    return remitNameField().get();
  }

  default Invoice remitName( final String v )
  {
    remitNameField().set(v);
    return this;
  }

  Field < String > remitPhoneField();

  default String remitPhone()
  {
    return remitPhoneField().get();
  }

  default Invoice remitPhone( final String v )
  {
    remitPhoneField().set(v);
    return this;
  }

  Field < String > salesRepIdentifierField();

  default String salesRepIdentifier()
  {
    return salesRepIdentifierField().get();
  }

  default Invoice salesRepIdentifier( final String v )
  {
    salesRepIdentifierField().set(v);
    return this;
  }

  Field < String > taxCodeDescriptionField();

  default String taxCodeDescription()
  {
    return taxCodeDescriptionField().get();
  }

  default Invoice taxCodeDescription( final String v )
  {
    taxCodeDescriptionField().set(v);
    return this;
  }

  Field < String > taxCodeField();

  default String taxCode()
  {
    return taxCodeField().get();
  }

  default Invoice taxCode( final String v )
  {
    taxCodeField().set(v);
    return this;
  }

  Field < String > ticketResolutionField();

  default String ticketResolution()
  {
    return ticketResolutionField().get();
  }

  default Invoice ticketResolution( final String v )
  {
    ticketResolutionField().set(v);
    return this;
  }

  Field < Company > companyField();

  default Company company()
  {
    return companyField().get();
  }

  default Invoice company( final Company v )
  {
    companyField().set(v);
    return this;
  }

  Field < Company > billToCompanyField();

  default Company billToCompany()
  {
    return billToCompanyField().get();
  }

  default Invoice billToCompany( final Company v )
  {
    billToCompanyField().set(v);
    return this;
  }

  Field < Contact > contactField();

  default Contact contact()
  {
    return contactField().get();
  }

  default Invoice contact( final Contact v )
  {
    contactField().set(v);
    return this;
  }

  Field < Address > billingAddressField();

  default Address billingAddress()
  {
    return billingAddressField().get();
  }

  default Invoice billingAddress( final Address v )
  {
    billingAddressField().set(v);
    return this;
  }

  Field < Address > remitAddressField();

  default Address remitAddress()
  {
    return remitAddressField().get();
  }

  default Invoice remitAddress( final Address v )
  {
    remitAddressField().set(v);
    return this;
  }

  ListField < ExpenseDetail > expenseDetailsField();

  default List < ExpenseDetail > expenseDetails()
  {
    return expenseDetailsField().get();
  }

  default Invoice expenseDetails( final List < ExpenseDetail > v )
  {
    expenseDetailsField().set(v);
    return this;
  }

  ListField < ProductDetail > productDetailsField();

  default List < ProductDetail > productDetails()
  {
    return productDetailsField().get();
  }

  default Invoice productDetails( final List < ProductDetail > v )
  {
    productDetailsField().set(v);
    return this;
  }

  ListField < TimeDetail > timeDetailsField();

  default List < TimeDetail > timeDetails()
  {
    return timeDetailsField().get();
  }

  default Invoice timeDetails( final List < TimeDetail > v )
  {
    timeDetailsField().set(v);
    return this;
  }

  ListField < SalesTaxDetail > salesTaxDetailsField();

  default List < SalesTaxDetail > salesTaxDetails()
  {
    return salesTaxDetailsField().get();
  }

  default Invoice salesTaxDetails( final List < SalesTaxDetail > v )
  {
    salesTaxDetailsField().set(v);
    return this;
  }

  ListField < AgreementDetail > agreementDetailsField();

  default List < AgreementDetail > agreementDetails()
  {
    return agreementDetailsField().get();
  }

  default Invoice agreementDetails( final List < AgreementDetail > v )
  {
    agreementDetailsField().set(v);
    return this;
  }

  DateField paidDateField();

  default Date paidDate()
  {
    return paidDateField().get();
  }

  default Invoice paidDate( final Date v )
  {
    paidDateField().set(v);
    return this;
  }

  NumberField < Double > paidAmountField();

  default Double paidAmount()
  {
    return paidAmountField().get();
  }

  default Invoice paidAmount( final Double v )
  {
    paidAmountField().set(v);
    return this;
  }

  Field < Boolean > processingFlagField();

  default Boolean processingFlag()
  {
    return processingFlagField().get();
  }

  default Invoice processingFlag( final Boolean v )
  {
    processingFlagField().set(v);
    return this;
  }

  DateField processingDateField();

  default Date processingDate()
  {
    return processingDateField().get();
  }

  default Invoice processingDate( final Date v )
  {
    processingDateField().set(v);
    return this;
  }

  Field < String > salesRepFullNameField();

  default String salesRepFullName()
  {
    return salesRepFullNameField().get();
  }

  default Invoice salesRepFullName( final String v )
  {
    salesRepFullNameField().set(v);
    return this;
  }

  @Override
  default String toXml( String rootName )
  {
    return "<" + rootName + ">"
      + idField().toXml()
      + clientLocationField().toXml()
      + taxableField().toXml()
      + emailField().toXml()
      + closedField().toXml()
      + sentField().toXml()
      + glPostedField().toXml()
      + dueDateField().toXml()
      + invoiceDateField().toXml()
      + invoiceTypeField().toXml()
      + downpaymentAmountField().toXml()
      + invoiceAmountField().toXml()
      + projectBillingAmountField().toXml()
      + projectBillingRateField().toXml()
      + salesTaxAmountField().toXml()
      + taxableAmountField().toXml()
      + taxRateField().toXml()
      + ticketBillingAmountField().toXml()
      + dueDaysField().toXml()
      + agreementNameField().toXml()
      + agreementTypeField().toXml()
      + billingDeliveryField().toXml()
      + billingMethodField().toXml()
      + billingTermsField().toXml()
      + billingTermsXrefField().toXml()
      + businessUnitField().toXml()
      + currencyNameField().toXml()
      + currencySymbolField().toXml()
      + glBatchIdField().toXml()
      + topCommentField().toXml()
      + bottomCommentField().toXml()
      + invoiceNumberField().toXml()
      + locationField().toXml()
      + poNumberField().toXml()
      + projectNameField().toXml()
      + projectNumberField().toXml()
      + phaseNameField().toXml()
      + routedMemberIdentifierField().toXml()
      + routedMemberNameField().toXml()
      + remitNameField().toXml()
      + remitPhoneField().toXml()
      + salesRepIdentifierField().toXml()
      + statusField().toXml()
      + taxCodeDescriptionField().toXml()
      + taxCodeField().toXml()
      + territoryField().toXml()
      + ticketNumberField().toXml()
      + ticketResolutionField().toXml()
      + ticketSummaryField().toXml()
      + companyField().toXml()
      + billToCompanyField().toXml()
      + contactField().toXml()
      + billingAddressField().toXml()
      + remitAddressField().toXml()
      + expenseDetailsField().toXml()
      + productDetailsField().toXml()
      + timeDetailsField().toXml()
      + salesTaxDetailsField().toXml()
      + agreementDetailsField().toXml()
      + paidDateField().toXml()
      + paidAmountField().toXml()
      + lastUpdatedField().toXml()
      + updatedByField().toXml()
      + processingFlagField().toXml()
      + processingDateField().toXml()
      + salesRepFullNameField().toXml()
      + "</" + rootName + ">";
  }
}
