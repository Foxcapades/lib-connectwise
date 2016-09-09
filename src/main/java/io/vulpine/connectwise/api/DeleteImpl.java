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
import io.vulpine.connectwise.api.endpoints.activity.delete.DeleteActivity;
import io.vulpine.connectwise.api.endpoints.agreement.delete.*;
import io.vulpine.connectwise.api.common.ConnectwiseSubApi;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.endpoints.company.delete.*;
import io.vulpine.connectwise.api.endpoints.configuration.delete.*;
import io.vulpine.connectwise.api.endpoints.contact.delete.*;
import io.vulpine.connectwise.api.endpoints.document.delete.DeleteDocument;
import io.vulpine.connectwise.api.endpoints.invoice.delete.*;
import io.vulpine.connectwise.api.endpoints.opportunity.delete.*;
import io.vulpine.connectwise.api.endpoints.product.delete.*;

class DeleteImpl extends ConnectwiseSubApi implements Delete
{
  public DeleteImpl(
    final ConnectwiseApi api,
    final Credentials credentials,
    final XmlMapper xmlMapper
  )
  {
    super(api, credentials, xmlMapper);
  }

  @Override
  public DeleteActivity activity( final int id )
  {
    return new DeleteActivity(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteAddition addition( final int id )
  {
    return new DeleteAddition(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteAdjustment adjustment( final int id )
  {
    return new DeleteAdjustment(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteAgreement agreement( final int id )
  {
    return new DeleteAgreement(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteAgreementSite agreementSite( final int id )
  {
    return new DeleteAgreementSite(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteBoardDefault boardDefault( final int id )
  {
    return new DeleteBoardDefault(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteCompany company( final int id )
  {
    return new DeleteCompany(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteCompanyNote companyNote( final int id )
  {
    return new DeleteCompanyNote(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteCompanyTeam companyTeam( final int id )
  {
    return new DeleteCompanyTeam(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteConfiguration configuration( final int id )
  {
    return new DeleteConfiguration(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteConfigurationType configurationType( final int id )
  {
    return new DeleteConfigurationType(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteConfigurationTypeQuestion configurationTypeQuestion( final int id )
  {
    return new DeleteConfigurationTypeQuestion(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteContact contact( final int id )
  {
    return new DeleteContact(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteContactCommunicationItem contactCommunicationItem( final int id )
  {
    return new DeleteContactCommunicationItem(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteContactNote contactNote( final int id )
  {
    return new DeleteContactNote(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteDocument document( final int id )
  {
    return new DeleteDocument(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteForecast forecast( final int id )
  {
    return new DeleteForecast(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteOpportunity opportunity( final int id )
  {
    return new DeleteOpportunity(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteOpportunityDocument opportunityDocument( final int id )
  {
    return new DeleteOpportunityDocument(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteOpportunityItem opportunityItem( final int id )
  {
    return new DeleteOpportunityItem(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteOpportunityNote opportunityNote( final int id )
  {
    return new DeleteOpportunityNote(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteOpportunityTeamMember opportunityTeamMember( final int id )
  {
    return new DeleteOpportunityTeamMember(credentials, xmlMapper, this, id);
  }

  @Override
  public DeletePossibleResponse possibleResponse( final int id )
  {
    return new DeletePossibleResponse(credentials, xmlMapper, this, id);
  }

  @Override
  public DeletePriceBreak priceBreak( final int id )
  {
    return new DeletePriceBreak(credentials, xmlMapper, this, id);
  }

  @Override
  public DeletePricingDetail pricingDetail( final int id )
  {
    return new DeletePricingDetail(credentials, xmlMapper, this, id);
  }

  @Override
  public DeletePricingSchedule pricingSchedule( final int id )
  {
    return new DeletePricingSchedule(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteProduct product( final int id )
  {
    return new DeleteProduct(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteProductPickedAndShipped productPickedAndShipped( final int id )
  {
    return new DeleteProductPickedAndShipped(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteRecurringRevenue recurringRevenue( final int id )
  {
    return new DeleteRecurringRevenue(credentials, xmlMapper, this, id);
  }

  public DeleteSpecialInvoice specialInvoice( final int id )
  {
    return new DeleteSpecialInvoice();
  }

  public DeleteSpecialInvoiceByInvoiceNumber specialInvoiceByInvoiceNumber( final int invoiceNumber )
  {
    return new DeleteSpecialInvoiceByInvoiceNumber();
  }

  public DeleteSpecialInvoiceProduct specialInvoiceProduct( final int id )
  {
    return new DeleteSpecialInvoiceProduct();
  }


  @Override
  public DeleteWorkRole workRole( final int id )
  {
    return new DeleteWorkRole(credentials, xmlMapper, this, id);
  }

  @Override
  public DeleteWorkType workType( final int id )
  {
    return new DeleteWorkType(credentials, xmlMapper, this, id);
  }
}
