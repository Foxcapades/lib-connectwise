package io.vulpine.connectwise.type.time;

import de.bechte.junit.runners.context.HierarchicalContextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

@RunWith( HierarchicalContextRunner.class )
public class EntryTest
{
  private static final int TEST_INT = 666;
  private static final double TEST_DOUBLE = 66.6;

  private Entry timeEntry;

  @Before
  public void setUp()
  {
    timeEntry = new Entry();
  }

  public class Property_activityId
  {
    private final Field prop;

    public Property_activityId() throws NoSuchFieldException
    {
      prop = Entry.class.getDeclaredField("activityId");
      prop.setAccessible(true);
    }

    @Test
    public void updatable_by_setter() throws IllegalAccessException
    {
      timeEntry.activityId(TEST_INT);
      assertEquals(TEST_INT, prop.get(timeEntry));
    }

    @Test
    public void retrievable_by_getter() throws IllegalAccessException
    {
      prop.set(timeEntry, TEST_INT);
      assertEquals(TEST_INT, timeEntry.activityId());
    }
  }

  public class Property_actualHours
  {
    private final Field prop;

    public Property_actualHours() throws NoSuchFieldException
    {
      prop = Entry.class.getDeclaredField("actualHours");
      prop.setAccessible(true);
    }

    @Test
    public void updatable_by_setter() throws IllegalAccessException
    {
      timeEntry.actualHours(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, prop.get(timeEntry));
    }

    @Test
    public void retrievable_by_getter() throws IllegalAccessException
    {
      prop.set(timeEntry, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, timeEntry.actualHours(), 0);
    }
  }

  public class Property_addNotesToDetailDescription
  {
    private final Field prop;

    public Property_addNotesToDetailDescription() throws NoSuchFieldException
    {
      prop = Entry.class.getDeclaredField("addNotesToDetailDescription");
      prop.setAccessible(true);
    }

    @Test
    public void updatable_by_setter() throws IllegalAccessException
    {
      timeEntry.addNotesToDetailDescription(true);
      assertEquals(true, prop.get(timeEntry));
    }

    @Test
    public void retrievable_by_getter() throws IllegalAccessException
    {
      prop.set(timeEntry, false);
      assertEquals(false, timeEntry.addNotesToDetailDescription());
    }
  }

  public class Property_addNotesToInternalAnalysis
  {
    private final Field prop;

    public Property_addNotesToInternalAnalysis() throws NoSuchFieldException
    {
      prop = Entry.class.getDeclaredField("addNotesToInternalAnalysis");
      prop.setAccessible(true);
    }

    @Test
    public void updatable_by_setter() throws IllegalAccessException
    {
      timeEntry.addNotesToInternalAnalysis(true);
      assertEquals(true, prop.get(timeEntry));
    }

    @Test
    public void retrievable_by_getter() throws IllegalAccessException
    {
      prop.set(timeEntry, false);
      assertEquals(false, timeEntry.addNotesToInternalAnalysis());
    }
  }

  public class Property_addNotesToResolution
  {
    private final Field prop;

    public Property_addNotesToResolution() throws NoSuchFieldException
    {
      prop = Entry.class.getDeclaredField("addNotesToResolution");
      prop.setAccessible(true);
    }

    @Test
    public void updatable_by_setter() throws IllegalAccessException
    {
      timeEntry.addNotesToResolution(true);
      assertEquals(true, prop.get(timeEntry));
    }

    @Test
    public void retrievable_by_getter() throws IllegalAccessException
    {
      prop.set(timeEntry, false);
      assertEquals(false, timeEntry.addNotesToResolution());
    }
  }

  public class Property_agreementId
  {
    private final Field prop;

    public Property_agreementId() throws NoSuchFieldException
    {
      prop = Entry.class.getDeclaredField("agreementId");
      prop.setAccessible(true);
    }

    @Test
    public void updatable_by_setter() throws IllegalAccessException
    {
      timeEntry.agreementId(777);
      assertEquals(777, prop.get(timeEntry));
    }

    @Test
    public void retrievable_by_getter() throws IllegalAccessException
    {
      prop.set(timeEntry, 888);
      assertEquals(888, timeEntry.agreementId());
    }
  }

  public class Property_chargeCode
  {
    private final Field prop;

    public Property_chargeCode() throws NoSuchFieldException
    {
      prop = Entry.class.getDeclaredField("chargeCode");
      prop.setAccessible(true);
    }

    @Test
    public void updatable_by_setter() throws IllegalAccessException
    {
      timeEntry.chargeCode("TEST STRING");
      assertEquals("TEST STRING", prop.get(timeEntry));
    }

    @Test
    public void retrievable_by_getter() throws IllegalAccessException
    {
      prop.set(timeEntry, "TEST STRING");
      assertEquals("TEST STRING", timeEntry.chargeCode());
    }
  }
}
