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
package io.vulpine.connectwise.type.def;

import io.vulpine.connectwise.type.agreement.BillCustomer;
import io.vulpine.connectwise.type.def.gen.*;
import io.vulpine.connectwise.util.Field;

import java.util.Date;

public interface AgreementAddition
extends
  HasAgreementId,
  HasEffectiveDate,
  HasLastUpdate,
  HasTaxable,
  HasUpdatedBy,
  SubAgreement,
  XmlSerializable
{
  Field < Double > quantityField();
  Field < AdditionProduct > additionProductField();
  Field < Double > lessIncludedField();
  Field < Double > unitPriceField();
  Field < Double > unitCostField();
  Field < Date > cancelledDateField();
  Field < BillCustomer > billCustomerField();
  Field < String > serialNumberField();
  Field < String > invoiceDescriptionField();
  Field < Boolean > purchaseItemField();
  Field < Boolean > specialOrderField();
  Field < Double > billedQuantityField();
  Field < String > uomField();
  Field < Double > extPriceField();
  Field < Double > extCostField();
  Field < Double > marginField();

  default Double quantity() { return quantityField().get(); }
  default AgreementAddition quantity( final Double d ) { quantityField().set(d); return this; }

  default AdditionProduct additionProduct() { return additionProductField().get(); }
  default AgreementAddition additionProduct( final AdditionProduct a ) { additionProductField().set(a); return this; }

  default Double lessIncluded() { return lessIncludedField().get(); }
  default AgreementAddition lessIncluded( final Double d ) { lessIncludedField().set(d); return this; }

  default Double unitPrice() { return unitPriceField().get(); }
  default AgreementAddition unitPrice( final Double d ) { unitPriceField().set(d); return this; }

  default Double unitCost() { return unitCostField().get(); }
  default AgreementAddition unitCost( final Double d ) { unitCostField().set(d); return this; }

  default Date cancelledDate() { return cancelledDateField().get(); }
  default AgreementAddition cancelledDate( final Date d ) { cancelledDateField().set(d); return this; }

  default BillCustomer billCustomer() { return billCustomerField().get(); }
  default AgreementAddition billCustomer( final BillCustomer b ) { billCustomerField().set(b); return this; }

  default String serialNumber() { return serialNumberField().get(); }
  default AgreementAddition serialNumber( final String s ) { serialNumberField().set(s); return this; }

  default String invoiceDescription() { return invoiceDescriptionField().get(); }
  default AgreementAddition invoiceDescription( final String s ) { invoiceDescriptionField().set(s); return this; }

  default Boolean purchaseItem() { return purchaseItemField().get(); }
  default AgreementAddition purchaseItem( final Boolean b ) { purchaseItemField().set(b); return this; }

  default Boolean specialOrder() { return specialOrderField().get(); }
  default AgreementAddition specialOrder( final Boolean b ) { specialOrderField().set(b); return this; }

  default Double billedQuantity() { return billedQuantityField().get(); }
  default AgreementAddition billedQuantity( final Double d ) { billedQuantityField().set(d); return this; }

  default String uom() { return uomField().get(); }
  default AgreementAddition uom( final String s ) { uomField().set(s); return this; }

  default Double extPrice() { return extPriceField().get(); }
  default AgreementAddition extPrice( final Double d ) { extPriceField().set(d); return this; }

  default Double extCost() { return extCostField().get(); }
  default AgreementAddition extCost( final Double d ) { extCostField().set(d); return this; }

  default Double margin() { return marginField().get(); }
  default AgreementAddition margin( final Double d ) { marginField().set(d); return this; }

  @Override default AgreementAddition taxable( final Boolean b ) { taxableField().set(b); return this; }
  @Override default AgreementAddition effectiveDate( final Date d ) { effectiveDateField().set(d); return this; }
  @Override default AgreementAddition id( final Integer i ) { idField().set(i); return this; }
  @Override default AgreementAddition updatedBy( final String s ) { updatedByField().set(s); return this; }
  @Override default AgreementAddition lastUpdate( final Date d ) { lastUpdateField().set(d); return this; }
  @Override default AgreementAddition agreementId( final Integer i ) { agreementIdField().set(i); return this; }
}
