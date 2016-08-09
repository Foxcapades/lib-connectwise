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

    switch (writer.getType().getRawClass().getSimpleName()) {
      case "String":
        final String s = (String) m.invoke(pojo);
        if (null == s || s.isEmpty()) return;
        break;
      case "int":
        final int i = (int) m.invoke(pojo);
        if (i < 1) return;
        break;
      default:
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
