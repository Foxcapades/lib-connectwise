package io.vulpine.connectwise.type.invoice;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Date;

public class FoundSpecialInvoice
{
  private int     id;
  private String  invoiceNumber;
  private Date    invoiceDate;
  private int     companyId;
  private int     billToCompanyId;
  private int     addressId;
  private String  applyToType;
  private int     applyToId;
  private double  total;
  private double  invoiceTotal;
  private double  remainingDownpayment;
  private Date    dueDate;
  private String  customerPO;
  private String  invoiceTypeIdentifier;
  private String  invoiceType;
  private int     billingStatusId;
  private String  billingStatus;
  private boolean closed;
  private int     billingTermsId;
  private String  billingTerms;
  private boolean taxable;
  private String  attention;

  @JsonGetter( "AddressId" )
  public int addressId()
  {
    return this.addressId;
  }

  @JsonSetter( "AddressId" )
  public void addressId( final int addressId )
  {
    this.addressId = addressId;
  }

  @JsonGetter( "ApplyToId" )
  public int applyToId()
  {
    return this.applyToId;
  }

  @JsonSetter( "ApplyToId" )
  public void applyToId( final int applyToId )
  {
    this.applyToId = applyToId;
  }

  @JsonGetter( "ApplyToType" )
  public String applyToType()
  {
    return this.applyToType;
  }

  @JsonSetter( "ApplyToType" )
  public void applyToType( final String applyToType )
  {
    this.applyToType = applyToType;
  }

  @JsonGetter( "Attention" )
  public String attention()
  {
    return this.attention;
  }

  @JsonSetter( "Attention" )
  public void attention( final String attention )
  {
    this.attention = attention;
  }

  @JsonGetter( "BillToCompanyId" )
  public int billToCompanyId()
  {
    return this.billToCompanyId;
  }

  @JsonSetter( "BillToCompanyId" )
  public void billToCompanyId( final int billToCompanyId )
  {
    this.billToCompanyId = billToCompanyId;
  }

  @JsonGetter( "BillingStatus" )
  public String billingStatus()
  {
    return this.billingStatus;
  }

  @JsonSetter( "BillingStatus" )
  public void billingStatus( final String billingStatus )
  {
    this.billingStatus = billingStatus;
  }

  @JsonGetter( "BillingStatusId" )
  public int billingStatusId()
  {
    return this.billingStatusId;
  }

  @JsonSetter( "BillingStatusId" )
  public void billingStatusId( final int billingStatusId )
  {
    this.billingStatusId = billingStatusId;
  }

  @JsonGetter( "BillingTerms" )
  public String billingTerms()
  {
    return this.billingTerms;
  }

  @JsonSetter( "BillingTerms" )
  public void billingTerms( final String billingTerms )
  {
    this.billingTerms = billingTerms;
  }

  @JsonGetter( "BillingTermsId" )
  public int billingTermsId()
  {
    return this.billingTermsId;
  }

  @JsonSetter( "BillingTermsId" )
  public void billingTermsId( final int billingTermsId )
  {
    this.billingTermsId = billingTermsId;
  }

  @JsonGetter( "Closed" )
  public boolean closed()
  {
    return this.closed;
  }

  @JsonSetter( "Closed" )
  public void closed( final boolean closed )
  {
    this.closed = closed;
  }

  @JsonGetter( "CompanyId" )
  public int companyId()
  {
    return this.companyId;
  }

  @JsonSetter( "CompanyId" )
  public void companyId( final int companyId )
  {
    this.companyId = companyId;
  }

  @JsonGetter( "CustomerPO" )
  public String customerPO()
  {
    return this.customerPO;
  }

  @JsonSetter( "CustomerPO" )
  public void customerPO( final String customerPO )
  {
    this.customerPO = customerPO;
  }

  @JsonGetter( "DueDate" )
  public Date dueDate()
  {
    return this.dueDate;
  }

  @JsonSetter( "DueDate" )
  public void dueDate( final Date dueDate )
  {
    this.dueDate = dueDate;
  }

  @JsonGetter( "Id" )
  public int id()
  {
    return this.id;
  }

  @JsonSetter( "Id" )
  public void id( final int id )
  {
    this.id = id;
  }

  @JsonGetter( "InvoiceDate" )
  public Date invoiceDate()
  {
    return this.invoiceDate;
  }

  @JsonSetter( "InvoiceDate" )
  public void invoiceDate( final Date invoiceDate )
  {
    this.invoiceDate = invoiceDate;
  }

  @JsonGetter( "InvoiceNumber" )
  public String invoiceNumber()
  {
    return this.invoiceNumber;
  }

  @JsonSetter( "InvoiceNumber" )
  public void invoiceNumber( final String invoiceNumber )
  {
    this.invoiceNumber = invoiceNumber;
  }

  @JsonGetter( "InvoiceTotal" )
  public double invoiceTotal()
  {
    return this.invoiceTotal;
  }

  @JsonSetter( "InvoiceTotal" )
  public void invoiceTotal( final double invoiceTotal )
  {
    this.invoiceTotal = invoiceTotal;
  }

  @JsonGetter( "InvoiceType" )
  public String invoiceType()
  {
    return this.invoiceType;
  }

  @JsonSetter( "InvoiceType" )
  public void invoiceType( final String invoiceType )
  {
    this.invoiceType = invoiceType;
  }

  @JsonGetter( "InvoiceTypeIdentifier" )
  public String invoiceTypeIdentifier()
  {
    return this.invoiceTypeIdentifier;
  }

  @JsonSetter( "InvoiceTypeIdentifier" )
  public void invoiceTypeIdentifier( final String invoiceTypeIdentifier )
  {
    this.invoiceTypeIdentifier = invoiceTypeIdentifier;
  }

  @JsonGetter( "RemainingDownpayment" )
  public double remainingDownpayment()
  {
    return this.remainingDownpayment;
  }

  @JsonSetter( "RemainingDownpayment" )
  public void remainingDownpayment( final double remainingDownpayment )
  {
    this.remainingDownpayment = remainingDownpayment;
  }

  @JsonGetter( "Taxable" )
  public boolean taxable()
  {
    return this.taxable;
  }

  @JsonSetter( "Taxable" )
  public void taxable( final boolean taxable )
  {
    this.taxable = taxable;
  }

  @JsonGetter( "Total" )
  public double total()
  {
    return this.total;
  }

  @JsonSetter( "Total" )
  public void total( final double total )
  {
    this.total = total;
  }

}
