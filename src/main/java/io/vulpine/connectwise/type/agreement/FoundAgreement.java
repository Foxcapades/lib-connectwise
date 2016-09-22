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
package io.vulpine.connectwise.type.agreement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement( localName = "AgreementFindResult" )
public class FoundAgreement extends Agreement
{
  @JacksonXmlProperty( localName = "BoardId" )
  protected Integer boardId;

  @JacksonXmlProperty( localName = "BoardDefaultFlag" )
  protected Boolean boardDefault;

  @JacksonXmlProperty( localName = "ServiceTypeId" )
  protected Integer serviceTypeId;

  public Integer getBoardId ()
  {
    return boardId;
  }

  public void setBoardId ( Integer boardId )
  {
    this.boardId = boardId;
  }

  public Boolean isBoardDefault ()
  {
    return boardDefault;
  }

  public void setBoardDefault ( Boolean boardDefault )
  {
    this.boardDefault = boardDefault;
  }

  public Integer getServiceTypeId ()
  {
    return serviceTypeId;
  }

  public void setServiceTypeId ( Integer serviceTypeId )
  {
    this.serviceTypeId = serviceTypeId;
  }
}
