package io.vulpine.connectwise.type.configuration;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vulpine.connectwise.type.CwObject;

@SuppressWarnings( "unused" )
public class VendorCompany extends CwObject
{
  @JacksonXmlProperty( localName = "Name" )
  protected String name;

  public String getName ()
  {
    return name;
  }

  public void setName ( String name )
  {
    this.name = name;
  }
}
