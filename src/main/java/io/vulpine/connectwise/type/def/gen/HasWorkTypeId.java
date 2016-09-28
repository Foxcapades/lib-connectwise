package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

public interface HasWorkTypeId extends XmlSerializable
{
  default Integer workTypeId()
  {
    return workTypeIdField().get();
  }

  Field < Integer > workTypeIdField();

  HasWorkTypeId workTypeId( final Integer i );
}
