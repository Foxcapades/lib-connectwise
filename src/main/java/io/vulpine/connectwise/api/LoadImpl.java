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

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.api.endpoints.activity.LoadActivity;
import io.vulpine.connectwise.api.common.ConnectwiseSubApi;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.endpoints.company.LoadCompany;
import io.vulpine.connectwise.api.endpoints.configuration.LoadConfiguration;
import io.vulpine.connectwise.api.endpoints.configuration.LoadConfigurationType;
import io.vulpine.connectwise.api.endpoints.contact.LoadContact;
import io.vulpine.connectwise.api.endpoints.invoice.LoadInvoice;
import io.vulpine.connectwise.api.endpoints.opportunity.LoadOpportunity;
import io.vulpine.connectwise.api.endpoints.product.LoadProduct;

class LoadImpl extends ConnectwiseSubApi implements Load
{
  public LoadImpl(
    final ConnectwiseApi api,
    final Credentials credentials,
    final XmlMapper xmlMapper
  )
  {
    super(api, credentials, xmlMapper);
  }

  public LoadActivity activity()
  {
    return new LoadActivity();
  }

  public LoadCompany company()
  {
    return new LoadCompany();
  }

  public LoadConfiguration configuration()
  {
    return new LoadConfiguration();
  }

  public LoadConfigurationType configurationType()
  {
    return new LoadConfigurationType();
  }

  public LoadContact contact()
  {
    return new LoadContact();
  }

  public LoadInvoice invoice()
  {
    return new LoadInvoice();
  }

  public LoadOpportunity opportunity()
  {
    return new LoadOpportunity();
  }

  public LoadProduct product()
  {
    return new LoadProduct();
  }
}
