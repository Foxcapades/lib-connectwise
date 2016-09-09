package io.vulpine.connectwise.api.endpoints.product.get;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.common.request.GetRequest;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.endpoints.Endpoint;

abstract class _Common < T > extends GetRequest < T >
{
  public _Common(
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final SubApiInterface api,
    final int id
  )
  {
    super(credentials, xmlMapper, api, Endpoint.PRODUCT, id);
  }
}
