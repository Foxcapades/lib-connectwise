package io.vulpine.connectwise.data.product;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.data.CwObject;

@SuppressWarnings( "unused" )
public class Component extends AbstractSubProduct
{
  @JacksonXmlProperty( localName = "SequenceNumber" )
  protected int sequenceNumber;

  @JacksonXmlProperty( localName = "ParentId" )
  protected int parentId;

  @JacksonXmlProperty( localName = "Quantity" )
  protected int quantity;

  @JacksonXmlProperty( localName = "ProductId" )
  protected int productId;

  @JacksonXmlProperty( localName = "ItemId" )
  protected int itemId;

  @JacksonXmlProperty( localName = "HidePrice" )
  protected boolean hidePrice;

  @JacksonXmlProperty( localName = "HideItemId" )
  protected boolean hideItemId;

  @JacksonXmlProperty( localName = "HideDescription" )
  protected boolean hideDescription;

  @JacksonXmlProperty( localName = "HideQuantity" )
  protected boolean hideQuantity;

  @JacksonXmlProperty( localName = "Warehouse" )
  protected String warehouse;

  @JacksonXmlProperty( localName = "Bin" )
  protected String bin;

  public int getSequenceNumber ()
  {
    return sequenceNumber;
  }

  public void setSequenceNumber ( final int sequenceNumber )
  {
    this.sequenceNumber = sequenceNumber;
  }

  public int getParentId ()
  {
    return parentId;
  }

  public void setParentId ( final int parentId )
  {
    this.parentId = parentId;
  }

  public int getQuantity ()
  {
    return quantity;
  }

  public void setQuantity ( final int quantity )
  {
    this.quantity = quantity;
  }

  public int getProductId ()
  {
    return productId;
  }

  public void setProductId ( final int productId )
  {
    this.productId = productId;
  }

  public int getItemId ()
  {
    return itemId;
  }

  public void setItemId ( final int itemId )
  {
    this.itemId = itemId;
  }

  public boolean isHidePrice ()
  {
    return hidePrice;
  }

  public void setHidePrice ( final boolean hidePrice )
  {
    this.hidePrice = hidePrice;
  }

  public boolean isHideItemId ()
  {
    return hideItemId;
  }

  public void setHideItemId ( final boolean hideItemId )
  {
    this.hideItemId = hideItemId;
  }

  public boolean isHideDescription ()
  {
    return hideDescription;
  }

  public void setHideDescription ( final boolean hideDescription )
  {
    this.hideDescription = hideDescription;
  }

  public boolean isHideQuantity ()
  {
    return hideQuantity;
  }

  public void setHideQuantity ( final boolean hideQuantity )
  {
    this.hideQuantity = hideQuantity;
  }

  public String getWarehouse ()
  {
    return warehouse;
  }

  public void setWarehouse ( final String warehouse )
  {
    this.warehouse = warehouse;
  }

  public String getBin ()
  {
    return bin;
  }

  public void setBin ( final String bin )
  {
    this.bin = bin;
  }
}
