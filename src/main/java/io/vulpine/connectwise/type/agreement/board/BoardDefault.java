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
package io.vulpine.connectwise.type.agreement.board;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.agreement.AbstractSubAgreement;

public class BoardDefault extends AbstractSubAgreement
{
  private boolean isDefault;

  private int boardId;

  private int serviceTypeId;

  @JsonGetter( "BoardId" )
  public int boardId ()
  {
    return boardId;
  }

  @JsonSetter( "BoardId" )
  public BoardDefault boardId ( int boardId )
  {
    this.boardId = boardId;

    return this;
  }

  @JsonGetter( "ServiceTypeId" )
  public int serviceTypeId ()
  {
    return serviceTypeId;
  }

  @JsonSetter( "ServiceTypeId" )
  public BoardDefault serviceTypeId ( int serviceTypeId )
  {
    this.serviceTypeId = serviceTypeId;

    return this;
  }

  @JsonGetter( "DefaultFlag" )
  public boolean defaultFlag ()
  {
    return isDefault;
  }

  @JsonSetter( "DefaultFlag" )
  public BoardDefault defaultFlag ( boolean aDefault )
  {
    isDefault = aDefault;

    return this;
  }
}
