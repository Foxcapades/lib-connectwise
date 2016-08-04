package io.vulpine.connectwise.api.product;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.FindRequest;
import io.vulpine.connectwise.data.product.FindProductsResponse;
import io.vulpine.connectwise.data.product.FoundProduct;

import java.io.IOException;
import java.util.List;

@JacksonXmlRootElement(localName = "FindProducts")
public class FindProductRequest extends FindRequest < List < FoundProduct > >
{
  public FindProductRequest ( final Credentials credentials, final XmlMapper x, final ConnectwiseSubApiInterface i )
  {
    super(credentials, x, i);
  }

  @Override
  public List< FoundProduct > submit () throws IOException
  {
    final FindProductsResponse r = x.readerFor(FindProductsResponse.class).readValue(i.send(this));
    return r.getResults();
  }
}
