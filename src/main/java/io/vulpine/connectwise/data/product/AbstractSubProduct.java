package io.vulpine.connectwise.data.product;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.data.CwObject;

@SuppressWarnings( "unused" )
abstract class AbstractSubProduct extends CwObject
{
  @JacksonXmlProperty( localName = "ItemIdentifier" )
  protected String itemIdentifier;

  @JacksonXmlProperty( localName = "Cost" )
  protected double cost;

  @JacksonXmlProperty( localName = "Price" )
  protected double price;

  @JacksonXmlProperty( localName = "Taxable" )
  protected boolean taxable;

  @JacksonXmlProperty( localName = "Inactive" )
  protected boolean inactive;

  @JacksonXmlProperty( localName = "Serialized" )
  protected boolean serialized;

  public String getItemIdentifier ()
  {
    return itemIdentifier;
  }

  public void setItemIdentifier ( final String itemIdentifier )
  {
    this.itemIdentifier = itemIdentifier;
  }

  public double getCost ()
  {
    return cost;
  }

  public void setCost ( final double cost )
  {
    this.cost = cost;
  }

  public double getPrice ()
  {
    return price;
  }

  public void setPrice ( final double price )
  {
    this.price = price;
  }

  public boolean isTaxable ()
  {
    return taxable;
  }

  public void setTaxable ( final boolean taxable )
  {
    this.taxable = taxable;
  }

  public boolean isInactive ()
  {
    return inactive;
  }

  public void setInactive ( final boolean inactive )
  {
    this.inactive = inactive;
  }

  public boolean isSerialized ()
  {
    return serialized;
  }

  public void setSerialized ( final boolean serialized )
  {
    this.serialized = serialized;
  }
}
