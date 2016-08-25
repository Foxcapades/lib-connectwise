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

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class ForecastRevenueInfoTest
{
  private ForecastRevenueInfo item;

  @Before
  public void setUp() throws Exception
  {
    item = new ForecastRevenueInfo();
  }

  public class OpportunityId
  {
    private final Field prop;

    public OpportunityId() throws NoSuchFieldException
    {
      prop = ForecastRevenueInfo.class.getDeclaredField("opportunityId");
      prop.setAccessible(true);
    }

    @Test
    public void getOpportunityId() throws Exception
    {
      prop.set(item, 666);
      assertEquals(666, item.getOpportunityId());
    }

    @Test
    public void setOpportunityId() throws Exception
    {
      item.setOpportunityId(666);
      assertEquals(666, prop.get(item));
    }
  }

  public class ForecastItem
  {
    private final io.vulpine.connectwise.type.opportunity.ForecastItem test;
    private final Field prop;

    public ForecastItem() throws NoSuchFieldException
    {
      prop = ForecastRevenueInfo.class.getDeclaredField("forecastItem");
      test = new io.vulpine.connectwise.type.opportunity.ForecastItem();
      prop.setAccessible(true);
    }

    @Test
    public void getForecastItem() throws Exception
    {
      prop.set(item, test);
      assertSame(test, item.getForecastItem());
    }

    @Test
    public void setForecastItem() throws Exception
    {
      item.setForecastItem(test);
      assertSame(test, prop.get(item));
    }
  }

  public class RecurringRevenueItem
  {
    private final io.vulpine.connectwise.type.opportunity.RecurringRevenueItem test;
    private final Field prop;

    public RecurringRevenueItem() throws NoSuchFieldException
    {
      prop = ForecastRevenueInfo.class.getDeclaredField("recurringRevenueItem");
      test = new io.vulpine.connectwise.type.opportunity.RecurringRevenueItem();
      prop.setAccessible(true);
    }

    @Test
    public void getRecurringRevenueItem() throws Exception
    {
      prop.set(item, test);
      assertSame(test, item.getRecurringRevenueItem());
    }

    @Test
    public void setRecurringRevenueItem() throws Exception
    {
      item.setRecurringRevenueItem(test);
      assertSame(test, prop.get(item));
    }
  }

}
