package io.vulpine.connectwise.api.product;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ApiDivision;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.product.addOrUpdate.*;
import io.vulpine.connectwise.api.request.Credentials;

public class AddOrUpdate extends ApiDivision
{
  public AddOrUpdate(
    final Credentials credentials,
    final XmlMapper mapper,
    final ConnectwiseSubApiInterface api
  )
  {
    super(credentials, mapper, api);
  }

  public AddOrUpdatePriceBreak priceBreak()
  {
    return new AddOrUpdatePriceBreak();
  }

  public AddOrUpdatePricingDetail pricingDetail()
  {
    return new AddOrUpdatePricingDetail();
  }

  public AddOrUpdatePricingSchedule pricingSchedule()
  {
    return new AddOrUpdatePricingSchedule();
  }

  public AddOrUpdateProduct product()
  {
    return new AddOrUpdateProduct();
  }

  public AddOrUpdateProductPickedAndShipped productPickedAndShipped()
  {
    return new AddOrUpdateProductPickedAndShipped();
  }
}
