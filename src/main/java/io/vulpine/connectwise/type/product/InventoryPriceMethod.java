package io.vulpine.connectwise.type.product;

public enum InventoryPriceMethod
{
  FLAT_RATE("FlatRate"),
  PERCENT_MARKUP_COST("PercentMarkupCost"),
  PERCENT_MARKDOWN_PRICE("PercentMarkdownPrice"),
  UNIT_PRICE("UnitPrice");

  private final String value;

  InventoryPriceMethod ( String value )
  {
    this.value = value;
  }

  @Override
  public String toString ()
  {
    return value;
  }

  public static InventoryPriceMethod fromString ( final String value )
  {
    for ( InventoryPriceMethod inv : values() ) {
      if ( inv.value.equals(value) ) {
        return inv;
      }
    }
    return null;
  }
}