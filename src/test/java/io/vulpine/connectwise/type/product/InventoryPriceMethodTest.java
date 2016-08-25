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

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class InventoryPriceMethodTest
{
  @Test
  public void toStringReturnsValue () throws Exception
  {
    final Field prop = InventoryPriceMethod.class.getDeclaredField("value");
    prop.setAccessible(true);

    for ( final InventoryPriceMethod m : InventoryPriceMethod.values() ) {
      assertEquals(prop.get(m), m.toString());
    }
  }

  @Test
  public void fromStringReturnsMatch() throws Exception
  {
    final Field prop = InventoryPriceMethod.class.getDeclaredField("value");
    prop.setAccessible(true);

    for ( final InventoryPriceMethod m : InventoryPriceMethod.values() ) {
      assertEquals(m, InventoryPriceMethod.fromString((String) prop.get(m)));
    }
  }

  @Test
  public void fromStringReturnsNullForNoMatch() throws Exception
  {
    assertNull(InventoryPriceMethod.fromString("Test value"));
  }
}
