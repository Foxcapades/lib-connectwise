package io.vulpine.connectwise.api.endpoints.product.find;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.common.request.FindRequest;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.endpoints.Endpoint;

abstract class _Commons< T > extends FindRequest < T >
{
  public _Commons(
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final SubApiInterface api
  )
  {
    super(credentials, xmlMapper, api, Endpoint.PRODUCT);
  }
}
