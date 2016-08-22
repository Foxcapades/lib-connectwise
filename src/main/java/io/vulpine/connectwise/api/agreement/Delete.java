package io.vulpine.connectwise.api.agreement;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ApiDivision;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.agreement.delete.*;
import io.vulpine.connectwise.api.request.Credentials;

public class Delete extends ApiDivision
{
  public Delete ( Credentials credentials, XmlMapper mapper, ConnectwiseSubApiInterface api )
  {
    super(credentials, mapper, api);
  }

  public DeleteAgreementAdjustment adjustment()
  {
    return new DeleteAgreementAdjustment(credentials, mapper, api);
  }

  public DeleteAgreementSite site()
  {
    return new DeleteAgreementSite(credentials, mapper, api);
  }

  public DeleteAgreementWorkRole workRole()
  {
    return new DeleteAgreementWorkRole(credentials, mapper, api);
  }

  public DeleteAgreementWorkType workType()
  {
    return new DeleteAgreementWorkType(credentials, mapper, api);
  }

  public DeleteAgreement agreement()
  {
    return new DeleteAgreement(credentials, mapper, api);
  }

  public DeleteAgreementAddition addition()
  {
    return new DeleteAgreementAddition(credentials, mapper, api);
  }

  public DeleteAgreementBoardDefault boardDefault()
  {
    return new DeleteAgreementBoardDefault(credentials, mapper, api);
  }
}
