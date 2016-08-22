package io.vulpine.connectwise.type.project;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.ConnectwiseCommon;

import java.util.Date;

@SuppressWarnings( "unused" )
public class ProjectSummaryInfo extends ConnectwiseCommon
{
  @JacksonXmlProperty(localName = "ScheduledHours")
  protected double scheduledHours;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty(localName = "ScheduledStart")
  protected Date scheduledStart;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty(localName = "ScheduledEnd")
  protected Date scheduledEnd;

  @JacksonXmlProperty(localName = "ActualHours")
  protected double actualHours;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty(localName = "ActualStart")
  protected Date actualStart;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
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
