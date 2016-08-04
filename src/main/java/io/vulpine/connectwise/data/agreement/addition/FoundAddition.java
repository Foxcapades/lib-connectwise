package io.vulpine.connectwise.data.agreement.addition;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement( localName = "AgreementAdditionFindResult")
public class FoundAddition extends Addition
{
  @JacksonXmlProperty( localName = "ProductId" )
  protected int     productId;

  @JacksonXmlProperty ( localName = "Taxable" )
  protected String taxable;

  public int getProductId ()
  {
    return productId;
  }

  public void setProductId ( int productId )
  {
    this.productId = productId;
  }
}
