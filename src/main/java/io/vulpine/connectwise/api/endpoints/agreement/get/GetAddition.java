package io.vulpine.connectwise.api.endpoints.agreement.get;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.endpoints.Endpoint;
import io.vulpine.connectwise.type.agreement.addition.Addition;

import java.io.IOException;

public class GetAddition extends _Common < Addition >
{
  public GetAddition( Credentials credentials, XmlMapper xmlMapper, SubApiInterface api, int id )
  {
    super(credentials, xmlMapper, api, id);
  }

  @Override
  public String getRootName()
  {
    return "GetAgreementAddition";
  }

  @Override
  public Addition submit() throws IOException
  {
    return submit(GetAdditionResponse.class);
  }
}
