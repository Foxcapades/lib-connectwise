package io.vulpine.connectwise.data.purchasing;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@SuppressWarnings( "unused" )
public class VendorContact
{
  @JacksonXmlProperty(localName = "FirstName")
  protected String FirstName;

  @JacksonXmlProperty(localName = "LastName")
  protected String LastName;

  public String getFirstName ()
  {
    return FirstName;
  }

  public void setFirstName ( final String firstName )
  {
    FirstName = firstName;
  }

  public String getLastName ()
  {
    return LastName;
  }

  public void setLastName ( final String lastName )
  {
    LastName = lastName;
  }
}
