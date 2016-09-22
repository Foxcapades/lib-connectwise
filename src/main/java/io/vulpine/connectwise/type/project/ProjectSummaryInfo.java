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

package io.vulpine.connectwise.type.project;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.ConnectwiseCommon;

import java.util.Date;

@SuppressWarnings( "unused" )
public class ProjectSummaryInfo extends ConnectwiseCommon
{
  @JacksonXmlProperty(localName = "ScheduledHours")
  protected Double scheduledHours;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty(localName = "ScheduledStart")
  protected Date scheduledStart;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty(localName = "ScheduledEnd")
  protected Date scheduledEnd;

  @JacksonXmlProperty(localName = "ActualHours")
  protected Double actualHours;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty(localName = "ActualStart")
  protected Date actualStart;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty(localName = "ActualEnd")
  protected Date actualEnd;

  @JacksonXmlProperty(localName = "BudgetHours")
  protected Double budgetHours;

  public Double getScheduledHours ()
  {
    return scheduledHours;
  }

  public void setScheduledHours ( final Double scheduledHours )
  {
    this.scheduledHours = scheduledHours;
  }

  public Date getScheduledStart ()
  {
    return scheduledStart;
  }

  public void setScheduledStart ( final Date scheduledStart )
  {
    this.scheduledStart = scheduledStart;
  }

  public Date getScheduledEnd ()
  {
    return scheduledEnd;
  }

  public void setScheduledEnd ( final Date scheduledEnd )
  {
    this.scheduledEnd = scheduledEnd;
  }

  public Double getActualHours ()
  {
    return actualHours;
  }

  public void setActualHours ( final Double actualHours )
  {
    this.actualHours = actualHours;
  }

  public Date getActualStart ()
  {
    return actualStart;
  }

  public void setActualStart ( final Date actualStart )
  {
    this.actualStart = actualStart;
  }

  public Date getActualEnd ()
  {
    return actualEnd;
  }

  public void setActualEnd ( final Date actualEnd )
  {
    this.actualEnd = actualEnd;
  }

  public Double getBudgetHours ()
  {
    return budgetHours;
  }

  public void setBudgetHours ( final Double budgetHours )
  {
    this.budgetHours = budgetHours;
  }
}
