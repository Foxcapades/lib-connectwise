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

import io.vulpine.connectwise.type.def.XmlSerializable;

import java.util.Map;

/**
 * = Field
 *
 * @param <T>
 *
 * @since 0.1.0
 * @version 1.0.0
 * @author https://github.com/elliefops[Elizabeth Harper]
 */
public interface Field < T > extends XmlSerializable
{
  String getName();

  Field < T > setName( String s );

  T get();

  Field < T > set( T val );

  boolean isNullable();

  Field < T > setNullable( boolean val );

  Map < String, String > attributes();

  Field < T > setAttribute( String key, String val );

  boolean isOptional();

  Field < T > setOptional( boolean val );

  String toXml();

  default String toXml( final String s ) { return toXml(); }
}
