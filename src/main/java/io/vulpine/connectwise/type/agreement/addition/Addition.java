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
package io.vulpine.connectwise.type.agreement.addition;

import io.vulpine.connectwise.type.agreement.AbstractSubAgreement;
import io.vulpine.connectwise.type.agreement.BillCustomer;
import io.vulpine.connectwise.type.def.AgreementAddition;

import java.util.Date;

public class Addition extends AbstractSubAgreement implements AgreementAddition
{
  private AdditionProduct additionProduct;

  private BillCustomer billCustomer;

  private Boolean purchaseItem;

  private Boolean specialOrder;

  private Boolean taxable;

  private Date cancelledDate;

  private Date effectiveDate;

  private Double billedQuantity;

  private Double extPrice;

  private Double extCost;

  private Double lessIncluded;

  private Double margin;

  private Double quantity;

  private Double unitCost;

  private Double unitPrice;

  private Integer productId;

  private String invoiceDescription;

  private String serialNumber;

  private String uom;

  @Override
  public AdditionProduct additionProduct()
  {
    return additionProduct;
  }

  @Override
  public Addition additionProduct( final AdditionProduct additionProduct )
  {
    this.additionProduct = additionProduct;

    return this;
  }

  @Override
  public BillCustomer billCustomer()
  {
    return billCustomer;
  }

  @Override
  public Addition billCustomer( final BillCustomer billCustomer )
  {
    this.billCustomer = billCustomer;

    return this;
  }

  @Override
  public Double billedQuantity()
  {
    return billedQuantity;
  }

  @Override
  public Addition billedQuantity( final Double billedQuantity )
  {
    this.billedQuantity = billedQuantity;

    return this;
  }

  @Override
  public Date cancelledDate()
  {
    return cancelledDate;
  }

  @Override
  public Addition cancelledDate( final Date cancelledDate )
  {
    this.cancelledDate = cancelledDate;

    return this;
  }

  @Override
  public Date effectiveDate()
  {
    return effectiveDate;
  }

  @Override
  public Addition effectiveDate( final Date effectiveDate )
  {
    this.effectiveDate = effectiveDate;

    return this;
  }

  @Override
  public Double extCost()
  {
    return extCost;
  }

  @Override
  public Addition extCost( final Double extCost )
  {
    this.extCost = extCost;

    return this;
  }

  @Override
  public Double extPrice()
  {
    return extPrice;
  }

  @Override
  public Addition extPrice( final Double extPrice )
  {
    this.extPrice = extPrice;

    return this;
  }

  @Override
  public String invoiceDescription()
  {
    return invoiceDescription;
  }

  @Override
  public Addition invoiceDescription( final String invoiceDescription )
  {
    this.invoiceDescription = invoiceDescription;

    return this;
  }

  @Override
  public Double lessIncluded()
  {
    return lessIncluded;
  }

  @Override
  public Addition lessIncluded( final Double lessIncluded )
  {
    this.lessIncluded = lessIncluded;

    return this;
  }

  @Override
  public Double margin()
  {
    return margin;
  }

  @Override
  public Addition margin( final Double margin )
  {
    this.margin = margin;

    return this;
  }

  @Override
  public Integer productId()
  {
    return productId;
  }

  @Override
  public Addition productId( Integer productId )
  {
    this.productId = productId;

    return this;
  }

  @Override
  public Double quantity()
  {
    return quantity;
  }

  @Override
  public Addition quantity( final Double quantity )
  {
    this.quantity = quantity;

    return this;
  }

  @Override
  public String serialNumber()
  {
    return serialNumber;
  }

  @Override
  public Addition serialNumber( final String serialNumber )
  {
    this.serialNumber = serialNumber;

    return this;
  }

  @Override
  public Double unitCost()
  {
    return unitCost;
  }

  @Override
  public Addition unitCost( final Double unitCost )
  {
    this.unitCost = unitCost;

    return this;
  }

  @Override
  public Double unitPrice()
  {
    return unitPrice;
  }

  @Override
  public Addition unitPrice( final Double unitPrice )
  {
    this.unitPrice = unitPrice;

    return this;
  }

  @Override
  public String uom()
  {
    return uom;
  }

  @Override
  public Addition uom( final String uom )
  {
    this.uom = uom;

    return this;
  }

  @Override
  public Boolean purchaseItem()
  {
    return purchaseItem;
  }

  @Override
  public Addition purchaseItem( final Boolean purchaseItem )
  {
    this.purchaseItem = purchaseItem;

    return this;
  }

  @Override
  public Boolean specialOrder()
  {
    return specialOrder;
  }

  @Override
  public Addition specialOrder( final Boolean specialOrder )
  {
    this.specialOrder = specialOrder;

    return this;
  }

  @Override
  public Boolean taxable()
  {
    return taxable;
  }

  @Override
  public Addition taxable( final Boolean taxable )
  {
    this.taxable = taxable;

    return this;
  }
}
