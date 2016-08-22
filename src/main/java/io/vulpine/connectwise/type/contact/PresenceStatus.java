package io.vulpine.connectwise.type.contact;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.ConnectwiseCommon;

@SuppressWarnings( "unused" )
public class PresenceStatus extends ConnectwiseCommon
{
  @JacksonXmlProperty( localName = "ContactId" )
  protected int contactId;

  @JacksonXmlProperty( localName = "PresenceDescription" )
  protected String presenceDescription;

  public int getContactId ()
  {
    return contactId;
  }

  public void setContactId ( int contactId )
  {
    this.contactId = contactId;
  }

  public String getPresenceDescription ()
  {
    return presenceDescription;
  }

  public void setPresenceDescription ( String presenceDescription )
  {
    this.presenceDescription = presenceDescription;
  }
}
