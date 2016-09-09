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
package io.vulpine.connectwise.type.company;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.vulpine.connectwise.type.ConnectwiseCommon;

@JsonRootName( "CompanyNote" )
public class CompanyNote extends ConnectwiseCommon
{
  private String noteType = null;

  private String noteText = null;

  private Boolean flagged = null;

  private String enteredBy = null;

  @JsonGetter( "NoteType" )
  public String noteType()
  {
    return noteType;
  }

  @JsonSetter( "NoteType" )
  public void noteType( final String noteType )
  {
    this.noteType = noteType;
  }

  @JsonGetter( "NoteText" )
  public String noteText()
  {
    return noteText;
  }

  @JsonSetter( "NoteText" )
  public void noteText( final String noteText )
  {
    this.noteText = noteText;
  }

  @JsonGetter( "IsFlagged" )
  public Boolean flagged()
  {
    return flagged;
  }

  @JsonSetter( "IsFlagged" )
  public void flagged( final Boolean flagged )
  {
    this.flagged = flagged;
  }

  @JsonGetter( "EnteredBy" )
  public String enteredBy()
  {
    return enteredBy;
  }

  @JsonSetter( "EnteredBy" )
  public void enteredBy( final String enteredBy )
  {
    this.enteredBy = enteredBy;
  }
}
