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
 *
 */

package io.vulpine.connectwise.type.agreement.addition;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.ConnectwiseCommon;
import io.vulpine.connectwise.type.PriceAttribute;
import io.vulpine.connectwise.type.agreement.ProductClass;

public class AdditionProduct extends ConnectwiseCommon
{
  private boolean applyCostBySerialNumber;

  private boolean inactive;

  private boolean serialized;

  private boolean taxable;

  private double cost;

  private double price;

  private int categoryId;

  private int manufacturerId;

  private int minimumStock;

  private int productTypeId;

  private int subcategoryId;

  private int uomId;

  private int vendorId;

  private PriceAttribute priceAttribute;

  private ProductClass productClass;

  private String itemIdentifier;

  private String longDescription;

  private String manufacturerPartNumber;

  private String vendorSku;

  @JsonGetter( "CategoryId" )
  public int categoryId()
  {
    return categoryId;
  }

  @JsonSetter( "CategoryId" )
  public AdditionProduct categoryId( final int categoryId )
  {
    this.categoryId = categoryId;

    return this;
  }

  @JsonGetter( "Cost" )
  public double cost()
  {
    return cost;
  }

  @JsonSetter( "Cost" )
  public AdditionProduct cost( final double cost )
  {
    this.cost = cost;

    return this;
  }

  @JsonGetter( "ItemIdentifier" )
  public String itemIdentifier()
  {
    return itemIdentifier;
  }

  @JsonSetter( "ItemIdentifier" )
  public AdditionProduct itemIdentifier( final String itemIdentifier )
  {
    this.itemIdentifier = itemIdentifier;

    return this;
  }

  @JsonGetter( "LongDescription" )
  public String longDescription()
  {
    return longDescription;
  }

  @JsonSetter( "LongDescription" )
  public AdditionProduct longDescription( final String longDescription )
  {
    this.longDescription = longDescription;

    return this;
  }

  @JsonGetter( "ManufacturerId" )
  public int manufacturerId()
  {
    return manufacturerId;
  }

  @JsonSetter( "ManufacturerId" )
  public AdditionProduct manufacturerId( final int manufacturerId )
  {
    this.manufacturerId = manufacturerId;

    return this;
  }

  @JsonGetter( "ManufacturerPartNumber" )
  public String manufacturerPartNumber()
  {
    return manufacturerPartNumber;
  }

  @JsonSetter( "ManufacturerPartNumber" )
  public AdditionProduct manufacturerPartNumber( final String manufacturerPartNumber )
  {
    this.manufacturerPartNumber = manufacturerPartNumber;

    return this;
  }

  @JsonGetter( "MinimumStock" )
  public int minimumStock()
  {
    return minimumStock;
  }

  @JsonSetter( "MinimumStock" )
  public AdditionProduct minimumStock( final int minimumStock )
  {
    this.minimumStock = minimumStock;

    return this;
  }

  @JsonGetter( "Price" )
  public double price()
  {
    return price;
  }

  @JsonSetter( "Price" )
  public AdditionProduct price( final double price )
  {
    this.price = price;

    return this;
  }

  @JsonGetter( "PriceAttribute" )
  public PriceAttribute priceAttribute()
  {
    return priceAttribute;
  }

  @JsonSetter( "PriceAttribute" )
  public AdditionProduct priceAttribute( final PriceAttribute priceAttribute )
  {
    this.priceAttribute = priceAttribute;

    return this;
  }

  @JsonGetter( "ProductClass" )
  public ProductClass productClass()
  {
    return productClass;
  }

  @JsonSetter( "ProductClass" )
  public AdditionProduct productClass( final ProductClass productClass )
  {
    this.productClass = productClass;

    return this;
  }

  @JsonGetter( "ProductTypeId" )
  public int productTypeId()
  {
    return productTypeId;
  }

  @JsonSetter( "ProductTypeId" )
  public AdditionProduct productTypeId( final int productTypeId )
  {
    this.productTypeId = productTypeId;

    return this;
  }

  @JsonGetter( "SubcategoryId" )
  public int subcategoryId()
  {
    return subcategoryId;
  }

  @JsonSetter( "SubcategoryId" )
  public AdditionProduct subcategoryId( final int subcategoryId )
  {
    this.subcategoryId = subcategoryId;

    return this;
  }

  @JsonGetter( "UomId" )
  public int uomId()
  {
    return uomId;
  }

  @JsonSetter( "UomId" )
  public AdditionProduct uomId( final int uomId )
  {
    this.uomId = uomId;

    return this;
  }

  @JsonGetter( "VendorId" )
  public int vendorId()
  {
    return vendorId;
  }

  @JsonSetter( "VendorId" )
  public AdditionProduct vendorId( final int vendorId )
  {
    this.vendorId = vendorId;

    return this;
  }

  @JsonGetter( "VendorSku" )
  public String vendorSku()
  {
    return vendorSku;
  }

  @JsonSetter( "VendorSku" )
  public AdditionProduct vendorSku( final String vendorSku )
  {
    this.vendorSku = vendorSku;

    return this;
  }

  @JsonGetter( "ApplyCostBySerialNumber" )
  public boolean applyCostBySerialNumber()
  {
    return applyCostBySerialNumber;
  }

  @JsonSetter( "ApplyCostBySerialNumber" )
  public AdditionProduct applyCostBySerialNumber( final boolean applyCostBySerialNumber )
  {
    this.applyCostBySerialNumber = applyCostBySerialNumber;

    return this;
  }

  @JsonGetter( "Inactive" )
  public boolean inactive()
  {
    return inactive;
  }

  @JsonSetter( "Inactive" )
  public AdditionProduct inactive( final boolean inactive )
  {
    this.inactive = inactive;

    return this;
  }

  @JsonGetter( "Serialized" )
  public boolean serialized()
  {
    return serialized;
  }

  @JsonSetter( "Serialized" )
  public AdditionProduct serialized( final boolean serialized )
  {
    this.serialized = serialized;

    return this;
  }

  @JsonGetter( "Taxable" )
  public boolean taxable()
  {
    return taxable;
  }

  @JsonSetter( "Taxable" )
  public AdditionProduct taxable( final boolean taxable )
  {
    this.taxable = taxable;

    return this;
  }
}
