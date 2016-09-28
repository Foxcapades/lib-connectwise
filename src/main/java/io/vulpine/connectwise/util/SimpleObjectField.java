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
package io.vulpine.connectwise.util;

import java.util.HashMap;
import java.util.Map;

/**
 * = Field
 *
 * @param <T> Type of this field
 *
 * @since 0.1.0
 * @version 1.0.0
 * @author https://github.com/elliefops[Elizabeth Harper]
 */
public class SimpleObjectField < T > implements Field < T >
{
  private boolean optional = true;

  private boolean nullable = true;

  private T value = null;

  private Map< String, String > attributes = new HashMap < String, String >();

  private String name = "";

  public SimpleObjectField()
  {
  }

  public SimpleObjectField( String name )
  {
    this.name = name;
  }

  public SimpleObjectField( String name, T value )
  {
    this.name = name;
    this.value = value;
  }

  public SimpleObjectField( String name , final boolean optional, final boolean nullable )
  {
    this.name = name;
    this.optional = optional;
    this.nullable = nullable;
  }

  @Override
  public boolean isOptional()
  {
    return optional;
  }

  @Override
  public Field < T > setOptional( final boolean optional )
  {
    this.optional = optional;

    return this;
  }

  @Override
  public boolean isNullable()
  {
    return nullable;
  }

  @Override
  public Field < T > setNullable( final boolean nullable )
  {
    this.nullable = nullable;

    return this;
  }

  @Override
  public Map < String, String > attributes()
  {
    return this.attributes;
  }

  @Override
  public T get()
  {
    return this.value;
  }

  @Override
  public Field < T > set( final T val )
  {
    this.value = val;

    return this;
  }

  @Override
  public Field < T > setAttribute( final String key, final String val )
  {
    this.attributes.put(key, val);

    return this;
  }

  @Override
  public String getName()
  {
    return name;
  }

  @Override
  public Field < T > setName( String name )
  {
    this.name = name;

    return this;
  }

  @Override
  public String toXml()
  {
    final StringBuilder builder;

    if (value == null) {
      if (optional) {
        return "";
      }

      return "<" + name + " />";
    }

    builder = new StringBuilder();
    builder.append("<").append(name);

    if (!attributes.isEmpty()) {
      for ( final Map.Entry < String, String > entry : attributes.entrySet() ) {
        builder.append(" ").append(entry.getKey()).append("=\"").append(entry.getValue()).append('"');
      }
    }

    builder.append('>').append(valueToXml()).append("</").append(name).append('>');

    return builder.toString();
  }

  protected Object valueToXml()
  {
    return value;
  }
}
