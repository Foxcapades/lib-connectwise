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
import io.vulpine.connectwise.api.endpoints.activity.add.AddActivity;
import io.vulpine.connectwise.api.common.ConnectwiseSubApi;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.endpoints.company.add.AddCompany;
import io.vulpine.connectwise.api.endpoints.configuration.add.AddConfiguration;
import io.vulpine.connectwise.api.endpoints.configuration.add.AddConfigurationType;
import io.vulpine.connectwise.api.endpoints.contact.add.AddContactToGroup;
import io.vulpine.connectwise.api.endpoints.document.add.AddDocuments;
import io.vulpine.connectwise.api.endpoints.opportunity.add.AddForecastAndRecurringRevenue;
import io.vulpine.connectwise.api.endpoints.opportunity.add.AddOpportunity;
import io.vulpine.connectwise.api.endpoints.opportunity.add.AddOpportunityDocuments;
import io.vulpine.connectwise.api.endpoints.opportunity.add.AddOpportunityItem;
import io.vulpine.connectwise.api.endpoints.product.add.AddProduct;

class AddImpl extends ConnectwiseSubApi implements Add
{
  public AddImpl(
    final ConnectwiseApi api,
    final Credentials credentials,
    final XmlMapper xmlMapper
  )
  {
    super(api, credentials, xmlMapper);
  }

  public AddActivity activity()
  {
    return new AddActivity();
  }

  @Override
  public AddCompany company()
  {
    return new AddCompany(credentials, xmlMapper, this);
  }

  public AddConfiguration configuration()
  {
   return new AddConfiguration();
  }

  public AddConfigurationType configurationType()
  {
    return new AddConfigurationType();
  }

  public AddContactToGroup contactToGroup()
  {
    return new AddContactToGroup();
  }

  public AddDocuments documents()
  {
    return new AddDocuments();
  }

  public AddForecastAndRecurringRevenue forecastAndRecurringRevenue()
  {
    return new AddForecastAndRecurringRevenue();
  }

  public AddOpportunity opportunity()
  {
    return new AddOpportunity();
  }

  public AddOpportunityDocuments opportunityDocuments()
  {
    return new AddOpportunityDocuments();
  }

  public AddOpportunityItem opportunityItem()
  {
    return new AddOpportunityItem();
  }

  public AddProduct product()
  {
    return new AddProduct();
  }
}
