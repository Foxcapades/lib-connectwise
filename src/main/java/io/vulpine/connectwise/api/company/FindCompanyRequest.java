package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.FindRequest;
import io.vulpine.connectwise.data.company.FindCompanyResponse;
import io.vulpine.connectwise.data.company.FoundCompany;

import java.io.IOException;
import java.util.List;

@JacksonXmlRootElement ( localName = "FindCompanies" )
public class FindCompanyRequest extends FindRequest < List< FoundCompany > >
{
  public FindCompanyRequest ( Credentials credentials, XmlMapper xmlMapper, ConnectwiseSubApiInterface api )
  {
    super(credentials, xmlMapper, api);
  }

  @Override
  public List < FoundCompany > submit () throws IOException
  {
    final FindCompanyResponse r = xmlMapper.readerFor(FindCompanyResponse.class).readValue(api.send(this));
    return r.getResults();
  }
}
