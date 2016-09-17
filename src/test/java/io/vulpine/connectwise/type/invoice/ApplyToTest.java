package io.vulpine.connectwise.type.invoice;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class ApplyToTest
{
  private final Field field;
  private final ApplyTo applyTo;

  public ApplyToTest() throws NoSuchFieldException
  {
    field = ApplyTo.class.getDeclaredField("type");
    field.setAccessible(true);
    applyTo = new ApplyTo();
  }

  @Test
  public void get_type() throws Exception
  {
    field.set(applyTo, ApplyToType.AGREEMENT);
    assertSame(ApplyToType.AGREEMENT, applyTo.type());
  }

  @Test
  public void set_type() throws Exception
  {
    applyTo.type(ApplyToType.PROJECT_PHASE);
    assertSame(ApplyToType.PROJECT_PHASE, field.get(applyTo));
  }

}