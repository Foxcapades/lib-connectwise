package io.vulpine.connectwise.type.agreement;

import io.vulpine.connectwise.type.def.agreement.*;

import java.util.function.Supplier;

public final class AgreementApiTypes
{
  public Supplier < Agreement > agreement = SimpleAgreement::new;

  public Supplier < AgreementAddition > addition = SimpleAgreementAddition::new;

  public Supplier < AgreementSite > site  = SimpleAgreementSite::new;

  public Supplier < AgreementWorkType > workType = SimpleWorkType::new;

  public AgreementApiTypes() {}
}
