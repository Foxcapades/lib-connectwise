package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

public interface HasDescription extends XmlSerializable
{
  default String description() { return descriptionField().get(); }

  Field< String > descriptionField();

  HasDescription description( String s );
}
