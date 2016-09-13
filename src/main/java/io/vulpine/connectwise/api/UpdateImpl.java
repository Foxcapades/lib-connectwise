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
import io.vulpine.connectwise.api.endpoints.activity.UpdateActivity;
import io.vulpine.connectwise.api.common.ConnectwiseSubApi;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.endpoints.company.UpdateCompany;
import io.vulpine.connectwise.api.endpoints.company.UpdateCompanyProfile;
import io.vulpine.connectwise.api.endpoints.configuration.UpdateConfiguration;
import io.vulpine.connectwise.api.endpoints.configuration.UpdateConfigurationType;
import io.vulpine.connectwise.api.endpoints.contact.UpdatePresenceStatus;
import io.vulpine.connectwise.api.endpoints.manageddevice.*;
import io.vulpine.connectwise.api.endpoints.opportunity.UpdateForecastAndRecurringRevenue;
import io.vulpine.connectwise.api.endpoints.opportunity.UpdateOpportunity;
import io.vulpine.connectwise.api.endpoints.opportunity.UpdateOpportunityItem;
import io.vulpine.connectwise.api.endpoints.product.UpdateProduct;

class UpdateImpl extends ConnectwiseSubApi implements Update
{
  public UpdateImpl(
    final ConnectwiseApi api,
    final Credentials credentials,
    final XmlMapper xmlMapper
  )
  {
    super(api, credentials, xmlMapper);
  }

  public UpdateActivity activity()
  {
    return new UpdateActivity();
  }

  public UpdateCompany company()
  {
    return new UpdateCompany();
  }

  public UpdateCompanyProfile companyProfile()
  {
    return new UpdateCompanyProfile();
  }

  public UpdateConfiguration configuration()
  {
    return new UpdateConfiguration();
  }

  public UpdateConfigurationType configurationType()
  {
    return new UpdateConfigurationType();
  }

  public UpdateForecastAndRecurringRevenue forecastAndRecurringRevenue()
  {
    return new UpdateForecastAndRecurringRevenue();
  }

  public UpdateManagedDevices managedDevices()
  {
    return new UpdateManagedDevices();
  }

  public UpdateManagedServers managedServers()
  {
    return new UpdateManagedServers();
  }

  public UpdateManagedWorkstations managedWorkstations()
  {
    return new UpdateManagedWorkstations();
  }

  public UpdateManagementSolution managementSolution()
  {
    return new UpdateManagementSolution();
  }

  public UpdateManagementSummaryReports managementSummaryReports()
  {
    return new UpdateManagementSummaryReports();
  }

  public UpdateOpportunity opportunity()
  {
    return new UpdateOpportunity();
  }

  public UpdateOpportunityItem opportunityItem()
  {
    return new UpdateOpportunityItem();
  }

  public UpdatePresenceStatus presenceStatus()
  {
    return new UpdatePresenceStatus();
  }

  public UpdateProduct product()
  {
    return new UpdateProduct();
  }

  public UpdateSpamStatsDomains spamStatsDomains()
  {
    return new UpdateSpamStatsDomains();
  }
}
