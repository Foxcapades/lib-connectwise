package io.vulpine.connectwise.api.endpoints.product.delete;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.common.request.DeleteRequest;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.endpoints.Endpoint;

abstract class _Commons extends DeleteRequest
{
  public _Commons(
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final SubApiInterface subApiInterface,
    final int id
  )
  {
    super(credentials, xmlMapper, subApiInterface, Endpoint.PRODUCT, id);
  }
}
