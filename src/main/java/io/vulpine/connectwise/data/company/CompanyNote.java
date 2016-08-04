package io.vulpine.connectwise.data.company;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.data.CwObject;

@SuppressWarnings( "unused" )
public class CompanyNote extends CwObject
{
  @JacksonXmlProperty (localName = "NoteType")
  protected String noteType;

  @JacksonXmlProperty (localName = "NoteText")
  protected String noteText;

  @JacksonXmlProperty (localName = "IsFlagged")
  protected boolean flagged;

  @JacksonXmlProperty (localName = "EnteredBy")
  protected String enteredBy;

  public String getNoteType ()
  {
    return noteType;
  }

  public void setNoteType ( final String noteType )
  {
    this.noteType = noteType;
  }

  public String getNoteText ()
  {
    return noteText;
  }

  public void setNoteText ( final String noteText )
  {
    this.noteText = noteText;
  }

  public boolean isFlagged ()
  {
    return flagged;
  }

  public void setFlagged ( final boolean flagged )
  {
    this.flagged = flagged;
  }

  public String getEnteredBy ()
  {
    return enteredBy;
  }

  public void setEnteredBy ( final String enteredBy )
  {
    this.enteredBy = enteredBy;
  }
}
