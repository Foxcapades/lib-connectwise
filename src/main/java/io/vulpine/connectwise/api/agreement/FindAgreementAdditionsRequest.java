package io.vulpine.connectwise.api.agreement;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.FindRequest;
import io.vulpine.connectwise.data.agreement.addition.FindAdditionsResponse;
import io.vulpine.connectwise.data.agreement.addition.FoundAddition;

import java.io.IOException;
import java.util.List;

@JacksonXmlRootElement(localName = "FindAgreementAdditions")
public class FindAgreementAdditionsRequest extends FindRequest < List< FoundAddition > >
{
  @JacksonXmlProperty( localName = "isOpen" )
  protected Boolean open = null;

  public FindAgreementAdditionsRequest (
    final Credentials credentials,
    final XmlMapper x,
    final ConnectwiseSubApiInterface i
  )
  {
    super(credentials, x, i);
  }

  @Override
  public List < FoundAddition > submit () throws IOException
  {
    final FindAdditionsResponse r = xmlMapper.readerFor(FindAdditionsResponse.class).readValue(api.send(this));
    return r.getResults();
  }

  public Boolean isOpen ()
  {
    return open;
  }

  public FindAgreementAdditionsRequest setOpen ( final Boolean open )
  {
    this.open = open;
    return this;
  }
}
