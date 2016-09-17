package io.vulpine.connectwise.type.invoice;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.ConnectwiseCommon;

@JsonIgnoreProperties( { "LastUpdate", "LastUpdated", "UpdatedBy" } )
public class BundleComponent extends ConnectwiseCommon
{
  private int sequenceNumber;

  private int parentId;

  private int quantity;

  private int productId;

  private int itemId;

  private boolean hidePrice;

  private boolean hideItemId;

  private boolean hideDescription;

  private boolean hideQuantity;

  private String warehouse;

  private String bin;

  private String itemIdentifier;

  private double cost;

  private double price;

  private boolean taxable;

  private boolean inactive;

  private boolean serialized;

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
  public double cost()
  {
    return this.cost;
  }

  @JsonSetter( "Cost" )
  public void cost( final double cost )
  {
    this.cost = cost;
  }

  @JsonGetter( "HideDescription" )
  public boolean hideDescription()
  {
    return this.hideDescription;
  }

  @JsonSetter( "HideDescription" )
  public void hideDescription( final boolean hideDescription )
  {
    this.hideDescription = hideDescription;
  }

  @JsonGetter( "HideItemId" )
  public boolean hideItemId()
  {
    return this.hideItemId;
  }

  @JsonSetter( "HideItemId" )
  public void hideItemId( final boolean hideItemId )
  {
    this.hideItemId = hideItemId;
  }

  @JsonGetter( "HidePrice" )
  public boolean hidePrice()
  {
    return this.hidePrice;
  }

  @JsonSetter( "HidePrice" )
  public void hidePrice( final boolean hidePrice )
  {
    this.hidePrice = hidePrice;
  }

  @JsonGetter( "HideQuantity" )
  public boolean hideQuantity()
  {
    return this.hideQuantity;
  }

  @JsonSetter( "HideQuantity" )
  public void hideQuantity( final boolean hideQuantity )
  {
    this.hideQuantity = hideQuantity;
  }

  @JsonGetter( "Inactive" )
  public boolean inactive()
  {
    return this.inactive;
  }

  @JsonSetter( "Inactive" )
  public void inactive( final boolean inactive )
  {
    this.inactive = inactive;
  }

  @JsonGetter( "ItemId" )
  public int itemId()
  {
    return this.itemId;
  }

  @JsonSetter( "ItemId" )
  public void itemId( final int itemId )
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
  public int parentId()
  {
    return this.parentId;
  }

  @JsonSetter( "ParentId" )
  public void parentId( final int parentId )
  {
    this.parentId = parentId;
  }

  @JsonGetter( "Price" )
  public double price()
  {
    return this.price;
  }

  @JsonSetter( "Price" )
  public void price( final double price )
  {
    this.price = price;
  }

  @JsonGetter( "ProductId" )
  public int productId()
  {
    return this.productId;
  }

  @JsonSetter( "ProductId" )
  public void productId( final int productId )
  {
    this.productId = productId;
  }

  @JsonGetter( "Quantity" )
  public int quantity()
  {
    return this.quantity;
  }

  @JsonSetter( "Quantity" )
  public void quantity( final int quantity )
  {
    this.quantity = quantity;
  }

  @JsonGetter( "SequenceNumber" )
  public int sequenceNumber()
  {
    return this.sequenceNumber;
  }

  @JsonSetter( "SequenceNumber" )
  public void sequenceNumber( final int sequenceNumber )
  {
    this.sequenceNumber = sequenceNumber;
  }

  @JsonGetter( "Serialized" )
  public boolean serialized()
  {
    return this.serialized;
  }

  @JsonSetter( "Serialized" )
  public void serialized( final boolean serialized )
  {
    this.serialized = serialized;
  }

  @JsonGetter( "Taxable" )
  public boolean taxable()
  {
    return this.taxable;
  }

  @JsonSetter( "Taxable" )
  public void taxable( final boolean taxable )
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
