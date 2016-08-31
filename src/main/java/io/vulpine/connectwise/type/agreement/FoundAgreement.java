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
 *
 */
package io.vulpine.connectwise.type.agreement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement( localName = "AgreementFindResult" )
public class FoundAgreement extends Agreement
{
  @JacksonXmlProperty( localName = "BoardId" )
  protected int boardId;

  @JacksonXmlProperty( localName = "BoardDefaultFlag" )
  protected boolean boardDefault;

  @JacksonXmlProperty( localName = "ServiceTypeId" )
  protected int serviceTypeId;

  public int getBoardId ()
  {
    this.logger.trace(this.getClass());
    return boardId;
  }

  public void setBoardId ( int boardId )
  {
    this.logger.trace(this.getClass(), boardId);
    this.boardId = boardId;
  }

  public boolean isBoardDefault ()
  {
    this.logger.trace(this.getClass());
    return boardDefault;
  }

  public void setBoardDefault ( boolean boardDefault )
  {
    this.logger.trace(this.getClass(), boardDefault);
    this.boardDefault = boardDefault;
  }

  public int getServiceTypeId ()
  {
    this.logger.trace(this.getClass());
    return serviceTypeId;
  }

  public void setServiceTypeId ( int serviceTypeId )
  {
    this.logger.trace(this.getClass(), serviceTypeId);
    this.serviceTypeId = serviceTypeId;
  }
}
