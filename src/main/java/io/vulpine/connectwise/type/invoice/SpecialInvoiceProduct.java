package io.vulpine.connectwise.type.invoice;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class SpecialInvoiceProduct
{
  private Integer id;

  private Boolean dropship;

  private Boolean specialOrder;

  private Integer forecastDetailId;

  private Integer ticketId;

  private Integer projectId;

  private Integer invoiceId;

  private Integer salesOrderId;

  private Boolean invoice;

  private Boolean taxable;

  private Boolean billable;

  private Double price;

  private Double cost;

  private Double quantity;

  private Double quantityCancelled;

  private Integer itemId;

  private String description;

  private String shortDescription;

  private Integer opportunityId;

  private String warehouse;

  private String bin;

  private String quoteNumber;

  private String quoteName;

  private Integer locationId;

  private Integer businessUnitId;

  private Boolean isPhaseProduct;

  private Double sequenceNumber;

  private List < BundleComponent > bundleComponents;

  private Integer vendorId;

  @JsonGetter( "Billable" )
  public Boolean billable()
  {
    return this.billable;
  }

  @JsonSetter( "Billable" )
  public void billable( final Boolean billable )
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
  public Integer businessUnitId()
  {
    return this.businessUnitId;
  }

  @JsonSetter( "BusinessUnitId" )
  public void businessUnitId( final Integer businessUnitId )
  {
    this.businessUnitId = businessUnitId;
  }

  @JsonGetter( "Cost" )
  public Double cost()
  {
    return this.cost;
  }

  @JsonSetter( "Cost" )
  public void cost( final Double cost )
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
  public Boolean dropship()
  {
    return this.dropship;
  }

  @JsonSetter( "Dropship" )
  public void dropship( final Boolean dropship )
  {
    this.dropship = dropship;
  }

  @JsonGetter( "ForecastDetailId" )
  public Integer forecastDetailId()
  {
    return this.forecastDetailId;
  }

  @JsonSetter( "ForecastDetailId" )
  public void forecastDetailId( final Integer forecastDetailId )
  {
    this.forecastDetailId = forecastDetailId;
  }

  @JsonGetter( "Id" )
  public Integer id()
  {
    return this.id;
  }

  @JsonSetter( "Id" )
  public void id( final Integer id )
  {
    this.id = id;
  }

  @JsonGetter( "Invoice" )
  public Boolean invoice()
  {
    return this.invoice;
  }

  @JsonSetter( "Invoice" )
  public void invoice( final Boolean invoice )
  {
    this.invoice = invoice;
  }

  @JsonGetter( "InvoiceId" )
  public Integer invoiceId()
  {
    return this.invoiceId;
  }

  @JsonSetter( "InvoiceId" )
  public void invoiceId( final Integer invoiceId )
  {
    this.invoiceId = invoiceId;
  }

  @JsonGetter( "IsPhaseProduct" )
  public Boolean isPhaseProduct()
  {
    return this.isPhaseProduct;
  }

  @JsonSetter( "IsPhaseProduct" )
  public void isPhaseProduct( final Boolean isPhaseProduct )
  {
    this.isPhaseProduct = isPhaseProduct;
  }

  @JsonGetter( "ItemId" )
  public Integer itemId()
  {
    return this.itemId;
  }

  @JsonSetter( "ItemId" )
  public void itemId( final Integer itemId )
  {
    this.itemId = itemId;
  }

  @JsonGetter( "LocationId" )
  public Integer locationId()
  {
    return this.locationId;
  }

  @JsonSetter( "LocationId" )
  public void locationId( final Integer locationId )
  {
    this.locationId = locationId;
  }

  @JsonGetter( "OpportunityId" )
  public Integer opportunityId()
  {
    return this.opportunityId;
  }

  @JsonSetter( "OpportunityId" )
  public void opportunityId( final Integer opportunityId )
  {
    this.opportunityId = opportunityId;
  }

  @JsonGetter( "Price" )
  public Double price()
  {
    return this.price;
  }

  @JsonSetter( "Price" )
  public void price( final Double price )
  {
    this.price = price;
  }

  @JsonGetter( "ProjectId" )
  public Integer projectId()
  {
    return this.projectId;
  }

  @JsonSetter( "ProjectId" )
  public void projectId( final Integer projectId )
  {
    this.projectId = projectId;
  }

  @JsonGetter( "Quantity" )
  public Double quantity()
  {
    return this.quantity;
  }

  @JsonSetter( "Quantity" )
  public void quantity( final Double quantity )
  {
    this.quantity = quantity;
  }

  @JsonGetter( "QuantityCancelled" )
  public Double quantityCancelled()
  {
    return this.quantityCancelled;
  }

  @JsonSetter( "QuantityCancelled" )
  public void quantityCancelled( final Double quantityCancelled )
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
  public Integer salesOrderId()
  {
    return this.salesOrderId;
  }

  @JsonSetter( "SalesOrderId" )
  public void salesOrderId( final Integer salesOrderId )
  {
    this.salesOrderId = salesOrderId;
  }

  @JsonGetter( "SequenceNumber" )
  public Double sequenceNumber()
  {
    return this.sequenceNumber;
  }

  @JsonSetter( "SequenceNumber" )
  public void sequenceNumber( final Double sequenceNumber )
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
  public Boolean specialOrder()
  {
    return this.specialOrder;
  }

  @JsonSetter( "SpecialOrder" )
  public void specialOrder( final Boolean specialOrder )
  {
    this.specialOrder = specialOrder;
  }

  @JsonGetter( "Taxable" )
  public Boolean taxable()
  {
    return this.taxable;
  }

  @JsonSetter( "Taxable" )
  public void taxable( final Boolean taxable )
  {
    this.taxable = taxable;
  }

  @JsonGetter( "TicketId" )
  public Integer ticketId()
  {
    return this.ticketId;
  }

  @JsonSetter( "TicketId" )
  public void ticketId( final Integer ticketId )
  {
    this.ticketId = ticketId;
  }

  @JsonGetter( "VendorId" )
  public Integer vendorId()
  {
    return this.vendorId;
  }

  @JsonSetter( "VendorId" )
  public void vendorId( final Integer vendorId )
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
