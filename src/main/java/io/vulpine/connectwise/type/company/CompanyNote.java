package io.vulpine.connectwise.type.company;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.type.ConnectwiseCommon;

@JacksonXmlRootElement( localName = "CompanyNote" )
public class CompanyNote extends ConnectwiseCommon
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
