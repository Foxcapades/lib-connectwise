package io.vulpine.connectwise.type.def.invoice;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.def.ProductItem;
import io.vulpine.connectwise.type.def.gen.*;

import java.util.List;

public interface SpecialInvoice
  extends
  HasId,
  HasCompanyId,
  HasAddressId,
  HasInvoiceNumber,
  HasInvoiceDate,
  HasInvoiceType,
  HasLocationId,
  HasDepartmentId,
  HasTopComment < String >,
  HasBottomComment < String >,
  HasTaxable,
  HasInternalNotes,
  HasDueDate,
  HasAgreementAmount,
  HasTaxCodeId,
  HasCustomerPo
{
  @JsonGetter( "BillToCompanyId" )
  Integer billToCompanyId();

  @JsonSetter( "BillToCompanyId" )
  SpecialInvoice billToCompanyId( final Integer i );

  @JsonGetter( "ApplyTo" )
  ApplyTo applyTo();

  @JsonSetter( "ApplyTo" )
  SpecialInvoice applyTo( final ApplyTo a );

  @JsonGetter( "Attention" )
  String attention();

  @JsonSetter( "Attention" )
  SpecialInvoice attention( final String s );

  @JsonGetter( "BillingTermsId" )
  Integer billingTermsId();

  @JsonSetter( "BillingTermsId" )
  SpecialInvoice billingTermsId( final Integer i );

  @JsonGetter( "Reference" )
  String reference();

  @JsonSetter( "Reference" )
  SpecialInvoice reference( final String s );

  @JsonGetter( "InvoiceTemplateId" )
  Integer invoiceTemplateId();

  @JsonSetter( "InvoiceTemplateId" )
  SpecialInvoice invoiceTemplateId( final Integer i );

  @JsonGetter( "InvoiceEmailTemplateId" )
  Integer invoiceEmailTemplateId();

  @JsonSetter( "InvoiceEmailTemplateId" )
  SpecialInvoice invoiceEmailTemplateId( final Integer i );

  @JsonGetter( "AddToBatchEmailList" )
  Boolean addToBatchEmailList();

  @JsonSetter( "AddToBatchEmailList" )
  SpecialInvoice addToBatchEmailList( final Boolean b );

  @JsonGetter( "InvoiceTypeIdentifier" )
  String invoiceTypeIdentifier();

  @JsonSetter( "InvoiceTypeIdentifier" )
  SpecialInvoice invoiceTypeIdentifier( final String s );

  @JsonGetter( "RestrictDownpayment" )
  Boolean restrictDownpayment();

  @JsonSetter( "RestrictDownpayment" )
  SpecialInvoice restrictDownpayment( final Boolean b );

  @JsonGetter( "BillingStatusId" )
  Integer billingStatusId();

  @JsonSetter( "BillingStatusId" )
  SpecialInvoice billingStatusId( final Integer i );

  @JsonGetter( "BillingStatus" )
  String billingStatus();

  @JsonSetter( "BillingStatus" )
  SpecialInvoice billingStatus( final String s );

  @JsonGetter( "TerritoryId" )
  Integer territoryId();

  @JsonSetter( "TerritoryId" )
  SpecialInvoice territoryId( final Integer i );

  @JsonGetter( "Total" )
  Double total();

  @JsonSetter( "Total" )
  SpecialInvoice total( final Double d );

  @JsonGetter( "DownpaymentPreviouslyTaxed" )
  Boolean downpaymentPreviouslyTaxed();

  @JsonSetter( "DownpaymentPreviouslyTaxed" )
  SpecialInvoice downpaymentPreviouslyTaxed( final Boolean b );

  @JsonGetter( "SpecialInvoiceProducts" )
  List < ProductItem > specialInvoiceProducts();

  @JsonSetter( "SpecialInvoiceProducts" )
  SpecialInvoice specialInvoiceProducts( final List < ProductItem > l );

  @JsonGetter( "ExpenseTotal" )
  Double expenseTotal();

  @JsonSetter( "ExpenseTotal" )
  SpecialInvoice expenseTotal( final Double d );

  @JsonGetter( "ProductTotal" )
  Double productTotal();

  @JsonSetter( "ProductTotal" )
  SpecialInvoice productTotal( final Double d );

  @JsonGetter( "PreviousProgressApplied" )
  Double previousProgressApplied();

  @JsonSetter( "PreviousProgressApplied" )
  SpecialInvoice previousProgressApplied( final Double d );

  @JsonGetter( "ServiceAdjustmentAmount" )
  Double serviceAdjustmentAmount();

  @JsonSetter( "ServiceAdjustmentAmount" )
  SpecialInvoice serviceAdjustmentAmount( final Double d );

  @JsonGetter( "DownpaymentApplied" )
  Double downpaymentApplied();

  @JsonSetter( "DownpaymentApplied" )
  SpecialInvoice downpaymentApplied( final Double d );

  @JsonGetter( "SalesTax" )
  Double salesTax();

  @JsonSetter( "SalesTax" )
  SpecialInvoice salesTax( final Double d );

  @JsonGetter( "InvoiceSubtotal" )
  Double invoiceSubtotal();

  @JsonSetter( "InvoiceSubtotal" )
  SpecialInvoice invoiceSubtotal( final Double d );

  @JsonGetter( "RemainingDownpayment" )
  Double remainingDownpayment();

  @JsonSetter( "RemainingDownpayment" )
  SpecialInvoice remainingDownpayment( final Double d );

  @JsonGetter( "InvoiceTotal" )
  Double invoiceTotal();

  @JsonSetter( "InvoiceTotal" )
  SpecialInvoice invoiceTotal( final Double d );

  @JsonGetter( "AdjustmentReason" )
  String adjustmentReason();

  @JsonSetter( "AdjustmentReason" )
  SpecialInvoice adjustmentReason( final String s );

  @JsonGetter( "By" )
  String by();

  @JsonSetter( "By" )
  SpecialInvoice by( final String s );

  @JsonGetter( "Payments" )
  Double payments();

  @JsonSetter( "Payments" )
  SpecialInvoice payments( final Double d );

  @JsonGetter( "Credits" )
  Double credits();

  @JsonSetter( "Credits" )
  SpecialInvoice credits( final Double d );

  @JsonGetter( "InvoiceBalance" )
  Double invoiceBalance();

  @JsonSetter( "InvoiceBalance" )
  SpecialInvoice invoiceBalance( final Double d );

  @JsonGetter( "ShipToCompanyId" )
  Integer shipToCompanyId();

  @JsonSetter( "ShipToCompanyId" )
  SpecialInvoice shipToCompanyId( final Integer i );

  @JsonGetter( "ShipToAddressId" )
  Integer shipToAddressId();

  @JsonSetter( "ShipToAddressId" )
  SpecialInvoice shipToAddressId( final Integer i );

  @JsonGetter( "ShipToAttention" )
  String shipToAttention();

  @JsonSetter( "ShipToAttention" )
  SpecialInvoice shipToAttention( final String s );
}
