package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

public interface HasCategoryId extends XmlSerializable
{
  HasCategoryId categoryId( final Integer i );

  Field< Integer > categoryIdField();

  default Integer categoryId()
  {
    return categoryIdField().get();
  }
}
