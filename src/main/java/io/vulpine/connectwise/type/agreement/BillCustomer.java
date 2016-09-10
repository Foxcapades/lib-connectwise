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

public enum BillCustomer
{
  BILLABLE("Billable"),
  DO_NOT_BILL("DoNotBill"),
  NO_CHARGE("NoCharge");

  private final String value;

  BillCustomer ( String value )
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
  public static BillCustomer fromString ( final String value )
  {
    for ( BillCustomer bill : values() ) {
      if ( bill.value.equals(value) ) {
        return bill;
      }
    }

    return null;
  }
}
