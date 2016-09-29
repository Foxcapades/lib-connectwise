package io.vulpine.connectwise.type.def.invoice;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.type.def.gen.*;
import io.vulpine.connectwise.util.DateField;
import io.vulpine.connectwise.util.Field;
import io.vulpine.connectwise.util.NumberField;
import io.vulpine.connectwise.util.StringField;

import java.util.Date;

public interface SpecialInvoice
  extends
  HasId,
  HasCompanyId,
  HasAddressId,
  HasLocationId,
  HasDepartmentId,
  HasTaxable,
  HasAgreementAmount,
  XmlSerializable
{
  NumberField < Integer > billToCompanyIdField();

  default Integer billToCompanyId()
  {
    return billToCompanyIdField().get();
  }

  default SpecialInvoice billToCompanyId( final Integer v )
  {
    billToCompanyIdField().set(v);
    return this;
  }

  StringField attentionField();

  default String attention()
  {
    return attentionField().get();
  }

  default SpecialInvoice attention( final String s )
  {
    attentionField().set(s);
    return this;
  }

  NumberField < Integer > billingTermsIdField();

  default Integer billingTermsId()
  {
    return billingTermsIdField().get();
  }

  default SpecialInvoice billingTermsId( final Integer v )
  {
    billingTermsIdField().set(v);
    return this;
  }

  StringField referenceField();

  default String reference()
  {
    return referenceField().get();
  }

  default SpecialInvoice reference( final String s )
  {
    referenceField().set(s);
    return this;
  }

  StringField customerPoField();

  default String customerPo()
  {
    return customerPoField().get();
  }

  default SpecialInvoice customerPo( final String s )
  {
    customerPoField().set(s);
    return this;
  }

  NumberField < Integer > invoiceTemplateIdField();

  default Integer invoiceTemplateId()
  {
    return invoiceTemplateIdField().get();
  }

  default SpecialInvoice invoiceTemplateId( final Integer v )
  {
    invoiceTemplateIdField().set(v);
    return this;
  }

  NumberField < Integer > invoiceEmailTemplateIdField();

  default Integer invoiceEmailTemplateId()
  {
    return invoiceEmailTemplateIdField().get();
  }

  default SpecialInvoice invoiceEmailTemplateId( final Integer v )
  {
    invoiceEmailTemplateIdField().set(v);
    return this;
  }

  Field < Boolean > addToBatchEmailListField();

  default Boolean addToBatchEmailList()
  {
    return addToBatchEmailListField().get();
  }

  default SpecialInvoice addToBatchEmailList( final Boolean b )
  {
    addToBatchEmailListField().set(b);
    return this;
  }


  StringField invoiceNumberField();

  default String invoiceNumber()
  {
    return invoiceNumberField().get();
  }

  default SpecialInvoice invoiceNumber( final String s )
  {
    invoiceNumberField().set(s);
    return this;
  }

  DateField invoiceDateField();

  default Date invoiceDate()
  {
    return invoiceDateField().get();
  }

  default SpecialInvoice invoiceDate( final Date d )
  {
    invoiceDateField().set(d);
    return this;
  }

  StringField invoiceTypeIdentifierField();

  default String invoiceTypeIdentifier()
  {
    return invoiceTypeIdentifierField().get();
  }

  default SpecialInvoice invoiceTypeIdentifier( final String s )
  {
    invoiceTypeIdentifierField().set(s);
    return this;
  }

  StringField invoiceTypeField();

  default String invoiceType()
  {
    return invoiceTypeField().get();
  }

  default SpecialInvoice invoiceType( final String s )
  {
    invoiceTypeField().set(s);
    return this;
  }

  Field < Boolean > restrictDownpaymentField();

  default Boolean restrictDownpayment()
  {
    return restrictDownpaymentField().get();
  }

  default SpecialInvoice restrictDownpayment( final Boolean b )
  {
    restrictDownpaymentField().set(b);
    return this;
  }


  NumberField < Integer > billingStatusIdField();

  default Integer billingStatusId()
  {
    return billingStatusIdField().get();
  }

  default SpecialInvoice billingStatusId( final Integer v )
  {
    billingStatusIdField().set(v);
    return this;
  }

  StringField billingStatusField();

  default String billingStatus()
  {
    return billingStatusField().get();
  }

  default SpecialInvoice billingStatus( final String s )
  {
    billingStatusField().set(s);
    return this;
  }

  NumberField < Integer > territoryIdField();

  default Integer territoryId()
  {
    return territoryIdField().get();
  }

  default SpecialInvoice territoryId( final Integer v )
  {
    territoryIdField().set(v);
    return this;
  }

  StringField topCommentField();

  default String topComment()
  {
    return topCommentField().get();
  }

  default SpecialInvoice topComment( final String s )
  {
    topCommentField().set(s);
    return this;
  }

  StringField bottomCommentField();

  default String bottomComment()
  {
    return bottomCommentField().get();
  }

  default SpecialInvoice bottomComment( final String s )
  {
    bottomCommentField().set(s);
    return this;
  }

  NumberField < Double > totalField();

  default Double total()
  {
    return totalField().get();
  }

  default SpecialInvoice total( final Double v )
  {
    totalField().set(v);
    return this;
  }

  NumberField < Integer > taxCodeIdField();

  default Integer taxCodeId()
  {
    return taxCodeIdField().get();
  }

  default SpecialInvoice taxCodeId( final Integer v )
  {
    taxCodeIdField().set(v);
    return this;
  }

  StringField internalNotesField();

  default String internalNotes()
  {
    return internalNotesField().get();
  }

  default SpecialInvoice internalNotes( final String s )
  {
    internalNotesField().set(s);
    return this;
  }

  Field < Boolean > downpaymentPreviouslyTaxedField();

  default Boolean downpaymentPreviouslyTaxed()
  {
    return downpaymentPreviouslyTaxedField().get();
  }

  default SpecialInvoice downpaymentPreviouslyTaxed( final Boolean b )
  {
    downpaymentPreviouslyTaxedField().set(b);
    return this;
  }


  // SpecialInvoiceProducts

  DateField dueDateField();

  default Date dueDate()
  {
    return dueDateField().get();
  }

  default SpecialInvoice dueDate( final Date d )
  {
    dueDateField().set(d);
    return this;
  }

  NumberField < Double > expenseTotalField();

  default Double expenseTotal()
  {
    return expenseTotalField().get();
  }

  default SpecialInvoice expenseTotal( final Double v )
  {
    expenseTotalField().set(v);
    return this;
  }

  NumberField < Double > productTotalField();

  default Double productTotal()
  {
    return productTotalField().get();
  }

  default SpecialInvoice productTotal( final Double v )
  {
    productTotalField().set(v);
    return this;
  }

  NumberField < Double > previousProgressAppliedField();

  default Double previousProgressApplied()
  {
    return previousProgressAppliedField().get();
  }

  default SpecialInvoice previousProgressApplied( final Double v )
  {
    previousProgressAppliedField().set(v);
    return this;
  }

  NumberField < Double > serviceAdjustmentAmountField();

  default Double serviceAdjustmentAmount()
  {
    return serviceAdjustmentAmountField().get();
  }

  default SpecialInvoice serviceAdjustmentAmount( final Double v )
  {
    serviceAdjustmentAmountField().set(v);
    return this;
  }

  NumberField < Double > downpaymentAppliedField();

  default Double downpaymentApplied()
  {
    return downpaymentAppliedField().get();
  }

  default SpecialInvoice downpaymentApplied( final Double v )
  {
    downpaymentAppliedField().set(v);
    return this;
  }

  NumberField < Double > invoiceSubtotalField();

  default Double invoiceSubtotal()
  {
    return invoiceSubtotalField().get();
  }

  default SpecialInvoice invoiceSubtotal( final Double v )
  {
    invoiceSubtotalField().set(v);
    return this;
  }

  NumberField < Double > remainingDownpaymentField();

  default Double remainingDownpayment()
  {
    return remainingDownpaymentField().get();
  }

  default SpecialInvoice remainingDownpayment( final Double v )
  {
    remainingDownpaymentField().set(v);
    return this;
  }

  NumberField < Double > salesTaxField();

  default Double salesTax()
  {
    return salesTaxField().get();
  }

  default SpecialInvoice salesTax( final Double v )
  {
    salesTaxField().set(v);
    return this;
  }

  NumberField < Double > invoiceTotalField();

  default Double invoiceTotal()
  {
    return invoiceTotalField().get();
  }

  default SpecialInvoice invoiceTotal( final Double v )
  {
    invoiceTotalField().set(v);
    return this;
  }

  StringField adjustmentReasonField();

  default String adjustmentReason()
  {
    return adjustmentReasonField().get();
  }

  default SpecialInvoice adjustmentReason( final String s )
  {
    adjustmentReasonField().set(s);
    return this;
  }

  StringField byField();

  default String by()
  {
    return byField().get();
  }

  default SpecialInvoice by( final String s )
  {
    byField().set(s);
    return this;
  }

  NumberField < Double > paymentsField();

  default Double payments()
  {
    return paymentsField().get();
  }

  default SpecialInvoice payments( final Double v )
  {
    paymentsField().set(v);
    return this;
  }

  NumberField < Double > creditsField();

  default Double credits()
  {
    return creditsField().get();
  }

  default SpecialInvoice credits( final Double v )
  {
    creditsField().set(v);
    return this;
  }

  NumberField < Double > invoiceBalanceField();

  default Double invoiceBalance()
  {
    return invoiceBalanceField().get();
  }

  default SpecialInvoice invoiceBalance( final Double v )
  {
    invoiceBalanceField().set(v);
    return this;
  }

  NumberField < Integer > shipToCompanyIdField();

  default Integer shipToCompanyId()
  {
    return shipToCompanyIdField().get();
  }

  default SpecialInvoice shipToCompanyId( final Integer v )
  {
    shipToCompanyIdField().set(v);
    return this;
  }

  NumberField < Integer > shipToAddressIdField();

  default Integer shipToAddressId()
  {
    return shipToAddressIdField().get();
  }

  default SpecialInvoice shipToAddressId( final Integer v )
  {
    shipToAddressIdField().set(v);
    return this;
  }

  StringField shipToAttentionField();

  default String shipToAttention()
  {
    return shipToAttentionField().get();
  }

  default SpecialInvoice shipToAttention( final String s )
  {
    shipToAttentionField().set(s);
    return this;
  }
}
