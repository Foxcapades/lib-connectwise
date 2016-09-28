package io.vulpine.connectwise.type.def;

import io.vulpine.connectwise.type.agreement.BillableOption;
import io.vulpine.connectwise.type.agreement.RateType;
import io.vulpine.connectwise.type.def.gen.*;
import io.vulpine.connectwise.util.Field;

import java.util.Date;

public interface AgreementWorkType
extends
  HasAddressId,
  HasEffectiveDate,
  HasEndDate,
  HasLocationId,
  HasRate,
  HasRateType,
  HasWorkTypeId,
  SubAgreement,
  XmlSerializable
{
  Field < BillableOption > billTimeField();
  Field < Double > hoursMinField();
  Field < Double > hoursMaxField();

  default BillableOption billTime()
  {
    return billTimeField().get();
  }

  default AgreementWorkType billTime( final BillableOption b )
  {
    billTimeField().set(b);

    return this;
  }

  default Double hoursMin()
  {
    return hoursMinField().get();
  }

  default AgreementWorkType hoursMin( final Double d )
  {
    hoursMinField().set(d);

    return this;
  }

  default Double hoursMax()
  {
    return hoursMaxField().get();
  }

  default AgreementWorkType hoursMax( final Double d )
  {
    hoursMaxField().set(d);

    return this;
  }

  @Override
  default AgreementWorkType rate( final Double d )
  {
    rateField().set(d);

    return this;
  }

  @Override
  default AgreementWorkType workTypeId( final Integer i )
  {
    workTypeIdField().set(i);

    return this;
  }

  @Override
  default AgreementWorkType effectiveDate( Date d )
  {
    effectiveDateField().set(d);

    return this;
  }

  @Override
  default AgreementWorkType rateType( final RateType r )
  {
    rateTypeField().set(r);

    return this;
  }

  @Override
  default AgreementWorkType id( final Integer i )
  {
    idField().set(i);

    return this;
  }

  @Override
  default AgreementWorkType updatedBy( final String s )
  {
    updatedByField().set(s);

    return this;
  }

  @Override
  default AgreementWorkType locationId( Integer i )
  {
    locationIdField().set(i);

    return this;
  }

  @Override
  default AgreementWorkType lastUpdate( final Date d )
  {
    lastUpdateField().set(d);

    return this;
  }

  @Override
  default AgreementWorkType addressId( Integer i )
  {
    addressIdField().set(i);

    return this;
  }

  @Override
  default AgreementWorkType agreementId( final Integer i )
  {
    agreementIdField().set(i);

    return this;
  }

  @Override
  default AgreementWorkType endDate( Date d )
  {
    endDateField().set(d);

    return this;
  }

  @Override
  default String toXml( String rootName )
  {
    return "<" + rootName + ">"
      + idField().toXml()
      + workTypeIdField().toXml()
      + agreementIdField().toXml()
      + locationIdField().toXml()
      + rateTypeField().toXml()
      + rateField().toXml()
      + effectiveDateField().toXml()
      + endDateField().toXml()
      + billTimeField().toXml()
      + hoursMinField().toXml()
      + hoursMaxField().toXml()
      + addressIdField().toXml()
      + lastUpdateField().toXml()
      + updatedByField().toXml()
      + "</" + rootName + ">";
  }
}
