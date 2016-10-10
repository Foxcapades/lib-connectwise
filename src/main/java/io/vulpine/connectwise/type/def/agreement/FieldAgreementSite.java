/*
 * Copyright 2016 Elizabeth Harper
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.vulpine.connectwise.type.def.agreement;


import io.vulpine.connectwise.util.DateField;
import io.vulpine.connectwise.util.NumberField;
import io.vulpine.connectwise.util.StringField;

import java.util.Date;

public interface FieldAgreementSite extends AgreementSite
{
  NumberField < Integer > idField();
  NumberField < Integer > agreementIdField();
  NumberField < Integer > companyIdField();
  NumberField < Integer > addressIdField();
  DateField lastUpdateField();
  StringField updatedByField();

  @Override
  default Integer id()
  {
    return idField().get();
  }

  @Override
  default FieldAgreementSite id( final Integer i )
  {
    idField().set(i);
    return this;
  }

  @Override
  default Integer agreementId()
  {
    return agreementIdField().get();
  }

  @Override
  default FieldAgreementSite agreementId( final Integer i )
  {
    agreementIdField().set(i);

    return this;
  }

  @Override
  default Integer companyId()
  {
    return companyIdField().get();
  }

  @Override
  default FieldAgreementSite companyId( final Integer i )
  {
    companyIdField().set(i);
    return this;
  }

  @Override
  default Integer addressId()
  {
    return addressIdField().get();
  }

  @Override
  default FieldAgreementSite addressId( final Integer i )
  {
    addressIdField().set(i);

    return this;
  }

  @Override
  default Date lastUpdate()
  {
    return lastUpdateField().get();
  }

  @Override
  default FieldAgreementSite lastUpdate( final Date d )
  {
    lastUpdateField().set(d);

    return this;
  }

  @Override
  default String updatedBy()
  {
    return updatedByField().get();
  }

  @Override
  default FieldAgreementSite updatedBy( final String s )
  {
    updatedByField().set(s);

    return this;
  }

  @Override
  default String toXml( String rootName )
  {
    return "<" + rootName + ">"
      + idField().toXml()
      + agreementIdField().toXml()
      + companyIdField().toXml()
      + addressIdField().toXml()
      + lastUpdateField().toXml()
      + updatedByField().toXml()
      + "</" + rootName + ">";
  }
}
