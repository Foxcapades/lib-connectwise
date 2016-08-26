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

import com.fasterxml.jackson.annotation.JsonCreator;

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

  @JsonCreator
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
