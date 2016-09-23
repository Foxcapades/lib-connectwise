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
package io.vulpine.connectwise.type;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.util.Field;
import io.vulpine.connectwise.util.SimpleField;

import java.util.Date;

@JsonFilter( "filter-empty" )
public class ConnectwiseCommon < T extends ConnectwiseCommon >
{

  private Date lastUpdate;

  private Date lastUpdated;

  private Field < Integer > id = new SimpleField < Integer >("Id", false, true);

  private String description;

  private String updatedBy;


  @JsonGetter( "Id" )
  public Integer id()
  {
    return id.get();
  }

  @JsonSetter( "Id" )
  public ConnectwiseCommon<T> id( final Integer i )
  {
    id.set(i);

    return this;
  }

  @JsonGetter( "UpdatedBy" )
  public String updatedBy()
  {
    return updatedBy;
  }

  @JsonSetter( "UpdatedBy" )
  public ConnectwiseCommon updatedBy( String updatedBy )
  {
    this.updatedBy = updatedBy;

    return this;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonGetter( "LastUpdate" )
  public Date lastUpdate()
  {
    return null == this.lastUpdate ? null : new Date(this.lastUpdate.getTime());
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonSetter( "LastUpdate" )
  public ConnectwiseCommon lastUpdate( final Date lastUpdate )
  {
    this.lastUpdate = new Date(lastUpdate.getTime());

    return this;
  }

  @JsonGetter( "Description" )
  public String description()
  {
    return description;
  }

  @JsonSetter( "Description" )
  public ConnectwiseCommon description( final String description )
  {
    this.description = description;

    return this;
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonGetter( "LastUpdated" )
  public Date lastUpdated()
  {
    return null == this.lastUpdated ? null : new Date(this.lastUpdated.getTime());
  }

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss" )
  @JsonSetter( "LastUpdated" )
  public ConnectwiseCommon lastUpdated( final Date lastUpdated )
  {
    this.lastUpdated = new Date(lastUpdated.getTime());

    return this;
  }
}
