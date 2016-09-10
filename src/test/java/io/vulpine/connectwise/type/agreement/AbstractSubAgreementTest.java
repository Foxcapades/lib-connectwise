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
package io.vulpine.connectwise.type.agreement;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class AbstractSubAgreementTest
{
  private static Field prop;
  private AbstractSubAgreement agreement;

  @BeforeClass
  public static void setUpClass() throws Exception
  {
    prop = AbstractSubAgreement.class.getDeclaredField("agreementId");
  }

  @Before
  public void setUp()
  {
    agreement = new AbstractSubAgreement() {};
  }

  @After
  public void tearDown()
  {
    agreement = null;
  }


  @Test
  public void getAgreementId () throws Exception
  {
    final int test = 136546;
    prop.set(agreement, test);
    assertEquals(test, agreement.agreementId());
  }

  @Test
  public void setAgreementId () throws Exception
  {
    final int test = 666666;
    agreement.agreementId(test);
    assertEquals(test, prop.get(agreement));
  }
}
