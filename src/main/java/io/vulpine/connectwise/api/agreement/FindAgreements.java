package io.vulpine.connectwise.api.agreement;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.FindRequest;
import io.vulpine.connectwise.type.agreement.FindAgreementsResponse;
import io.vulpine.connectwise.type.agreement.FoundAgreement;

import java.io.IOException;
import java.util.List;

@JacksonXmlRootElement(localName = "FindAgreements")
public class FindAgreements extends FindRequest < List < FoundAgreement > >
{
  @JacksonXmlProperty( localName = "isOpen" )
  protected Boolean open = null;

  public FindAgreements (
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

  public FindAgreements setOpen ( final Boolean open )
  {
    this.open = open;
    return this;
  }

  @Override
  public List < FoundAgreement > submit () throws IOException
  {
    final FindAgreementsResponse r = xmlMapper.readerFor(FindAgreementsResponse.class).readValue(api.send(this));
    return r.getResults();
  }
}
