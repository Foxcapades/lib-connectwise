/*
 * Copyright 2016 Elizabeth Harper
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.vulpine.connectwise.type.purchasing;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.ConnectwiseCommon;

import java.util.Date;

@SuppressWarnings( "unused" )
public class PurchaseOrderLineItem extends ConnectwiseCommon
{
  @JacksonXmlProperty(localName = "ItemIdentifier")
  protected String itemIdentifier;

  @JacksonXmlProperty(localName = "LineNumber")
  protected Integer lineNumber;

  @JacksonXmlProperty(localName = "Quantity")
  protected Integer quantity;

  @JacksonXmlProperty(localName = "UnitOfMeasure")
  protected String unitOfMeasure;

  @JacksonXmlProperty(localName = "UnitCost")
  protected Double unitCost;

  @JacksonXmlProperty(localName = "ShipmentMethod")
  protected String shipmentMethod;

  @JacksonXmlProperty(localName = "TrackingNumber")
  protected String trackingNumber;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty(localName = "ShipDate")
  protected Date shipDate;

  @JacksonXmlProperty(localName = "VendorOrderNumber")
  protected String vendorOrderNumber;

  @JacksonXmlProperty(localName = "IsBackordered")
  protected Boolean isBackordered;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty(localName = "ExpectedShipDate")
  protected Date expectedShipDate;

  @JacksonXmlProperty(localName = "ReceivedQuantity")
  protected Integer receivedQuantity;

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
  protected Boolean isCanceled;

  @JacksonXmlProperty(localName = "CancelReason")
  protected String cancelReason;

  @JacksonXmlProperty(localName = "IsClosed")
  protected Boolean isClosed;

  public String getItemIdentifier ()
  {
    return itemIdentifier;
  }

  public void setItemIdentifier ( final String itemIdentifier )
  {
    this.itemIdentifier = itemIdentifier;
  }

  public Integer getLineNumber ()
  {
    return lineNumber;
  }

  public void setLineNumber ( final Integer lineNumber )
  {
    this.lineNumber = lineNumber;
  }

  public Integer getQuantity ()
  {
    return quantity;
  }

  public void setQuantity ( final Integer quantity )
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

  public Double getUnitCost ()
  {
    return unitCost;
  }

  public void setUnitCost ( final Double unitCost )
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

  public Boolean isBackordered ()
  {
    return isBackordered;
  }

  public void setBackordered ( final Boolean backordered )
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

  public Integer getReceivedQuantity ()
  {
    return receivedQuantity;
  }

  public void setReceivedQuantity ( final Integer receivedQuantity )
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

  public Boolean isCanceled ()
  {
    return isCanceled;
  }

  public void setCanceled ( final Boolean canceled )
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

  public Boolean isClosed ()
  {
    return isClosed;
  }

  public void setClosed ( final Boolean closed )
  {
    isClosed = closed;
  }
}
