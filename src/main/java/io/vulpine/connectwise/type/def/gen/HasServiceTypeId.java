package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

public interface HasServiceTypeId extends XmlSerializable
{
  default Integer serviceTypeId()
  {
    return serviceTypeIdField().get();
  }

  Field< Integer > serviceTypeIdField();

  HasServiceTypeId serviceTypeId( final Integer i );
}
