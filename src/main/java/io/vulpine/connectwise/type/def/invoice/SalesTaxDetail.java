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

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public interface SalesTaxDetail
{
  @JsonGetter( "TaxExpenses" )
  Boolean taxExpenses();

  @JsonSetter( "TaxExpenses" )
  SalesTaxDetail taxExpenses( final Boolean b );

  @JsonGetter( "TaxProducts" )
  Boolean taxProducts();

  @JsonSetter( "TaxProducts" )
  SalesTaxDetail taxProducts( final Boolean b );

  @JsonGetter( "TaxServices" )
  Boolean taxServices();

  @JsonSetter( "TaxServices" )
  SalesTaxDetail taxServices( final Boolean b );

  @JsonGetter( "ApplySingleUnitLimit" )
  Boolean applySingleUnitLimit();

  @JsonSetter( "ApplySingleUnitLimit" )
  SalesTaxDetail applySingleUnitLimit( final Boolean b );

  @JsonGetter( "TaxLevel" )
  Integer taxLevel();

  @JsonSetter( "TaxLevel" )
  SalesTaxDetail taxLevel( final Integer i );

  @JsonGetter( "Amount" )
  Double amount();

  @JsonSetter( "Amount" )
  SalesTaxDetail amount( final Double d );

  @JsonGetter( "SingleUnitMax" )
  Double singleUnitMax();

  @JsonSetter( "SingleUnitMax" )
  SalesTaxDetail singleUnitMax( final Double d );

  @JsonGetter( "SingleUnitMin" )
  Double singleUnitMin();

  @JsonSetter( "SingleUnitMin" )
  SalesTaxDetail singleUnitMin( final Double d );

  @JsonGetter( "TaxableMax" )
  Double taxableMax();

  @JsonSetter( "TaxableMax" )
  SalesTaxDetail taxableMax( final Double d );

  @JsonGetter( "Caption" )
  String caption();

  @JsonSetter( "Caption" )
  SalesTaxDetail caption( final String s );

  @JsonGetter( "RateType" )
  String rateType();

  @JsonSetter( "RateType" )
  SalesTaxDetail rateType( final String s );

  @JsonGetter( "TaxAgencyXref" )
  String taxAgencyXref();

  @JsonSetter( "TaxAgencyXref" )
  SalesTaxDetail taxAgencyXref( final String s );

  @JsonGetter( "TaxCodeXref" )
  String taxCodeXref();

  @JsonSetter( "TaxCodeXref" )
  SalesTaxDetail taxCodeXref( final String s );
}
