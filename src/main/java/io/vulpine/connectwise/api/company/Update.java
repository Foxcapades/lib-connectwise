package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ApiDivision;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.company.update.UpdateCompany;
import io.vulpine.connectwise.api.company.update.UpdateCompanyProfile;
import io.vulpine.connectwise.api.request.Credentials;

public class Update extends ApiDivision
{
  public Update ( final Credentials credentials, final XmlMapper mapper, final ConnectwiseSubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  /**
   * Initialize Update Company Request
   *
   * @return a new Update Company request object.
   */
  public UpdateCompany company ()
  {
    return null;
  }

  public UpdateCompanyProfile profile()
  {
    return null;
  }
}
