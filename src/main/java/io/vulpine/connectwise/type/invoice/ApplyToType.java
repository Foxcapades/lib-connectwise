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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ApplyToType
{
  ALL("All"),
  AGREEMENT("Agreement"),
  PROJECT("Project"),
  PROJECT_PHASE("ProjectPhase"),
  SALES_ORDER("SalesOrder"),
  TICKET("Ticket");

  private final String value;

  ApplyToType( String value )
  {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString()
  {
    return value;
  }

  @JsonCreator
  public ApplyToType fromString( final String string )
  {
    for ( final ApplyToType type : values() )
      if (type.value.equals(string))
        return type;
    return null;
  }
}
