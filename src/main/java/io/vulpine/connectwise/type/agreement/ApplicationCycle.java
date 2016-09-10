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
package io.vulpine.connectwise.type.agreement;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ApplicationCycle
{
  CONTRACT_2_WEEKS("Contract2Weeks"),
  CONTRACT_4_WEEKS("Contract4Weeks"),
  CONTRACT_YEAR("ContractYear"),
  CALENDAR_MONTH("CalendarMonth"),
  CALENDAR_QUARTER("CalendarQuarter"),
  CALENDAR_WEEK("CalendarWeek"),
  CONTRACT_QUARTER("ContractQuarter"),
  CALENDAR_YEAR("CalendarYear");

  private final String value;

  ApplicationCycle ( String value ) { this.value = value; }

  @Override
  @JsonValue
  public String toString () { return value; }

  @JsonCreator
  public static ApplicationCycle fromString ( final String value )
  {
    for ( final ApplicationCycle ac : ApplicationCycle.values() ) if ( ac.value.equals(value) ) return ac;
    return null;
  }
}
