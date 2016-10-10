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

/**
 * = Billable Option Enumeration
 *
 * [source,xml]
 * AgreementApi WSDL Definition
 * ----
 * <s:simpleType name="BillableOptions">
 *   <s:restriction base="s:string">
 *     <s:enumeration value="Billable"/>
 *     <s:enumeration value="DoNotBill"/>
 *     <s:enumeration value="NoCharge"/>
 *     <s:enumeration value="NoDefault"/>
 *   </s:restriction>
 * </s:simpleType>
 * ----
 *
 * @version 2.0.0
 * @since 0.0.5
 * @author https://github.com/EllieFops[Elizabeth Harper]
 */
public enum BillableOption
{
  BILLABLE("Billable"),
  DO_NOT_BILL("DoNotBill"),
  NO_CHARGE("NoCharge"),
  NO_DEFAULT("NoDefault");

  private final String value;

  BillableOption ( String value )
  {
    this.value = value;
  }

  public String toString ()
  {
    return value;
  }

  public static BillableOption fromString( final String value )
  {
    for ( final BillableOption opt : values() ) {
      if ( opt.value.equals(value) ) {
        return opt;
      }
    }
    return null;
  }
}
