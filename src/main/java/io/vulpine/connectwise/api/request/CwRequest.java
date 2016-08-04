package io.vulpine.connectwise.api.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;

import java.io.IOException;

abstract public class CwRequest < R >
{
  @JacksonXmlProperty( localName = "xmlns", isAttribute = true )
  protected final String xmlns = "http://connectwise.com";

  @JacksonXmlProperty( localName = "credentials" )
  protected final Credentials c;

  @JsonIgnore
  protected final XmlMapper x;

  @JsonIgnore
  protected final ConnectwiseSubApiInterface i;

  public CwRequest ( final Credentials c, final XmlMapper x, final ConnectwiseSubApiInterface i )
  {
    this.c = c;
    this.x = x;
    this.i = i;
  }

  public Credentials getCredentials ()
  {
    return c;
  }

  abstract public R submit () throws IOException;

  public String getXmlns ()
  {
    return xmlns;
  }
}
