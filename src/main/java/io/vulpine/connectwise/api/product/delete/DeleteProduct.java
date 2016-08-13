package io.vulpine.connectwise.api.product.delete;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.DeleteRequest;

import java.io.IOException;

@JacksonXmlRootElement(localName = "DeleteProduct")
public class DeleteProduct extends DeleteRequest
{
  public DeleteProduct (
    final Credentials c,
    final XmlMapper x,
    final ConnectwiseSubApiInterface i
  )
  {
    super(c, x, i);
  }

  @Override
  public Void submit () throws IOException
  {
    api.send(this);
    return null;
  }
}
