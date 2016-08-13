package io.vulpine.connectwise.api.agreement;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ApiDivision;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;

public class Get extends ApiDivision
{
  public Get ( Credentials credentials, XmlMapper mapper, ConnectwiseSubApiInterface api )
  {
    super(credentials, mapper, api);
  }
}
