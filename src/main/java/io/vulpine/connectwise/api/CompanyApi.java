package io.vulpine.connectwise.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.company.AddCompanyRequest;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.data.Envelope;
import io.vulpine.connectwise.data.company.CompanyFindResult;
import io.vulpine.connectwise.data.company.FindCompanyBody;

import java.io.IOException;

public class CompanyApi extends ConnectwiseSubApi
{

  public CompanyApi ( final ConnectwiseApi api, final Credentials credentials, final XmlMapper xmlMapper )
  {
    super(api, credentials, xmlMapper, "CompanyApi.asmx");
  }

  public CompanyFindResult[] findCompanies () throws IOException
  {
    final Envelope < FindCompanyBody > e = api.x
      .readerFor(new TypeReference < Envelope < FindCompanyBody > >() {})
      .readValue(api.send(api.c.getApiPath() + "CompanyApi.asmx", api.format(api.getXml("FindCompanies.xml"))));

    return e.getBody().getResponse().getResults();
  }

  public AddCompanyRequest addCompany( final String name, final String identifier )
  {
    return new AddCompanyRequest(credentials, xmlMapper, this).companyName(name).companyIdentifier(identifier);
  }
}
