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

import io.vulpine.connectwise.type.def.agreement.AgreementAdditionFindResult;
import io.vulpine.connectwise.type.def.agreement.FieldAgreementAdditionFindResult;
import io.vulpine.connectwise.util.*;

import java.util.Date;

public class SimpleFoundAddition implements FieldAgreementAdditionFindResult
{
  public final NumberField < Integer >
    id          = new SimpleIntegerField("Id"),
    agreementId = new SimpleIntegerField("AgreementId"),
    productId   = new SimpleIntegerField("ProductId");

  public final NumberField < Double >
    quantity       = new SimpleDoubleField("Quantity"),
    lessIncluded   = new SimpleDoubleField("LessIncluded"),
    unitPrice      = new SimpleDoubleField("UnitPrice"),
    unitCost       = new SimpleDoubleField("UnitCost"),
    billedQuantity = new SimpleDoubleField("BilledQuantity"),
    extPrice       = new SimpleDoubleField("ExtPrice"),
    extCost        = new SimpleDoubleField("ExtCost"),
    margin         = new SimpleDoubleField("Margin");

  public final DateField
    effectiveDate = new SimpleDateField("EffectiveDate"),
    cancelledDate = new SimpleDateField("CancelledDate"),
    lastUpdate    = new SimpleDateField("LastUpdate");

  public final Field < Boolean >
    taxable          = new BooleanField("Taxable"),
    purchaseItemFlag = new BooleanField("PurchaseItemFlag"),
    specialOrderFlag = new BooleanField("SpecialOrderFlag");

  public final StringField
    serialNumber       = new SimpleStringField("SerialNumber"),
    invoiceDescription = new SimpleStringField("InvoiceDescription"),
    description        = new SimpleStringField("Description"),
    updatedBy          = new SimpleStringField("UpdatedBy");

  @Override
  public AgreementAdditionFindResult agreementId( final Integer i )
  {
    agreementIdField().set(i);

    return this;
  }

  @Override
  public NumberField < Integer > agreementIdField()
  {
    return agreementId;
  }

  @Override
  public AgreementAdditionFindResult cancelledDate( final Date d )
  {
    cancelledDateField().set(d);

    return this;
  }

  @Override
  public DateField cancelledDateField()
  {
    return cancelledDate;
  }

  @Override
  public String description()
  {
    return description.get();
  }

  @Override
  public AgreementAdditionFindResult description( final String s )
  {
    description.set(s);

    return this;
  }

  @Override
  public Date effectiveDate()
  {
    return effectiveDate.get();
  }

  @Override
  public AgreementAdditionFindResult effectiveDate( final Date d )
  {
    effectiveDate.set(d);

    return this;
  }

  @Override
  public NumberField < Integer > idField()
  {
    return id;
  }

  @Override
  public AgreementAdditionFindResult id( final Integer i )
  {
    id.set(i);

    return this;
  }

  @Override
  public Date lastUpdate()
  {
    return lastUpdate.get();
  }

  @Override
  public AgreementAdditionFindResult lastUpdate( final Date d )
  {
    lastUpdate.set(d);

    return this;
  }

  @Override
  public Double lessIncluded()
  {
    return lessIncluded.get();
  }

  @Override
  public AgreementAdditionFindResult lessIncluded( final Double d )
  {
    lessIncluded.set(d);

    return this;
  }

  @Override
  public String serialNumber()
  {
    return serialNumber.get();
  }

  @Override
  public AgreementAdditionFindResult serialNumber( final String s )
  {
    serialNumber.set(s);

    return this;
  }

  @Override
  public String invoiceDescription()
  {
    return invoiceDescription.get();
  }

  @Override
  public AgreementAdditionFindResult invoiceDescription( final String s )
  {
    invoiceDescription.set(s);

    return this;
  }

  @Override
  public Double extPrice()
  {
    return extPrice.get();
  }

  @Override
  public AgreementAdditionFindResult extPrice( final Double d )
  {
    extPrice.set(d);

    return this;
  }

  @Override
  public Double extCost()
  {
    return extCost.get();
  }

  @Override
  public AgreementAdditionFindResult extCost( final Double d )
  {
    extCost.set(d);

    return this;
  }

  @Override
  public Double margin()
  {
    return margin.get();
  }

  @Override
  public AgreementAdditionFindResult margin( final Double d )
  {
    margin.set(d);

    return this;
  }

  @Override
  public Boolean purchaseItemFlag()
  {
    return purchaseItemFlag.get();
  }

  @Override
  public AgreementAdditionFindResult purchaseItemFlag( final Boolean b )
  {
    purchaseItemFlag.set(b);

    return this;
  }

  @Override
  public Boolean specialOrderFlag()
  {
    return specialOrderFlag.get();
  }

  @Override
  public AgreementAdditionFindResult specialOrderFlag( final Boolean b )
  {
    specialOrderFlag.set(b);

    return this;
  }

  @Override
  public Double billedQuantity()
  {
    return null;
  }

  @Override
  public AgreementAdditionFindResult billedQuantity( final Double d )
  {
    return null;
  }

  @Override
  public AgreementAdditionFindResult productId( final Integer i )
  {
    productId.set(i);

    return this;
  }

  @Override
  public NumberField < Integer > productIdField()
  {
    return productId;
  }

  @Override
  public AgreementAdditionFindResult quantity( final Double d )
  {
    quantity.set(d);

    return this;
  }

  @Override
  public NumberField < Double > quantityField()
  {
    return quantity;
  }

  @Override
  public Boolean taxable()
  {
    return taxable.get();
  }

  @Override
  public AgreementAdditionFindResult taxable( final Boolean b )
  {
    taxable.set(b);

    return this;
  }

  @Override
  public NumberField < Double > unitCostField()
  {
    return unitCost;
  }

  @Override
  public AgreementAdditionFindResult unitCost( final Double d )
  {
    unitCost.set(d);

    return this;
  }

  @Override
  public AgreementAdditionFindResult unitPrice( final Double d )
  {
    unitCost.set(d);

    return this;
  }

  @Override
  public NumberField < Double > unitPriceField()
  {
    return unitPrice;
  }

  @Override
  public String updatedBy()
  {
    return updatedBy.get();
  }

  @Override
  public AgreementAdditionFindResult updatedBy( final String s )
  {
    updatedBy.set(s);

    return this;
  }

  @Override
  public String toXml( final String rootName )
  {
    return "<" + rootName + ">"
      + id.toXml()
      + agreementId.toXml()
      + productId.toXml()
      + quantity.toXml()
      + lessIncluded.toXml()
      + unitPrice.toXml()
      + unitCost.toXml()
      + effectiveDate.toXml()
      + cancelledDate.toXml()
      + taxable.toXml()
      + serialNumber.toXml()
      + invoiceDescription.toXml()
      + description.toXml()
      + billedQuantity.toXml()
      + extPrice.toXml()
      + extCost.toXml()
      + margin.toXml()
      + purchaseItemFlag.toXml()
      + specialOrderFlag.toXml()
      + updatedBy.toXml()
      + lastUpdate.toXml()
      + "</" + rootName + ">";
  }
}
