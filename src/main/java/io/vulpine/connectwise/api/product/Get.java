package io.vulpine.connectwise.api.product;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ApiDivision;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.product.get.*;
import io.vulpine.connectwise.api.request.Credentials;

public class Get extends ApiDivision
{
  public Get(
    final Credentials credentials,
    final XmlMapper mapper,
    final ConnectwiseSubApiInterface api
  )
  {
    super(credentials, mapper, api);
  }

  public GetPriceBreak priceBreak()
  {
    return new GetPriceBreak();
  }

  public GetPricingDetail pricingDetail()
  {
    return new GetPricingDetail();
  }

  public GetPricingSchedule pricingSchedule()
  {
    return new GetPricingSchedule();
  }

  public GetProduct product()
  {
    return new GetProduct();
  }

  public GetProductPickedAndShipped productPickedAndShipped()
  {
    return new GetProductPickedAndShipped();
  }

  public GetQuantityOnHand quantityOnHand()
  {
    return new GetQuantityOnHand();
  }
}
