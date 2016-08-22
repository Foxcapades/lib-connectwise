package io.vulpine.connectwise.api.agreement.addOrUpdate;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.AddOrUpdateRequest;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.type.agreement.addition.Addition;

public class AddOrUpdateAgreementAddition extends AddOrUpdateRequest < Addition >
{
  public AddOrUpdateAgreementAddition(
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final ConnectwiseSubApiInterface api,
    final Addition data
  )
  {
    super(credentials, xmlMapper, api, data);
  }
}
