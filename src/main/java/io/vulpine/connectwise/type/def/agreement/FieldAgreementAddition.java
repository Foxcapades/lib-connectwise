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
package io.vulpine.connectwise.type.def.agreement;

import io.vulpine.connectwise.type.agreement.BillCustomer;
import io.vulpine.connectwise.util.DateField;
import io.vulpine.connectwise.util.Field;
import io.vulpine.connectwise.util.NumberField;
import io.vulpine.connectwise.util.StringField;

import java.util.Date;

public interface FieldAgreementAddition extends AgreementAddition
{
  NumberField < Integer > idField();

  NumberField < Integer > agreementIdField();

  Field < AdditionProduct > additionProductField();

  NumberField < Double > quantityField();

  NumberField < Double > lessIncludedField();

  NumberField < Double > unitPriceField();

  NumberField < Double > unitCostField();

  DateField effectiveDateField();

  DateField cancelledDateField();

  Field < BillCustomer > billCustomerField();

  Field < Boolean > taxableField();

  StringField serialNumberField();

  StringField invoiceDescriptionField();

  Field < Boolean > purchaseItemField();

  Field < Boolean > specialOrderField();

  StringField descriptionField();

  NumberField < Double > billedQuantityField();

  StringField uomField();

  NumberField < Double > extPriceField();

  NumberField < Double > extCostField();

  NumberField < Double > marginField();

  StringField updatedByField();

  DateField lastUpdateField();

  @Override
  default FieldAgreementAddition id( final Integer i )
  {
    idField().set(i);

    return this;
  }

  @Override
  default Integer id()
  {
    return idField().get();
  }

  @Override
  default FieldAgreementAddition agreementId( final Integer i )
  {
    agreementIdField().set(i);

    return this;
  }

  @Override
  default Integer agreementId()
  {
    return agreementIdField().get();
  }

  @Override
  default FieldAgreementAddition additionProduct( final AdditionProduct a )
  {
    additionProductField().set(a);

    return this;
  }

  @Override
  default AdditionProduct additionProduct()
  {
    return additionProductField().get();
  }

  @Override
  default FieldAgreementAddition quantity( final Double d )
  {
    quantityField().set(d);

    return this;
  }

  @Override
  default Double quantity()
  {
    return quantityField().get();
  }

  @Override
  default FieldAgreementAddition lessIncluded( final Double d )
  {
    lessIncludedField().set(d);

    return this;
  }

  @Override
  default Double lessIncluded()
  {
    return lessIncludedField().get();
  }

  @Override
  default FieldAgreementAddition unitPrice( final Double d )
  {
    unitPriceField().set(d);

    return this;
  }

  @Override
  default Double unitPrice()
  {
    return unitPriceField().get();
  }

  @Override
  default FieldAgreementAddition unitCost( final Double d )
  {
    unitCostField().set(d);

    return this;
  }

  @Override
  default Double unitCost()
  {
    return unitCostField().get();
  }

  @Override
  default FieldAgreementAddition effectiveDate( final Date d )
  {
    effectiveDateField().set(d);

    return this;
  }

  @Override
  default Date effectiveDate()
  {
    return effectiveDateField().get();
  }

  @Override
  default FieldAgreementAddition cancelledDate( final Date d )
  {
    cancelledDateField().set(d);

    return this;
  }

  @Override
  default Date cancelledDate()
  {
    return cancelledDateField().get();
  }

  @Override
  default FieldAgreementAddition billCustomer( final BillCustomer b )
  {
    billCustomerField().set(b);

    return this;
  }

  @Override
  default BillCustomer billCustomer()
  {
    return billCustomerField().get();
  }

  @Override
  default FieldAgreementAddition taxable( final Boolean b )
  {
    taxableField().set(b);

    return this;
  }

  @Override
  default Boolean taxable()
  {
    return taxableField().get();
  }

  @Override
  default FieldAgreementAddition serialNumber( final String s )
  {
    serialNumberField().set(s);

    return this;
  }

  @Override
  default String serialNumber()
  {
    return serialNumberField().get();
  }

  @Override
  default FieldAgreementAddition invoiceDescription( final String s )
  {
    invoiceDescriptionField().set(s);

    return this;
  }

  @Override
  default String invoiceDescription()
  {
    return invoiceDescriptionField().get();
  }

  @Override
  default FieldAgreementAddition purchaseItem( final Boolean b )
  {
    purchaseItemField().set(b);

    return this;
  }

  @Override
  default Boolean purchaseItem()
  {
    return purchaseItemField().get();
  }

  @Override
  default FieldAgreementAddition specialOrder( final Boolean b )
  {
    specialOrderField().set(b);

    return this;
  }

  @Override
  default Boolean specialOrder()
  {
    return specialOrderField().get();
  }

  @Override
  default FieldAgreementAddition description( final String s )
  {
    descriptionField().set(s);

    return this;
  }

  @Override
  default String description()
  {
    return descriptionField().get();
  }

  @Override
  default FieldAgreementAddition billedQuantity( final Double d )
  {
    billedQuantityField().set(d);

    return this;
  }

  @Override
  default Double billedQuantity()
  {
    return billedQuantityField().get();
  }

  @Override
  default FieldAgreementAddition uom( final String s )
  {
    uomField().set(s);

    return this;
  }

  @Override
  default String uom()
  {
    return uomField().get();
  }

  @Override
  default FieldAgreementAddition extPrice( final Double d )
  {
    extPriceField().set(d);

    return this;
  }

  @Override
  default Double extPrice()
  {
    return extPriceField().get();
  }

  @Override
  default FieldAgreementAddition extCost( final Double d )
  {
    extCostField().set(d);

    return this;
  }

  @Override
  default Double extCost()
  {
    return extCostField().get();
  }

  @Override
  default FieldAgreementAddition margin( final Double d )
  {
    marginField().set(d);

    return this;
  }

  @Override
  default Double margin()
  {
    return marginField().get();
  }

  default FieldAgreementAddition updatedBy( final String s )
  {
    updatedByField().set(s);

    return this;
  }

  @Override
  default String updatedBy()
  {
    return updatedByField().get();
  }

  default FieldAgreementAddition lastUpdate( final Date d )
  {
    lastUpdateField().set(d);

    return this;
  }

  @Override
  default Date lastUpdate()
  {
    return lastUpdateField().get();
  }

  @Override
  default String toXml( final String rootName )
  {
    return "<" + rootName + ">"
      + idField().toXml()
      + agreementIdField().toXml()
      + additionProductField().toXml()
      + quantityField().toXml()
      + lessIncludedField().toXml()
      + unitPriceField().toXml()
      + unitCostField().toXml()
      + effectiveDateField().toXml()
      + cancelledDateField().toXml()
      + billCustomerField().toXml()
      + taxableField().toXml()
      + serialNumberField().toXml()
      + invoiceDescriptionField().toXml()
      + purchaseItemField().toXml()
      + specialOrderField().toXml()
      + descriptionField().toXml()
      + billedQuantityField().toXml()
      + uomField().toXml()
      + extPriceField().toXml()
      + extCostField().toXml()
      + marginField().toXml()
      + updatedByField().toXml()
      + lastUpdateField().toXml()
      + "</" + rootName + ">";
  }
}
