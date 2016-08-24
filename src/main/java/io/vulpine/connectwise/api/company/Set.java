package io.vulpine.connectwise.api.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.ApiDivision;
import io.vulpine.connectwise.api.def.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.company.set.SetCompanyDefaultContact;
import io.vulpine.connectwise.api.request.Credentials;

public class Set extends ApiDivision
{
  public Set ( final Credentials c, final XmlMapper m, final ConnectwiseSubApiInterface a )
  {
    super(c, m, a);
  }

  /**
   * Create a new Set Company Default Contact request
   *
   * @return a new company api request object.
   */
  public SetCompanyDefaultContact defaultContact()
  {
    return new SetCompanyDefaultContact();
  }
}
