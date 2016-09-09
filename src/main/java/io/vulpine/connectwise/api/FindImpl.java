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
import io.vulpine.connectwise.api.endpoints.activity.find.FindActivities;
import io.vulpine.connectwise.api.endpoints.agreement.find.*;
import io.vulpine.connectwise.api.common.ConnectwiseSubApi;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.endpoints.company.find.FindCompanies;
import io.vulpine.connectwise.api.endpoints.configuration.find.FindConfigurationCount;
import io.vulpine.connectwise.api.endpoints.configuration.find.FindConfigurationTypes;
import io.vulpine.connectwise.api.endpoints.configuration.find.FindConfigurations;
import io.vulpine.connectwise.api.endpoints.contact.find.FindContactCount;
import io.vulpine.connectwise.api.endpoints.contact.find.FindContacts;
import io.vulpine.connectwise.api.endpoints.document.find.FindDocuments;
import io.vulpine.connectwise.api.endpoints.invoice.find.FindInvoiceCount;
import io.vulpine.connectwise.api.endpoints.invoice.find.FindInvoices;
import io.vulpine.connectwise.api.endpoints.invoice.find.FindSpecialInvoices;
import io.vulpine.connectwise.api.endpoints.member.find.FindMembers;
import io.vulpine.connectwise.api.endpoints.opportunity.find.FindOpportunities;
import io.vulpine.connectwise.api.endpoints.opportunity.find.FindOpportunityCount;
import io.vulpine.connectwise.api.endpoints.product.find.FindPriceBreaks;
import io.vulpine.connectwise.api.endpoints.product.find.FindPricingDetails;
import io.vulpine.connectwise.api.endpoints.product.find.FindPricingSchedules;
import io.vulpine.connectwise.api.endpoints.product.find.FindProducts;

class FindImpl extends ConnectwiseSubApi implements Find
{
  public FindImpl(
    final ConnectwiseApi api,
    final Credentials credentials,
    final XmlMapper xmlMapper
  )
  {
    super(api, credentials, xmlMapper);
  }

  public FindActivities activities()
  {
    return new FindActivities();
  }

  @Override
  public FindAdditions additions()
  {
    return new FindAdditions(credentials, xmlMapper, this);
  }

  public FindAdjustments adjustments()
  {
    return new FindAdjustments();
  }

  @Override
  public FindAgreements agreements()
  {
    return new FindAgreements(credentials, xmlMapper, this);
  }

  public FindAgreementSite agreementSites()
  {
    return new FindAgreementSite();
  }

  public FindWorkRoles agreementWorkRoles()
  {
    return new FindWorkRoles();
  }

  public FindWorkTypes agreementWorkTypes()
  {
    return new FindWorkTypes();
  }

  @Override
  public FindCompanies companies()
  {
    return new FindCompanies(credentials, xmlMapper, this);
  }

  public FindConfigurationCount configurationCount()
  {
    return new FindConfigurationCount();
  }

  public FindConfigurations configurations()
  {
    return new FindConfigurations();
  }

  public FindConfigurationTypes configurationTypes()
  {
    return new FindConfigurationTypes();
  }

  public FindContactCount contactCount()
  {
    return new FindContactCount();
  }

  @Override
  public FindContacts contacts()
  {
    return new FindContacts(credentials, xmlMapper, this);
  }

  public FindDocuments documents()
  {
    return new FindDocuments();
  }

  public FindInvoiceCount invoiceCount()
  {
    return new FindInvoiceCount();
  }

  public FindInvoices invoices()
  {
    return new FindInvoices();
  }

  public FindSpecialInvoices specialInvoices()
  {
    return new FindSpecialInvoices();
  }

  public FindMembers members()
  {
    return new FindMembers();
  }

  public FindOpportunities opportunities()
  {
    return new FindOpportunities();
  }

  public FindOpportunityCount opportunityCount()
  {
    return new FindOpportunityCount();
  }

  public FindPriceBreaks priceBreaks()
  {
    return new FindPriceBreaks();
  }

  public FindPricingDetails pricingDetails()
  {
    return new FindPricingDetails();
  }

  public FindPricingSchedules pricingSchedules()
  {
    return new FindPricingSchedules();
  }

  @Override
  public FindProducts products()
  {
    return new FindProducts(credentials, xmlMapper, this);
  }
}
