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
 *
 */

package io.vulpine.connectwise.api.product.find;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vulpine.connectwise.type.product.FoundProduct;

import java.util.List;

@JacksonXmlRootElement( localName = "FindProductsResponse" )
public class FindProductsResponse
{
  protected final List < FoundProduct > results;

  @JsonCreator
  public FindProductsResponse (
    @JacksonXmlProperty( localName = "FindProductsResult" ) final List < FoundProduct > results
  )
  {
    this.results = results;
  }

  public List < FoundProduct > getResults ()
  {
    return results;
  }
}
