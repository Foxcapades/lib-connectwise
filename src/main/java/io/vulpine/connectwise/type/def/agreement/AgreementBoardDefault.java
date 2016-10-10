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

import io.vulpine.connectwise.type.def.XmlSerializable;
import io.vulpine.connectwise.type.def.gen.HasBoardId;
import io.vulpine.connectwise.type.def.gen.HasDefaultFlag;
import io.vulpine.connectwise.type.def.gen.HasServiceTypeId;
import io.vulpine.connectwise.util.Field;

import java.util.Date;

public interface AgreementBoardDefault
extends
  HasBoardId,
  HasDefaultFlag,
  HasServiceTypeId,
  SubAgreement,
  XmlSerializable
{
  @Override
  default AgreementBoardDefault agreementId( final Integer i )
  {
    agreementIdField().set(i);
    return this;
  }

  default Integer agreementId() { return agreementIdField().get(); }

  default Integer boardId()
  {
    return boardIdField().get();
  }Field< Integer > boardIdField();

  default AgreementBoardDefault id( final Integer i )
  {
    idField().set(i);
    return this;
  }

  default Integer id()
  {
    return idField().get();
  }

  default Date lastUpdate() { return lastUpdateField().get(); }

  default Integer serviceTypeId()
  {
    return serviceTypeIdField().get();
  }

  Field< Integer > serviceTypeIdField();

  default AgreementBoardDefault updatedBy( final String s )
  {
    updatedByField().set(s);
    return this;
  }

  default AgreementBoardDefault lastUpdate( final Date d )
  {
    lastUpdateField().set(d);
    return this;
  }

  default AgreementBoardDefault serviceTypeId( final Integer i )
  {
    serviceTypeIdField().set(i);
    return this;
  }

  default AgreementBoardDefault boardId( final Integer i )
  {
    boardIdField().set(i);
    return this;
  }

  @Override
  default AgreementBoardDefault defaultFlag( final Boolean b )
  {
    defaultFlagField().set(b);
    return this;
  }

  @Override
  default String toXml( String rootName )
  {
    return "<" + rootName + ">"
      + idField().toXml()
      + boardIdField().toXml()
      + agreementIdField().toXml()
      + serviceTypeIdField().toXml()
      + defaultFlagField().toXml()
      + updatedByField().toXml()
      + lastUpdateField().toXml()
      + "</" + rootName + ">";
  }

  default String updatedBy()
  {
    return updatedByField().get();
  }
}
