package io.vulpine.connectwise.api.agreement;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.ApiDivision;
import io.vulpine.connectwise.api.def.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.agreement.find.FindAgreementAdditions;
import io.vulpine.connectwise.api.agreement.find.FindAgreements;
import io.vulpine.connectwise.api.request.Credentials;

import java.io.IOException;

public class Find extends ApiDivision
{
  public Find ( Credentials credentials, XmlMapper mapper, ConnectwiseSubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  public FindAgreements agreements() throws IOException
  {
    return new FindAgreements(credentials, mapper, api);
  }

  public FindAgreementAdditions additions() throws IOException
  {
    return new FindAgreementAdditions(credentials, mapper, api);
  }
}
