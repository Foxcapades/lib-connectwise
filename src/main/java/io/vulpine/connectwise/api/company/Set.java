package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ApiDivision;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.company.set.SetCompanyDefaultContact;
import io.vulpine.connectwise.api.request.Credentials;

public class Set extends ApiDivision
{
  public Set ( final Credentials c, final XmlMapper m, final ConnectwiseSubApiInterface a )
  {
    super(c, m, a);
  }

  public SetCompanyDefaultContact defaultContact()
  {
    return null;
  }

}
