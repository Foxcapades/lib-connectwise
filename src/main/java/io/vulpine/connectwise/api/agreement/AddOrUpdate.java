package io.vulpine.connectwise.api.agreement;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ApiDivision;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.agreement.addOrUpdate.*;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.type.agreement.Agreement;
import io.vulpine.connectwise.type.agreement.addition.Addition;

public class AddOrUpdate extends ApiDivision
{
  public AddOrUpdate ( Credentials credentials, XmlMapper mapper, ConnectwiseSubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  public AddOrUpdateAgreement agreement()
  {
    return new AddOrUpdateAgreement(credentials, mapper, api, new Agreement());
  }

  public AddOrUpdateAgreement agreement( final Agreement agreement )
  {
    return new AddOrUpdateAgreement(credentials, mapper, api, agreement);
  }

  public AddOrUpdateAgreementAddition addition()
  {
    return new AddOrUpdateAgreementAddition(credentials, mapper, api, new Addition());
  }

  public AddOrUpdateAgreementAddition addition( final Addition addition )
  {
    return new AddOrUpdateAgreementAddition(credentials, mapper, api, addition);
  }

  public AddOrUpdateAgreementAdjustment adjustment()
  {
    return new AddOrUpdateAgreementAdjustment();
  }

  public AddOrUpdateAgreementSite site()
  {
    return new AddOrUpdateAgreementSite();
  }

  public AddOrUpdateAgreementWorkRole workRole()
  {
    return new AddOrUpdateAgreementWorkRole();
  }

  public AddOrUpdateAgreementWorkType workType()
  {
    return new AddOrUpdateAgreementWorkType();
  }
}
