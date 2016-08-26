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

import de.bechte.junit.runners.context.HierarchicalContextRunner;
import io.vulpine.connectwise.api.def.SubApiInterface;
import org.junit.Before;
import org.junit.runner.RunWith;

import java.lang.reflect.Method;

@RunWith( HierarchicalContextRunner.class )
public class AgreementApi_Test
{
  private AgreementApi api;

  @Before
  public void setUp()
  {
    api = new AgreementApi(null, null, null, "");
  }

  public class addOrUpdate extends SubApiMethodTest
  {
    @Override public Method getMethod() throws NoSuchMethodException { return api.getClass().getMethod("addOrUpdate"); }
    @Override public SubApiInterface getApi()
    {
      return api;
    }
  }

  public class delete extends SubApiMethodTest
  {
    @Override public Method getMethod() throws NoSuchMethodException { return api.getClass().getMethod("delete"); }
    @Override public SubApiInterface getApi()
    {
      return api;
    }
  }

  public class find extends SubApiMethodTest
  {
    @Override public Method getMethod() throws NoSuchMethodException { return api.getClass().getMethod("find"); }
    @Override public SubApiInterface getApi()
    {
      return api;
    }
  }

  public class get extends SubApiMethodTest
  {
    @Override public Method getMethod() throws NoSuchMethodException { return api.getClass().getMethod("get"); }
    @Override public SubApiInterface getApi()
    {
      return api;
    }
  }
}
