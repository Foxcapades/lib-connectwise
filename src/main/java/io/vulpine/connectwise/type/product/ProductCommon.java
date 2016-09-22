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

import io.vulpine.connectwise.type.ConnectwiseCommon;

public class ProductCommon extends ConnectwiseCommon
{
  @JacksonXmlProperty( localName = "ItemIdentifier" )
  protected String itemIdentifier;

  @JacksonXmlProperty( localName = "Cost" )
  protected Double cost;

  @JacksonXmlProperty( localName = "Price" )
  protected Double price;

  @JacksonXmlProperty( localName = "Taxable" )
  protected Boolean taxable;

  @JacksonXmlProperty( localName = "Inactive" )
  protected Boolean inactive;

  @JacksonXmlProperty( localName = "Serialized" )
  protected Boolean serialized;

  public String getItemIdentifier ()
  {
    return itemIdentifier;
  }

  public void setItemIdentifier ( final String itemIdentifier )
  {
    this.itemIdentifier = itemIdentifier;
  }

  public Double getCost ()
  {
    return cost;
  }

  public void setCost ( final Double cost )
  {
    this.cost = cost;
  }

  public Double getPrice ()
  {
    return price;
  }

  public void setPrice ( final Double price )
  {
    this.price = price;
  }

  public Boolean isTaxable ()
  {
    return taxable;
  }

  public void setTaxable ( final Boolean taxable )
  {
    this.taxable = taxable;
  }

  public Boolean isInactive ()
  {
    return inactive;
  }

  public void setInactive ( final Boolean inactive )
  {
    this.inactive = inactive;
  }

  public Boolean isSerialized ()
  {
    return serialized;
  }

  public void setSerialized ( final Boolean serialized )
  {
    this.serialized = serialized;
  }
}
