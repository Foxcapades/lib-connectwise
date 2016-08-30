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
 *
 */
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
    return new Date(lastUpdate.getTime());
  }

  public void setLastUpdate ( final Date lastUpdate )
  {
    this.lastUpdate = new Date(lastUpdate.getTime());
  }

  public String getDescription ()
  {
    return description;
  }

  public void setDescription ( final String description )
  {
    this.description = description;
  }

  public Date getLastUpdated ()
  {
    return new Date(lastUpdated.getTime());
  }

  public void setLastUpdated ( final Date lastUpdated )
  {
    this.lastUpdated = new Date(lastUpdated.getTime());
  }
}
