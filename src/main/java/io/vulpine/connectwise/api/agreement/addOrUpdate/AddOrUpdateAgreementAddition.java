package io.vulpine.connectwise.api.agreement.addOrUpdate;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.api.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.AddOrUpdateRequest;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.type.agreement.addition.Addition;

import java.io.IOException;

@JsonFilter( "filter-empty" )
@JacksonXmlRootElement( localName = "AddOrUpdateAgreementAddition" )
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

  @Override
  public Addition submit() throws IOException
  {
    final AddOrUpdateAgreementAdditionResponse response = xmlMapper
      .readerFor(AddOrUpdateAgreementAdditionResponse.class)
      .readValue(api.send(this));
    return null;
  }

  @JsonFilter( "filter-empty" )
  @JacksonXmlProperty ( localName = "agreementAddition" )
  public Addition getAddition()
  {
    return data;
  }
}
