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
import io.vulpine.connectwise.util.Field;
import io.vulpine.connectwise.util.NumberField;

public interface SalesTaxDetail extends XmlSerializable
{
  Field < Boolean > taxExpensesField();

  default Boolean taxExpenses()
  {
    return taxExpensesField().get();
  }

  default SalesTaxDetail taxExpenses( final Boolean v )
  {
    taxExpensesField().set(v);
    return this;
  }

  Field < Boolean > taxProductsField();

  default Boolean taxProducts()
  {
    return taxProductsField().get();
  }

  default SalesTaxDetail taxProducts( final Boolean v )
  {
    taxProductsField().set(v);
    return this;
  }

  Field < Boolean > taxServicesField();

  default Boolean taxServices()
  {
    return taxServicesField().get();
  }

  default SalesTaxDetail taxServices( final Boolean v )
  {
    taxServicesField().set(v);
    return this;
  }

  Field < Boolean > applySingelUnitLimitField();

  default Boolean applySingelUnitLimit()
  {
    return applySingelUnitLimitField().get();
  }

  default SalesTaxDetail applySingelUnitLimit( final Boolean v )
  {
    applySingelUnitLimitField().set(v);
    return this;
  }

  NumberField < Integer > taxLevelField();

  default Integer taxLevel()
  {
    return taxLevelField().get();
  }

  default SalesTaxDetail taxLevel( final Integer v )
  {
    taxLevelField().set(v);
    return this;
  }

  NumberField < Double > amountField();

  default Double amount()
  {
    return amountField().get();
  }

  default SalesTaxDetail amount( final Double v )
  {
    amountField().set(v);
    return this;
  }

  NumberField < Double > rateField();

  default Double rate()
  {
    return rateField().get();
  }

  default SalesTaxDetail rate( final Double v )
  {
    rateField().set(v);
    return this;
  }

  NumberField < Double > singleUnitMaxField();

  default Double singleUnitMax()
  {
    return singleUnitMaxField().get();
  }

  default SalesTaxDetail singleUnitMax( final Double v )
  {
    singleUnitMaxField().set(v);
    return this;
  }

  NumberField < Double > singleUnitMinField();

  default Double singleUnitMin()
  {
    return singleUnitMinField().get();
  }

  default SalesTaxDetail singleUnitMin( final Double v )
  {
    singleUnitMinField().set(v);
    return this;
  }

  NumberField < Double > taxableMaxField();

  default Double taxableMax()
  {
    return taxableMaxField().get();
  }

  default SalesTaxDetail taxableMax( final Double v )
  {
    taxableMaxField().set(v);
    return this;
  }

  Field < String > captionField();

  default String caption()
  {
    return captionField().get();
  }

  default SalesTaxDetail caption( final String v )
  {
    captionField().set(v);
    return this;
  }

  Field < String > rateTypeField();

  default String rateType()
  {
    return rateTypeField().get();
  }

  default SalesTaxDetail rateType( final String v )
  {
    rateTypeField().set(v);
    return this;
  }

  Field < String > taxAgencyXrefField();

  default String taxAgencyXref()
  {
    return taxAgencyXrefField().get();
  }

  default SalesTaxDetail taxAgencyXref( final String v )
  {
    taxAgencyXrefField().set(v);
    return this;
  }

  Field < String > taxCodeXrefField();

  default String taxCodeXref()
  {
    return taxCodeXrefField().get();
  }

  default SalesTaxDetail taxCodeXref( final String v )
  {
    taxCodeXrefField().set(v);
    return this;
  }

  @Override
  default String toXml( String rootName )
  {
    return "<" + rootName + ">"
      + taxExpensesField().toXml()
      + taxProductsField().toXml()
      + taxServicesField().toXml()
      + applySingelUnitLimitField().toXml()
      + taxLevelField().toXml()
      + amountField().toXml()
      + rateField().toXml()
      + singleUnitMaxField().toXml()
      + singleUnitMinField().toXml()
      + taxableMaxField().toXml()
      + captionField().toXml()
      + rateTypeField().toXml()
      + taxAgencyXrefField().toXml()
      + taxCodeXrefField().toXml()
      + "</" + rootName + ">";
  }
}
