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
import io.vulpine.connectwise.api.endpoints.activity.AddOrUpdateActivity;
import io.vulpine.connectwise.api.endpoints.agreement.*;
import io.vulpine.connectwise.api.common.ConnectwiseSubApi;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.endpoints.company.AddOrUpdateCompany;
import io.vulpine.connectwise.api.endpoints.company.AddOrUpdateCompanyCustomField;
import io.vulpine.connectwise.api.endpoints.company.AddOrUpdateCompanyNote;
import io.vulpine.connectwise.api.endpoints.company.AddOrUpdateCompanyTeam;
import io.vulpine.connectwise.api.endpoints.configuration.AddOrUpdateConfiguration;
import io.vulpine.connectwise.api.endpoints.configuration.AddOrUpdateConfigurationType;
import io.vulpine.connectwise.api.endpoints.contact.AddOrUpdateContact;
import io.vulpine.connectwise.api.endpoints.contact.AddOrUpdateContactCommunicationItem;
import io.vulpine.connectwise.api.endpoints.contact.AddOrUpdateContactNote;
import io.vulpine.connectwise.api.endpoints.invoice.AddOrUpdateSpecialInvoice;
import io.vulpine.connectwise.api.endpoints.invoice.AddOrUpdateSpecialInvoiceProduct;
import io.vulpine.connectwise.api.endpoints.opportunity.AddOrUpdateForecastAndRecurringRevenue;
import io.vulpine.connectwise.api.endpoints.opportunity.AddOrUpdateOpportunity;
import io.vulpine.connectwise.api.endpoints.opportunity.AddOrUpdateOpportunityItem;
import io.vulpine.connectwise.api.endpoints.product.*;
import io.vulpine.connectwise.type.agreement.SimpleAgreement;
import io.vulpine.connectwise.type.agreement.addition.Addition;
import io.vulpine.connectwise.type.agreement.adjustment.Adjustment;
import io.vulpine.connectwise.type.agreement.workrole.WorkRole;
import io.vulpine.connectwise.type.agreement.worktype.WorkType;
import io.vulpine.connectwise.type.company.Company;
import io.vulpine.connectwise.type.company.CompanyNote;
import io.vulpine.connectwise.type.configuration.SimpleConfiguration;
import io.vulpine.connectwise.type.configuration.ConfigurationType;

class AddOrUpdateImpl extends ConnectwiseSubApi implements AddOrUpdate
{
  public AddOrUpdateImpl(
    final ConnectwiseApi api,
    final Credentials credentials,
    final XmlMapper xmlMapper
  )
  {
    super(api, credentials, xmlMapper);
  }

  public AddOrUpdateActivity activity()
  {
    return new AddOrUpdateActivity();
  }

  @Override
  public AddOrUpdateAddition addition()
  {
    return new AddOrUpdateAddition(credentials, xmlMapper, this, new Addition());
  }

  @Override
  public AddOrUpdateAddition addition( final Addition addition )
  {
    return new AddOrUpdateAddition(credentials, xmlMapper, this, addition);
  }

  public AddOrUpdateAdjustment adjustment()
  {
    return new AddOrUpdateAdjustment();
  }

  public AddOrUpdateAdjustment adjustment( final Adjustment adjustment )
  {
    return new AddOrUpdateAdjustment();
  }

  @Override
  public AddOrUpdateAgreement agreement()
  {
    return new AddOrUpdateAgreement(credentials, xmlMapper, this, new SimpleAgreement());
  }

  @Override
  public AddOrUpdateAgreement agreement( final SimpleAgreement agreement )
  {
    return new AddOrUpdateAgreement(credentials, xmlMapper, this, agreement);
  }

  public AddOrUpdateCompany company()
  {
    return new AddOrUpdateCompany();
  }

  public AddOrUpdateCompany company( final Company company )
  {
    return new AddOrUpdateCompany();
  }

  public AddOrUpdateCompanyCustomField companyCustomField()
  {
    return new AddOrUpdateCompanyCustomField();
  }

  public AddOrUpdateCompanyNote companyNote()
  {
    return new AddOrUpdateCompanyNote();
  }

  public AddOrUpdateCompanyNote companyNote( final CompanyNote note )
  {
    return new AddOrUpdateCompanyNote();
  }

  public AddOrUpdateCompanyTeam companyTeam()
  {
    return new AddOrUpdateCompanyTeam();
  }

  public AddOrUpdateConfiguration configuration()
  {
    return new AddOrUpdateConfiguration();
  }

  public AddOrUpdateConfiguration configuration( final SimpleConfiguration configuration )
  {
    return new AddOrUpdateConfiguration();
  }

  public AddOrUpdateConfigurationType configurationType()
  {
    return new AddOrUpdateConfigurationType();
  }

  public AddOrUpdateConfigurationType configurationType( final ConfigurationType type )
  {
    return new AddOrUpdateConfigurationType();
  }

  public AddOrUpdateContact contact()
  {
    return new AddOrUpdateContact();
  }

  public AddOrUpdateContactCommunicationItem contactCommunicationItem()
  {
    return new AddOrUpdateContactCommunicationItem();
  }

  public AddOrUpdateContactNote contactNote()
  {
    return new AddOrUpdateContactNote();
  }

  public AddOrUpdateForecastAndRecurringRevenue forecastAndRecurringRevenue()
  {
    return new AddOrUpdateForecastAndRecurringRevenue();
  }

  public AddOrUpdateOpportunity opportunity()
  {
    return new AddOrUpdateOpportunity();
  }

  public AddOrUpdateOpportunityItem opportunityItem()
  {
    return new AddOrUpdateOpportunityItem();
  }

  public AddOrUpdatePriceBreak priceBreak()
  {
    return new AddOrUpdatePriceBreak();
  }

  public AddOrUpdatePricingDetail pricingDetail()
  {
    return new AddOrUpdatePricingDetail();
  }

  public AddOrUpdatePricingSchedule pricingSchedule()
  {
    return new AddOrUpdatePricingSchedule();
  }

  public AddOrUpdateProduct product()
  {
    return new AddOrUpdateProduct();
  }

  public AddOrUpdateProductPickedAndShipped productPickedAndShipped()
  {
    return new AddOrUpdateProductPickedAndShipped();
  }

  public AddOrUpdateSpecialInvoice specialInvoice()
  {
    return new AddOrUpdateSpecialInvoice();
  }

  public AddOrUpdateSpecialInvoiceProduct specialInvoiceProduct()
  {
    return new AddOrUpdateSpecialInvoiceProduct();
  }

  public AddOrUpdateWorkRole workRole()
  {
    return new AddOrUpdateWorkRole();
  }

  public AddOrUpdateWorkRole workRole( final WorkRole workRole )
  {
    return new AddOrUpdateWorkRole();
  }

  public AddOrUpdateWorkType workType()
  {
    return new AddOrUpdateWorkType();
  }

  public AddOrUpdateWorkType workType( final WorkType workType )
  {
    return new AddOrUpdateWorkType();
  }
}
