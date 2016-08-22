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
   * @return a new company api request object.
   */
  public UpdateCompany company ()
  {
    return new UpdateCompany();
  }

  /**
   * Create a new  Update Company Profile request
   *
   * @return a new company api request object.
   */
  public UpdateCompanyProfile profile()
  {
    return new UpdateCompanyProfile();
  }
}
