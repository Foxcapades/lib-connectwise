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

@SuppressWarnings( "unused" )
public class Component extends ProductCommon
{
  @JacksonXmlProperty( localName = "SequenceNumber" )
  protected Integer sequenceNumber;

  @JacksonXmlProperty( localName = "ParentId" )
  protected Integer parentId;

  @JacksonXmlProperty( localName = "Quantity" )
  protected Integer quantity;

  @JacksonXmlProperty( localName = "ProductId" )
  protected Integer productId;

  @JacksonXmlProperty( localName = "ItemId" )
  protected Integer itemId;

  @JacksonXmlProperty( localName = "HidePrice" )
  protected Boolean hidePrice;

  @JacksonXmlProperty( localName = "HideItemId" )
  protected Boolean hideItemId;

  @JacksonXmlProperty( localName = "HideDescription" )
  protected Boolean hideDescription;

  @JacksonXmlProperty( localName = "HideQuantity" )
  protected Boolean hideQuantity;

  @JacksonXmlProperty( localName = "Warehouse" )
  protected String warehouse;

  @JacksonXmlProperty( localName = "Bin" )
  protected String bin;

  public Integer getSequenceNumber ()
  {
    return sequenceNumber;
  }

  public void setSequenceNumber ( final Integer sequenceNumber )
  {
    this.sequenceNumber = sequenceNumber;
  }

  public Integer getParentId ()
  {
    return parentId;
  }

  public void setParentId ( final Integer parentId )
  {
    this.parentId = parentId;
  }

  public Integer getQuantity ()
  {
    return quantity;
  }

  public void setQuantity ( final Integer quantity )
  {
    this.quantity = quantity;
  }

  public Integer getProductId ()
  {
    return productId;
  }

  public void setProductId ( final Integer productId )
  {
    this.productId = productId;
  }

  public Integer getItemId ()
  {
    return itemId;
  }

  public void setItemId ( final Integer itemId )
  {
    this.itemId = itemId;
  }

  public Boolean isHidePrice ()
  {
    return hidePrice;
  }

  public void setHidePrice ( final Boolean hidePrice )
  {
    this.hidePrice = hidePrice;
  }

  public Boolean isHideItemId ()
  {
    return hideItemId;
  }

  public void setHideItemId ( final Boolean hideItemId )
  {
    this.hideItemId = hideItemId;
  }

  public Boolean isHideDescription ()
  {
    return hideDescription;
  }

  public void setHideDescription ( final Boolean hideDescription )
  {
    this.hideDescription = hideDescription;
  }

  public Boolean isHideQuantity ()
  {
    return hideQuantity;
  }

  public void setHideQuantity ( final Boolean hideQuantity )
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
