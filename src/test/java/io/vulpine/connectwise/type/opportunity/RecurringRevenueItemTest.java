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
package io.vulpine.connectwise.type.opportunity;

import de.bechte.junit.runners.context.HierarchicalContextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

@RunWith( HierarchicalContextRunner.class )
public class RecurringRevenueItemTest
{
  private static final double TEST_DOUBLE = 6.66;

  private static final String TEST_STRING = "TEST STRING VALUE.";

  private static final Date TEST_DATE = new Date();

  private RecurringRevenueItem item;

  @Before
  public void setUp() throws Exception
  {
    item = new RecurringRevenueItem();
  }

  public class RecurringRevenue
  {
    private final Field field;

    public RecurringRevenue() throws Exception
    {
      field = RecurringRevenueItem.class.getDeclaredField("recurringRevenue");
      field.setAccessible(true);
    }

    @Test
    public void getRecurringRevenue() throws Exception
    {
      field.set(item, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, item.getRecurringRevenue(), 0);
    }

    @Test
    public void setRecurringRevenue() throws Exception
    {
      item.setRecurringRevenue(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(item));
    }
  }

  public class RecurringCost
  {
    private final Field field;

    public RecurringCost() throws Exception
    {
      field = RecurringRevenueItem.class.getDeclaredField("recurringCost");
      field.setAccessible(true);
    }

    @Test
    public void getRecurringCost() throws Exception
    {
      field.set(item, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, item.getRecurringCost(), 0);
    }

    @Test
    public void setRecurringCost() throws Exception
    {
      item.setRecurringCost(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(item));
    }
  }

  public class CycleBasis
  {
    private final Field field;

    public CycleBasis() throws Exception
    {
      field = RecurringRevenueItem.class.getDeclaredField("cycleBasis");
      field.setAccessible(true);
    }

    @Test
    public void getCycleBasis() throws Exception
    {
      field.set(item, TEST_STRING);
      assertEquals(TEST_STRING, item.getCycleBasis());
    }

    @Test
    public void setCycleBasis() throws Exception
    {
      item.setCycleBasis(TEST_STRING);
      assertEquals(TEST_STRING, field.get(item));
    }
  }

  public class BillCycle
  {
    private final Field field;

    public BillCycle() throws Exception
    {
      field = RecurringRevenueItem.class.getDeclaredField("billCycle");
      field.setAccessible(true);
    }

    @Test
    public void getBillCycle() throws Exception
    {
      field.set(item, TEST_STRING);
      assertEquals(TEST_STRING, item.getBillCycle());
    }

    @Test
    public void setBillCycle() throws Exception
    {
      item.setBillCycle(TEST_STRING);
      assertEquals(TEST_STRING, field.get(item));
    }
  }

  public class RecurringEndDate
  {
    private final Field field;

    public RecurringEndDate() throws Exception
    {
      field = RecurringRevenueItem.class.getDeclaredField("recurringEndDate");
      field.setAccessible(true);
    }

    @Test
    public void getRecurringEndDate() throws Exception
    {
      field.set(item, TEST_DATE);
      assertSame(TEST_DATE, item.getRecurringEndDate());
    }

    @Test
    public void setRecurringEndDate() throws Exception
    {
      item.setRecurringEndDate(TEST_DATE);
      assertSame(TEST_DATE, field.get(item));
    }

  }

  public class RecurringStartDate
  {
    private final Field field;

    public RecurringStartDate() throws Exception
    {
      field = RecurringRevenueItem.class.getDeclaredField("recurringStartDate");
      field.setAccessible(true);
    }

    @Test
    public void getRecurringStartDate() throws Exception
    {
      field.set(item, TEST_DATE);
      assertSame(TEST_DATE, item.getRecurringStartDate());
    }

    @Test
    public void setRecurringStartDate() throws Exception
    {
      item.setRecurringStartDate(TEST_DATE);
      assertSame(TEST_DATE, field.get(item));
    }
  }
}
