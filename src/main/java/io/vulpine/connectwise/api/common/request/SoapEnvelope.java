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

package io.vulpine.connectwise.api.common.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.HashMap;
import java.util.Map;

@JacksonXmlRootElement(localName = "soap:Envelope")
public class SoapEnvelope
{
  @JacksonXmlProperty(localName = "xmlns:xsi", isAttribute = true)
  public final String xsi = "http://www.w3.org/2001/XMLSchema-instance";

  @JacksonXmlProperty(localName = "xmlns:xsd", isAttribute = true)
  public final String xsd = "http://www.w3.org/2001/XMLSchema";

  @JacksonXmlProperty(localName = "xmlns:soap", isAttribute = true)
  public final String soap = "http://schemas.xmlsoap.org/soap/envelope/";

  @JacksonXmlProperty(localName = "soap:Body")
  public final Map < String, ConnectwiseRequest > e;

  public SoapEnvelope ( final ConnectwiseRequest r )
  {
    e = new HashMap < String, ConnectwiseRequest >(1);
    e.put(r.getClass().getAnnotation(JacksonXmlRootElement.class).localName(), r);
  }
}
