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

import java.util.Date;

@JacksonXmlRootElement( localName = "RecurringRevenueItem" )
public class RecurringRevenueItem
{
  @JacksonXmlProperty( localName = "RecurringRevenue" )
  protected Double recurringRevenue;

  @JacksonXmlProperty( localName = "RecurringCost" )
  protected Double recurringCost;

  @JacksonXmlProperty( localName = "CycleBasis" )
  protected String cycleBasis;

  @JacksonXmlProperty( localName = "BillCycle" )
  protected String billCycle;

  @JacksonXmlProperty( localName = "RecurringEndDate" )
  protected Date recurringEndDate;

  @JacksonXmlProperty( localName = "RecurringStartDate" )
  protected Date recurringStartDate;

  public Double getRecurringRevenue()
  {
    return recurringRevenue;
  }

  public void setRecurringRevenue( final Double recurringRevenue )
  {
    this.recurringRevenue = recurringRevenue;
  }

  public Double getRecurringCost()
  {
    return recurringCost;
  }

  public void setRecurringCost( final Double recurringCost )
  {
    this.recurringCost = recurringCost;
  }

  public String getCycleBasis()
  {
    return cycleBasis;
  }

  public void setCycleBasis( final String cycleBasis )
  {
    this.cycleBasis = cycleBasis;
  }

  public String getBillCycle()
  {
    return billCycle;
  }

  public void setBillCycle( final String billCycle )
  {
    this.billCycle = billCycle;
  }

  public Date getRecurringEndDate()
  {
    return recurringEndDate;
  }

  public void setRecurringEndDate( final Date recurringEndDate )
  {
    this.recurringEndDate = recurringEndDate;
  }

  public Date getRecurringStartDate()
  {
    return recurringStartDate;
  }

  public void setRecurringStartDate( final Date recurringStartDate )
  {
    this.recurringStartDate = recurringStartDate;
  }
}
