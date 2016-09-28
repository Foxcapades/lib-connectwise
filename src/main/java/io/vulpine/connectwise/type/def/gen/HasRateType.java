package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.type.agreement.RateType;
import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.util.Field;

public interface HasRateType extends XmlSerializable
{
  default RateType rateType()
  {
    return rateTypeField().get();
  }

  Field< RateType > rateTypeField();

  HasRateType rateType( final RateType r );
}
