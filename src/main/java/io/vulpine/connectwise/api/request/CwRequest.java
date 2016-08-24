package io.vulpine.connectwise.api.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vulpine.connectwise.api.def.ConnectwiseSubApiInterface;

import java.io.IOException;

abstract public class CwRequest < R >
{
  @JacksonXmlProperty( localName = "xmlns", isAttribute = true )
  protected final String xmlns = "http://connectwise.com";

  @JacksonXmlProperty( localName = "credentials" )
  protected final Credentials credentials;

  @JsonIgnore
  protected final XmlMapper xmlMapper;

  @JsonIgnore
  protected final ConnectwiseSubApiInterface api;

  public CwRequest (
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final ConnectwiseSubApiInterface api
  )
  {
    this.credentials = credentials;
    this.xmlMapper = xmlMapper;
    this.api = api;
  }

  public Credentials getCredentials ()
  {
    return credentials;
  }

  abstract public R submit () throws IOException;

  public String getXmlns ()
  {
    return xmlns;
  }
}
