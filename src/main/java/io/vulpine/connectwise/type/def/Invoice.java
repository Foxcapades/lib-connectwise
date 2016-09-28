package io.vulpine.connectwise.type.def;

import io.vulpine.connectwise.type.def.gen.HasAgreementName;
import io.vulpine.connectwise.type.def.gen.HasId;
import io.vulpine.connectwise.type.def.gen.HasTaxable;

public interface Invoice
extends
  HasId,
  HasTaxable,
  HasAgreementName,
  XmlSerializable
{
  // IsClientLocation
  // Email
  // Closed
  // Sent
  // GlPosted
  // DueDate
  // InvoiceDate
  // InvoiceType
  // DownpaymentAmount
  // InvoiceAmount
  // ProjectBillingAmount
  // ProjectBillingRate
  // SalesTaxAmount
  // TaxableAmount
  // TaxRate
  // TicketBillingAmount
  // DueDays
  // AgreementType
  // BillingDelivery
  // BillingMethod
  // BillingTerms
  // BillingTermsXref
  // BusinessUnit
  // CurrencyName
  // CurrencySymbol
  // GlBatchId
  // TopComment
  // BottomComment
  // Invoice Number
  // Location
  // PoNumber
  // ProjectName
  // ProjectNumber
  // PhaseName
  // RoutedMemberIdentifier
  // RoutedMemberName
  // RemitName
  // RemitPhone
  // SalesRepIdentifier
  // Status
}
