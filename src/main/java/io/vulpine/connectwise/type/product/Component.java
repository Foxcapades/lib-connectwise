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

package io.vulpine.connectwise.type.product;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@SuppressWarnings( "unused" )
public class Component extends _Common
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
