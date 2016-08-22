package io.vulpine.connectwise.type.purchasing;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.CwObject;

import java.util.Date;
import java.util.List;

@SuppressWarnings( "unused" )
public class PurchaseOrder extends CwObject
{
  @JacksonXmlProperty(localName = "VendorCompany")
  protected VendorCompany vendorCompany;

  @JacksonXmlProperty(localName = "VendorContact")
  protected VendorContact vendorContact;

  @JacksonXmlProperty(localName = "IsDropShipped")
  protected boolean isDropShipped;

  @JacksonXmlProperty(localName = "ShipToWarehouse")
  protected String shipToWarehouse;

  @JacksonXmlProperty(localName = "ShipToCompany")
  protected ShipToCompany shipToCompany;

  @JacksonXmlProperty(localName = "DropShipAddress")
  protected DropShipAddress dropShipAddress;

  @JacksonXmlProperty( localName = "PoNumber")
  protected String poNumber;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty (localName = "PurchaseDate")
  protected Date purchaseDate;

  @JacksonXmlProperty(localName = "VendorOrderNumber")
  protected String vendorOrderNumber;

  @JacksonXmlProperty(localName = "VendorInvoiceNumber")
  protected String vendorInvoiceNumber;

  @JacksonXmlProperty(localName = "BillingTerms")
  protected String billingTerms;

  @JacksonXmlProperty(localName = "SubTotal")
  protected double subTotal;

  @JacksonXmlProperty(localName = "FreightCost")
  protected double freightCost;

  @JacksonXmlProperty(localName = "Total")
  protected double total;

  @JacksonXmlProperty(localName = "Location")
  protected String location;

  @JacksonXmlProperty(localName = "BusinessUnit")
  protected String businessUnit;

  @JacksonXmlProperty(localName = "EnteredBy")
  protected String enteredBy;

  @JacksonXmlProperty(localName = "ShipmentMethod")
  protected String shipmentMethod;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty(localName = "ShipDate")
  protected Date shipDate;

  @JacksonXmlProperty(localName = "TrackingNumber")
  protected String trackingNumber;

  @JacksonXmlProperty(localName = "ShippingInstructions")
  protected String shippingInstructions;

  @JacksonXmlProperty(localName = "IsClosed")
  protected boolean isClosed;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty(localName = "DateClosed")
  protected Date dateClosed;

  @JacksonXmlProperty(localName = "LineItems")
  protected List < PurchaseOrderLineItem > lineItems;

  public VendorCompany getVendorCompany ()
  {
    return vendorCompany;
  }

  public void setVendorCompany ( final VendorCompany vendorCompany )
  {
    this.vendorCompany = vendorCompany;
  }

  public VendorContact getVendorContact ()
  {
    return vendorContact;
  }

  public void setVendorContact ( final VendorContact vendorContact )
  {
    this.vendorContact = vendorContact;
  }

  public boolean isDropShipped ()
  {
    return isDropShipped;
  }

  public void setDropShipped ( final boolean dropShipped )
  {
    isDropShipped = dropShipped;
  }

  public String getShipToWarehouse ()
  {
    return shipToWarehouse;
  }

  public void setShipToWarehouse ( final String shipToWarehouse )
  {
    this.shipToWarehouse = shipToWarehouse;
  }

  public ShipToCompany getShipToCompany ()
  {
    return shipToCompany;
  }

  public void setShipToCompany ( final ShipToCompany shipToCompany )
  {
    this.shipToCompany = shipToCompany;
  }

  public DropShipAddress getDropShipAddress ()
  {
    return dropShipAddress;
  }

  public void setDropShipAddress ( final DropShipAddress dropShipAddress )
  {
    this.dropShipAddress = dropShipAddress;
  }

  public String getPoNumber ()
  {
    return poNumber;
  }

  public void setPoNumber ( final String poNumber )
  {
    this.poNumber = poNumber;
  }

  public Date getPurchaseDate ()
  {
    return purchaseDate;
  }

  public void setPurchaseDate ( final Date purchaseDate )
  {
    this.purchaseDate = purchaseDate;
  }

  public String getVendorOrderNumber ()
  {
    return vendorOrderNumber;
  }

  public void setVendorOrderNumber ( final String vendorOrderNumber )
  {
    this.vendorOrderNumber = vendorOrderNumber;
  }

  public String getVendorInvoiceNumber ()
  {
    return vendorInvoiceNumber;
  }

  public void setVendorInvoiceNumber ( final String vendorInvoiceNumber )
  {
    this.vendorInvoiceNumber = vendorInvoiceNumber;
  }

  public String getBillingTerms ()
  {
    return billingTerms;
  }

  public void setBillingTerms ( final String billingTerms )
  {
    this.billingTerms = billingTerms;
  }

  public double getSubTotal ()
  {
    return subTotal;
  }

  public void setSubTotal ( final double subTotal )
  {
    this.subTotal = subTotal;
  }

  public double getFreightCost ()
  {
    return freightCost;
  }

  public void setFreightCost ( final double freightCost )
  {
    this.freightCost = freightCost;
  }

  public double getTotal ()
  {
    return total;
  }

  public void setTotal ( final double total )
  {
    this.total = total;
  }

  public String getLocation ()
  {
    return location;
  }

  public void setLocation ( final String location )
  {
    this.location = location;
  }

  public String getBusinessUnit ()
  {
    return businessUnit;
  }

  public void setBusinessUnit ( final String businessUnit )
  {
    this.businessUnit = businessUnit;
  }

  public String getEnteredBy ()
  {
    return enteredBy;
  }

  public void setEnteredBy ( final String enteredBy )
  {
    this.enteredBy = enteredBy;
  }

  public String getShipmentMethod ()
  {
    return shipmentMethod;
  }

  public void setShipmentMethod ( final String shipmentMethod )
  {
    this.shipmentMethod = shipmentMethod;
  }

  public Date getShipDate ()
  {
    return shipDate;
  }

  public void setShipDate ( final Date shipDate )
  {
    this.shipDate = shipDate;
  }

  public String getTrackingNumber ()
  {
    return trackingNumber;
  }

  public void setTrackingNumber ( final String trackingNumber )
  {
    this.trackingNumber = trackingNumber;
  }

  public String getShippingInstructions ()
  {
    return shippingInstructions;
  }

  public void setShippingInstructions ( final String shippingInstructions )
  {
    this.shippingInstructions = shippingInstructions;
  }

  public boolean isClosed ()
  {
    return isClosed;
  }

  public void setClosed ( final boolean closed )
  {
    isClosed = closed;
  }

  public Date getDateClosed ()
  {
    return dateClosed;
  }

  public void setDateClosed ( final Date dateClosed )
  {
    this.dateClosed = dateClosed;
  }

  public List < PurchaseOrderLineItem > getLineItems ()
  {
    return lineItems;
  }

  public void setLineItems ( final List < PurchaseOrderLineItem > lineItems )
  {
    this.lineItems = lineItems;
  }
}
