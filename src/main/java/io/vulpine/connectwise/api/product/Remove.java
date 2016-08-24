package io.vulpine.connectwise.api.product;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.common.ApiDivision;
import io.vulpine.connectwise.api.def.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.product.remove.RemoveCompanyPricingSchedule;
import io.vulpine.connectwise.api.request.Credentials;

public class Remove extends ApiDivision
{
  public Remove(
    final Credentials credentials,
    final XmlMapper mapper,
    final ConnectwiseSubApiInterface api
  )
  {
    super(credentials, mapper, api);
  }

  public RemoveCompanyPricingSchedule companyPricingSchedule()
  {
    return new RemoveCompanyPricingSchedule();
  }
}
