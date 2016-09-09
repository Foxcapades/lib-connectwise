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

import io.vulpine.connectwise.api.endpoints.activity.delete.DeleteActivity;
import io.vulpine.connectwise.api.endpoints.agreement.delete.*;
import io.vulpine.connectwise.api.endpoints.company.delete.DeleteCompany;
import io.vulpine.connectwise.api.endpoints.company.delete.DeleteCompanyNote;
import io.vulpine.connectwise.api.endpoints.company.delete.DeleteCompanyTeam;
import io.vulpine.connectwise.api.endpoints.configuration.delete.DeleteConfiguration;
import io.vulpine.connectwise.api.endpoints.configuration.delete.DeleteConfigurationType;
import io.vulpine.connectwise.api.endpoints.configuration.delete.DeleteConfigurationTypeQuestion;
import io.vulpine.connectwise.api.endpoints.configuration.delete.DeletePossibleResponse;
import io.vulpine.connectwise.api.endpoints.contact.delete.DeleteContact;
import io.vulpine.connectwise.api.endpoints.contact.delete.DeleteContactCommunicationItem;
import io.vulpine.connectwise.api.endpoints.contact.delete.DeleteContactNote;
import io.vulpine.connectwise.api.def.SubApiInterface;
import io.vulpine.connectwise.api.endpoints.document.delete.DeleteDocument;
import io.vulpine.connectwise.api.endpoints.opportunity.delete.*;
import io.vulpine.connectwise.api.endpoints.product.delete.*;

public interface Delete extends SubApiInterface
{
  DeleteActivity activity( int id );

  DeleteAddition addition( int id );

  DeleteAdjustment adjustment( int id );

  DeleteAgreement agreement( int id );

  DeleteAgreementSite agreementSite( int id );

  DeleteBoardDefault boardDefault( int id );

  DeleteCompany company( int id );

  DeleteCompanyNote companyNote( int id );

  DeleteCompanyTeam companyTeam( int id );

  DeleteConfiguration configuration( int id );

  DeleteConfigurationType configurationType( int id );

  DeleteConfigurationTypeQuestion configurationTypeQuestion( int id );

  DeleteContact contact( int id );

  DeleteContactCommunicationItem contactCommunicationItem( int id );

  DeleteContactNote contactNote( int id );

  DeleteDocument document( int id );

  DeleteForecast forecast( int id );

  DeleteOpportunity opportunity( int id );

  DeleteOpportunityDocument opportunityDocument( int id );

  DeleteOpportunityItem opportunityItem( int id );

  DeleteOpportunityNote opportunityNote( int id );

  DeleteOpportunityTeamMember opportunityTeamMember( int id );

  DeletePossibleResponse possibleResponse( int id );

  DeletePriceBreak priceBreak( int id );

  DeletePricingDetail pricingDetail( int id );

  DeletePricingSchedule pricingSchedule( int id );

  DeleteProduct product( int id );

  DeleteProductPickedAndShipped productPickedAndShipped( int id );

  DeleteRecurringRevenue recurringRevenue( int id );

  DeleteWorkRole workRole( int id );

  DeleteWorkType workType( int id );
}
