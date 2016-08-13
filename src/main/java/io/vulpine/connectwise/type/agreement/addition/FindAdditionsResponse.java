package io.vulpine.connectwise.type.agreement.addition;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement( localName = "FindAgreementAdditionsResponse" )
public class FindAdditionsResponse
{
  @JacksonXmlProperty(localName = "FindAgreementAdditionsResult")
  protected List < FoundAddition > result;

  public List< FoundAddition > getResults ()
  {
    return result;
  }

  public void setResult( final List < FoundAddition > l )
  {
    result = (null == l) ? new ArrayList < FoundAddition >() : l;
  }
}
