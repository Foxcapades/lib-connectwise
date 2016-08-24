package io.vulpine.connectwise.api.product;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.ApiDivision;
import io.vulpine.connectwise.api.def.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.product.delete.*;
import io.vulpine.connectwise.api.request.Credentials;

public class Delete extends ApiDivision
{
  public Delete(
    final Credentials credentials,
    final XmlMapper mapper,
    final ConnectwiseSubApiInterface api
  )
  {
    super(credentials, mapper, api);
  }

  public DeletePriceBreak priceBreak()
  {
    return new DeletePriceBreak(credentials, mapper, api);
  }

  public DeletePricingDetail pricingDetail()
  {
    return new DeletePricingDetail(credentials, mapper, api);
  }

  public DeletePricingSchedule pricingSchedule()
  {
    return new DeletePricingSchedule(credentials, mapper, api);
  }

  public DeleteProduct product()
  {
    return new DeleteProduct(credentials, mapper, api);
  }

  public DeleteProductPickedAndShipped productPickedAndShipped()
  {
    return new DeleteProductPickedAndShipped(credentials, mapper, api);
  }
}
