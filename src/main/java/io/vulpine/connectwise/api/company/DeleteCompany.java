package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.CwRequest;

import java.io.IOException;

@JacksonXmlRootElement ( localName = "DeleteCompany" )
public class DeleteCompany extends CwRequest < Void >
{

  public DeleteCompany (
    Credentials credentials,
    XmlMapper xmlMapper,
    ConnectwiseSubApiInterface api
  )
  {
    super(credentials, xmlMapper, api);
  }

  @Override
  public Void submit () throws IOException
  {
    return null;
  }
}
