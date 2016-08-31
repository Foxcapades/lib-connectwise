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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.util.logging.LoggerInterface;
import io.vulpine.connectwise.util.logging.LoggerManager;

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

  @JsonIgnore
  protected final LoggerInterface logger;

  public ConnectwiseCommon()
  {
    logger = LoggerManager.getLogger("lib-connectwise");
  }


  public int getId ()
  {
    this.logger.trace(this.getClass());
    return id;
  }

  public void setId ( final int id )
  {
    this.logger.trace(this.getClass(), id);
    this.id = id;
  }

  public String getUpdatedBy ()
  {
    this.logger.trace(this.getClass());
    return updatedBy;
  }

  public void setUpdatedBy ( String updatedBy )
  {
    this.logger.trace(this.getClass(), updatedBy);
    this.updatedBy = updatedBy;
  }

  public Date getLastUpdate ()
  {
    this.logger.trace(this.getClass());
    return new Date(lastUpdate.getTime());
  }

  public void setLastUpdate ( final Date lastUpdate )
  {
    this.logger.trace(this.getClass(), lastUpdate);
    this.lastUpdate = new Date(lastUpdate.getTime());
  }

  public String getDescription ()
  {
    this.logger.trace(this.getClass());
    return description;
  }

  public void setDescription ( final String description )
  {
    this.logger.trace(this.getClass(), description);
    this.description = description;
  }

  public Date getLastUpdated ()
  {
    this.logger.trace(this.getClass());
    return new Date(lastUpdated.getTime());
  }

  public void setLastUpdated ( final Date lastUpdated )
  {
    this.logger.trace(this.getClass(), lastUpdated);
    this.lastUpdated = new Date(lastUpdated.getTime());
  }
}
