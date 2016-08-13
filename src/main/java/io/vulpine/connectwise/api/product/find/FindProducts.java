package io.vulpine.connectwise.api.product.find;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.FindRequest;
import io.vulpine.connectwise.api.company.find.FindProductsResponse;
import io.vulpine.connectwise.type.product.FoundProduct;

import java.io.IOException;
import java.util.List;

@JacksonXmlRootElement(localName = "FindProducts")
public class FindProducts extends FindRequest < List < FoundProduct > >
{
  public FindProducts ( final Credentials credentials, final XmlMapper x, final ConnectwiseSubApiInterface i )
  {
    super(credentials, x, i);
  }

  @Override
  public List< FoundProduct > submit () throws IOException
  {
    final FindProductsResponse r = xmlMapper.readerFor(FindProductsResponse.class).readValue(api.send(this));
    return r.getResults();
  }
}
