package io.vulpine.connectwise.api.request;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.type.CwObject;

public abstract class AddOrUpdateRequest < T extends CwObject > extends CwRequest < T >
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
