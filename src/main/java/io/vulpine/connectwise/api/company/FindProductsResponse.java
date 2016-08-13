package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.type.product.FoundProduct;

import java.util.List;

@JacksonXmlRootElement( localName = "FindProductsResponse" )
public class FindProductsResponse
{
  protected final List < FoundProduct > results;

  @JsonCreator
  public FindProductsResponse (
    @JacksonXmlProperty( localName = "FindProductsResult" ) final List < FoundProduct > results
  )
  {
    this.results = results;
  }

  public List < FoundProduct > getResults ()
  {
    return results;
  }
}
