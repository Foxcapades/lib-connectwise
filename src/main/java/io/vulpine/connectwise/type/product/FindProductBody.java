package io.vulpine.connectwise.type.product;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.company.FindProductsResponse;

@JacksonXmlRootElement( namespace = "soap", localName = "Body" )
public class FindProductBody
{
  protected final FindProductsResponse result;

  @JsonCreator
  public FindProductBody (
    @JacksonXmlProperty( localName = "FindProductsResponse" ) final FindProductsResponse result
  )
  {
    this.result = result;
  }

  public FindProductsResponse getResponse ()
  {
    return result;
  }
}
