package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.ApiDivision;
import io.vulpine.connectwise.api.common.ConnectwiseSubApi;
import io.vulpine.connectwise.api.company.add.AddCompany;
import io.vulpine.connectwise.api.request.Credentials;

public class Add extends ApiDivision
{
  public Add ( Credentials credentials, XmlMapper xmlMapper, ConnectwiseSubApi api )
  {
    super(credentials, xmlMapper, api);
  }

  /**
   * Initialize Add Company Request
   *
   * @param name       new Company name
   * @param identifier new Company identifier
   *
   * @return a new Add Company request object.
   */
  public AddCompany company ( final String name, final String identifier )
  {
    return new AddCompany(credentials, mapper, api).companyName(name).companyIdentifier(identifier);
  }
}
