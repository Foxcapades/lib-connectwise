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

package io.vulpine.connectwise.api.common.request;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.def.SubApiInterface;

import java.util.List;

@JsonFilter("filter-empty")
abstract public class FindRequest < T > extends CwRequest< T >
{
  @JacksonXmlProperty( localName = "conditions" )
  protected String conditions;

  @JacksonXmlProperty( localName = "orderBy" )
  protected String orderBy;

  @JacksonXmlProperty( localName = "limit" )
  protected int limit;

  @JacksonXmlProperty( localName = "skip" )
  protected int skip;

  @JacksonXmlProperty( localName = "returnFields" )
  protected List < String > returnFields;

  public FindRequest ( final Credentials credentials, final XmlMapper xmlMapper, final SubApiInterface api )
  {
    super(credentials, xmlMapper, api);
  }

  public String getConditions ()
  {
    return conditions;
  }

  public FindRequest < T > setConditions ( final String conditions )
  {
    this.conditions = conditions;
    return this;
  }

  public String getOrderBy ()
  {
    return orderBy;
  }

  public FindRequest < T > setOrderBy ( final String orderBy )
  {
    this.orderBy = orderBy;
    return this;
  }

  public int getLimit ()
  {
    return limit;
  }

  public FindRequest < T > setLimit ( final int limit )
  {
    this.limit = limit;
    return this;
  }

  public int getSkip ()
  {
    return skip;
  }

  public FindRequest < T >  setSkip ( final int skip )
  {
    this.skip = skip;
    return this;
  }

  public List < String > getReturnFields ()
  {
    return returnFields;
  }

  public FindRequest < T > setReturnFields ( final List < String > returnFields )
  {
    this.returnFields = returnFields;
    return this;
  }
}
