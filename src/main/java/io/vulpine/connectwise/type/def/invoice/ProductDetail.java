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
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import io.vulpine.connectwise.type.def.gen.*;

import java.util.List;

public interface ProductDetail
  extends
  HasBillable,
  HasTaxable,
  HasDate,
  HasAgreementAmount,
  HasQuantity,
  HasUnitPrice,
  HasUnitCost,
  HasBusinessUnit,
  HasChargeTo,
  HasDescription,
  HasItemIdentifier,
  HasLocation,
  HasProjectName,
  HasProjectNumber,
  HasPhaseName,
  HasTicketNumber,
  HasTicketSummary,
  HasInvoicedAmount,
  HasBin,
  HasWarehouse
{
  @JsonGetter( "SerialNumbers" )
  @JacksonXmlElementWrapper( localName = "string" )
  List < String > serialNumbers();

  @JsonSetter( "SerialNumbers" )
  @JacksonXmlElementWrapper( localName = "string" )
  ProductDetail serialNumbers( final List < String > l );

  @JsonGetter( "IsSerialized" )
  Boolean isSerialized();

  @JsonSetter( "IsSerialized" )
  ProductDetail isSerialized( final Boolean b );

  @JsonGetter( "Category" )
  String category();

  @JsonSetter( "Category" )
  ProductDetail category( final String s );

  @JsonGetter( "ItemClass" )
  String itemClass();

  @JsonSetter( "ItemClass" )
  ProductDetail itemClass( final String s );

  @JsonGetter( "ItemType" )
  String itemType();

  @JsonSetter( "ItemType" )
  ProductDetail itemType( final String s );

  @JsonGetter( "ManufacturerName" )
  String manufacturerName();

  @JsonSetter( "ManufacturerName" )
  ProductDetail manufacturerName( final String s );

  @JsonGetter( "ManufacturerIdentifier" )
  String manufacturerIdentifier();

  @JsonSetter( "ManufacturerIdentifier" )
  ProductDetail manufacturerIdentifier( final String s );

  @JsonGetter( "SubCategory" )
  String subCategory();

  @JsonSetter( "SubCategory" )
  ProductDetail subCategory( final String s );

  @JsonGetter( "VendorName" )
  String vendorName();

  @JsonSetter( "VendorName" )
  ProductDetail vendorName( final String s );

  @JsonGetter( "VendorIdentifier" )
  String vendorIdentifier();

  @JsonSetter( "VendorIdentifier" )
  ProductDetail vendorIdentifier( final String s );

  @JsonGetter( "VendorNumber" )
  String vendorNumber();

  @JsonSetter( "VendorNumber" )
  ProductDetail vendorNumber( final String s );
}
