package io.vulpine.connectwise.api.product.delete;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.def.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.DeleteRequest;

import java.io.IOException;

@JacksonXmlRootElement( localName = "DeletePriceBreak" )
public class DeletePriceBreak extends DeleteRequest
{
  public DeletePriceBreak( final Credentials c, final XmlMapper x, final ConnectwiseSubApiInterface i )
  {
    super(c, x, i);
  }

  @Override
  public Void submit() throws IOException
  {
    return null;
  }
}
