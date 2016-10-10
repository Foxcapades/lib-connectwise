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
package io.vulpine.connectwise.type.agreement;

import io.vulpine.connectwise.type.ConnectwiseCommon;
import io.vulpine.connectwise.type.def.agreement.*;
import io.vulpine.connectwise.type.def.agreement.AdditionProduct;
import io.vulpine.connectwise.util.*;

import java.util.Date;

/**
 * = Agreement Addition
 *
 * @since v0.0.2
 * @version 2.0.0
 */
class SimpleAgreementAddition extends ConnectwiseCommon implements FieldAgreementAddition
{
  private final Field < AdditionProduct > additionProductField    = new SimpleObjectField <>("AdditionsProduct");
  private final NumberField < Double >    lessIncludedField       = new SimpleDoubleField("LessIncluded");
  private final NumberField < Double >    unitPriceField          = new SimpleDoubleField("UnitPrice");
  private final NumberField < Double >    unitCostField           = new SimpleDoubleField("UnitCost");
  private final DateField                 cancelledDateField      = new SimpleDateField("CancelledDate");
  private final Field < BillCustomer >    billCustomerField       = new SimpleObjectField <>("BillCustomer");
  private final StringField               serialNumberField       = new SimpleStringField("SerialNumber");
  private final StringField               invoiceDescriptionField = new SimpleStringField("InvoiceDescription");
  private final Field < Boolean >         purchaseItemField       = new SimpleObjectField <>("PurchaseItemFlag");
  private final Field < Boolean >         specialOrderField       = new SimpleObjectField <>("SpecialOrderFlag");
  private final NumberField < Double >    billedQuantityField     = new SimpleDoubleField("BilledQuantity");
  private final StringField               uomField                = new SimpleStringField("UOM");
  private final NumberField < Double >    extPriceField           = new SimpleDoubleField("ExtPrice");
  private final NumberField < Double >    extCostField            = new SimpleDoubleField("ExtCost");
  private final NumberField < Double >    marginField             = new SimpleDoubleField("Margin");
  private final NumberField < Integer >   agreementIdField        = new SimpleIntegerField("AgreementId");
  private final StringField               descriptionField        = new SimpleStringField("Description");
  private final DateField                 effectiveDateField      = new SimpleDateField("EffectiveDate");
  private final NumberField < Double >    quantityField           = new SimpleDoubleField("Quantity");
  private final Field < Boolean >         taxableField            = new SimpleObjectField <>("TaxableFlag");

  @Override
  public Field < AdditionProduct > additionProductField()
  {
    return additionProductField;
  }

  @Override
  public NumberField < Double > lessIncludedField()
  {
    return lessIncludedField;
  }

  @Override
  public NumberField < Double > unitPriceField()
  {
    return unitPriceField;
  }

  @Override
  public NumberField < Double > unitCostField()
  {
    return unitCostField;
  }

  @Override
  public DateField cancelledDateField()
  {
    return cancelledDateField;
  }

  @Override
  public Field < BillCustomer > billCustomerField()
  {
    return billCustomerField;
  }

  @Override
  public StringField serialNumberField()
  {
    return serialNumberField;
  }

  @Override
  public StringField invoiceDescriptionField()
  {
    return invoiceDescriptionField;
  }

  @Override
  public Field < Boolean > purchaseItemField()
  {
    return purchaseItemField;
  }

  @Override
  public Field < Boolean > specialOrderField()
  {
    return specialOrderField;
  }

  @Override
  public NumberField < Double > billedQuantityField()
  {
    return billedQuantityField;
  }

  @Override
  public StringField uomField()
  {
    return uomField;
  }

  @Override
  public NumberField < Double > extPriceField()
  {
    return extPriceField;
  }

  @Override
  public NumberField < Double > extCostField()
  {
    return extCostField;
  }

  @Override
  public NumberField < Double > marginField()
  {
    return marginField;
  }

  @Override
  public NumberField < Integer > agreementIdField()
  {
    return agreementIdField;
  }

  @Override
  public StringField descriptionField()
  {
    return descriptionField;
  }

  @Override
  public DateField effectiveDateField()
  {
    return effectiveDateField;
  }

  @Override
  public NumberField < Double > quantityField()
  {
    return quantityField;
  }

  @Override
  public Field < Boolean > taxableField()
  {
    return taxableField;
  }
}
