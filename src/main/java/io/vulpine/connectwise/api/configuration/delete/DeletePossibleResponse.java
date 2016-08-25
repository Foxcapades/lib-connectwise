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
package io.vulpine.connectwise.api.configuration.delete;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.def.ConnectwiseSubApiInterface;
import io.vulpine.connectwise.api.request.Credentials;
import io.vulpine.connectwise.api.request.DeleteRequest;

import java.io.IOException;

public class DeletePossibleResponse extends DeleteRequest
{
  public DeletePossibleResponse(
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