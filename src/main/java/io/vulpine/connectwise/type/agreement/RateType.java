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
 * = Agreement Rate Type
 *
 * [source,xml]
 * .WSDL Definition
 * ----
 * <s:simpleType name="RateType">
 *   <s:restriction base="s:string">
 *     <s:enumeration value="AdjAmount"/>
 *     <s:enumeration value="Custom"/>
 *     <s:enumeration value="Multiplier"/>
 *   </s:restriction>
 * </s:simpleType>
 * ----
 *
 * @version 2.0.0
 * @since 0.0.5
 * @author https://github.com/EllieFops[Elizabeth Harper]
 */
public enum RateType
{
  ADJUSTMENT_AMOUNT("AdjAmount"),
  CUSTOM("Custom"),
  MULTIPLIER("Multiplier");

  private final String value;

  RateType ( String v )
  {
    this.value = v;
  }

  public String toString ()
  {
    return value;
  }

  public static RateType fromString( final String s )
  {
    for ( final RateType r : values() ) {
      if ( r.value.equals(s) ) {
        return r;
      }
    }
    return null;
  }
}
