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

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.def.gen.*;

import java.util.List;

public interface ProductItem
  extends
  HasId,
  HasProjectId,
  HasTaxable,
  HasBillable,
  HasQuantity,
  HasDescription,
  HasWarehouse,
  HasBin,
  HasLocationId,
  HasVendorId,
  HasItemId,
  HasCost,
  HasPrice
{
  @JsonGetter( "Dropship" )
  Boolean dropship();

  @JsonSetter( "Dropship" )
  ProductItem dropship( final Boolean b );

  @JsonGetter( "SpecialOrder" )
  Boolean specialOrder();

  @JsonSetter( "SpecialOrder" )
  ProductItem specialOrder( final Boolean b );

  @JsonGetter( "ForecastDetailId" )
  Integer forecastDetailId();

  @JsonSetter( "ForecastDetailId" )
  ProductItem forecastDetailId( final Integer i );

  @JsonGetter( "TicketId" )
  Integer ticketId();

  @JsonSetter( "TicketId" )
  ProductItem ticketId( final Integer i );

  @JsonGetter( "InvoiceId" )
  Integer invoiceId();

  @JsonSetter( "InvoiceId" )
  ProductItem invoiceId( final Integer i );

  @JsonGetter( "SalesOrderId" )
  Integer salesOrderId();

  @JsonSetter( "SalesOrderId" )
  ProductItem salesOrderId( final Integer i );

  @JsonGetter( "Invoice" )
  Boolean invoice();

  @JsonSetter( "Invoice" )
  ProductItem invoice( final Boolean b );

  @JsonGetter( "QuantityCancelled" )
  Double quantityCancelled();

  @JsonSetter( "QuantityCancelled" )
  ProductItem quantityCancelled( final Double d );

  @JsonGetter( "ShortDescription" )
  String shortDescription();

  @JsonSetter( "ShortDescription" )
  ProductItem shortDescription( final String s );

  @JsonGetter( "OpportunityId" )
  Integer opportunityId();

  @JsonSetter( "OpportunityId" )
  ProductItem opportunityId( final Integer i );

  @JsonGetter( "QuoteNumber" )
  String quoteNumber();

  @JsonSetter( "QuoteNumber" )
  ProductItem quoteNumber( final String s );

  @JsonGetter( "QuoteName" )
  String quoteName();

  @JsonSetter( "QuoteName" )
  ProductItem quoteName( final String s );

  @JsonGetter( "BusinessUnitId" )
  Integer businessUnitId();

  @JsonSetter( "BusinessUnitId" )
  ProductItem businessUnitId( final Integer i );

  @JsonGetter( "IsPhaseProduct" )
  Boolean isPhaseProduct();

  @JsonSetter( "IsPhaseProduct" )
  ProductItem isPhaseProduct( final Boolean b );

  @JsonGetter( "SequenceNumber" )
  Double sequenceNumber();

  @JsonSetter( "SequenceNumber" )
  ProductItem sequenceNumber( final Double d );

  @JsonGetter( "BundleComponents" )
  List < Component > bundleComponents();

  @JsonSetter( "BundleComponents" )
  ProductItem bundleComponents( final List < Component > l );
}
