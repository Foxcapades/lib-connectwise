package io.vulpine.connectwise.api.agreement;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.FindRequest;
import io.vulpine.connectwise.data.agreement.FindAgreementsResponse;
import io.vulpine.connectwise.data.agreement.FoundAgreement;

import java.io.IOException;
import java.util.List;

@JacksonXmlRootElement(localName = "FindAgreements")
public class FindAgreementRequest extends FindRequest < List < FoundAgreement > >
{
  @JacksonXmlProperty( localName = "isOpen" )
  protected Boolean open = null;

  public FindAgreementRequest (
    final Credentials credentials,
    final XmlMapper x,
    final ConnectwiseSubApiInterface i
  )
  {
    super(credentials, x, i);
  }

  public Boolean isOpen ()
  {
    return open;
  }

  public FindAgreementRequest setOpen ( final Boolean open )
  {
    this.open = open;
    return this;
  }

  @Override
  public List < FoundAgreement > submit () throws IOException
  {
    final FindAgreementsResponse r = x.readerFor(FindAgreementsResponse.class).readValue(i.send(this));
    return r.getResults();
  }
}
