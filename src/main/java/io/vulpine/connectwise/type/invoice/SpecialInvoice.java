package io.vulpine.connectwise.type.invoice;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.ConnectwiseCommon;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties( { "LastUpdate", "LastUpdated", "UpdatedBy", "Description" } )
public class SpecialInvoice extends ConnectwiseCommon
{
  private int companyId;

  private int billToCompanyId;

  private ApplyTo applyTo;

  private int attention;

  private int addressId;

  private int billingTermsId;

  private int reference;

  private int customerPO;

  private int invoiceTemplateId;

  private int invoiceEmailTemplateId;

  private boolean addToBatchEmailList;

  private int invoiceNumber;

  private Date invoiceDate;

  private int invoiceTypeIdentifier;

  private int invoiceType;

  private boolean restrictDownpayment;

  private int billingStatusId;

  private int billingStatus;

  private int locationId;

  private int departmentId;

  private int territoryId;

  private int topComment;

  private int bottomComment;

  private double total;

  private boolean taxable;

  private int taxCodeId;

  private int internalNotes;

  private boolean downpaymentPreviouslyTaxed;

  private List < SpecialInvoiceProduct > specialInvoiceProducts;

  private Date dueDate;

  private double expenseTotal;

  private double productTotal;

  private double previousProgressApplied;

  private double serviceAdjustmentAmount;

  private double agreementAmount;

  private double downpaymentApplied;

  private double invoiceSubtotal;

  private double remainingDownpayment;

  private double salesTax;

  private double invoiceTotal;

  private int adjustmentReason;

  private int by;

  private double payments;

  private double credits;

  private double invoiceBalance;

  private int shipToCompanyId;

  private int shipToAddressId;

  private int shipToAttention;

  @JsonGetter( "AddToBatchEmailList" )
  public boolean addToBatchEmailList()
  {
    return this.addToBatchEmailList;
  }

  @JsonSetter( "AddToBatchEmailList" )
  public SpecialInvoice addToBatchEmailList( final boolean addToBatchEmailList )
  {
    this.addToBatchEmailList = addToBatchEmailList;

    return this;
  }

  @JsonGetter( "AddressId" )
  public int addressId()
  {
    return this.addressId;
  }

  @JsonSetter( "AddressId" )
  public SpecialInvoice addressId( final int addressId )
  {
    this.addressId = addressId;

    return this;
  }

  @JsonGetter( "AdjustmentReason" )
  public int adjustmentReason()
  {
    return this.adjustmentReason;
  }

  @JsonSetter( "AdjustmentReason" )
  public SpecialInvoice adjustmentReason( final int adjustmentReason )
  {
    this.adjustmentReason = adjustmentReason;

    return this;
  }

  @JsonGetter( "AgreementAmount" )
  public double agreementAmount()
  {
    return this.agreementAmount;
  }

  @JsonSetter( "AgreementAmount" )
  public SpecialInvoice agreementAmount( final double agreementAmount )
  {
    this.agreementAmount = agreementAmount;

    return this;
  }

  @JsonGetter( "ApplyTo" )
  public ApplyTo applyTo()
  {
    return this.applyTo;
  }

  @JsonSetter( "ApplyTo" )
  public SpecialInvoice applyTo( final ApplyTo applyTo )
  {
    this.applyTo = applyTo;

    return this;
  }

  @JsonGetter( "Attention" )
  public int attention()
  {
    return this.attention;
  }

  @JsonSetter( "Attention" )
  public SpecialInvoice attention( final int attention )
  {
    this.attention = attention;

    return this;
  }

  @JsonGetter( "BillToCompanyId" )
  public int billToCompanyId()
  {
    return this.billToCompanyId;
  }

  @JsonSetter( "BillToCompanyId" )
  public SpecialInvoice billToCompanyId( final int billToCompanyId )
  {
    this.billToCompanyId = billToCompanyId;

    return this;
  }

  @JsonGetter( "BillingStatus" )
  public int billingStatus()
  {
    return this.billingStatus;
  }

  @JsonSetter( "BillingStatus" )
  public SpecialInvoice billingStatus( final int billingStatus )
  {
    this.billingStatus = billingStatus;

    return this;
  }

  @JsonGetter( "BillingStatusId" )
  public int billingStatusId()
  {
    return this.billingStatusId;
  }

  @JsonSetter( "BillingStatusId" )
  public SpecialInvoice billingStatusId( final int billingStatusId )
  {
    this.billingStatusId = billingStatusId;

    return this;
  }

  @JsonGetter( "BillingTermsId" )
  public int billingTermsId()
  {
    return this.billingTermsId;
  }

  @JsonSetter( "BillingTermsId" )
  public SpecialInvoice billingTermsId( final int billingTermsId )
  {
    this.billingTermsId = billingTermsId;

    return this;
  }

  @JsonGetter( "BottomComment" )
  public int bottomComment()
  {
    return this.bottomComment;
  }

  @JsonSetter( "BottomComment" )
  public SpecialInvoice bottomComment( final int bottomComment )
  {
    this.bottomComment = bottomComment;

    return this;
  }

  @JsonGetter( "By" )
  public int by()
  {
    return this.by;
  }

  @JsonSetter( "By" )
  public SpecialInvoice by( final int by )
  {
    this.by = by;

    return this;
  }

  @JsonGetter( "CompanyId" )
  public int companyId()
  {
    return this.companyId;
  }

  @JsonSetter( "CompanyId" )
  public SpecialInvoice companyId( final int companyId )
  {
    this.companyId = companyId;

    return this;
  }

  @JsonGetter( "Credits" )
  public double credits()
  {
    return this.credits;
  }

  @JsonSetter( "Credits" )
  public SpecialInvoice credits( final double credits )
  {
    this.credits = credits;

    return this;
  }

  @JsonGetter( "CustomerPO" )
  public int customerPO()
  {
    return this.customerPO;
  }

  @JsonSetter( "CustomerPO" )
  public SpecialInvoice customerPO( final int customerPO )
  {
    this.customerPO = customerPO;

    return this;
  }

  @JsonGetter( "DepartmentId" )
  public int departmentId()
  {
    return this.departmentId;
  }

  @JsonSetter( "DepartmentId" )
  public SpecialInvoice departmentId( final int departmentId )
  {
    this.departmentId = departmentId;

    return this;
  }

  @JsonGetter( "DownpaymentApplied" )
  public double downpaymentApplied()
  {
    return this.downpaymentApplied;
  }

  @JsonSetter( "DownpaymentApplied" )
  public SpecialInvoice downpaymentApplied( final double downpaymentApplied )
  {
    this.downpaymentApplied = downpaymentApplied;

    return this;
  }

  @JsonGetter( "DownpaymentPreviouslyTaxed" )
  public boolean downpaymentPreviouslyTaxed()
  {
    return this.downpaymentPreviouslyTaxed;
  }

  @JsonSetter( "DownpaymentPreviouslyTaxed" )
  public SpecialInvoice downpaymentPreviouslyTaxed( final boolean downpaymentPreviouslyTaxed )
  {
    this.downpaymentPreviouslyTaxed = downpaymentPreviouslyTaxed;

    return this;
  }

  @JsonGetter( "DueDate" )
  public Date dueDate()
  {
    return this.dueDate;
  }

  @JsonSetter( "DueDate" )
  public SpecialInvoice dueDate( final Date dueDate )
  {
    this.dueDate = dueDate;

    return this;
  }

  @JsonGetter( "ExpenseTotal" )
  public double expenseTotal()
  {
    return this.expenseTotal;
  }

  @JsonSetter( "ExpenseTotal" )
  public SpecialInvoice expenseTotal( final double expenseTotal )
  {
    this.expenseTotal = expenseTotal;

    return this;
  }

  @JsonGetter( "InternalNotes" )
  public int internalNotes()
  {
    return this.internalNotes;
  }

  @JsonSetter( "InternalNotes" )
  public SpecialInvoice internalNotes( final int internalNotes )
  {
    this.internalNotes = internalNotes;

    return this;
  }

  @JsonGetter( "InvoiceBalance" )
  public double invoiceBalance()
  {
    return this.invoiceBalance;
  }

  @JsonSetter( "InvoiceBalance" )
  public SpecialInvoice invoiceBalance( final double invoiceBalance )
  {
    this.invoiceBalance = invoiceBalance;

    return this;
  }

  @JsonGetter( "InvoiceDate" )
  public Date invoiceDate()
  {
    return this.invoiceDate;
  }

  @JsonSetter( "InvoiceDate" )
  public SpecialInvoice invoiceDate( final Date invoiceDate )
  {
    this.invoiceDate = invoiceDate;

    return this;
  }

  @JsonGetter( "InvoiceEmailTemplateId" )
  public int invoiceEmailTemplateId()
  {
    return this.invoiceEmailTemplateId;
  }

  @JsonSetter( "InvoiceEmailTemplateId" )
  public SpecialInvoice invoiceEmailTemplateId( final int invoiceEmailTemplateId )
  {
    this.invoiceEmailTemplateId = invoiceEmailTemplateId;

    return this;
  }

  @JsonGetter( "InvoiceNumber" )
  public int invoiceNumber()
  {
    return this.invoiceNumber;
  }

  @JsonSetter( "InvoiceNumber" )
  public SpecialInvoice invoiceNumber( final int invoiceNumber )
  {
    this.invoiceNumber = invoiceNumber;

    return this;
  }

  @JsonGetter( "InvoiceSubtotal" )
  public double invoiceSubtotal()
  {
    return this.invoiceSubtotal;
  }

  @JsonSetter( "InvoiceSubtotal" )
  public SpecialInvoice invoiceSubtotal( final double invoiceSubtotal )
  {
    this.invoiceSubtotal = invoiceSubtotal;

    return this;
  }

  @JsonGetter( "InvoiceTemplateId" )
  public int invoiceTemplateId()
  {
    return this.invoiceTemplateId;
  }

  @JsonSetter( "InvoiceTemplateId" )
  public SpecialInvoice invoiceTemplateId( final int invoiceTemplateId )
  {
    this.invoiceTemplateId = invoiceTemplateId;

    return this;
  }

  @JsonGetter( "InvoiceTotal" )
  public double invoiceTotal()
  {
    return this.invoiceTotal;
  }

  @JsonSetter( "InvoiceTotal" )
  public SpecialInvoice invoiceTotal( final double invoiceTotal )
  {
    this.invoiceTotal = invoiceTotal;

    return this;
  }

  @JsonGetter( "InvoiceType" )
  public int invoiceType()
  {
    return this.invoiceType;
  }

  @JsonSetter( "InvoiceType" )
  public SpecialInvoice invoiceType( final int invoiceType )
  {
    this.invoiceType = invoiceType;

    return this;
  }

  @JsonGetter( "InvoiceTypeIdentifier" )
  public int invoiceTypeIdentifier()
  {
    return this.invoiceTypeIdentifier;
  }

  @JsonSetter( "InvoiceTypeIdentifier" )
  public SpecialInvoice invoiceTypeIdentifier( final int invoiceTypeIdentifier )
  {
    this.invoiceTypeIdentifier = invoiceTypeIdentifier;

    return this;
  }

  @JsonGetter( "LocationId" )
  public int locationId()
  {
    return this.locationId;
  }

  @JsonSetter( "LocationId" )
  public SpecialInvoice locationId( final int locationId )
  {
    this.locationId = locationId;

    return this;
  }

  @JsonGetter( "Payments" )
  public double payments()
  {
    return this.payments;
  }

  @JsonSetter( "Payments" )
  public SpecialInvoice payments( final double payments )
  {
    this.payments = payments;

    return this;
  }

  @JsonGetter( "PreviousProgressApplied" )
  public double previousProgressApplied()
  {
    return this.previousProgressApplied;
  }

  @JsonSetter( "PreviousProgressApplied" )
  public SpecialInvoice previousProgressApplied( final double previousProgressApplied )
  {
    this.previousProgressApplied = previousProgressApplied;

    return this;
  }

  @JsonGetter( "ProductTotal" )
  public double productTotal()
  {
    return this.productTotal;
  }

  @JsonSetter( "ProductTotal" )
  public SpecialInvoice productTotal( final double productTotal )
  {
    this.productTotal = productTotal;

    return this;
  }

  @JsonGetter( "Reference" )
  public int reference()
  {
    return this.reference;
  }

  @JsonSetter( "Reference" )
  public SpecialInvoice reference( final int reference )
  {
    this.reference = reference;

    return this;
  }

  @JsonGetter( "RemainingDownpayment" )
  public double remainingDownpayment()
  {
    return this.remainingDownpayment;
  }

  @JsonSetter( "RemainingDownpayment" )
  public SpecialInvoice remainingDownpayment( final double remainingDownpayment )
  {
    this.remainingDownpayment = remainingDownpayment;

    return this;
  }

  @JsonGetter( "RestrictDownpayment" )
  public boolean restrictDownpayment()
  {
    return this.restrictDownpayment;
  }

  @JsonSetter( "RestrictDownpayment" )
  public SpecialInvoice restrictDownpayment( final boolean restrictDownpayment )
  {
    this.restrictDownpayment = restrictDownpayment;

    return this;
  }

  @JsonGetter( "SalesTax" )
  public double salesTax()
  {
    return this.salesTax;
  }

  @JsonSetter( "SalesTax" )
  public SpecialInvoice salesTax( final double salesTax )
  {
    this.salesTax = salesTax;

    return this;
  }

  @JsonGetter( "ServiceAdjustmentAmount" )
  public double serviceAdjustmentAmount()
  {
    return this.serviceAdjustmentAmount;
  }

  @JsonSetter( "ServiceAdjustmentAmount" )
  public SpecialInvoice serviceAdjustmentAmount( final double serviceAdjustmentAmount )
  {
    this.serviceAdjustmentAmount = serviceAdjustmentAmount;

    return this;
  }

  @JsonGetter( "ShipToAddressId" )
  public int shipToAddressId()
  {
    return this.shipToAddressId;
  }

  @JsonSetter( "ShipToAddressId" )
  public SpecialInvoice shipToAddressId( final int shipToAddressId )
  {
    this.shipToAddressId = shipToAddressId;

    return this;
  }

  @JsonGetter( "ShipToAttention" )
  public int shipToAttention()
  {
    return this.shipToAttention;
  }

  @JsonSetter( "ShipToAttention" )
  public SpecialInvoice shipToAttention( final int shipToAttention )
  {
    this.shipToAttention = shipToAttention;

    return this;
  }

  @JsonGetter( "ShipToCompanyId" )
  public int shipToCompanyId()
  {
    return this.shipToCompanyId;
  }

  @JsonSetter( "ShipToCompanyId" )
  public SpecialInvoice shipToCompanyId( final int shipToCompanyId )
  {
    this.shipToCompanyId = shipToCompanyId;

    return this;
  }

  @JsonGetter( "SpecialInvoiceProducts" )
  public List < SpecialInvoiceProduct > specialInvoiceProducts()
  {
    return this.specialInvoiceProducts;
  }

  @JsonSetter( "SpecialInvoiceProducts" )
  public SpecialInvoice specialInvoiceProducts( final List < SpecialInvoiceProduct > specialInvoiceProducts )
  {
    this.specialInvoiceProducts = specialInvoiceProducts;

    return this;
  }

  @JsonGetter( "TaxCodeId" )
  public int taxCodeId()
  {
    return this.taxCodeId;
  }

  @JsonSetter( "TaxCodeId" )
  public SpecialInvoice taxCodeId( final int taxCodeId )
  {
    this.taxCodeId = taxCodeId;

    return this;
  }

  @JsonGetter( "Taxable" )
  public boolean taxable()
  {
    return this.taxable;
  }

  @JsonSetter( "Taxable" )
  public SpecialInvoice taxable( final boolean taxable )
  {
    this.taxable = taxable;

    return this;
  }

  @JsonGetter( "TerritoryId" )
  public int territoryId()
  {
    return this.territoryId;
  }

  @JsonSetter( "TerritoryId" )
  public SpecialInvoice territoryId( final int territoryId )
  {
    this.territoryId = territoryId;

    return this;
  }

  @JsonGetter( "TopComment" )
  public int topComment()
  {
    return this.topComment;
  }

  @JsonSetter( "TopComment" )
  public SpecialInvoice topComment( final int topComment )
  {
    this.topComment = topComment;

    return this;
  }

  @JsonGetter( "Total" )
  public double total()
  {
    return this.total;
  }

  @JsonSetter( "Total" )
  public SpecialInvoice total( final double total )
  {
    this.total = total;

    return this;
  }

}
