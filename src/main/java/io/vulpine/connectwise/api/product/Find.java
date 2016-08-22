package io.vulpine.connectwise.api.product;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ApiDivision;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.product.find.FindPriceBreaks;
import io.vulpine.connectwise.api.product.find.FindPricingDetails;
import io.vulpine.connectwise.api.product.find.FindPricingSchedules;
import io.vulpine.connectwise.api.product.find.FindProducts;
import io.vulpine.connectwise.api.request.Credentials;

public class Find extends ApiDivision
{
  public Find(
    final Credentials credentials,
    final XmlMapper mapper,
    final ConnectwiseSubApiInterface api
  )
  {
    super(credentials, mapper, api);
  }

  public FindPriceBreaks priceBreaks()
  {
    return new FindPriceBreaks();
  }

  public FindPricingDetails pricingDetails()
  {
    return new FindPricingDetails();
  }

  public FindPricingSchedules pricingSchedules()
  {
    return new FindPricingSchedules();
  }

  public FindProducts products()
  {
    return new FindProducts(credentials, mapper, api);
  }
}
