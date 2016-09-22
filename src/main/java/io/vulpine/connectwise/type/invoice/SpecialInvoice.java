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
  private Integer companyId;

  private Integer billToCompanyId;

  private ApplyTo applyTo;

  private Integer attention;

  private Integer addressId;

  private Integer billingTermsId;

  private Integer reference;

  private Integer customerPO;

  private Integer invoiceTemplateId;

  private Integer invoiceEmailTemplateId;

  private Boolean addToBatchEmailList;

  private Integer invoiceNumber;

  private Date invoiceDate;

  private Integer invoiceTypeIdentifier;

  private Integer invoiceType;

  private Boolean restrictDownpayment;

  private Integer billingStatusId;

  private Integer billingStatus;

  private Integer locationId;

  private Integer departmentId;

  private Integer territoryId;

  private Integer topComment;

  private Integer bottomComment;

  private Double total;

  private Boolean taxable;

  private Integer taxCodeId;

  private Integer internalNotes;

  private Boolean downpaymentPreviouslyTaxed;

  private List < SpecialInvoiceProduct > specialInvoiceProducts;

  private Date dueDate;

  private Double expenseTotal;

  private Double productTotal;

  private Double previousProgressApplied;

  private Double serviceAdjustmentAmount;

  private Double agreementAmount;

  private Double downpaymentApplied;

  private Double invoiceSubtotal;

  private Double remainingDownpayment;

  private Double salesTax;

  private Double invoiceTotal;

  private Integer adjustmentReason;

  private Integer by;

  private Double payments;

  private Double credits;

  private Double invoiceBalance;

  private Integer shipToCompanyId;

  private Integer shipToAddressId;

  private Integer shipToAttention;

  @JsonGetter( "AddToBatchEmailList" )
  public Boolean addToBatchEmailList()
  {
    return this.addToBatchEmailList;
  }

  @JsonSetter( "AddToBatchEmailList" )
  public SpecialInvoice addToBatchEmailList( final Boolean addToBatchEmailList )
  {
    this.addToBatchEmailList = addToBatchEmailList;

    return this;
  }

  @JsonGetter( "AddressId" )
  public Integer addressId()
  {
    return this.addressId;
  }

  @JsonSetter( "AddressId" )
  public SpecialInvoice addressId( final Integer addressId )
  {
    this.addressId = addressId;

    return this;
  }

  @JsonGetter( "AdjustmentReason" )
  public Integer adjustmentReason()
  {
    return this.adjustmentReason;
  }

  @JsonSetter( "AdjustmentReason" )
  public SpecialInvoice adjustmentReason( final Integer adjustmentReason )
  {
    this.adjustmentReason = adjustmentReason;

    return this;
  }

  @JsonGetter( "AgreementAmount" )
  public Double agreementAmount()
  {
    return this.agreementAmount;
  }

  @JsonSetter( "AgreementAmount" )
  public SpecialInvoice agreementAmount( final Double agreementAmount )
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
  public Integer attention()
  {
    return this.attention;
  }

  @JsonSetter( "Attention" )
  public SpecialInvoice attention( final Integer attention )
  {
    this.attention = attention;

    return this;
  }

  @JsonGetter( "BillToCompanyId" )
  public Integer billToCompanyId()
  {
    return this.billToCompanyId;
  }

  @JsonSetter( "BillToCompanyId" )
  public SpecialInvoice billToCompanyId( final Integer billToCompanyId )
  {
    this.billToCompanyId = billToCompanyId;

    return this;
  }

  @JsonGetter( "BillingStatus" )
  public Integer billingStatus()
  {
    return this.billingStatus;
  }

  @JsonSetter( "BillingStatus" )
  public SpecialInvoice billingStatus( final Integer billingStatus )
  {
    this.billingStatus = billingStatus;

    return this;
  }

  @JsonGetter( "BillingStatusId" )
  public Integer billingStatusId()
  {
    return this.billingStatusId;
  }

  @JsonSetter( "BillingStatusId" )
  public SpecialInvoice billingStatusId( final Integer billingStatusId )
  {
    this.billingStatusId = billingStatusId;

    return this;
  }

  @JsonGetter( "BillingTermsId" )
  public Integer billingTermsId()
  {
    return this.billingTermsId;
  }

  @JsonSetter( "BillingTermsId" )
  public SpecialInvoice billingTermsId( final Integer billingTermsId )
  {
    this.billingTermsId = billingTermsId;

    return this;
  }

  @JsonGetter( "BottomComment" )
  public Integer bottomComment()
  {
    return this.bottomComment;
  }

  @JsonSetter( "BottomComment" )
  public SpecialInvoice bottomComment( final Integer bottomComment )
  {
    this.bottomComment = bottomComment;

    return this;
  }

  @JsonGetter( "By" )
  public Integer by()
  {
    return this.by;
  }

  @JsonSetter( "By" )
  public SpecialInvoice by( final Integer by )
  {
    this.by = by;

    return this;
  }

  @JsonGetter( "CompanyId" )
  public Integer companyId()
  {
    return this.companyId;
  }

  @JsonSetter( "CompanyId" )
  public SpecialInvoice companyId( final Integer companyId )
  {
    this.companyId = companyId;

    return this;
  }

  @JsonGetter( "Credits" )
  public Double credits()
  {
    return this.credits;
  }

  @JsonSetter( "Credits" )
  public SpecialInvoice credits( final Double credits )
  {
    this.credits = credits;

    return this;
  }

  @JsonGetter( "CustomerPO" )
  public Integer customerPO()
  {
    return this.customerPO;
  }

  @JsonSetter( "CustomerPO" )
  public SpecialInvoice customerPO( final Integer customerPO )
  {
    this.customerPO = customerPO;

    return this;
  }

  @JsonGetter( "DepartmentId" )
  public Integer departmentId()
  {
    return this.departmentId;
  }

  @JsonSetter( "DepartmentId" )
  public SpecialInvoice departmentId( final Integer departmentId )
  {
    this.departmentId = departmentId;

    return this;
  }

  @JsonGetter( "DownpaymentApplied" )
  public Double downpaymentApplied()
  {
    return this.downpaymentApplied;
  }

  @JsonSetter( "DownpaymentApplied" )
  public SpecialInvoice downpaymentApplied( final Double downpaymentApplied )
  {
    this.downpaymentApplied = downpaymentApplied;

    return this;
  }

  @JsonGetter( "DownpaymentPreviouslyTaxed" )
  public Boolean downpaymentPreviouslyTaxed()
  {
    return this.downpaymentPreviouslyTaxed;
  }

  @JsonSetter( "DownpaymentPreviouslyTaxed" )
  public SpecialInvoice downpaymentPreviouslyTaxed( final Boolean downpaymentPreviouslyTaxed )
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
  public Double expenseTotal()
  {
    return this.expenseTotal;
  }

  @JsonSetter( "ExpenseTotal" )
  public SpecialInvoice expenseTotal( final Double expenseTotal )
  {
    this.expenseTotal = expenseTotal;

    return this;
  }

  @JsonGetter( "InternalNotes" )
  public Integer internalNotes()
  {
    return this.internalNotes;
  }

  @JsonSetter( "InternalNotes" )
  public SpecialInvoice internalNotes( final Integer internalNotes )
  {
    this.internalNotes = internalNotes;

    return this;
  }

  @JsonGetter( "InvoiceBalance" )
  public Double invoiceBalance()
  {
    return this.invoiceBalance;
  }

  @JsonSetter( "InvoiceBalance" )
  public SpecialInvoice invoiceBalance( final Double invoiceBalance )
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
  public Integer invoiceEmailTemplateId()
  {
    return this.invoiceEmailTemplateId;
  }

  @JsonSetter( "InvoiceEmailTemplateId" )
  public SpecialInvoice invoiceEmailTemplateId( final Integer invoiceEmailTemplateId )
  {
    this.invoiceEmailTemplateId = invoiceEmailTemplateId;

    return this;
  }

  @JsonGetter( "InvoiceNumber" )
  public Integer invoiceNumber()
  {
    return this.invoiceNumber;
  }

  @JsonSetter( "InvoiceNumber" )
  public SpecialInvoice invoiceNumber( final Integer invoiceNumber )
  {
    this.invoiceNumber = invoiceNumber;

    return this;
  }

  @JsonGetter( "InvoiceSubtotal" )
  public Double invoiceSubtotal()
  {
    return this.invoiceSubtotal;
  }

  @JsonSetter( "InvoiceSubtotal" )
  public SpecialInvoice invoiceSubtotal( final Double invoiceSubtotal )
  {
    this.invoiceSubtotal = invoiceSubtotal;

    return this;
  }

  @JsonGetter( "InvoiceTemplateId" )
  public Integer invoiceTemplateId()
  {
    return this.invoiceTemplateId;
  }

  @JsonSetter( "InvoiceTemplateId" )
  public SpecialInvoice invoiceTemplateId( final Integer invoiceTemplateId )
  {
    this.invoiceTemplateId = invoiceTemplateId;

    return this;
  }

  @JsonGetter( "InvoiceTotal" )
  public Double invoiceTotal()
  {
    return this.invoiceTotal;
  }

  @JsonSetter( "InvoiceTotal" )
  public SpecialInvoice invoiceTotal( final Double invoiceTotal )
  {
    this.invoiceTotal = invoiceTotal;

    return this;
  }

  @JsonGetter( "InvoiceType" )
  public Integer invoiceType()
  {
    return this.invoiceType;
  }

  @JsonSetter( "InvoiceType" )
  public SpecialInvoice invoiceType( final Integer invoiceType )
  {
    this.invoiceType = invoiceType;

    return this;
  }

  @JsonGetter( "InvoiceTypeIdentifier" )
  public Integer invoiceTypeIdentifier()
  {
    return this.invoiceTypeIdentifier;
  }

  @JsonSetter( "InvoiceTypeIdentifier" )
  public SpecialInvoice invoiceTypeIdentifier( final Integer invoiceTypeIdentifier )
  {
    this.invoiceTypeIdentifier = invoiceTypeIdentifier;

    return this;
  }

  @JsonGetter( "LocationId" )
  public Integer locationId()
  {
    return this.locationId;
  }

  @JsonSetter( "LocationId" )
  public SpecialInvoice locationId( final Integer locationId )
  {
    this.locationId = locationId;

    return this;
  }

  @JsonGetter( "Payments" )
  public Double payments()
  {
    return this.payments;
  }

  @JsonSetter( "Payments" )
  public SpecialInvoice payments( final Double payments )
  {
    this.payments = payments;

    return this;
  }

  @JsonGetter( "PreviousProgressApplied" )
  public Double previousProgressApplied()
  {
    return this.previousProgressApplied;
  }

  @JsonSetter( "PreviousProgressApplied" )
  public SpecialInvoice previousProgressApplied( final Double previousProgressApplied )
  {
    this.previousProgressApplied = previousProgressApplied;

    return this;
  }

  @JsonGetter( "ProductTotal" )
  public Double productTotal()
  {
    return this.productTotal;
  }

  @JsonSetter( "ProductTotal" )
  public SpecialInvoice productTotal( final Double productTotal )
  {
    this.productTotal = productTotal;

    return this;
  }

  @JsonGetter( "Reference" )
  public Integer reference()
  {
    return this.reference;
  }

  @JsonSetter( "Reference" )
  public SpecialInvoice reference( final Integer reference )
  {
    this.reference = reference;

    return this;
  }

  @JsonGetter( "RemainingDownpayment" )
  public Double remainingDownpayment()
  {
    return this.remainingDownpayment;
  }

  @JsonSetter( "RemainingDownpayment" )
  public SpecialInvoice remainingDownpayment( final Double remainingDownpayment )
  {
    this.remainingDownpayment = remainingDownpayment;

    return this;
  }

  @JsonGetter( "RestrictDownpayment" )
  public Boolean restrictDownpayment()
  {
    return this.restrictDownpayment;
  }

  @JsonSetter( "RestrictDownpayment" )
  public SpecialInvoice restrictDownpayment( final Boolean restrictDownpayment )
  {
    this.restrictDownpayment = restrictDownpayment;

    return this;
  }

  @JsonGetter( "SalesTax" )
  public Double salesTax()
  {
    return this.salesTax;
  }

  @JsonSetter( "SalesTax" )
  public SpecialInvoice salesTax( final Double salesTax )
  {
    this.salesTax = salesTax;

    return this;
  }

  @JsonGetter( "ServiceAdjustmentAmount" )
  public Double serviceAdjustmentAmount()
  {
    return this.serviceAdjustmentAmount;
  }

  @JsonSetter( "ServiceAdjustmentAmount" )
  public SpecialInvoice serviceAdjustmentAmount( final Double serviceAdjustmentAmount )
  {
    this.serviceAdjustmentAmount = serviceAdjustmentAmount;

    return this;
  }

  @JsonGetter( "ShipToAddressId" )
  public Integer shipToAddressId()
  {
    return this.shipToAddressId;
  }

  @JsonSetter( "ShipToAddressId" )
  public SpecialInvoice shipToAddressId( final Integer shipToAddressId )
  {
    this.shipToAddressId = shipToAddressId;

    return this;
  }

  @JsonGetter( "ShipToAttention" )
  public Integer shipToAttention()
  {
    return this.shipToAttention;
  }

  @JsonSetter( "ShipToAttention" )
  public SpecialInvoice shipToAttention( final Integer shipToAttention )
  {
    this.shipToAttention = shipToAttention;

    return this;
  }

  @JsonGetter( "ShipToCompanyId" )
  public Integer shipToCompanyId()
  {
    return this.shipToCompanyId;
  }

  @JsonSetter( "ShipToCompanyId" )
  public SpecialInvoice shipToCompanyId( final Integer shipToCompanyId )
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
  public Integer taxCodeId()
  {
    return this.taxCodeId;
  }

  @JsonSetter( "TaxCodeId" )
  public SpecialInvoice taxCodeId( final Integer taxCodeId )
  {
    this.taxCodeId = taxCodeId;

    return this;
  }

  @JsonGetter( "Taxable" )
  public Boolean taxable()
  {
    return this.taxable;
  }

  @JsonSetter( "Taxable" )
  public SpecialInvoice taxable( final Boolean taxable )
  {
    this.taxable = taxable;

    return this;
  }

  @JsonGetter( "TerritoryId" )
  public Integer territoryId()
  {
    return this.territoryId;
  }

  @JsonSetter( "TerritoryId" )
  public SpecialInvoice territoryId( final Integer territoryId )
  {
    this.territoryId = territoryId;

    return this;
  }

  @JsonGetter( "TopComment" )
  public Integer topComment()
  {
    return this.topComment;
  }

  @JsonSetter( "TopComment" )
  public SpecialInvoice topComment( final Integer topComment )
  {
    this.topComment = topComment;

    return this;
  }

  @JsonGetter( "Total" )
  public Double total()
  {
    return this.total;
  }

  @JsonSetter( "Total" )
  public SpecialInvoice total( final Double total )
  {
    this.total = total;

    return this;
  }

}
