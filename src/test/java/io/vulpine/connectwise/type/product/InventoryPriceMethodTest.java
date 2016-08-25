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