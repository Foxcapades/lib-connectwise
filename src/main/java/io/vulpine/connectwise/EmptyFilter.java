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
package io.vulpine.connectwise;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;

import java.lang.reflect.Method;

public class EmptyFilter implements PropertyFilter
{
  @Override
  public void serializeAsField (
    final Object pojo, final JsonGenerator jgen, final SerializerProvider prov, final PropertyWriter writer
  ) throws Exception
  {
    if (!(writer.getMember().getMember() instanceof Method)) return;

    final Method m = (Method) writer.getMember().getMember();

    String s1 = writer.getType().getRawClass().getSimpleName();

    if ( "String".equals(s1) ) {

      final String s = (String) m.invoke(pojo);
      if (null == s || s.isEmpty()) return;

    } else if ( "int".equals(s1) ) {

      final int i = (Integer) m.invoke(pojo);
      if (i < 1) return;

    } else {

      final Object o = m.invoke(pojo);
      if (null == o) return;

    }

    writer.serializeAsField(pojo, jgen, prov);
  }

  @Override
  public void serializeAsElement (
    final Object elementValue, final JsonGenerator jgen, final SerializerProvider prov, final PropertyWriter writer
  ) throws Exception
  {
  }

  @Override
  @Deprecated
  public void depositSchemaProperty (
    final PropertyWriter writer, final ObjectNode propertiesNode, final SerializerProvider provider
  ) throws JsonMappingException
  {

  }

  @Override
  public void depositSchemaProperty (
    final PropertyWriter writer, final JsonObjectFormatVisitor objectVisitor, final SerializerProvider provider
  ) throws JsonMappingException
  {
    System.out.println(objectVisitor.toString());
  }

}
