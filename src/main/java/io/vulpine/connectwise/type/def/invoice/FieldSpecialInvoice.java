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
import io.vulpine.connectwise.type.def.ProductItem;
import io.vulpine.connectwise.type.def.gen.field.*;
import io.vulpine.connectwise.util.*;

import java.util.Date;
import java.util.List;

public interface FieldSpecialInvoice
  extends
  SpecialInvoice,
  HasIdField,
  HasCompanyIdField,
  HasAddressIdField,
  HasInvoiceNumberField,
  HasInvoiceDateField,
  HasInvoiceTypeField,
  HasLocationIdField,
  HasDepartmentIdField,
  HasTopCommentField < String >,
  HasBottomCommentField < String >,
  HasTaxableField,
  HasInternalNotesField,
  HasDueDateField,
  HasAgreementAmountField
{
  @Override
  default FieldSpecialInvoice internalNotes( final String s )
  {
    internalNotesField().set(s);
    return this;
  }

  @JsonIgnore
  NumberField < Integer > billToCompanyIdField();

  @Override
  default Integer billToCompanyId()
  {
    return billToCompanyIdField().get();
  }

  @Override
  default FieldSpecialInvoice billToCompanyId( final Integer i )
  {
    billToCompanyIdField().set(i);
    return this;
  }

  @Override
  default FieldSpecialInvoice taxable( final Boolean b )
  {
    taxableField().set(b);
    return this;
  }

  @Override
  default FieldSpecialInvoice locationId( final Integer i )
  {
    locationIdField().set(i);
    return this;
  }

  @Override
  default FieldSpecialInvoice departmentId( final Integer i )
  {
    departmentIdField().set(i);
    return this;
  }

  @JsonIgnore
  Field < ApplyTo > applyToField();

  @Override
  default ApplyTo applyTo()
  {
    return applyToField().get();
  }

  @Override
  default FieldSpecialInvoice agreementAmount( final Double d )
  {
    agreementAmountField().set(d);
    return this;
  }

  @Override
  default FieldSpecialInvoice addressId( Integer i )
  {
    return this;
  }

  @Override
  default FieldSpecialInvoice applyTo( final ApplyTo a )
  {
    applyToField().set(a);
    return this;
  }

  @Override
  default FieldSpecialInvoice topComment( final String s )
  {
    topCommentField().set(s);
    return this;
  }

  @Override
  default FieldSpecialInvoice dueDate( final Date d )
  {
    dueDateField().set(d);
    return this;
  }

  @Override
  default FieldSpecialInvoice invoiceType( final String s )
  {
    invoiceTypeField().set(s);
    return this;
  }

  @Override
  default FieldSpecialInvoice invoiceNumber( final String s )
  {
    invoiceNumberField().set(s);
    return this;
  }

  @Override
  default FieldSpecialInvoice bottomComment( final String s )
  {
    bottomCommentField().set(s);
    return this;
  }

  @JsonIgnore
  StringField attentionField();

  @Override
  default String attention()
  {
    return attentionField().get();
  }

  @Override
  default FieldSpecialInvoice invoiceDate( final Date d )
  {
    invoiceDateField().set(d);
    return this;
  }

  @Override
  default FieldSpecialInvoice id( final Integer i )
  {
    idField().set(i);
    return this;
  }

  @Override
  default FieldSpecialInvoice attention( final String s )
  {
    attentionField().set(s);
    return this;
  }

  @Override
  default FieldSpecialInvoice companyId( final Integer i )
  {
    companyIdField().set(i);
    return this;
  }

  @JsonIgnore
  NumberField < Integer > billingTermsIdField();

  @Override
  default Integer billingTermsId()
  {
    return billingTermsIdField().get();
  }

  @Override
  default FieldSpecialInvoice billingTermsId( final Integer i )
  {
    billingTermsIdField().set(i);
    return this;
  }

  @JsonIgnore
  StringField referenceField();

  @Override
  default String reference()
  {
    return referenceField().get();
  }

  @Override
  default FieldSpecialInvoice reference( final String s )
  {
    referenceField().set(s);
    return this;
  }

  @JsonIgnore
  StringField customerPoField();

  @Override
  default String customerPo()
  {
    return customerPoField().get();
  }

  @Override
  default FieldSpecialInvoice customerPo( final String s )
  {
    customerPoField().set(s);
    return this;
  }

  @JsonIgnore
  NumberField < Integer > invoiceTemplateIdField();

  @Override
  default Integer invoiceTemplateId()
  {
    return invoiceTemplateIdField().get();
  }

  @Override
  default FieldSpecialInvoice invoiceTemplateId( final Integer i )
  {
    invoiceTemplateIdField().set(i);
    return this;
  }

  @JsonIgnore
  NumberField < Integer > invoiceEmailTemplateIdField();

  @Override
  default Integer invoiceEmailTemplateId()
  {
    return invoiceEmailTemplateIdField().get();
  }

  @Override
  default FieldSpecialInvoice invoiceEmailTemplateId( final Integer i )
  {
    invoiceEmailTemplateIdField().set(i);
    return this;
  }

  @JsonIgnore
  BooleanField addToBatchEmailListField();

  @Override
  default Boolean addToBatchEmailList()
  {
    return addToBatchEmailListField().get();
  }

  @Override
  default FieldSpecialInvoice addToBatchEmailList( final Boolean b )
  {
    addToBatchEmailListField().set(b);
    return this;
  }

  @JsonIgnore
  StringField invoiceTypeIdentifierField();

  @Override
  default String invoiceTypeIdentifier()
  {
    return invoiceTypeIdentifierField().get();
  }

  @Override
  default FieldSpecialInvoice invoiceTypeIdentifier( final String s )
  {
    invoiceTypeIdentifierField().set(s);
    return this;
  }

  @JsonIgnore
  BooleanField restrictDownpaymentField();

  @Override
  default Boolean restrictDownpayment()
  {
    return restrictDownpaymentField().get();
  }

  @Override
  default FieldSpecialInvoice restrictDownpayment( final Boolean b )
  {
    restrictDownpaymentField().set(b);
    return this;
  }

  @JsonIgnore
  NumberField < Integer > billingStatusIdField();

  @Override
  default Integer billingStatusId()
  {
    return billingStatusIdField().get();
  }

  @Override
  default FieldSpecialInvoice billingStatusId( final Integer i )
  {
    billingStatusIdField().set(i);
    return this;
  }

  @JsonIgnore
  StringField billingStatusField();

  @Override
  default String billingStatus()
  {
    return billingStatusField().get();
  }

  @Override
  default FieldSpecialInvoice billingStatus( final String s )
  {
    billingStatusField().set(s);
    return this;
  }

  @JsonIgnore
  NumberField < Integer > territoryIdField();

  @Override
  default Integer territoryId()
  {
    return territoryIdField().get();
  }

  @Override
  default FieldSpecialInvoice territoryId( final Integer i )
  {
    territoryIdField().set(i);
    return this;
  }

  @JsonIgnore
  NumberField < Double > totalField();

  @Override
  default Double total()
  {
    return totalField().get();
  }

  @Override
  default FieldSpecialInvoice total( final Double d )
  {
    totalField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Integer > taxCodeIdField();

  @Override
  default Integer taxCodeId()
  {
    return taxCodeIdField().get();
  }

  @Override
  default FieldSpecialInvoice taxCodeId( final Integer i )
  {
    taxCodeIdField().set(i);
    return this;
  }

  @JsonIgnore
  BooleanField downpaymentPreviouslyTaxedField();

  @Override
  default Boolean downpaymentPreviouslyTaxed()
  {
    return downpaymentPreviouslyTaxedField().get();
  }

  @Override
  default FieldSpecialInvoice downpaymentPreviouslyTaxed( final Boolean b )
  {
    downpaymentPreviouslyTaxedField().set(b);
    return this;
  }

  @JsonIgnore
  ListField < ProductItem > specialInvoiceProductsField();

  @Override
  default List < ProductItem > specialInvoiceProducts()
  {
    return specialInvoiceProductsField().get();
  }

  @Override
  default FieldSpecialInvoice specialInvoiceProducts( final List < ProductItem > l )
  {
    return this;
  }

  @JsonIgnore
  NumberField < Double > expenseTotalField();

  @Override
  default Double expenseTotal()
  {
    return expenseTotalField().get();
  }

  @Override
  default FieldSpecialInvoice expenseTotal( final Double d )
  {
    expenseTotalField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Double > productTotalField();

  @Override
  default Double productTotal()
  {
    return productTotalField().get();
  }

  @Override
  default FieldSpecialInvoice productTotal( final Double d )
  {
    productTotalField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Double > previousProgressAppliedField();

  @Override
  default Double previousProgressApplied()
  {
    return previousProgressAppliedField().get();
  }

  @Override
  default FieldSpecialInvoice previousProgressApplied( final Double d )
  {
    previousProgressAppliedField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Double > serviceAdjustmentAmountField();

  @Override
  default Double serviceAdjustmentAmount()
  {
    return serviceAdjustmentAmountField().get();
  }

  @Override
  default FieldSpecialInvoice serviceAdjustmentAmount( final Double d )
  {
    serviceAdjustmentAmountField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Double > downpaymentAppliedField();

  @Override
  default Double downpaymentApplied()
  {
    return downpaymentAppliedField().get();
  }

  @Override
  default FieldSpecialInvoice downpaymentApplied( final Double d )
  {
    downpaymentAppliedField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Double > salesTaxField();

  @Override
  default Double salesTax()
  {
    return salesTaxField().get();
  }

  @Override
  default FieldSpecialInvoice salesTax( final Double d )
  {
    salesTaxField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Double > invoiceSubtotalField();

  @Override
  default Double invoiceSubtotal()
  {
    return invoiceSubtotalField().get();
  }

  @Override
  default FieldSpecialInvoice invoiceSubtotal( final Double d )
  {
    invoiceSubtotalField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Double > remainingDownpaymentField();

  @Override
  default Double remainingDownpayment()
  {
    return remainingDownpaymentField().get();
  }

  @Override
  default FieldSpecialInvoice remainingDownpayment( final Double d )
  {
    remainingDownpaymentField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Double > invoiceTotalField();

  @Override
  default Double invoiceTotal()
  {
    return invoiceTotalField().get();
  }

  @Override
  default FieldSpecialInvoice invoiceTotal( final Double d )
  {
    invoiceTotalField().set(d);
    return this;
  }

  @JsonIgnore
  StringField adjustmentReasonField();

  @Override
  default String adjustmentReason()
  {
    return adjustmentReasonField().get();
  }

  @Override
  default FieldSpecialInvoice adjustmentReason( final String s )
  {
    adjustmentReasonField().set(s);
    return this;
  }

  @JsonIgnore
  StringField byField();

  @Override
  default String by()
  {
    return byField().get();
  }

  @Override
  default FieldSpecialInvoice by( final String s )
  {
    byField().set(s);
    return this;
  }

  @JsonIgnore
  NumberField < Double > paymentsField();

  @Override
  default Double payments()
  {
    return paymentsField().get();
  }

  @Override
  default FieldSpecialInvoice payments( final Double d )
  {
    paymentsField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Double > creditsField();

  @Override
  default Double credits()
  {
    return creditsField().get();
  }

  @Override
  default FieldSpecialInvoice credits( final Double d )
  {
    creditsField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Double > invoiceBalanceField();

  @Override
  default Double invoiceBalance()
  {
    return invoiceBalanceField().get();
  }

  @Override
  default FieldSpecialInvoice invoiceBalance( final Double d )
  {
    invoiceBalanceField().set(d);
    return this;
  }

  @JsonIgnore
  NumberField < Integer > shipToCompanyIdField();

  @Override
  default Integer shipToCompanyId()
  {
    return shipToCompanyIdField().get();
  }

  @Override
  default FieldSpecialInvoice shipToCompanyId( final Integer i )
  {
    shipToCompanyIdField().set(i);
    return this;
  }

  @JsonIgnore
  NumberField < Integer > shipToAddressIdField();

  @Override
  default Integer shipToAddressId()
  {
    return shipToAddressIdField().get();
  }

  @Override
  default FieldSpecialInvoice shipToAddressId( final Integer i )
  {
    shipToAddressIdField().set(i);
    return this;
  }

  @JsonIgnore
  StringField shipToAttentionField();

  @Override
  default String shipToAttention()
  {
    return shipToAttentionField().get();
  }

  @Override
  default FieldSpecialInvoice shipToAttention( final String s )
  {
    shipToAttentionField().set(s);
    return this;
  }
}
