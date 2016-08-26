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

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.type.ConnectwiseCommon;

@JacksonXmlRootElement( localName = "ForecastRevenueInfo" )
public class ForecastRevenueInfo extends ConnectwiseCommon
{
  @JacksonXmlProperty( localName = "OpportunityId" )
  protected int opportunityId;

  @JacksonXmlProperty( localName = "ForecastItem" )
  protected ForecastItem forecastItem;

  @JacksonXmlProperty( localName = "RecurringRevenueItem" )
  protected RecurringRevenueItem recurringRevenueItem;

  public int getOpportunityId()
  {
    return opportunityId;
  }

  public void setOpportunityId( final int opportunityId )
  {
    this.opportunityId = opportunityId;
  }

  public ForecastItem getForecastItem()
  {
    return forecastItem;
  }

  public void setForecastItem( final ForecastItem forecastItem )
  {
    this.forecastItem = forecastItem;
  }

  public RecurringRevenueItem getRecurringRevenueItem()
  {
    return recurringRevenueItem;
  }

  public void setRecurringRevenueItem( final RecurringRevenueItem recurringRevenueItem )
  {
    this.recurringRevenueItem = recurringRevenueItem;
  }
}
