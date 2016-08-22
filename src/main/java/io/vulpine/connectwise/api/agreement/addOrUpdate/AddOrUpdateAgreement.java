package io.vulpine.connectwise.api.agreement.addOrUpdate;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.AddOrUpdateRequest;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.type.agreement.Agreement;

import java.io.IOException;

@JacksonXmlRootElement( localName = "AddOrUpdateAgreement" )
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

  @Override
  @JsonFilter( "filter-empty" )
  @JacksonXmlProperty( localName = "agreement" )
  public Agreement getRequestData()
  {
    return data;
  }

  @Override
  public Agreement submit() throws IOException
  {
    final AddOrUpdateAgreementResponse res = xmlMapper.readerFor(AddOrUpdateAgreementResponse.class).readValue(api.send(this));
    return res.getUpdatedAgreement();
  }
}
