package io.vulpine.connectwise.api.product;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ApiDivision;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.product.set.SetCompanyPricingSchedule;
import io.vulpine.connectwise.api.request.Credentials;

public class Set extends ApiDivision
{

  public Set(
    final Credentials credentials,
    final XmlMapper mapper,
    final ConnectwiseSubApiInterface api
  )
  {
    super(credentials, mapper, api);
  }

  public SetCompanyPricingSchedule companyPricingSchedule()
  {
    return new SetCompanyPricingSchedule();
  }
}
