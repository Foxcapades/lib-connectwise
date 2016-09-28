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
package io.vulpine.connectwise.type.invoice;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.ConnectwiseCommon;

@JsonIgnoreProperties( { "LastUpdate", "LastUpdated", "UpdatedBy" } )
public class BundleComponent extends ConnectwiseCommon
{
  private Integer sequenceNumber;

  private Integer parentId;

  private Integer quantity;

  private Integer productId;

  private Integer itemId;

  private Boolean hidePrice;

  private Boolean hideItemId;

  private Boolean hideDescription;

  private Boolean hideQuantity;

  private String warehouse;

  private String bin;

  private String itemIdentifier;

  private Double cost;

  private Double price;

  private Boolean taxable;

  private Boolean inactive;

  private Boolean serialized;

  @JsonGetter( "Bin" )
  public String bin()
  {
    return this.bin;
  }

  @JsonSetter( "Bin" )
  public void bin( final String bin )
  {
    this.bin = bin;
  }

  @JsonGetter( "Cost" )
  public Double cost()
  {
    return this.cost;
  }

  @JsonSetter( "Cost" )
  public void cost( final Double cost )
  {
    this.cost = cost;
  }

  @JsonGetter( "HideDescription" )
  public Boolean hideDescription()
  {
    return this.hideDescription;
  }

  @JsonSetter( "HideDescription" )
  public void hideDescription( final Boolean hideDescription )
  {
    this.hideDescription = hideDescription;
  }

  @JsonGetter( "HideItemId" )
  public Boolean hideItemId()
  {
    return this.hideItemId;
  }

  @JsonSetter( "HideItemId" )
  public void hideItemId( final Boolean hideItemId )
  {
    this.hideItemId = hideItemId;
  }

  @JsonGetter( "HidePrice" )
  public Boolean hidePrice()
  {
    return this.hidePrice;
  }

  @JsonSetter( "HidePrice" )
  public void hidePrice( final Boolean hidePrice )
  {
    this.hidePrice = hidePrice;
  }

  @JsonGetter( "HideQuantity" )
  public Boolean hideQuantity()
  {
    return this.hideQuantity;
  }

  @JsonSetter( "HideQuantity" )
  public void hideQuantity( final Boolean hideQuantity )
  {
    this.hideQuantity = hideQuantity;
  }

  @JsonGetter( "Inactive" )
  public Boolean inactive()
  {
    return this.inactive;
  }

  @JsonSetter( "Inactive" )
  public void inactive( final Boolean inactive )
  {
    this.inactive = inactive;
  }

  @JsonGetter( "ItemId" )
  public Integer itemId()
  {
    return this.itemId;
  }

  @JsonSetter( "ItemId" )
  public void itemId( final Integer itemId )
  {
    this.itemId = itemId;
  }

  @JsonGetter( "ItemIdentifier" )
  public String itemIdentifier()
  {
    return this.itemIdentifier;
  }

  @JsonSetter( "ItemIdentifier" )
  public void itemIdentifier( final String itemIdentifier )
  {
    this.itemIdentifier = itemIdentifier;
  }

  @JsonGetter( "ParentId" )
  public Integer parentId()
  {
    return this.parentId;
  }

  @JsonSetter( "ParentId" )
  public void parentId( final Integer parentId )
  {
    this.parentId = parentId;
  }

  @JsonGetter( "Price" )
  public Double price()
  {
    return this.price;
  }

  @JsonSetter( "Price" )
  public void price( final Double price )
  {
    this.price = price;
  }

  @JsonGetter( "ProductId" )
  public Integer productId()
  {
    return this.productId;
  }

  @JsonSetter( "ProductId" )
  public void productId( final Integer productId )
  {
    this.productId = productId;
  }

  @JsonGetter( "Quantity" )
  public Integer quantity()
  {
    return this.quantity;
  }

  @JsonSetter( "Quantity" )
  public void quantity( final Integer quantity )
  {
    this.quantity = quantity;
  }

  @JsonGetter( "SequenceNumber" )
  public Integer sequenceNumber()
  {
    return this.sequenceNumber;
  }

  @JsonSetter( "SequenceNumber" )
  public void sequenceNumber( final Integer sequenceNumber )
  {
    this.sequenceNumber = sequenceNumber;
  }

  @JsonGetter( "Serialized" )
  public Boolean serialized()
  {
    return this.serialized;
  }

  @JsonSetter( "Serialized" )
  public void serialized( final Boolean serialized )
  {
    this.serialized = serialized;
  }

  @JsonGetter( "Taxable" )
  public Boolean taxable()
  {
    return this.taxable;
  }

  @JsonSetter( "Taxable" )
  public void taxable( final Boolean taxable )
  {
    this.taxable = taxable;
  }

  @JsonGetter( "Warehouse" )
  public String warehouse()
  {
    return this.warehouse;
  }

  @JsonSetter( "Warehouse" )
  public void warehouse( final String warehouse )
  {
    this.warehouse = warehouse;
  }

}
