package io.vulpine.connectwise.api;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.CwRequest;
import io.vulpine.connectwise.api.request.SoapEnvelope;

import java.io.IOException;

public class ConnectwiseSubApi implements ConnectwiseSubApiInterface
{
  protected final ConnectwiseApi api;
  protected final Credentials credentials;
  protected final XmlMapper xmlMapper;
  protected final String endpoint;

  public ConnectwiseSubApi (
    final ConnectwiseApi api,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    this.api = api;
    this.credentials = credentials;
    this.xmlMapper = xmlMapper;
    this.endpoint = endpoint;
  }

  @Override
  public String send ( CwRequest r ) throws IOException
  {
    final String out = xmlMapper.writeValueAsString(new SoapEnvelope(r));
    if ("ALL".equals(System.getProperty("javax.net.debug", "off").toUpperCase())) { System.out.println(out); }
    return soap.matcher(api.send(api.c.getApiPath() + endpoint, out)).replaceAll("");
  }
}
