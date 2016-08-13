package io.vulpine.connectwise.api.agreement;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ApiDivision;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
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

  public FindAgreements findAgreements () throws IOException
  {
    return new FindAgreements(credentials, mapper, api);
  }

  public FindAgreementAdditions findAgreementAdditions() throws IOException
  {
    return new FindAgreementAdditions(credentials, mapper, api);
  }


}
