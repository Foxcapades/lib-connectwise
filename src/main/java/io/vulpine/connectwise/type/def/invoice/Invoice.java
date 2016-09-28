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
import io.vulpine.connectwise.util.Field;

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

  Field < Boolean > entField();

  default Boolean ent()
  {
    return entField().get();
  }

  default Invoice ent( final Boolean v )
  {
    entField().set(v);
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

  Field < Date > dueDateField();

  default Date dueDate()
  {
    return dueDateField().get();
  }

  default Invoice dueDate( final Date v )
  {
    dueDateField().set(v);
    return this;
  }

  Field < Date > nvoiceDateField();

  default Date nvoiceDate()
  {
    return nvoiceDateField().get();
  }

  default Invoice nvoiceDate( final Date v )
  {
    nvoiceDateField().set(v);
    return this;
  }

  Field < String > nvoiceTypeField();

  default String nvoiceType()
  {
    return nvoiceTypeField().get();
  }

  default Invoice nvoiceType( final String v )
  {
    nvoiceTypeField().set(v);
    return this;
  }

  Field < Double > downpaymentAmountField();

  default Double downpaymentAmount()
  {
    return downpaymentAmountField().get();
  }

  default Invoice downpaymentAmount( final Double v )
  {
    downpaymentAmountField().set(v);
    return this;
  }

  Field < Double > nvoiceAmountField();

  default Double nvoiceAmount()
  {
    return nvoiceAmountField().get();
  }

  default Invoice nvoiceAmount( final Double v )
  {
    nvoiceAmountField().set(v);
    return this;
  }

  Field < Double > projectBillingAmountField();

  default Double projectBillingAmount()
  {
    return projectBillingAmountField().get();
  }

  default Invoice projectBillingAmount( final Double v )
  {
    projectBillingAmountField().set(v);
    return this;
  }

  Field < Double > projectBillingRateField();

  default Double projectBillingRate()
  {
    return projectBillingRateField().get();
  }

  default Invoice projectBillingRate( final Double v )
  {
    projectBillingRateField().set(v);
    return this;
  }

  Field < Double > alesTaxAmountField();

  default Double alesTaxAmount()
  {
    return alesTaxAmountField().get();
  }

  default Invoice alesTaxAmount( final Double v )
  {
    alesTaxAmountField().set(v);
    return this;
  }

  Field < Double > taxableAmountField();

  default Double taxableAmount()
  {
    return taxableAmountField().get();
  }

  default Invoice taxableAmount( final Double v )
  {
    taxableAmountField().set(v);
    return this;
  }

  Field < Double > taxRateField();

  default Double taxRate()
  {
    return taxRateField().get();
  }

  default Invoice taxRate( final Double v )
  {
    taxRateField().set(v);
    return this;
  }

  Field < Double > ticketBillingAmountField();

  default Double ticketBillingAmount()
  {
    return ticketBillingAmountField().get();
  }

  default Invoice ticketBillingAmount( final Double v )
  {
    ticketBillingAmountField().set(v);
    return this;
  }

  Field < Date > dueDaysField();

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

  Field < String > nvoiceNumberField();

  default String nvoiceNumber()
  {
    return nvoiceNumberField().get();
  }

  default Invoice nvoiceNumber( final String v )
  {
    nvoiceNumberField().set(v);
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

  Field < String > alesRepIdentifierField();

  default String alesRepIdentifier()
  {
    return alesRepIdentifierField().get();
  }

  default Invoice alesRepIdentifier( final String v )
  {
    alesRepIdentifierField().set(v);
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

  Field < List > expenseDetailsField();

  default List expenseDetails()
  {
    return expenseDetailsField().get();
  }

  default Invoice expenseDetails( final List v )
  {
    expenseDetailsField().set(v);
    return this;
  }

  < ExpenseDetail >
  Field < List > productDetailsField();

  default List productDetails()
  {
    return productDetailsField().get();
  }

  default Invoice productDetails( final List v )
  {
    productDetailsField().set(v);
    return this;
  }

  < ProductDetail >
  Field < List > timeDetailsField();

  default List timeDetails()
  {
    return timeDetailsField().get();
  }

  default Invoice timeDetails( final List v )
  {
    timeDetailsField().set(v);
    return this;
  }

  < TimeDetail >
  Field < List > alesTaxDetailsField();

  default List alesTaxDetails()
  {
    return alesTaxDetailsField().get();
  }

  default Invoice alesTaxDetails( final List v )
  {
    alesTaxDetailsField().set(v);
    return this;
  }

  < SalesTaxDetail >
  Field < List > agreementDetailsField();

  default List agreementDetails()
  {
    return agreementDetailsField().get();
  }

  default Invoice agreementDetails( final List v )
  {
    agreementDetailsField().set(v);
    return this;
  }

  < AgreementDetail >
  Field < Date > paidDateField();

  default Date paidDate()
  {
    return paidDateField().get();
  }

  default Invoice paidDate( final Date v )
  {
    paidDateField().set(v);
    return this;
  }

  Field < Double > paidAmountField();

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

  Field < Date > processingDateField();

  default Date processingDate()
  {
    return processingDateField().get();
  }

  default Invoice processingDate( final Date v )
  {
    processingDateField().set(v);
    return this;
  }

  Field < String > alesRepFullNameField();

  default String alesRepFullName()
  {
    return alesRepFullNameField().get();
  }

  default Invoice alesRepFullName( final String v )
  {
    alesRepFullNameField().set(v);
    return this;
  }

  @Override
  default String toXml( String rootName )
  {
    return null;
  }
}
