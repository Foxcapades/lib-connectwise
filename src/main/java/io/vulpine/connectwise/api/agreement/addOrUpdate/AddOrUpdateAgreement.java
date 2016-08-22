package io.vulpine.connectwise.api.agreement.addOrUpdate;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.AddOrUpdateRequest;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.type.agreement.Agreement;

public class AddOrUpdateAgreement extends AddOrUpdateRequest < Agreement >
{
  public AddOrUpdateAgreement(
    final Credentials credentials,
    final XmlMapper xmlMapper,
    final ConnectwiseSubApiInterface api,
    final Agreement data
  )
  {
    super(credentials, xmlMapper, api, data);
  }
}
