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

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.ConnectwiseCommon;
import io.vulpine.connectwise.type.PriceAttribute;
import io.vulpine.connectwise.type.agreement.ProductClass;

public class AdditionProduct extends ConnectwiseCommon
{
  @JacksonXmlProperty( localName = "ItemIdentifier" )
  protected String itemIdentifier;

  @JacksonXmlProperty( localName = "ProductTypeId" )
  protected int productTypeId;

  @JacksonXmlProperty( localName = "CategoryId" )
  protected int categoryId;

  @JacksonXmlProperty( localName = "SubcategoryId" )
  protected int subcategoryId;

  @JacksonXmlProperty( localName = "UomId" )
  protected int uomId;

  @JacksonXmlProperty( localName = "Cost" )
  protected double cost;

  @JacksonXmlProperty( localName = "Price" )
  protected double price;

  @JacksonXmlProperty( localName = "Taxable" )
  protected boolean taxable;

  @JacksonXmlProperty( localName = "LongDescription" )
  protected String longDescription;

  @JacksonXmlProperty( localName = "Inactive" )
  protected boolean inactive;

  @JacksonXmlProperty( localName = "Serialized" )
  protected boolean serialized;

  @JacksonXmlProperty( localName = "ApplyCostBySerialNumber" )
  protected boolean applyCostBySerialNumber;

  @JacksonXmlProperty( localName = "ManufacturerId" )
  protected int manufacturerId;

  @JacksonXmlProperty( localName = "ManufacturerPartNumber" )
  protected String manufacturerPartNumber;

  @JacksonXmlProperty( localName = "VendorId" )
  protected int vendorId;

  @JacksonXmlProperty( localName = "VendorSku" )
  protected String vendorSku;

  @JacksonXmlProperty( localName = "ProductClass" )
  protected ProductClass productClass;

  @JacksonXmlProperty( localName = "PriceAttribute" )
  protected PriceAttribute priceAttribute;

  @JacksonXmlProperty( localName = "MinimumStock" )
  protected int minimumStock;

  public String getItemIdentifier()
  {
    return itemIdentifier;
  }

  public void setItemIdentifier( final String itemIdentifier )
  {
    this.itemIdentifier = itemIdentifier;
  }

  public int getProductTypeId()
  {
    return productTypeId;
  }

  public void setProductTypeId( final int productTypeId )
  {
    this.productTypeId = productTypeId;
  }

  public int getCategoryId()
  {
    return categoryId;
  }

  public void setCategoryId( final int categoryId )
  {
    this.categoryId = categoryId;
  }

  public int getSubcategoryId()
  {
    return subcategoryId;
  }

  public void setSubcategoryId( final int subcategoryId )
  {
    this.subcategoryId = subcategoryId;
  }

  public int getUomId()
  {
    return uomId;
  }

  public void setUomId( final int uomId )
  {
    this.uomId = uomId;
  }

  public double getCost()
  {
    return cost;
  }

  public void setCost( final double cost )
  {
    this.cost = cost;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice( final double price )
  {
    this.price = price;
  }

  public boolean isTaxable()
  {
    return taxable;
  }

  public void setTaxable( final boolean taxable )
  {
    this.taxable = taxable;
  }

  public String getLongDescription()
  {
    return longDescription;
  }

  public void setLongDescription( final String longDescription )
  {
    this.longDescription = longDescription;
  }

  public boolean isInactive()
  {
    return inactive;
  }

  public void setInactive( final boolean inactive )
  {
    this.inactive = inactive;
  }

  public boolean isSerialized()
  {
    return serialized;
  }

  public void setSerialized( final boolean serialized )
  {
    this.serialized = serialized;
  }

  public boolean isApplyCostBySerialNumber()
  {
    return applyCostBySerialNumber;
  }

  public void setApplyCostBySerialNumber( final boolean applyCostBySerialNumber )
  {
    this.applyCostBySerialNumber = applyCostBySerialNumber;
  }

  public int getManufacturerId()
  {
    return manufacturerId;
  }

  public void setManufacturerId( final int manufacturerId )
  {
    this.manufacturerId = manufacturerId;
  }

  public String getManufacturerPartNumber()
  {
    return manufacturerPartNumber;
  }

  public void setManufacturerPartNumber( final String manufacturerPartNumber )
  {
    this.manufacturerPartNumber = manufacturerPartNumber;
  }

  public int getVendorId()
  {
    return vendorId;
  }

  public void setVendorId( final int vendorId )
  {
    this.vendorId = vendorId;
  }

  public String getVendorSku()
  {
    return vendorSku;
  }

  public void setVendorSku( final String vendorSku )
  {
    this.vendorSku = vendorSku;
  }

  public ProductClass getProductClass()
  {
    return productClass;
  }

  public void setProductClass( final ProductClass productClass )
  {
    this.productClass = productClass;
  }

  public PriceAttribute getPriceAttribute()
  {
    return priceAttribute;
  }

  public void setPriceAttribute( final PriceAttribute priceAttribute )
  {
    this.priceAttribute = priceAttribute;
  }

  public int getMinimumStock()
  {
    return minimumStock;
  }

  public void setMinimumStock( final int minimumStock )
  {
    this.minimumStock = minimumStock;
  }
}
