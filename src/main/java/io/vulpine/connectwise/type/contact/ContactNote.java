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
package io.vulpine.connectwise.type.contact;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.ConnectwiseCommon;

public class ContactNote extends ConnectwiseCommon
{
  @JacksonXmlProperty( localName = "NoteType" )
  protected String noteType;

  @JacksonXmlProperty( localName = "NoteText" )
  protected String noteText;

  @JacksonXmlProperty( localName = "IsFlagged" )
  protected boolean isFlagged;

  @JacksonXmlProperty( localName = "EnteredBy" )
  protected String enteredBy;

  public String getNoteType ()
  {
    return noteType;
  }

  public void setNoteType ( String noteType )
  {
    this.noteType = noteType;
  }

  public String getNoteText ()
  {
    return noteText;
  }

  public void setNoteText ( String noteText )
  {
    this.noteText = noteText;
  }

  public boolean isFlagged ()
  {
    return isFlagged;
  }

  public void setFlagged ( boolean flagged )
  {
    isFlagged = flagged;
  }

  public String getEnteredBy ()
  {
    return enteredBy;
  }

  public void setEnteredBy ( String enteredBy )
  {
    this.enteredBy = enteredBy;
  }
}
