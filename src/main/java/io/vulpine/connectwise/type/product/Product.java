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

package io.vulpine.connectwise.type.product;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@SuppressWarnings( "unused" )
public class Product extends ProductCommon
{
  @JacksonXmlProperty( localName = "Type" )
  protected String type;

  @JacksonXmlProperty( localName = "Category" )
  protected String category;

  @JacksonXmlProperty( localName = "SubCategory" )
  protected String subCategory;

  @JacksonXmlProperty( localName = "UOM" )
  protected String uom;

  @JacksonXmlProperty( localName = "LongDescription" )
  protected String longDescription;

  @JacksonXmlProperty( localName = "Manufacturer" )
  protected String manufacturer;

  @JacksonXmlProperty( localName = "Vendor" )
  protected String vendor;

  @JacksonXmlProperty( localName = "VendorSku" )
  protected String vendorSku;

  @JacksonXmlProperty( localName = "Class" )
  protected String productClass;

  @JacksonXmlProperty( localName = "IsPhaseProduct" )
  protected Boolean phaseProduct;

  @JacksonXmlProperty( localName = "ManufacturerPartNumber" )
  protected String manufacturerPartNumber;

  @JacksonXmlProperty( localName = "PriceAttribute" )
  protected String priceAttribute;

  @JacksonXmlProperty( localName = "BundledComponents" )
  protected List < Component > components;

  public String getType ()
  {
    return type;
  }

  public void setType ( final String type )
  {
    this.type = type;
  }

  public String getCategory ()
  {
    return category;
  }

  public void setCategory ( final String category )
  {
    this.category = category;
  }

  public String getSubCategory ()
  {
    return subCategory;
  }

  public void setSubCategory ( final String subCategory )
  {
    this.subCategory = subCategory;
  }

  public String getUom ()
  {
    return uom;
  }

  public void setUom ( final String uom )
  {
    this.uom = uom;
  }

  public String getLongDescription ()
  {
    return longDescription;
  }

  public void setLongDescription ( final String longDescription )
  {
    this.longDescription = longDescription;
  }

  public String getManufacturer ()
  {
    return manufacturer;
  }

  public void setManufacturer ( final String manufacturer )
  {
    this.manufacturer = manufacturer;
  }

  public String getVendor ()
  {
    return vendor;
  }

  public void setVendor ( final String vendor )
  {
    this.vendor = vendor;
  }

  public String getVendorSku ()
  {
    return vendorSku;
  }

  public void setVendorSku ( final String vendorSku )
  {
    this.vendorSku = vendorSku;
  }

  public String getProductClass ()
  {
    return productClass;
  }

  public void setProductClass ( final String productClass )
  {
    this.productClass = productClass;
  }

  public Boolean isPhaseProduct ()
  {
    return phaseProduct;
  }

  public void setPhaseProduct ( final Boolean phaseProduct )
  {
    this.phaseProduct = phaseProduct;
  }

  public String getManufacturerPartNumber ()
  {
    return manufacturerPartNumber;
  }

  public void setManufacturerPartNumber ( final String manufacturerPartNumber )
  {
    this.manufacturerPartNumber = manufacturerPartNumber;
  }

  public String getPriceAttribute ()
  {
    return priceAttribute;
  }

  public void setPriceAttribute ( final String priceAttribute )
  {
    this.priceAttribute = priceAttribute;
  }

  public List < Component > getComponents ()
  {
    return components;
  }

  public void setComponents ( final List < Component > components )
  {
    this.components = components;
  }
}
