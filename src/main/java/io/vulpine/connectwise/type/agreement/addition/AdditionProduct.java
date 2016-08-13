package io.vulpine.connectwise.type.agreement.addition;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.CwObject;
import io.vulpine.connectwise.type.PriceAttribute;
import io.vulpine.connectwise.type.agreement.ProductClass;

@SuppressWarnings( "unused" )
public class AdditionProduct extends CwObject
{
  @JacksonXmlProperty( localName = "ItemIdentifier" )
  protected String ItemIdentifier;

  @JacksonXmlProperty( localName = "ProductTypeId" )
  protected int ProductTypeId;

  @JacksonXmlProperty( localName = "CategoryId" )
  protected int CategoryId;

  @JacksonXmlProperty( localName = "SubcategoryId" )
  protected int SubcategoryId;

  @JacksonXmlProperty( localName = "UomId" )
  protected int UomId;

  @JacksonXmlProperty( localName = "Cost" )
  protected double Cost;

  @JacksonXmlProperty( localName = "Price" )
  protected double Price;

  @JacksonXmlProperty( localName = "Taxable" )
  protected boolean Taxable;

  @JacksonXmlProperty( localName = "LongDescription" )
  protected String LongDescription;

  @JacksonXmlProperty( localName = "Inactive" )
  protected boolean Inactive;

  @JacksonXmlProperty( localName = "Serialized" )
  protected boolean Serialized;

  @JacksonXmlProperty( localName = "ApplyCostBySerialNumber" )
  protected boolean ApplyCostBySerialNumber;

  @JacksonXmlProperty( localName = "ManufacturerId" )
  protected int ManufacturerId;

  @JacksonXmlProperty( localName = "ManufacturerPartNumber" )
  protected String ManufacturerPartNumber;

  @JacksonXmlProperty( localName = "VendorId" )
  protected int VendorId;

  @JacksonXmlProperty( localName = "VendorSku" )
  protected String VendorSku;

  @JacksonXmlProperty( localName = "ProductClass" )
  protected ProductClass ProductClass;

  @JacksonXmlProperty( localName = "PriceAttribute" )
  protected PriceAttribute PriceAttribute;

  @JacksonXmlProperty( localName = "MinimumStock" )
  protected int MinimumStock;

  public String getItemIdentifier ()
  {
    return ItemIdentifier;
  }

  public void setItemIdentifier ( String itemIdentifier )
  {
    ItemIdentifier = itemIdentifier;
  }

  public int getProductTypeId ()
  {
    return ProductTypeId;
  }

  public void setProductTypeId ( int productTypeId )
  {
    ProductTypeId = productTypeId;
  }

  public int getCategoryId ()
  {
    return CategoryId;
  }

  public void setCategoryId ( int categoryId )
  {
    CategoryId = categoryId;
  }

  public int getSubcategoryId ()
  {
    return SubcategoryId;
  }

  public void setSubcategoryId ( int subcategoryId )
  {
    SubcategoryId = subcategoryId;
  }

  public int getUomId ()
  {
    return UomId;
  }

  public void setUomId ( int uomId )
  {
    UomId = uomId;
  }

  public double getCost ()
  {
    return Cost;
  }

  public void setCost ( double cost )
  {
    Cost = cost;
  }

  public double getPrice ()
  {
    return Price;
  }

  public void setPrice ( double price )
  {
    Price = price;
  }

  public boolean isTaxable ()
  {
    return Taxable;
  }

  public void setTaxable ( boolean taxable )
  {
    Taxable = taxable;
  }

  public String getLongDescription ()
  {
    return LongDescription;
  }

  public void setLongDescription ( String longDescription )
  {
    LongDescription = longDescription;
  }

  public boolean isInactive ()
  {
    return Inactive;
  }

  public void setInactive ( boolean inactive )
  {
    Inactive = inactive;
  }

  public boolean isSerialized ()
  {
    return Serialized;
  }

  public void setSerialized ( boolean serialized )
  {
    Serialized = serialized;
  }

  public boolean isApplyCostBySerialNumber ()
  {
    return ApplyCostBySerialNumber;
  }

  public void setApplyCostBySerialNumber ( boolean applyCostBySerialNumber )
  {
    ApplyCostBySerialNumber = applyCostBySerialNumber;
  }

  public int getManufacturerId ()
  {
    return ManufacturerId;
  }

  public void setManufacturerId ( int manufacturerId )
  {
    ManufacturerId = manufacturerId;
  }

  public String getManufacturerPartNumber ()
  {
    return ManufacturerPartNumber;
  }

  public void setManufacturerPartNumber ( String manufacturerPartNumber )
  {
    ManufacturerPartNumber = manufacturerPartNumber;
  }

  public int getVendorId ()
  {
    return VendorId;
  }

  public void setVendorId ( int vendorId )
  {
    VendorId = vendorId;
  }

  public String getVendorSku ()
  {
    return VendorSku;
  }

  public void setVendorSku ( String vendorSku )
  {
    VendorSku = vendorSku;
  }

  public ProductClass getProductClass ()
  {
    return ProductClass;
  }

  public void setProductClass ( ProductClass productClass )
  {
    ProductClass = productClass;
  }

  public PriceAttribute getPriceAttribute ()
  {
    return PriceAttribute;
  }

  public void setPriceAttribute ( PriceAttribute priceAttribute )
  {
    PriceAttribute = priceAttribute;
  }

  public int getMinimumStock ()
  {
    return MinimumStock;
  }

  public void setMinimumStock ( int minimumStock )
  {
    MinimumStock = minimumStock;
  }
}
