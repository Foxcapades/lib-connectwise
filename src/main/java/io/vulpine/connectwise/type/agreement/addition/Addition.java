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
 *
 */

package io.vulpine.connectwise.type.agreement.addition;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.agreement.AbstractSubAgreement;
import io.vulpine.connectwise.type.agreement.BillCustomer;

import java.util.Date;

public class Addition extends AbstractSubAgreement
{

  @JacksonXmlProperty( localName = "AdditionsProduct" )
  protected AdditionProduct additionProduct;

  @JacksonXmlProperty( localName = "Quantity" )
  protected double quantity;

  @JacksonXmlProperty( localName = "LessIncluded" )
  protected double lessIncluded;

  @JacksonXmlProperty( localName = "UnitPrice" )
  protected double unitPrice;

  @JacksonXmlProperty( localName = "UnitCost" )
  protected double unitCost;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty( localName = "EffectiveDate" )
  protected Date effectiveDate;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty( localName = "CancelledDate" )
  protected Date cancelledDate;

  @JacksonXmlProperty( localName = "BillCustomer" )
  protected BillCustomer billCustomer;

  @JacksonXmlProperty( localName = "TaxableFlag" )
  protected boolean taxable;

  @JacksonXmlProperty( localName = "SerialNumber" )
  protected String serialNumber;

  @JacksonXmlProperty( localName = "InvoiceDescription" )
  protected String invoiceDescription;

  @JacksonXmlProperty( localName = "PurchaseItemFlag" )
  protected boolean purchaseItem;

  @JacksonXmlProperty( localName = "SpecialOrderFlag" )
  protected boolean specialOrder;

  @JacksonXmlProperty( localName = "BilledQuantity" )
  protected double billedQuantity;

  @JacksonXmlProperty( localName = "UOM" )
  protected String uom;

  @JacksonXmlProperty( localName = "ExtPrice" )
  protected double extPrice;

  @JacksonXmlProperty( localName = "ExtCost" )
  protected double extCost;

  @JacksonXmlProperty( localName = "Margin" )
  protected double margin;

  public AdditionProduct getAdditionProduct()
  {
    return additionProduct;
  }

  public void setAdditionProduct( final AdditionProduct additionProduct )
  {
    this.additionProduct = additionProduct;
  }

  public double getQuantity()
  {
    return quantity;
  }

  public void setQuantity( final double quantity )
  {
    this.quantity = quantity;
  }

  public double getLessIncluded()
  {
    return lessIncluded;
  }

  public void setLessIncluded( final double lessIncluded )
  {
    this.lessIncluded = lessIncluded;
  }

  public double getUnitPrice()
  {
    return unitPrice;
  }

  public void setUnitPrice( final double unitPrice )
  {
    this.unitPrice = unitPrice;
  }

  public double getUnitCost()
  {
    return unitCost;
  }

  public void setUnitCost( final double unitCost )
  {
    this.unitCost = unitCost;
  }

  public Date getEffectiveDate()
  {
    return effectiveDate;
  }

  public void setEffectiveDate( final Date effectiveDate )
  {
    this.effectiveDate = effectiveDate;
  }

  public Date getCancelledDate()
  {
    return cancelledDate;
  }

  public void setCancelledDate( final Date cancelledDate )
  {
    this.cancelledDate = cancelledDate;
  }

  public BillCustomer getBillCustomer()
  {
    return billCustomer;
  }

  public void setBillCustomer( final BillCustomer billCustomer )
  {
    this.billCustomer = billCustomer;
  }

  public boolean isTaxable()
  {
    return taxable;
  }

  public void setTaxable( final boolean taxable )
  {
    this.taxable = taxable;
  }

  public String getSerialNumber()
  {
    return serialNumber;
  }

  public void setSerialNumber( final String serialNumber )
  {
    this.serialNumber = serialNumber;
  }

  public String getInvoiceDescription()
  {
    return invoiceDescription;
  }

  public void setInvoiceDescription( final String invoiceDescription )
  {
    this.invoiceDescription = invoiceDescription;
  }

  public boolean isPurchaseItem()
  {
    return purchaseItem;
  }

  public void setPurchaseItem( final boolean purchaseItem )
  {
    this.purchaseItem = purchaseItem;
  }

  public boolean isSpecialOrder()
  {
    return specialOrder;
  }

  public void setSpecialOrder( final boolean specialOrder )
  {
    this.specialOrder = specialOrder;
  }

  public double getBilledQuantity()
  {
    return billedQuantity;
  }

  public void setBilledQuantity( final double billedQuantity )
  {
    this.billedQuantity = billedQuantity;
  }

  public String getUom()
  {
    return uom;
  }

  public void setUom( final String uom )
  {
    this.uom = uom;
  }

  public double getExtPrice()
  {
    return extPrice;
  }

  public void setExtPrice( final double extPrice )
  {
    this.extPrice = extPrice;
  }

  public double getExtCost()
  {
    return extCost;
  }

  public void setExtCost( final double extCost )
  {
    this.extCost = extCost;
  }

  public double getMargin()
  {
    return margin;
  }

  public void setMargin( final double margin )
  {
    this.margin = margin;
  }
}
