package io.vulpine.connectwise.type.contact;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.CwObject;

@SuppressWarnings( "unused" )
public class ContactNote extends CwObject
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
