package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ApiDivision;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.company.delete.DeleteCompany;
import io.vulpine.connectwise.api.company.delete.DeleteCompanyNote;
import io.vulpine.connectwise.api.company.delete.DeleteCompanyTeam;
import io.vulpine.connectwise.api.request.Credentials;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Delete extends ApiDivision
{
  public Delete ( final Credentials credentials, final XmlMapper mapper, final ConnectwiseSubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  /**
   * Initialize Delete Company Request
   *
   * @param companyId Company ID
   *
   * @return a new Delete Company request object.
   */
  public DeleteCompany deleteCompany ( final int companyId )
  {
    return (DeleteCompany) new DeleteCompany(credentials, mapper, api).setId(companyId);
  }

  public DeleteCompanyNote deleteCompanyNote()
  {
    throw new NotImplementedException();
  }

  public DeleteCompanyTeam deleteCompanyTeam()
  {
    throw new NotImplementedException();
  }

}
