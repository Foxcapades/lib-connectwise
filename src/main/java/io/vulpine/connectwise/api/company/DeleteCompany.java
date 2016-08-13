package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.DeleteRequest;

import java.io.IOException;

@JacksonXmlRootElement( localName = "DeleteCompany" )
public class DeleteCompany extends DeleteRequest
{
  public DeleteCompany ( Credentials c, XmlMapper x, ConnectwiseSubApiInterface i ) { super(c, x, i); }

  @Override
  public Void submit () throws IOException
  {
    api.send(this);
    return null;
  }
}
