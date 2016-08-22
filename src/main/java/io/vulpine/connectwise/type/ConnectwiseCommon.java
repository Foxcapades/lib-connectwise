package io.vulpine.connectwise.type;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;

public class ConnectwiseCommon
{
  @JacksonXmlProperty ( localName = "Id" )
  protected int id;

  @JacksonXmlProperty ( localName = "UpdatedBy" )
  protected String updatedBy;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty ( localName = "LastUpdate" )
  protected Date lastUpdate;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty( localName = "LastUpdated" )
  protected Date lastUpdated;

  @JacksonXmlProperty( localName = "Description" )
  protected String description;

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
    return description;
  }

  public void setDescription ( String description )
  {
    this.description = description;
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
