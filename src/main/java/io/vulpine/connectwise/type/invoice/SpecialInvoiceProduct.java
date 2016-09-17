package io.vulpine.connectwise.type.invoice;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class SpecialInvoiceProduct
{
  private int id;

  private boolean dropship;

  private boolean specialOrder;

  private int forecastDetailId;

  private int ticketId;

  private int projectId;

  private int invoiceId;

  private int salesOrderId;

  private boolean invoice;

  private boolean taxable;

  private boolean billable;

  private double price;

  private double cost;

  private double quantity;

  private double quantityCancelled;

  private int itemId;

  private String description;

  private String shortDescription;

  private int opportunityId;

  private String warehouse;

  private String bin;

  private String quoteNumber;

  private String quoteName;

  private int locationId;

  private int businessUnitId;

  private boolean isPhaseProduct;

  private double sequenceNumber;

  private List < BundleComponent > bundleComponents;

  private int vendorId;

  @JsonGetter( "Billable" )
  public boolean billable()
  {
    return this.billable;
  }

  @JsonSetter( "Billable" )
  public void billable( final boolean billable )
  {
    this.billable = billable;
  }

  @JsonGetter( "Bin" )
  public String bin()
  {
    return this.bin;
  }

  @JsonSetter( "Bin" )
  public void bin( final String bin )
  {
    this.bin = bin;
  }

  @JsonGetter( "BundleComponents" )
  public List < BundleComponent > bundleComponents()
  {
    return this.bundleComponents;
  }

  @JsonSetter( "BundleComponents" )
  public void bundleComponents( final List < BundleComponent > bundleComponents )
  {
    this.bundleComponents = bundleComponents;
  }

  @JsonGetter( "BusinessUnitId" )
  public int businessUnitId()
  {
    return this.businessUnitId;
  }

  @JsonSetter( "BusinessUnitId" )
  public void businessUnitId( final int businessUnitId )
  {
    this.businessUnitId = businessUnitId;
  }

  @JsonGetter( "Cost" )
  public double cost()
  {
    return this.cost;
  }

  @JsonSetter( "Cost" )
  public void cost( final double cost )
  {
    this.cost = cost;
  }

  @JsonGetter( "Description" )
  public String description()
  {
    return this.description;
  }

  @JsonSetter( "Description" )
  public void description( final String description )
  {
    this.description = description;
  }

  @JsonGetter( "Dropship" )
  public boolean dropship()
  {
    return this.dropship;
  }

  @JsonSetter( "Dropship" )
  public void dropship( final boolean dropship )
  {
    this.dropship = dropship;
  }

  @JsonGetter( "ForecastDetailId" )
  public int forecastDetailId()
  {
    return this.forecastDetailId;
  }

  @JsonSetter( "ForecastDetailId" )
  public void forecastDetailId( final int forecastDetailId )
  {
    this.forecastDetailId = forecastDetailId;
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

  @JsonGetter( "Invoice" )
  public boolean invoice()
  {
    return this.invoice;
  }

  @JsonSetter( "Invoice" )
  public void invoice( final boolean invoice )
  {
    this.invoice = invoice;
  }

  @JsonGetter( "InvoiceId" )
  public int invoiceId()
  {
    return this.invoiceId;
  }

  @JsonSetter( "InvoiceId" )
  public void invoiceId( final int invoiceId )
  {
    this.invoiceId = invoiceId;
  }

  @JsonGetter( "IsPhaseProduct" )
  public boolean isPhaseProduct()
  {
    return this.isPhaseProduct;
  }

  @JsonSetter( "IsPhaseProduct" )
  public void isPhaseProduct( final boolean isPhaseProduct )
  {
    this.isPhaseProduct = isPhaseProduct;
  }

  @JsonGetter( "ItemId" )
  public int itemId()
  {
    return this.itemId;
  }

  @JsonSetter( "ItemId" )
  public void itemId( final int itemId )
  {
    this.itemId = itemId;
  }

  @JsonGetter( "LocationId" )
  public int locationId()
  {
    return this.locationId;
  }

  @JsonSetter( "LocationId" )
  public void locationId( final int locationId )
  {
    this.locationId = locationId;
  }

  @JsonGetter( "OpportunityId" )
  public int opportunityId()
  {
    return this.opportunityId;
  }

  @JsonSetter( "OpportunityId" )
  public void opportunityId( final int opportunityId )
  {
    this.opportunityId = opportunityId;
  }

  @JsonGetter( "Price" )
  public double price()
  {
    return this.price;
  }

  @JsonSetter( "Price" )
  public void price( final double price )
  {
    this.price = price;
  }

  @JsonGetter( "ProjectId" )
  public int projectId()
  {
    return this.projectId;
  }

  @JsonSetter( "ProjectId" )
  public void projectId( final int projectId )
  {
    this.projectId = projectId;
  }

  @JsonGetter( "Quantity" )
  public double quantity()
  {
    return this.quantity;
  }

  @JsonSetter( "Quantity" )
  public void quantity( final double quantity )
  {
    this.quantity = quantity;
  }

  @JsonGetter( "QuantityCancelled" )
  public double quantityCancelled()
  {
    return this.quantityCancelled;
  }

  @JsonSetter( "QuantityCancelled" )
  public void quantityCancelled( final double quantityCancelled )
  {
    this.quantityCancelled = quantityCancelled;
  }

  @JsonGetter( "QuoteName" )
  public String quoteName()
  {
    return this.quoteName;
  }

  @JsonSetter( "QuoteName" )
  public void quoteName( final String quoteName )
  {
    this.quoteName = quoteName;
  }

  @JsonGetter( "QuoteNumber" )
  public String quoteNumber()
  {
    return this.quoteNumber;
  }

  @JsonSetter( "QuoteNumber" )
  public void quoteNumber( final String quoteNumber )
  {
    this.quoteNumber = quoteNumber;
  }

  @JsonGetter( "SalesOrderId" )
  public int salesOrderId()
  {
    return this.salesOrderId;
  }

  @JsonSetter( "SalesOrderId" )
  public void salesOrderId( final int salesOrderId )
  {
    this.salesOrderId = salesOrderId;
  }

  @JsonGetter( "SequenceNumber" )
  public double sequenceNumber()
  {
    return this.sequenceNumber;
  }

  @JsonSetter( "SequenceNumber" )
  public void sequenceNumber( final double sequenceNumber )
  {
    this.sequenceNumber = sequenceNumber;
  }

  @JsonGetter( "ShortDescription" )
  public String shortDescription()
  {
    return this.shortDescription;
  }

  @JsonSetter( "ShortDescription" )
  public void shortDescription( final String shortDescription )
  {
    this.shortDescription = shortDescription;
  }

  @JsonGetter( "SpecialOrder" )
  public boolean specialOrder()
  {
    return this.specialOrder;
  }

  @JsonSetter( "SpecialOrder" )
  public void specialOrder( final boolean specialOrder )
  {
    this.specialOrder = specialOrder;
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

  @JsonGetter( "TicketId" )
  public int ticketId()
  {
    return this.ticketId;
  }

  @JsonSetter( "TicketId" )
  public void ticketId( final int ticketId )
  {
    this.ticketId = ticketId;
  }

  @JsonGetter( "VendorId" )
  public int vendorId()
  {
    return this.vendorId;
  }

  @JsonSetter( "VendorId" )
  public void vendorId( final int vendorId )
  {
    this.vendorId = vendorId;
  }

  @JsonGetter( "Warehouse" )
  public String warehouse()
  {
    return this.warehouse;
  }

  @JsonSetter( "Warehouse" )
  public void warehouse( final String warehouse )
  {
    this.warehouse = warehouse;
  }
}
