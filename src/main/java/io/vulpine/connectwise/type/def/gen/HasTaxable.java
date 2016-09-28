package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

public interface HasTaxable extends XmlSerializable
{
  default Boolean taxable() { return taxableField().get(); }

  Field< Boolean > taxableField();

  HasTaxable taxable( Boolean b );
}
