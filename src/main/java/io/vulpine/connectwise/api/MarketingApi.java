package io.vulpine.connectwise.api;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.ConnectwiseSubApi;
import io.vulpine.connectwise.api.request.Credentials;

public class MarketingApi extends ConnectwiseSubApi
{
  public MarketingApi(
    final ConnectwiseApi api,
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final String endpoint
  )
  {
    super(api, credentials, xmlMapper, endpoint + "MarketingApi.asmx");
  }
}
