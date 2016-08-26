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

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class FoundAgreementTest
{
  @Test
  public void getBoardId () throws Exception
  {
    final FoundAgreement agreement = new FoundAgreement();
    final Field prop = agreement.getClass().getDeclaredField("boardId");
    final int value = 123469872;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getBoardId());
  }

  @Test
  public void setBoardId () throws Exception
  {
    final FoundAgreement agreement = new FoundAgreement();
    final Field prop = agreement.getClass().getDeclaredField("boardId");
    final int value = 12321323;

    prop.setAccessible(true);
    agreement.setBoardId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isBoardDefault () throws Exception
  {
    final FoundAgreement agreement = new FoundAgreement();
    final Field prop = agreement.getClass().getDeclaredField("boardDefault");
    final boolean value = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isBoardDefault());
  }

  @Test
  public void setBoardDefault () throws Exception
  {
    final FoundAgreement agreement = new FoundAgreement();
    final Field prop = agreement.getClass().getDeclaredField("boardDefault");
    final boolean value = true;

    prop.setAccessible(true);
    agreement.setBoardDefault(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getServiceTypeId () throws Exception
  {
    final FoundAgreement agreement = new FoundAgreement();
    final Field prop = agreement.getClass().getDeclaredField("serviceTypeId");
    final int value = 1223;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getServiceTypeId());
  }

  @Test
  public void setServiceTypeId () throws Exception
  {
    final FoundAgreement agreement = new FoundAgreement();
    final Field prop = agreement.getClass().getDeclaredField("serviceTypeId");
    final int value = 1223;

    prop.setAccessible(true);
    agreement.setServiceTypeId(value);

    assertEquals(value, prop.get(agreement));
  }

}
