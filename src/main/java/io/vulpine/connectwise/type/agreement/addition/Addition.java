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
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.agreement.AbstractSubAgreement;
import io.vulpine.connectwise.type.agreement.BillCustomer;

import java.util.Date;

@JsonRootName( "AgreementAddition" )
public class Addition extends AbstractSubAgreement
{
  private AdditionProduct additionProduct;

  private BillCustomer billCustomer;

  private boolean purchaseItem;

  private boolean specialOrder;

  private boolean taxable;

  private Date cancelledDate;

  private Date effectiveDate;

  private double billedQuantity;

  private double extPrice;

  private double extCost;

  private double lessIncluded;

  private double margin;

  private double quantity;

  private double unitCost;

  private double unitPrice;

  private int productId;

  private String invoiceDescription;

  private String serialNumber;

  private String uom;

  @JsonGetter( "AdditionsProduct" )
  public AdditionProduct additionProduct()
  {
    return additionProduct;
  }

  @JsonSetter( "AdditionsProduct" )
  public Addition additionProduct( final AdditionProduct additionProduct )
  {
    this.additionProduct = additionProduct;

    return this;
  }

  @JsonGetter( "BillCustomer" )
  public BillCustomer billCustomer()
  {
    return billCustomer;
  }

  @JsonSetter( "BillCustomer" )
  public Addition billCustomer( final BillCustomer billCustomer )
  {
    this.billCustomer = billCustomer;

    return this;
  }

  @JsonGetter( "BilledQuantity" )
  public double billedQuantity()
  {
    return billedQuantity;
  }

  @JsonSetter( "BilledQuantity" )
  public Addition billedQuantity( final double billedQuantity )
  {
    this.billedQuantity = billedQuantity;

    return this;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonGetter( "CancelledDate" )
  public Date cancelledDate()
  {
    return cancelledDate;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonSetter( "CancelledDate" )
  public Addition cancelledDate( final Date cancelledDate )
  {
    this.cancelledDate = cancelledDate;

    return this;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonGetter( "EffectiveDate" )
  public Date effectiveDate()
  {
    return effectiveDate;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonSetter( "EffectiveDate" )
  public Addition effectiveDate( final Date effectiveDate )
  {
    this.effectiveDate = effectiveDate;

    return this;
  }

  @JsonGetter( "ExtCost" )
  public double extCost()
  {
    return extCost;
  }

  @JsonSetter( "ExtCost" )
  public Addition extCost( final double extCost )
  {
    this.extCost = extCost;

    return this;
  }

  @JsonGetter( "ExtPrice" )
  public double extPrice()
  {
    return extPrice;
  }

  @JsonSetter( "ExtPrice" )
  public Addition extPrice( final double extPrice )
  {
    this.extPrice = extPrice;

    return this;
  }

  @JsonGetter( "InvoiceDescription" )
  public String invoiceDescription()
  {
    return invoiceDescription;
  }

  @JsonSetter( "InvoiceDescription" )
  public Addition invoiceDescription( final String invoiceDescription )
  {
    this.invoiceDescription = invoiceDescription;

    return this;
  }

  @JsonGetter( "LessIncluded" )
  public double lessIncluded()
  {
    return lessIncluded;
  }

  @JsonSetter( "LessIncluded" )
  public Addition lessIncluded( final double lessIncluded )
  {
    this.lessIncluded = lessIncluded;

    return this;
  }

  @JsonGetter( "Margin" )
  public double margin()
  {
    return margin;
  }

  @JsonSetter( "Margin" )
  public Addition margin( final double margin )
  {
    this.margin = margin;

    return this;
  }

  @JsonGetter( "ProductId" )
  public int productId()
  {
    return productId;
  }

  @JsonSetter( "ProductId" )
  public Addition productId( int productId )
  {
    this.productId = productId;

    return this;
  }

  @JsonGetter( "Quantity" )
  public double quantity()
  {
    return quantity;
  }

  @JsonSetter( "Quantity" )
  public Addition quantity( final double quantity )
  {
    this.quantity = quantity;

    return this;
  }

  @JsonGetter( "SerialNumber" )
  public String serialNumber()
  {
    return serialNumber;
  }

  @JsonSetter( "SerialNumber" )
  public Addition serialNumber( final String serialNumber )
  {
    this.serialNumber = serialNumber;

    return this;
  }

  @JsonGetter( "UnitCost" )
  public double unitCost()
  {
    return unitCost;
  }

  @JsonSetter( "UnitCost" )
  public Addition unitCost( final double unitCost )
  {
    this.unitCost = unitCost;

    return this;
  }

  @JsonGetter( "UnitPrice" )
  public double unitPrice()
  {
    return unitPrice;
  }

  @JsonSetter( "UnitPrice" )
  public Addition unitPrice( final double unitPrice )
  {
    this.unitPrice = unitPrice;

    return this;
  }

  @JsonGetter( "UOM" )
  public String uom()
  {
    return uom;
  }

  @JsonSetter( "UOM" )
  public Addition uom( final String uom )
  {
    this.uom = uom;

    return this;
  }

  @JsonGetter( "PurchaseItemFlag" )
  public boolean purchaseItem()
  {
    return purchaseItem;
  }

  @JsonSetter( "PurchaseItemFlag" )
  public Addition purchaseItem( final boolean purchaseItem )
  {
    this.purchaseItem = purchaseItem;

    return this;
  }

  @JsonGetter( "SpecialOrderFlag" )
  public boolean specialOrder()
  {
    return specialOrder;
  }

  @JsonSetter( "SpecialOrderFlag" )
  public Addition specialOrder( final boolean specialOrder )
  {
    this.specialOrder = specialOrder;

    return this;
  }

  @JsonGetter( "TaxableFlag" )
  public boolean taxable()
  {
    return taxable;
  }

  @JsonSetter( "TaxableFlag" )
  public Addition taxable( final boolean taxable )
  {
    this.taxable = taxable;

    return this;
  }
}
