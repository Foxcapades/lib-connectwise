package io.vulpine.connectwise.api.request;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.def.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.type.ConnectwiseCommon;

public abstract class AddOrUpdateRequest < T extends ConnectwiseCommon > extends CwRequest < T >
{
  protected T data;

  public AddOrUpdateRequest(
    Credentials credentials,
    XmlMapper xmlMapper,
    ConnectwiseSubApiInterface api,
    T data
  )
  {
    super(credentials, xmlMapper, api);

    this.data = data;
  }

  public abstract T getRequestData();
}
