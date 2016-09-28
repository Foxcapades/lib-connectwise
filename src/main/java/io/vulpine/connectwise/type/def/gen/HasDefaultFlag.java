package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

public interface HasDefaultFlag extends XmlSerializable
{
  default Boolean defaultFlag()
  {
    return defaultFlagField().get();
  }

  Field< Boolean > defaultFlagField();

  HasDefaultFlag defaultFlag( final Boolean b );
}
