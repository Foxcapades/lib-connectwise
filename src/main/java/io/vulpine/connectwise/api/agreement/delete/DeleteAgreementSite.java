package io.vulpine.connectwise.api.agreement.delete;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.def.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.DeleteRequest;

import java.io.IOException;

public class DeleteAgreementSite extends DeleteRequest
{
  public DeleteAgreementSite(
    final Credentials c,
    final XmlMapper x,
    final ConnectwiseSubApiInterface i
  )
  {
    super(c, x, i);
  }

  @Override
  public Void submit() throws IOException
  {
    return null;
  }
}
