package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ApiDivision;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.company.load.LoadCompany;
import io.vulpine.connectwise.api.request.Credentials;

public class Load extends ApiDivision
{
  public Load ( final Credentials credentials, final XmlMapper mapper, final ConnectwiseSubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  /**
   * Initialize Load Company Request
   *
   * @return a new Load Company request object.
   */
  public LoadCompany company ()
  {
    return new LoadCompany();
  }
}
