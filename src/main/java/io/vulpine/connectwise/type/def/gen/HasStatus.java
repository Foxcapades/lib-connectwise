package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

public interface HasStatus extends XmlSerializable
{
  Field< String > statusField();

  default String status()
  {
    return statusField().get();
  }

  HasStatus status( final String s );
}
