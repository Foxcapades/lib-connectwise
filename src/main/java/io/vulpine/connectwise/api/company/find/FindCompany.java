package io.vulpine.connectwise.api.company.find;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.FindRequest;
import io.vulpine.connectwise.type.company.FindCompanyResponse;
import io.vulpine.connectwise.type.company.FoundCompany;

import java.io.IOException;
import java.util.List;

@JacksonXmlRootElement ( localName = "FindCompanies" )
public class FindCompany extends FindRequest < List< FoundCompany > >
{
  public FindCompany ( Credentials credentials, XmlMapper xmlMapper, ConnectwiseSubApiInterface api )
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
