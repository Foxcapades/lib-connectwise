package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ApiDivision;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.company.get.GetCompany;
import io.vulpine.connectwise.api.company.get.GetCompanyNote;
import io.vulpine.connectwise.api.company.get.GetCompanyProfile;
import io.vulpine.connectwise.api.company.get.GetCompanyTeam;
import io.vulpine.connectwise.api.request.Credentials;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Get extends ApiDivision
{
  public Get ( Credentials credentials, XmlMapper mapper, ConnectwiseSubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  /**
   * Initialize A Get Company Request
   *
   * @param id Company ID
   *
   * @return a new get company request object.
   */
  public GetCompany getCompany ( final int id )
  {
     throw new NotImplementedException();
  }

  public GetCompanyProfile getCompanyProfile()
  {
    throw new NotImplementedException();
  }

  public GetCompanyNote getCompanyNote()
    {
    throw new NotImplementedException();
  }

  public GetCompanyTeam getCompanyTeam()
  {
    throw new NotImplementedException();
  }
}