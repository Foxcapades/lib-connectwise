package io.vulpine.connectwise.api;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.request.Credentials;

public class ApiDivision
{
  protected final Credentials                credentials;
  protected final XmlMapper                  mapper;
  protected final ConnectwiseSubApiInterface api;

  public ApiDivision ( Credentials credentials, XmlMapper mapper, ConnectwiseSubApiInterface api )
  {
    this.credentials = credentials;
    this.mapper = mapper;
    this.api = api;
  }
}
