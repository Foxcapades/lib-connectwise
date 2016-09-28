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
import io.vulpine.connectwise.type.def.gen.*;
import io.vulpine.connectwise.util.Field;
import io.vulpine.connectwise.util.ListField;

import java.util.Date;
import java.util.List;

public interface ProductDetail
  extends
  HasAgreementAmount,
  HasBillable,
  HasBusinessUnit,
  HasChargeTo,
  HasDate,
  HasDescription,
  HasInvoiceAmount,
  HasItemIdentifier,
  HasLocation,
  HasPhaseName,
  HasProjectName,
  HasProjectNumber,
  HasQuantity,
  HasTicketNumber,
  HasTicketSummary,
  HasTaxable,
  HasUnitCost,
  HasUnitPrice,
  XmlSerializable
{
  ListField < String > serialNumbersField();

  default List < String > serialNumbers()
  {
    return serialNumbersField().get();
  }

  default ProductDetail serialNumbers( final List < String > v )
  {
    serialNumbersField().set(v);
    return this;
  }

  Field < Boolean > serializedField();

  default Boolean serialized()
  {
    return serializedField().get();
  }

  default ProductDetail serialized( final Boolean v )
  {
    serializedField().set(v);
    return this;
  }

  Field < String > binField();

  default String bin()
  {
    return binField().get();
  }

  default ProductDetail bin( final String v )
  {
    binField().set(v);
    return this;
  }

  Field < String > categoryField();

  default String category()
  {
    return categoryField().get();
  }

  default ProductDetail category( final String v )
  {
    categoryField().set(v);
    return this;
  }

  Field < String > itemClassField();

  default String itemClass()
  {
    return itemClassField().get();
  }

  default ProductDetail itemClass( final String v )
  {
    itemClassField().set(v);
    return this;
  }

  Field < String > itemTypeField();

  default String itemType()
  {
    return itemTypeField().get();
  }

  default ProductDetail itemType( final String v )
  {
    itemTypeField().set(v);
    return this;
  }

  Field < String > manufacturerNameField();

  default String manufacturerName()
  {
    return manufacturerNameField().get();
  }

  default ProductDetail manufacturerName( final String v )
  {
    manufacturerNameField().set(v);
    return this;
  }

  Field < String > manufacturerIdentifierField();

  default String manufacturerIdentifier()
  {
    return manufacturerIdentifierField().get();
  }

  default ProductDetail manufacturerIdentifier( final String v )
  {
    manufacturerIdentifierField().set(v);
    return this;
  }

  Field < String > subCategoryField();

  default String subCategory()
  {
    return subCategoryField().get();
  }

  default ProductDetail subCategory( final String v )
  {
    subCategoryField().set(v);
    return this;
  }

  Field < String > vendorNameField();

  default String vendorName()
  {
    return vendorNameField().get();
  }

  default ProductDetail vendorName( final String v )
  {
    vendorNameField().set(v);
    return this;
  }

  Field < String > vendorIdentifierField();

  default String vendorIdentifier()
  {
    return vendorIdentifierField().get();
  }

  default ProductDetail vendorIdentifier( final String v )
  {
    vendorIdentifierField().set(v);
    return this;
  }

  Field < String > vendorNumberField();

  default String vendorNumber()
  {
    return vendorNumberField().get();
  }

  default ProductDetail vendorNumber( final String v )
  {
    vendorNumberField().set(v);
    return this;
  }

  Field < String > warehouseField();

  default String warehouse()
  {
    return warehouseField().get();
  }

  default ProductDetail warehouse( final String v )
  {
    warehouseField().set(v);
    return this;
  }

  /*
  |*| INHERITED OVERRIDES
   */

  @Override
  ProductDetail agreementAmount( final Double d );

  @Override
  ProductDetail billable( final Boolean b );

  @Override
  ProductDetail businessUnit( final String s );

  @Override
  ProductDetail chargeTo( final String s );

  @Override
  ProductDetail date( final Date d );

  @Override
  ProductDetail description( final String d );

  @Override
  ProductDetail invoiceAmount( final Double d );

  @Override
  ProductDetail itemIdentifier( final String s );

  @Override
  ProductDetail location( final String s );

  @Override
  ProductDetail phaseName( final String s );

  @Override
  ProductDetail quantity( final Double d );

  @Override
  ProductDetail ticketNumber( final Integer i );

  @Override
  ProductDetail ticketSummary( final String s );

  @Override
  ProductDetail taxable( final Boolean b );

  @Override
  ProductDetail unitCost( final Double d );

  @Override
  ProductDetail unitPrice( final Double d );
}
