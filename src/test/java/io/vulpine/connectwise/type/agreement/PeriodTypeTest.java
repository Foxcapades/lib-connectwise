package io.vulpine.connectwise.type.agreement;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith( Parameterized.class )
public class PeriodTypeTest
{
  private static Field value;

  private final PeriodType type;

  public PeriodTypeTest ( PeriodType type )
  {
    this.type = type;
  }

  @BeforeClass
  public static void setUpClass() throws NoSuchFieldException
  {
    value = PeriodType.class.getDeclaredField("value");
    value.setAccessible(true);
  }

  @Parameters(name = "{index}: {0}")
  public static Object[] data()
  {
    return PeriodType.values();
  }

  @Test
  public void toString_returns_enum_value () throws Exception
  {
    assertEquals(value.get(type), type.toString());
  }

  @Test
  public void fromString_returns_enum_instance_by_value () throws Exception
  {
    assertEquals(type, PeriodType.fromString((String) value.get(type)));
  }

  @Test
  public void fromString_returns_null_on_unknown_value()
  {
    assertNull(PeriodType.fromString("asdl;fjfasd"));
  }

}