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

@JacksonXmlRootElement( localName = "ForecastItem" )
public class ForecastItem
{
  @JacksonXmlProperty( localName = "ForecastType" )
  protected String  forecastType;

  @JacksonXmlProperty( localName = "Cost" )
  protected double  cost;

  @JacksonXmlProperty( localName = "Revenue" )
  protected double  revenue;

  @JacksonXmlProperty( localName = "Included" )
  protected boolean included;

  @JacksonXmlProperty( localName = "Description" )
  protected String  description;

  @JacksonXmlProperty( localName = "Linked" )
  protected boolean linked;

  @JacksonXmlProperty( localName = "QuoteNumber" )
  protected String  quoteNumber;

  @JacksonXmlProperty( localName = "QuoteName" )
  protected String  quoteName;

  @JacksonXmlProperty( localName = "Status" )
  protected String  status;

  public String getForecastType()
  {
    return forecastType;
  }

  public void setForecastType( final String forecastType )
  {
    this.forecastType = forecastType;
  }

  public double getCost()
  {
    return cost;
  }

  public void setCost( final double cost )
  {
    this.cost = cost;
  }

  public double getRevenue()
  {
    return revenue;
  }

  public void setRevenue( final double revenue )
  {
    this.revenue = revenue;
  }

  public boolean isIncluded()
  {
    return included;
  }

  public void setIncluded( final boolean included )
  {
    this.included = included;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription( final String description )
  {
    this.description = description;
  }

  public boolean isLinked()
  {
    return linked;
  }

  public void setLinked( final boolean linked )
  {
    this.linked = linked;
  }

  public String getQuoteNumber()
  {
    return quoteNumber;
  }

  public void setQuoteNumber( final String quoteNumber )
  {
    this.quoteNumber = quoteNumber;
  }

  public String getQuoteName()
  {
    return quoteName;
  }

  public void setQuoteName( final String quoteName )
  {
    this.quoteName = quoteName;
  }

  public String getStatus()
  {
    return status;
  }

  public void setStatus( final String status )
  {
    this.status = status;
  }
}
