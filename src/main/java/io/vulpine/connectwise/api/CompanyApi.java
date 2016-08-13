package io.vulpine.connectwise.api;

import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.EmptyFilter;
import io.vulpine.connectwise.api.company.AddCompany;
import io.vulpine.connectwise.api.company.FindCompany;
import io.vulpine.connectwise.api.request.Credentials;

public class CompanyApi extends ConnectwiseSubApi
{

  public CompanyApi ( final ConnectwiseApi api, final Credentials credentials, final XmlMapper xmlMapper )
  {
    super(api, credentials, xmlMapper, "CompanyApi.asmx");
    xmlMapper.setFilterProvider(new SimpleFilterProvider().addFilter("filter-empty", new EmptyFilter()));
  }

  public FindCompany findCompanies ()
  {
    return new FindCompany(credentials, xmlMapper, this);
  }

  public AddCompany addCompany( final String name, final String identifier )
  {
    return new AddCompany(credentials, xmlMapper, this).companyName(name).companyIdentifier(identifier);
  }
}
