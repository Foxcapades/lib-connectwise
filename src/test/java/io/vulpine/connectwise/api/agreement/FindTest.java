package io.vulpine.connectwise.api.agreement;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.AgreementApi;
import io.vulpine.connectwise.api.agreement.find.FindAgreementAdditions;
import io.vulpine.connectwise.api.agreement.find.FindAgreements;
import io.vulpine.connectwise.api.request.Credentials;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FindTest
{
  private static final Credentials TEST_CREDENTIALS = new Credentials();

  private static final XmlMapper TEST_MAPPER = new XmlMapper();

  private static final AgreementApi TEST_API = new AgreementApi(null, null, null, "");

  private Find find;

  @Before
  public void setUp() throws Exception
  {
    find = new Find(TEST_CREDENTIALS, TEST_MAPPER, TEST_API);
  }

  @Test
  public void agreements_returns_find_agreements_request_instance() throws Exception
  {
    assertThat(find.agreements(), is(instanceOf(FindAgreements.class)));
  }

  @Test
  public void additions_returns_find_additions_request_instance() throws Exception
  {
    assertThat(find.additions(), is(instanceOf(FindAgreementAdditions.class)));
  }

}
