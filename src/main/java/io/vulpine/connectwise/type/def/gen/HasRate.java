package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

public interface HasRate extends XmlSerializable
{
  default Double rate()
  {
    return rateField().get();
  }

  Field< Double > rateField();

  HasRate rate( final Double d );
}
