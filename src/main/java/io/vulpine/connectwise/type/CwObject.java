package io.vulpine.connectwise.type;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;

public class CwObject
{
  @JacksonXmlProperty ( localName = "Id" )
  protected int id;

  @JacksonXmlProperty ( localName = "UpdatedBy" )
  protected String updatedBy;

  @JacksonXmlProperty ( localName = "LastUpdate" )
  protected Date lastUpdate;

  @JacksonXmlProperty( localName = "LastUpdated" )
  protected Date lastUpdated;

  @JacksonXmlProperty( localName = "Description" )
  protected String Description;

  public int getId ()
  {
    return id;
  }

  public void setId ( final int id )
  {
    this.id = id;
  }

  public String getUpdatedBy ()
  {
    return updatedBy;
  }

  public void setUpdatedBy ( String updatedBy )
  {
    this.updatedBy = updatedBy;
  }

  public Date getLastUpdate ()
  {
    return lastUpdate;
  }

  public void setLastUpdate ( Date lastUpdate )
  {
    this.lastUpdate = lastUpdate;
  }

  public String getDescription ()
  {
    return Description;
  }

  public void setDescription ( String description )
  {
    Description = description;
  }

  public Date getLastUpdated ()
  {
    return lastUpdated;
  }

  public void setLastUpdated ( Date lastUpdated )
  {
    this.lastUpdated = lastUpdated;
  }
}
