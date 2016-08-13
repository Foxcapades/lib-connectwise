package io.vulpine.connectwise.type.project;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.type.CwObject;

import java.util.Date;

@SuppressWarnings( "unused" )
public class ProjectSummaryInfo extends CwObject
{
  @JacksonXmlProperty(localName = "ScheduledHours")
  protected double scheduledHours;

  @JacksonXmlProperty(localName = "ScheduledStart")
  protected Date scheduledStart;

  @JacksonXmlProperty(localName = "ScheduledEnd")
  protected Date scheduledEnd;

  @JacksonXmlProperty(localName = "ActualHours")
  protected double actualHours;

  @JacksonXmlProperty(localName = "ActualStart")
  protected Date actualStart;

  @JacksonXmlProperty(localName = "ActualEnd")
  protected Date actualEnd;

  @JacksonXmlProperty(localName = "BudgetHours")
  protected double budgetHours;

  public double getScheduledHours ()
  {
    return scheduledHours;
  }

  public void setScheduledHours ( final double scheduledHours )
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

  public double getActualHours ()
  {
    return actualHours;
  }

  public void setActualHours ( final double actualHours )
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

  public double getBudgetHours ()
  {
    return budgetHours;
  }

  public void setBudgetHours ( final double budgetHours )
  {
    this.budgetHours = budgetHours;
  }
}
