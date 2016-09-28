package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

import java.util.Date;

public interface HasEffectiveDate extends XmlSerializable
{
  default Date effectiveDate() { return effectiveDateField().get(); }

  Field< Date > effectiveDateField();

  HasEffectiveDate effectiveDate( Date d );
}
