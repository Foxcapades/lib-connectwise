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
package io.vulpine.connectwise.type.agreement;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum InvoicingCycle
{
  CALENDAR_YEAR("CalendarYear"),
  CONTRACT_YEAR("ContractYear");

  private final String value;

  InvoicingCycle ( String v ) {this.value = v;}

  @JsonCreator
  public static InvoicingCycle fromString( final String v )
  {
    for ( final InvoicingCycle i : values() ) {
      if ( i.value.equals(v) ) {
        return i;
      }
    }
    return null;
  }


  @Override
  public String toString()
  {
    return value;
  }
}
