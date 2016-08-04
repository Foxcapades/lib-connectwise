package io.vulpine.connectwise.data.purchasing;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.data.CwObject;

import java.util.Date;

@SuppressWarnings( "unused" )
public class PurchaseOrderLineItem extends CwObject
{
  @JacksonXmlProperty(localName = "ItemIdentifier")
  protected String itemIdentifier;

  @JacksonXmlProperty(localName = "LineNumber")
  protected int lineNumber;

  @JacksonXmlProperty(localName = "Quantity")
  protected int quantity;

  @JacksonXmlProperty(localName = "UnitOfMeasure")
  protected String unitOfMeasure;

  @JacksonXmlProperty(localName = "UnitCost")
  protected double unitCost;

  @JacksonXmlProperty(localName = "ShipmentMethod")
  protected String shipmentMethod;

  @JacksonXmlProperty(localName = "TrackingNumber")
  protected String trackingNumber;

  @JacksonXmlProperty(localName = "ShipDate")
  protected Date shipDate;

  @JacksonXmlProperty(localName = "VendorOrderNumber")
  protected String vendorOrderNumber;

  @JacksonXmlProperty(localName = "IsBackordered")
  protected boolean isBackordered;

  @JacksonXmlProperty(localName = "ExpectedShipDate")
  protected Date expectedShipDate;

  @JacksonXmlProperty(localName = "ReceivedQuantity")
  protected int receivedQuantity;

  @JacksonXmlProperty(localName = "GenericSerialNumber")
  protected String genericSerialNumber;

  @JacksonXmlProperty(localName = "SerialNumbers")
  protected String serialNumbers;

  @JacksonXmlProperty(localName = "ShipToWarehouse")
  protected String shipToWarehouse;

  @JacksonXmlProperty(localName = "ShipToWarehouseBin")
  protected String shipToWarehouseBin;

  @JacksonXmlProperty(localName = "PackingSlip")
  protected String packingSlip;

  @JacksonXmlProperty(localName = "IsCanceled")
  protected boolean isCanceled;

  @JacksonXmlProperty(localName = "CancelReason")
  protected String cancelReason;

  @JacksonXmlProperty(localName = "IsClosed")
  protected boolean isClosed;

  public String getItemIdentifier ()
  {
    return itemIdentifier;
  }

  public void setItemIdentifier ( final String itemIdentifier )
  {
    this.itemIdentifier = itemIdentifier;
  }

  public int getLineNumber ()
  {
    return lineNumber;
  }

  public void setLineNumber ( final int lineNumber )
  {
    this.lineNumber = lineNumber;
  }

  public int getQuantity ()
  {
    return quantity;
  }

  public void setQuantity ( final int quantity )
  {
    this.quantity = quantity;
  }

  public String getUnitOfMeasure ()
  {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure ( final String unitOfMeasure )
  {
    this.unitOfMeasure = unitOfMeasure;
  }

  public double getUnitCost ()
  {
    return unitCost;
  }

  public void setUnitCost ( final double unitCost )
  {
    this.unitCost = unitCost;
  }

  public String getShipmentMethod ()
  {
    return shipmentMethod;
  }

  public void setShipmentMethod ( final String shipmentMethod )
  {
    this.shipmentMethod = shipmentMethod;
  }

  public String getTrackingNumber ()
  {
    return trackingNumber;
  }

  public void setTrackingNumber ( final String trackingNumber )
  {
    this.trackingNumber = trackingNumber;
  }

  public Date getShipDate ()
  {
    return shipDate;
  }

  public void setShipDate ( final Date shipDate )
  {
    this.shipDate = shipDate;
  }

  public String getVendorOrderNumber ()
  {
    return vendorOrderNumber;
  }

  public void setVendorOrderNumber ( final String vendorOrderNumber )
  {
    this.vendorOrderNumber = vendorOrderNumber;
  }

  public boolean isBackordered ()
  {
    return isBackordered;
  }

  public void setBackordered ( final boolean backordered )
  {
    isBackordered = backordered;
  }

  public Date getExpectedShipDate ()
  {
    return expectedShipDate;
  }

  public void setExpectedShipDate ( final Date expectedShipDate )
  {
    this.expectedShipDate = expectedShipDate;
  }

  public int getReceivedQuantity ()
  {
    return receivedQuantity;
  }

  public void setReceivedQuantity ( final int receivedQuantity )
  {
    this.receivedQuantity = receivedQuantity;
  }

  public String getGenericSerialNumber ()
  {
    return genericSerialNumber;
  }

  public void setGenericSerialNumber ( final String genericSerialNumber )
  {
    this.genericSerialNumber = genericSerialNumber;
  }

  public String getSerialNumbers ()
  {
    return serialNumbers;
  }

  public void setSerialNumbers ( final String serialNumbers )
  {
    this.serialNumbers = serialNumbers;
  }

  public String getShipToWarehouse ()
  {
    return shipToWarehouse;
  }

  public void setShipToWarehouse ( final String shipToWarehouse )
  {
    this.shipToWarehouse = shipToWarehouse;
  }

  public String getShipToWarehouseBin ()
  {
    return shipToWarehouseBin;
  }

  public void setShipToWarehouseBin ( final String shipToWarehouseBin )
  {
    this.shipToWarehouseBin = shipToWarehouseBin;
  }

  public String getPackingSlip ()
  {
    return packingSlip;
  }

  public void setPackingSlip ( final String packingSlip )
  {
    this.packingSlip = packingSlip;
  }

  public boolean isCanceled ()
  {
    return isCanceled;
  }

  public void setCanceled ( final boolean canceled )
  {
    isCanceled = canceled;
  }

  public String getCancelReason ()
  {
    return cancelReason;
  }

  public void setCancelReason ( final String cancelReason )
  {
    this.cancelReason = cancelReason;
  }

  public boolean isClosed ()
  {
    return isClosed;
  }

  public void setClosed ( final boolean closed )
  {
    isClosed = closed;
  }
}
