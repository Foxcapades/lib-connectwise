package io.vulpine.connectwise.type.def;

import io.vulpine.connectwise.type.PriceAttribute;
import io.vulpine.connectwise.type.agreement.ProductClass;
import io.vulpine.connectwise.type.def.gen.*;
import io.vulpine.connectwise.util.Field;

public interface AdditionProduct
  extends
  HasCategoryId,
  HasDescription,
  HasId,
  HasItemIdentifier,
  HasProductTypeId,
  HasTaxable,
  HasVendorId,
  XmlSerializable
{
  Field < ProductClass > productClassField();

  Field < PriceAttribute > priceAttributeField();

  Field < Integer > subcategoryIdField();

  Field < Integer > uomIdField();

  Field < Double > costField();

  Field < Double > priceField();

  Field < String > longDescriptionField();

  Field < Boolean > inactiveField();

  Field < Boolean > serializedField();

  Field < Boolean > applyCostBySerialNumberField();

  Field < Integer > manufacturerIdField();

  Field < String > manufacturerPartNumberField();

  Field < String > vendorSkuField();

  Field < Integer > minimumStockField();

  default ProductClass productClass()
  {
    return productClassField().get();
  }

  default AdditionProduct productClass( final ProductClass p )
  {
    productClassField().set(p);
    return this;
  }

  default PriceAttribute priceAttribute()
  {
    return priceAttributeField().get();
  }

  default AdditionProduct productClass( final PriceAttribute p )
  {
    priceAttributeField().set(p);
    return this;
  }

  default Integer subcategoryId()
  {
    return subcategoryIdField().get();
  }

  default AdditionProduct subcategoryId( final Integer i )
  {
    subcategoryIdField().set(i);
    return this;
  }

  default Integer uomId()
  {
    return uomIdField().get();
  }

  default AdditionProduct uomId( final Integer i )
  {
    uomIdField().set(i);
    return this;
  }

  default Double cost()
  {
    return costField().get();
  }

  default AdditionProduct cost( final Double d )
  {
    costField().set(d);
    return this;
  }

  default Double price()
  {
    return priceField().get();
  }

  default AdditionProduct price( final Double d )
  {
    priceField().set(d);
    return this;
  }

  default String longDescription()
  {
    return longDescriptionField().get();
  }

  default AdditionProduct longDescription( final String s )
  {
    longDescriptionField().set(s);
    return this;
  }

  default Boolean inactive()
  {
    return inactiveField().get();
  }

  default AdditionProduct inactive( final Boolean b )
  {
    inactiveField().set(b);
    return this;
  }

  default Boolean serialized()
  {
    return serializedField().get();
  }

  default AdditionProduct serialized( final Boolean b )
  {
    serializedField().set(b);
    return this;
  }

  default Boolean applyCostBySerialNumber()
  {
    return applyCostBySerialNumberField().get();
  }

  default AdditionProduct applyCostBySerialNumber( final Boolean b )
  {
    applyCostBySerialNumberField().set(b);
    return this;
  }

  default Integer manufacturerId()
  {
    return manufacturerIdField().get();
  }

  default AdditionProduct manufacturerId( final Integer i )
  {
    manufacturerIdField().set(i);
    return this;
  }

  default String manufacturerPartNumber()
  {
    return manufacturerPartNumberField().get();
  }

  default AdditionProduct manufacturerPartNumber( final String s )
  {
    manufacturerPartNumberField().set(s);
    return this;
  }

  default String vendorSku()
  {
    return vendorSkuField().get();
  }

  default AdditionProduct vendorSku( final String s )
  {
    vendorSkuField().set(s);
    return this;
  }

  default Integer minimumStock()
  {
    return minimumStockField().get();
  }

  default AdditionProduct minimumStock( final Integer i )
  {
    minimumStockField().set(i);
    return this;
  }

  @Override
  default AdditionProduct categoryId( final Integer i )
  {
    categoryIdField().set(i);
    return this;
  }

  @Override
  default AdditionProduct taxable( Boolean b )
  {
    taxableField().set(b);
    return this;
  }

  @Override
  default AdditionProduct vendorId( final Integer i )
  {
    vendorIdField().set(i);
    return this;
  }

  @Override
  default AdditionProduct description( String s )
  {
    descriptionField().set(s);
    return this;
  }

  @Override
  default AdditionProduct productTypeId( final Integer i )
  {
    productTypeIdField().set(i);
    return this;
  }

  @Override
  default AdditionProduct itemIdentifier( final String s )
  {
    itemIdentifierField().set(s);
    return this;
  }

  @Override
  default AdditionProduct id( final Integer i )
  {
    idField().set(i);
    return this;
  }
}
