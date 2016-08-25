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

import io.vulpine.connectwise.type.ConnectwiseCommon;

class _Common extends ConnectwiseCommon
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
