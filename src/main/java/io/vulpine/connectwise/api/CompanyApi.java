package io.vulpine.connectwise.api;

import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.EmptyFilter;
import io.vulpine.connectwise.api.company.AddCompanyRequest;
import io.vulpine.connectwise.api.company.FindCompanyRequest;
import io.vulpine.connectwise.api.request.Credentials;

public class CompanyApi extends ConnectwiseSubApi
{

  public CompanyApi ( final ConnectwiseApi api, final Credentials credentials, final XmlMapper xmlMapper )
  {
    super(api, credentials, xmlMapper, "CompanyApi.asmx");
    xmlMapper.setFilterProvider(new SimpleFilterProvider().addFilter("filter-empty", new EmptyFilter()));
  }

  public FindCompanyRequest findCompanies ()
  {
    return new FindCompanyRequest(credentials, xmlMapper, this);
  }

  public AddCompanyRequest addCompany( final String name, final String identifier )
  {
    return new AddCompanyRequest(credentials, xmlMapper, this).companyName(name).companyIdentifier(identifier);
  }
}
