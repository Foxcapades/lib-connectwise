package io.vulpine.connectwise.type.invoice;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.type.CwObject;

import java.util.Date;

@SuppressWarnings( "unused" )
public class Invoice extends CwObject
{
  @JacksonXmlProperty ( localName = "IsClientLocation" )
  protected boolean isClientLocation;

  @JacksonXmlProperty ( localName = "Taxable" )
  protected boolean taxable;

  @JacksonXmlProperty ( localName = "Email" )
  protected boolean email;

  @JacksonXmlProperty ( localName = "Closed" )
  protected boolean closed;

  @JacksonXmlProperty ( localName = "Sent" )
  protected boolean sent;

  @JacksonXmlProperty( localName = "GlPosted" )
  protected boolean glPosted;

  @JacksonXmlProperty ( localName = "DueDate" )
  protected Date dueDate;

  @JacksonXmlProperty ( localName = "InvoiceDate" )
  protected Date invoiceDate;

  @JacksonXmlProperty ( localName = "InvoiceType" )
  protected String invoiceType;

  @JacksonXmlProperty ( localName = "DownpaymentAmount" )
  protected double downpaymentAmount;

  @JacksonXmlProperty ( localName = "InvoiceAmount" )
  protected double invoiceAmount;

  @JacksonXmlProperty ( localName = "ProjectBillingAmount" )
  protected double projectBillingAmount;

  @JacksonXmlProperty ( localName = "ProjectBillingRate" )
  protected double projectBillingRate;

  @JacksonXmlProperty ( localName = "SalesTaxAmount" )
  protected double salesTaxAmount;

  @JacksonXmlProperty ( localName = "TaxableAmount" )
  protected double taxableAmount;

  @JacksonXmlProperty ( localName = "TaxRate" )
  protected double taxRate;

  @JacksonXmlProperty ( localName = "TicketBillingAmount" )
  protected double ticketBillingAmount;

  @JacksonXmlProperty ( localName = "DueDays" )
  protected int dueDays;

  @JacksonXmlProperty ( localName = "AgreementName" )
  protected String agreementName;

  @JacksonXmlProperty ( localName = "AgreementType" )
  protected String agreementType;

  @JacksonXmlProperty ( localName = "BillingDelivery" )
  protected String billingDelivery;

  @JacksonXmlProperty ( localName = "BillingMethod" )
  protected String billingMethod;

  @JacksonXmlProperty ( localName = "BillingTerms" )
  protected String billingTerms;

  @JacksonXmlProperty ( localName = "BillingTermsXref" )
  protected String billingTermsXref;

  @JacksonXmlProperty ( localName = "BusinessUnit" )
  protected String businessUnit;

  @JacksonXmlProperty ( localName = "CurrencyName" )
  protected String currencyName;

  @JacksonXmlProperty ( localName = "CurrencySymbol" )
  protected String currencySymbol;

  @JacksonXmlProperty ( localName = "GlBatchId" )
  protected String glBatchId;

  @JacksonXmlProperty ( localName = "TopComment" )
  protected String topComment;

  @JacksonXmlProperty ( localName = "BottomComment" )
  protected String bottomComment;

  @JacksonXmlProperty ( localName = "InvoiceNumber" )
  protected String invoiceNumber;

  @JacksonXmlProperty ( localName = "Location" )
  protected String location;

  @JacksonXmlProperty ( localName = "PoNumber" )
  protected String poNumber;

  @JacksonXmlProperty ( localName = "ProjectName" )
  protected String projectName;

  @JacksonXmlProperty ( localName = "ProjectNumber" )
  protected int projectNumber;

  @JacksonXmlProperty ( localName = "PhaseName" )
  protected String phaseName;

  @JacksonXmlProperty ( localName = "RoutedMemberIdentifier" )
  protected String routedMemberIdentifier;

  @JacksonXmlProperty ( localName = "RoutedMemberName" )
  protected String routedMemberName;

  @JacksonXmlProperty ( localName = "RemitName" )
  protected String remitName;

  @JacksonXmlProperty ( localName = "RemitPhone" )
  protected String remitPhone;

  @JacksonXmlProperty ( localName = "SalesRepIdentifier" )
  protected String salesRepIdentifier;

  @JacksonXmlProperty ( localName = "Status" )
  protected String status;

  @JacksonXmlProperty ( localName = "TaxCodeDescription" )
  protected String taxCodeDescription;

  @JacksonXmlProperty ( localName = "TaxCode" )
  protected String taxCode;

  @JacksonXmlProperty ( localName = "Territory" )
  protected String territory;

  @JacksonXmlProperty ( localName = "TicketNumber" )
  protected int ticketNumber;

  @JacksonXmlProperty ( localName = "TicketResolution" )
  protected String ticketResolution;

  @JacksonXmlProperty ( localName = "TicketSummary" )
  protected String ticketSummary;

  public boolean isClientLocation ()
  {
    return isClientLocation;
  }

  public void setClientLocation ( final boolean clientLocation )
  {
    isClientLocation = clientLocation;
  }

  public boolean isTaxable ()
  {
    return taxable;
  }

  public void setTaxable ( final boolean taxable )
  {
    this.taxable = taxable;
  }

  public boolean isEmail ()
  {
    return email;
  }

  public void setEmail ( final boolean email )
  {
    this.email = email;
  }

  public boolean isClosed ()
  {
    return closed;
  }

  public void setClosed ( final boolean closed )
  {
    this.closed = closed;
  }

  public boolean isSent ()
  {
    return sent;
  }

  public void setSent ( final boolean sent )
  {
    this.sent = sent;
  }

  public boolean isGlPosted ()
  {
    return glPosted;
  }

  public void setGlPosted ( final boolean glPosted )
  {
    this.glPosted = glPosted;
  }

  public Date getDueDate ()
  {
    return dueDate;
  }

  public void setDueDate ( final Date dueDate )
  {
    this.dueDate = dueDate;
  }

  public Date getInvoiceDate ()
  {
    return invoiceDate;
  }

  public void setInvoiceDate ( final Date invoiceDate )
  {
    this.invoiceDate = invoiceDate;
  }

  public String getInvoiceType ()
  {
    return invoiceType;
  }

  public void setInvoiceType ( final String invoiceType )
  {
    this.invoiceType = invoiceType;
  }

  public double getDownpaymentAmount ()
  {
    return downpaymentAmount;
  }

  public void setDownpaymentAmount ( final double downpaymentAmount )
  {
    this.downpaymentAmount = downpaymentAmount;
  }

  public double getInvoiceAmount ()
  {
    return invoiceAmount;
  }

  public void setInvoiceAmount ( final double invoiceAmount )
  {
    this.invoiceAmount = invoiceAmount;
  }

  public double getProjectBillingAmount ()
  {
    return projectBillingAmount;
  }

  public void setProjectBillingAmount ( final double projectBillingAmount )
  {
    this.projectBillingAmount = projectBillingAmount;
  }

  public double getProjectBillingRate ()
  {
    return projectBillingRate;
  }

  public void setProjectBillingRate ( final double projectBillingRate )
  {
    this.projectBillingRate = projectBillingRate;
  }

  public double getSalesTaxAmount ()
  {
    return salesTaxAmount;
  }

  public void setSalesTaxAmount ( final double salesTaxAmount )
  {
    this.salesTaxAmount = salesTaxAmount;
  }

  public double getTaxableAmount ()
  {
    return taxableAmount;
  }

  public void setTaxableAmount ( final double taxableAmount )
  {
    this.taxableAmount = taxableAmount;
  }

  public double getTaxRate ()
  {
    return taxRate;
  }

  public void setTaxRate ( final double taxRate )
  {
    this.taxRate = taxRate;
  }

  public double getTicketBillingAmount ()
  {
    return ticketBillingAmount;
  }

  public void setTicketBillingAmount ( final double ticketBillingAmount )
  {
    this.ticketBillingAmount = ticketBillingAmount;
  }

  public int getDueDays ()
  {
    return dueDays;
  }

  public void setDueDays ( final int dueDays )
  {
    this.dueDays = dueDays;
  }

  public String getAgreementName ()
  {
    return agreementName;
  }

  public void setAgreementName ( final String agreementName )
  {
    this.agreementName = agreementName;
  }

  public String getAgreementType ()
  {
    return agreementType;
  }

  public void setAgreementType ( final String agreementType )
  {
    this.agreementType = agreementType;
  }

  public String getBillingDelivery ()
  {
    return billingDelivery;
  }

  public void setBillingDelivery ( final String billingDelivery )
  {
    this.billingDelivery = billingDelivery;
  }

  public String getBillingMethod ()
  {
    return billingMethod;
  }

  public void setBillingMethod ( final String billingMethod )
  {
    this.billingMethod = billingMethod;
  }

  public String getBillingTerms ()
  {
    return billingTerms;
  }

  public void setBillingTerms ( final String billingTerms )
  {
    this.billingTerms = billingTerms;
  }

  public String getBillingTermsXref ()
  {
    return billingTermsXref;
  }

  public void setBillingTermsXref ( final String billingTermsXref )
  {
    this.billingTermsXref = billingTermsXref;
  }

  public String getBusinessUnit ()
  {
    return businessUnit;
  }

  public void setBusinessUnit ( final String businessUnit )
  {
    this.businessUnit = businessUnit;
  }

  public String getCurrencyName ()
  {
    return currencyName;
  }

  public void setCurrencyName ( final String currencyName )
  {
    this.currencyName = currencyName;
  }

  public String getCurrencySymbol ()
  {
    return currencySymbol;
  }

  public void setCurrencySymbol ( final String currencySymbol )
  {
    this.currencySymbol = currencySymbol;
  }

  public String getGlBatchId ()
  {
    return glBatchId;
  }

  public void setGlBatchId ( final String glBatchId )
  {
    this.glBatchId = glBatchId;
  }

  public String getTopComment ()
  {
    return topComment;
  }

  public void setTopComment ( final String topComment )
  {
    this.topComment = topComment;
  }

  public String getBottomComment ()
  {
    return bottomComment;
  }

  public void setBottomComment ( final String bottomComment )
  {
    this.bottomComment = bottomComment;
  }

  public String getInvoiceNumber ()
  {
    return invoiceNumber;
  }

  public void setInvoiceNumber ( final String invoiceNumber )
  {
    this.invoiceNumber = invoiceNumber;
  }

  public String getLocation ()
  {
    return location;
  }

  public void setLocation ( final String location )
  {
    this.location = location;
  }

  public String getPoNumber ()
  {
    return poNumber;
  }

  public void setPoNumber ( final String poNumber )
  {
    this.poNumber = poNumber;
  }

  public String getProjectName ()
  {
    return projectName;
  }

  public void setProjectName ( final String projectName )
  {
    this.projectName = projectName;
  }

  public int getProjectNumber ()
  {
    return projectNumber;
  }

  public void setProjectNumber ( final int projectNumber )
  {
    this.projectNumber = projectNumber;
  }

  public String getPhaseName ()
  {
    return phaseName;
  }

  public void setPhaseName ( final String phaseName )
  {
    this.phaseName = phaseName;
  }

  public String getRoutedMemberIdentifier ()
  {
    return routedMemberIdentifier;
  }

  public void setRoutedMemberIdentifier ( final String routedMemberIdentifier )
  {
    this.routedMemberIdentifier = routedMemberIdentifier;
  }

  public String getRoutedMemberName ()
  {
    return routedMemberName;
  }

  public void setRoutedMemberName ( final String routedMemberName )
  {
    this.routedMemberName = routedMemberName;
  }

  public String getRemitName ()
  {
    return remitName;
  }

  public void setRemitName ( final String remitName )
  {
    this.remitName = remitName;
  }

  public String getRemitPhone ()
  {
    return remitPhone;
  }

  public void setRemitPhone ( final String remitPhone )
  {
    this.remitPhone = remitPhone;
  }

  public String getSalesRepIdentifier ()
  {
    return salesRepIdentifier;
  }

  public void setSalesRepIdentifier ( final String salesRepIdentifier )
  {
    this.salesRepIdentifier = salesRepIdentifier;
  }

  public String getStatus ()
  {
    return status;
  }

  public void setStatus ( final String status )
  {
    this.status = status;
  }

  public String getTaxCodeDescription ()
  {
    return taxCodeDescription;
  }

  public void setTaxCodeDescription ( final String taxCodeDescription )
  {
    this.taxCodeDescription = taxCodeDescription;
  }

  public String getTaxCode ()
  {
    return taxCode;
  }

  public void setTaxCode ( final String taxCode )
  {
    this.taxCode = taxCode;
  }

  public String getTerritory ()
  {
    return territory;
  }

  public void setTerritory ( final String territory )
  {
    this.territory = territory;
  }

  public int getTicketNumber ()
  {
    return ticketNumber;
  }

  public void setTicketNumber ( final int ticketNumber )
  {
    this.ticketNumber = ticketNumber;
  }

  public String getTicketResolution ()
  {
    return ticketResolution;
  }

  public void setTicketResolution ( final String ticketResolution )
  {
    this.ticketResolution = ticketResolution;
  }

  public String getTicketSummary ()
  {
    return ticketSummary;
  }

  public void setTicketSummary ( final String ticketSummary )
  {
    this.ticketSummary = ticketSummary;
  }
}
