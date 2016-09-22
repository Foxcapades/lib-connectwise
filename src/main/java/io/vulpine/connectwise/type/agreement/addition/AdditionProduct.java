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

package io.vulpine.connectwise.type.agreement.addition;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.ConnectwiseCommon;
import io.vulpine.connectwise.type.PriceAttribute;
import io.vulpine.connectwise.type.agreement.ProductClass;

public class AdditionProduct extends ConnectwiseCommon
{
  private Boolean applyCostBySerialNumber;

  private Boolean inactive;

  private Boolean serialized;

  private Boolean taxable;

  private Double cost;

  private Double price;

  private Integer categoryId;

  private Integer manufacturerId;

  private Integer minimumStock;

  private Integer productTypeId;

  private Integer subcategoryId;

  private Integer uomId;

  private Integer vendorId;

  private PriceAttribute priceAttribute;

  private ProductClass productClass;

  private String itemIdentifier;

  private String longDescription;

  private String manufacturerPartNumber;

  private String vendorSku;

  @JsonGetter( "CategoryId" )
  public Integer categoryId()
  {
    return categoryId;
  }

  @JsonSetter( "CategoryId" )
  public AdditionProduct categoryId( final Integer categoryId )
  {
    this.categoryId = categoryId;

    return this;
  }

  @JsonGetter( "Cost" )
  public Double cost()
  {
    return cost;
  }

  @JsonSetter( "Cost" )
  public AdditionProduct cost( final Double cost )
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
  public Integer manufacturerId()
  {
    return manufacturerId;
  }

  @JsonSetter( "ManufacturerId" )
  public AdditionProduct manufacturerId( final Integer manufacturerId )
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
  public Integer minimumStock()
  {
    return minimumStock;
  }

  @JsonSetter( "MinimumStock" )
  public AdditionProduct minimumStock( final Integer minimumStock )
  {
    this.minimumStock = minimumStock;

    return this;
  }

  @JsonGetter( "Price" )
  public Double price()
  {
    return price;
  }

  @JsonSetter( "Price" )
  public AdditionProduct price( final Double price )
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
  public Integer productTypeId()
  {
    return productTypeId;
  }

  @JsonSetter( "ProductTypeId" )
  public AdditionProduct productTypeId( final Integer productTypeId )
  {
    this.productTypeId = productTypeId;

    return this;
  }

  @JsonGetter( "SubcategoryId" )
  public Integer subcategoryId()
  {
    return subcategoryId;
  }

  @JsonSetter( "SubcategoryId" )
  public AdditionProduct subcategoryId( final Integer subcategoryId )
  {
    this.subcategoryId = subcategoryId;

    return this;
  }

  @JsonGetter( "UomId" )
  public Integer uomId()
  {
    return uomId;
  }

  @JsonSetter( "UomId" )
  public AdditionProduct uomId( final Integer uomId )
  {
    this.uomId = uomId;

    return this;
  }

  @JsonGetter( "VendorId" )
  public Integer vendorId()
  {
    return vendorId;
  }

  @JsonSetter( "VendorId" )
  public AdditionProduct vendorId( final Integer vendorId )
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
  public Boolean applyCostBySerialNumber()
  {
    return applyCostBySerialNumber;
  }

  @JsonSetter( "ApplyCostBySerialNumber" )
  public AdditionProduct applyCostBySerialNumber( final Boolean applyCostBySerialNumber )
  {
    this.applyCostBySerialNumber = applyCostBySerialNumber;

    return this;
  }

  @JsonGetter( "Inactive" )
  public Boolean inactive()
  {
    return inactive;
  }

  @JsonSetter( "Inactive" )
  public AdditionProduct inactive( final Boolean inactive )
  {
    this.inactive = inactive;

    return this;
  }

  @JsonGetter( "Serialized" )
  public Boolean serialized()
  {
    return serialized;
  }

  @JsonSetter( "Serialized" )
  public AdditionProduct serialized( final Boolean serialized )
  {
    this.serialized = serialized;

    return this;
  }

  @JsonGetter( "Taxable" )
  public Boolean taxable()
  {
    return taxable;
  }

  @JsonSetter( "Taxable" )
  public AdditionProduct taxable( final Boolean taxable )
  {
    this.taxable = taxable;

    return this;
  }
}
