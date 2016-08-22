package io.vulpine.connectwise.api.product;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ApiDivision;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.product.update.UpdateProduct;
import io.vulpine.connectwise.api.request.Credentials;

public class Update extends ApiDivision
{
  public Update(
    final Credentials credentials,
    final XmlMapper mapper,
    final ConnectwiseSubApiInterface api
  )
  {
    super(credentials, mapper, api);
  }

  public UpdateProduct product()
  {
    return new UpdateProduct();
  }
}
