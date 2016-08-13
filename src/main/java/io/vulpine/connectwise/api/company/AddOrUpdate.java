package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ApiDivision;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.company.addOrUpdate.AddOrUpdateCompany;
import io.vulpine.connectwise.api.company.addOrUpdate.AddOrUpdateCompanyCustomField;
import io.vulpine.connectwise.api.company.addOrUpdate.AddOrUpdateCompanyNote;
import io.vulpine.connectwise.api.company.addOrUpdate.AddOrUpdateCompanyTeam;
import io.vulpine.connectwise.api.request.Credentials;

public class AddOrUpdate extends ApiDivision
{
  public AddOrUpdate ( final Credentials credentials, final XmlMapper mapper, final ConnectwiseSubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  /**
   * Initialize A Get Company Request
   *
   * @return a new get company request object.
   */
  public AddOrUpdateCompany company ()
  {
    return null;
  }

  public AddOrUpdateCompanyNote note()
  {
    return null;
  }

  public AddOrUpdateCompanyCustomField customField()
  {
    return null;
  }

  public AddOrUpdateCompanyTeam team()
  {
    return null;
  }
}
