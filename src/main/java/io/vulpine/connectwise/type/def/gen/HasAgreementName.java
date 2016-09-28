package io.vulpine.connectwise.type.def.gen;

import io.vulpine.connectwise.util.Field;

public interface HasAgreementName
{
  HasAgreementName agreementName( String s );

  Field< String > agreementNameField();

  default String agreementName()
  {
    return agreementNameField().get();
  }
}
