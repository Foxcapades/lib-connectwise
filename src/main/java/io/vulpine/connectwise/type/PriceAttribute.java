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
package io.vulpine.connectwise.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PriceAttribute
{
  FIXED_FEE("FixedFee"),
  NOT_TO_EXCEED("NotToExceed"),
  TIME_AND_MATERIALS("TimeAndMaterials"),
  OVERRIDE_RATE("OverrideRate");

  private final String value;

  PriceAttribute ( String value )
  {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString ()
  {
    return this.value;
  }

  @JsonCreator
  public static PriceAttribute fromString( final String value )
  {
    for ( PriceAttribute pri : values() ) {
      if ( pri.value.equals(value) ) {
        return pri;
      }
    }
    return null;
  }
}
