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
package io.vulpine.connectwise.api;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AgreementApiTest
{
  @Test
  public void addOrUpdateDoesNotReturnNull() throws Exception
  {
    final AgreementApi agreement = new AgreementApi(null, null, null, "");
    assertTrue(null != agreement.addOrUpdate());
  }

  @Test
  public void addOrUpdateReturnsOnlyOneInstance() throws Exception
  {
    final AgreementApi agreement = new AgreementApi(null, null, null, "");
    assertTrue(agreement.addOrUpdate() == agreement.addOrUpdate());
  }

  @Test
  public void deleteDoesNotReturnNull() throws Exception
  {
    final AgreementApi agreement = new AgreementApi(null, null, null, "");
    assertTrue(null != agreement.delete());
  }

  @Test
  public void deleteReturnsOnlyOneInstance() throws Exception
  {
    final AgreementApi agreement = new AgreementApi(null, null, null, "");
    assertTrue(agreement.delete() == agreement.delete());
  }

  @Test
  public void findDoesNotReturnNull() throws Exception
  {
    final AgreementApi agreement = new AgreementApi(null, null, null, "");
    assertTrue(null != agreement.find());
  }

  @Test
  public void findReturnsOnlyOneInstance() throws Exception
  {
    final AgreementApi agreement = new AgreementApi(null, null, null, "");
    assertTrue(agreement.find() == agreement.find());
  }

  @Test
  public void getDoesNotReturnNull() throws Exception
  {
    final AgreementApi agreement = new AgreementApi(null, null, null, "");
    assertTrue(null != agreement.get());
  }

  @Test
  public void getReturnsOnlyOneInstance() throws Exception
  {
    final AgreementApi agreement = new AgreementApi(null, null, null, "");
    assertTrue(agreement.get() == agreement.get());
  }

}
