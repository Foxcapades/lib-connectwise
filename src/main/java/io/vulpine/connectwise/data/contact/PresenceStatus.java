package io.vulpine.connectwise.data.contact;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.data.CwObject;

@SuppressWarnings( "unused" )
public class PresenceStatus extends CwObject
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
