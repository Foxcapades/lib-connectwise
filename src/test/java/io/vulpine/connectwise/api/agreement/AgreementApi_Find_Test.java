/*
 * Copyright 2016 Elizabeth Harper
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.vulpine.connectwise.api.agreement;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.agreement.find.FindAgreementAdditions;
import io.vulpine.connectwise.api.agreement.find.FindAgreements;
import io.vulpine.connectwise.api.common.Credentials;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AgreementApi_Find_Test
{
  private static final Credentials TEST_CREDENTIALS = new Credentials();

  private static final XmlMapper TEST_MAPPER = new XmlMapper();

  private static final AgreementApi TEST_API = new AgreementApi(null, null, null, "");

  private AgreementApi_Find find;

  @Before
  public void setUp() throws Exception
  {
    find = new AgreementApi_Find(TEST_CREDENTIALS, TEST_MAPPER, TEST_API);
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
