package io.vulpine.connectwise.type.project;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@SuppressWarnings( "unused" )
public class ProjectNote extends _Common
{
  @JacksonXmlProperty(localName = "Notes")
  protected String notes;

  @JacksonXmlProperty(localName = "NoteTypeId")
  protected int noteTypeId;

  @JacksonXmlProperty (localName = "Flag")
  protected boolean flag;

  public String getNotes ()
  {
    return notes;
  }

  public void setNotes ( final String notes )
  {
    this.notes = notes;
  }

  public int getNoteTypeId ()
  {
    return noteTypeId;
  }

  public void setNoteTypeId ( final int noteTypeId )
  {
    this.noteTypeId = noteTypeId;
  }

  public boolean isFlag ()
  {
    return flag;
  }

  public void setFlag ( final boolean flag )
  {
    this.flag = flag;
  }
}
