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

import static org.junit.Assert.assertEquals;

@RunWith( HierarchicalContextRunner.class )
public class ForecastItemTest
{
  private static final String TEST_STRING = "Test string value.";
  private static final double TEST_DOUBLE = 66.6;

  private ForecastItem item;

  @Before
  public void setUp() throws Exception
  {
    item = new ForecastItem();
  }

  public class ForecastType
  {
    private final Field field;

    public ForecastType() throws Exception
    {
      field = ForecastItem.class.getDeclaredField("forecastType");
      field.setAccessible(true);
    }

    @Test
    public void getForecastType() throws Exception
    {
      field.set(item, TEST_STRING);
      assertEquals(TEST_STRING, item.getForecastType());
    }

    @Test
    public void setForecastType() throws Exception
    {
      item.setForecastType(TEST_STRING);
      assertEquals(TEST_STRING, field.get(item));
    }
  }

  public class Cost
  {
    private final Field field;

    public Cost() throws Exception
    {
      field = ForecastItem.class.getDeclaredField("cost");
      field.setAccessible(true);
    }

    @Test
    public void getCost() throws Exception
    {
      field.set(item, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, item.getCost(), 0);
    }

    @Test
    public void setCost() throws Exception
    {
      item.setCost(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(item));
    }
  }

  public class Revenue
  {
    private final Field field;

    public Revenue() throws Exception
    {
      field = ForecastItem.class.getDeclaredField("revenue");
      field.setAccessible(true);
    }

    @Test
    public void getRevenue() throws Exception
    {
      field.set(item, TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, item.getRevenue(), 0);
    }

    @Test
    public void setRevenue() throws Exception
    {
      item.setRevenue(TEST_DOUBLE);
      assertEquals(TEST_DOUBLE, field.get(item));
    }
  }

  public class Included
  {
    private final Field field;

    public Included() throws Exception
    {
      field = ForecastItem.class.getDeclaredField("included");
      field.setAccessible(true);
    }

    @Test
    public void isIncluded() throws Exception
    {
      field.set(item, true);
      assertEquals(true, item.isIncluded());
    }

    @Test
    public void setIncluded() throws Exception
    {
      item.setIncluded(true);
      assertEquals(true, field.get(item));
    }
  }

  public class Description
  {
    private final Field field;

    public Description() throws Exception
    {
      field = ForecastItem.class.getDeclaredField("description");
      field.setAccessible(true);
    }

    @Test
    public void getDescription() throws Exception
    {
      field.set(item, TEST_STRING);
      assertEquals(TEST_STRING, item.getDescription());
    }

    @Test
    public void setDescription() throws Exception
    {
      item.setDescription(TEST_STRING);
      assertEquals(TEST_STRING, field.get(item));
    }
  }

  public class Linked
  {
    private final Field field;

    public Linked() throws Exception
    {
      field = ForecastItem.class.getDeclaredField("linked");
      field.setAccessible(true);
    }

    @Test
    public void isLinked() throws Exception
    {
      field.set(item, true);
      assertEquals(true, item.isLinked());
    }

    @Test
    public void setLinked() throws Exception
    {
      item.setLinked(true);
      assertEquals(true, field.get(item));
    }
  }

  public class QuoteNumber
  {
    private final Field field;

    public QuoteNumber() throws Exception
    {
      field = ForecastItem.class.getDeclaredField("quoteNumber");
      field.setAccessible(true);
    }

    @Test
    public void getQuoteNumber() throws Exception
    {
      field.set(item, TEST_STRING);
      assertEquals(TEST_STRING, item.getQuoteNumber());
    }

    @Test
    public void setQuoteNumber() throws Exception
    {
      item.setQuoteNumber(TEST_STRING);
      assertEquals(TEST_STRING, field.get(item));
    }
  }

  public class QuoteName
  {
    private final Field field;

    public QuoteName() throws Exception
    {
      field = ForecastItem.class.getDeclaredField("quoteName");
      field.setAccessible(true);
    }

    @Test
    public void getQuoteName() throws Exception
    {
      field.set(item, TEST_STRING);
      assertEquals(TEST_STRING, item.getQuoteName());
    }

    @Test
    public void setQuoteName() throws Exception
    {
      item.setQuoteName(TEST_STRING);
      assertEquals(TEST_STRING, field.get(item));
    }
  }

  public class Status
  {
    private final Field field;

    public Status() throws Exception
    {
      field = ForecastItem.class.getDeclaredField("status");
      field.setAccessible(true);
    }

    @Test
    public void getStatus() throws Exception
    {
      field.set(item, TEST_STRING);
      assertEquals(TEST_STRING, item.getStatus());
    }

    @Test
    public void setStatus() throws Exception
    {
      item.setStatus(TEST_STRING);
      assertEquals(TEST_STRING, field.get(item));
    }
  }
}
