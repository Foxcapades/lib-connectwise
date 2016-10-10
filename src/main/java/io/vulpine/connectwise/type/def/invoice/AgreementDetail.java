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
package io.vulpine.connectwise.type.def.invoice;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.type.def.gen.HasAgreementName;
import io.vulpine.connectwise.type.def.gen.HasAgreementType;
import io.vulpine.connectwise.util.Field;
import io.vulpine.connectwise.util.NumberField;

public interface AgreementDetail extends HasAgreementName, HasAgreementType, XmlSerializable
{
  default String agreementName()
  {
    return agreementNameField().get();
  }

  Field< String > agreementNameField();

  NumberField < Double > hoursField();

  default Double hours()
  {
    return hoursField().get();
  }

  default AgreementDetail hours( final Double v )
  {
    hoursField().set(v);
    return this;
  }

  NumberField < Double > timeAmountField();

  default Double timeAmount()
  {
    return timeAmountField().get();
  }

  default AgreementDetail timeAmount( final Double v )
  {
    timeAmountField().set(v);
    return this;
  }

  NumberField < Double > expenseAmountField();

  default Double expenseAmount()
  {
    return expenseAmountField().get();
  }

  default AgreementDetail expenseAmount( final Double v )
  {
    expenseAmountField().set(v);
    return this;
  }

  NumberField < Double > productAmountField();

  default Double productAmount()
  {
    return productAmountField().get();
  }

  default AgreementDetail productAmount( final Double v )
  {
    productAmountField().set(v);
    return this;
  }

  NumberField < Double > salesTaxAmountField();

  default Double salesTaxAmount()
  {
    return salesTaxAmountField().get();
  }

  default AgreementDetail salesTaxAmount( final Double v )
  {
    salesTaxAmountField().set(v);
    return this;
  }

  NumberField < Double > fixedFeeAmountField();

  default Double fixedFeeAmount()
  {
    return fixedFeeAmountField().get();
  }

  default AgreementDetail fixedFeeAmount( final Double v )
  {
    fixedFeeAmountField().set(v);
    return this;
  }

  Field < String > detailTypeField();

  default String detailType()
  {
    return detailTypeField().get();
  }

  default AgreementDetail detailType( final String v )
  {
    detailTypeField().set(v);
    return this;
  }

  NumberField < Double > billingAmountField();

  default Double billingAmount()
  {
    return billingAmountField().get();
  }

  default AgreementDetail billingAmount( final Double v )
  {
    billingAmountField().set(v);
    return this;
  }

  /*
  |*| Inherited Overrides
   */

  AgreementDetail agreementName( final String s );

  @Override
  AgreementDetail agreementType( final String s );

  @Override
  default String toXml( String rootName )
  {
    return "<" + rootName + ">"
      + hoursField().toXml()
      + timeAmountField().toXml()
      + expenseAmountField().toXml()
      + productAmountField().toXml()
      + salesTaxAmountField().toXml()
      + fixedFeeAmountField().toXml()
      + agreementNameField().toXml()
      + agreementTypeField().toXml()
      + detailTypeField().toXml()
      + billingAmountField().toXml()
      + "</" + rootName + ">";
  }
}
