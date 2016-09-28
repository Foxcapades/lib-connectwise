package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

public interface HasProductTypeId extends XmlSerializable
{
  Field< Integer > productTypeIdField();

  default Integer productTypeId()
  {
    return productTypeIdField().get();
  }

  HasProductTypeId productTypeId( final Integer i );
}
