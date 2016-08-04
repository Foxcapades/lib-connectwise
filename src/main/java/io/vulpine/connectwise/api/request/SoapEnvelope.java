package io.vulpine.connectwise.api.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JacksonXmlRootElement(localName = "soap:Envelope")
public class SoapEnvelope
{
  @JacksonXmlProperty(localName = "xmlns:xsi", isAttribute = true)
  public final String xsi = "http://www.w3.org/2001/XMLSchema-instance";

  @JacksonXmlProperty(localName = "xmlns:xsd", isAttribute = true)
  public final String xsd = "http://www.w3.org/2001/XMLSchema";

  @JacksonXmlProperty(localName = "xmlns:soap", isAttribute = true)
  public final String soap = "http://schemas.xmlsoap.org/soap/envelope/";

  @JacksonXmlProperty(localName = "soap:Body")
  public final Map < String, CwRequest > e;

  public SoapEnvelope ( final CwRequest r )
  {
    e = new HashMap < String, CwRequest >(1);
    e.put(r.getClass().getAnnotation(JacksonXmlRootElement.class).localName(), r);
  }
}
