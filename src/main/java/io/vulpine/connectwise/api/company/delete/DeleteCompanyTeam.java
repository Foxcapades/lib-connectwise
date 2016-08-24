package io.vulpine.connectwise.api.company.delete;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.def.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.DeleteRequest;

import java.io.IOException;

@JacksonXmlRootElement( localName = "DeleteCompanyTeam" )
public class DeleteCompanyTeam extends DeleteRequest
{
  public DeleteCompanyTeam( final Credentials c, final XmlMapper x, final ConnectwiseSubApiInterface i )
  {
    super(c, x, i);
  }

  @Override
  public Void submit() throws IOException
  {
    return null;
  }
}
