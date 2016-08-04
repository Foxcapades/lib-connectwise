package io.vulpine.connectwise.data.product;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;

@SuppressWarnings( value = "unused" )
@JacksonXmlRootElement ( localName = "ProductFindResult" )
public class FoundProduct extends Product
{
  public FoundProduct ()
  {
    this.components = new ArrayList < Component >();
  }
}
