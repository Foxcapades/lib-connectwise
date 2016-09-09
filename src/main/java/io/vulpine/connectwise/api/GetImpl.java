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
import io.vulpine.connectwise.api.common.ConnectwiseSubApi;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.endpoints.activity.get.GetActivity;
import io.vulpine.connectwise.api.endpoints.agreement.get.*;
import io.vulpine.connectwise.api.endpoints.company.get.GetCompany;
import io.vulpine.connectwise.api.endpoints.company.get.GetCompanyNote;
import io.vulpine.connectwise.api.endpoints.company.get.GetCompanyProfile;
import io.vulpine.connectwise.api.endpoints.company.get.GetCompanyTeam;
import io.vulpine.connectwise.api.endpoints.company.getAll.GetAllCompanyNotes;
import io.vulpine.connectwise.api.endpoints.configuration.get.GetConfiguration;
import io.vulpine.connectwise.api.endpoints.configuration.get.GetConfigurationType;
import io.vulpine.connectwise.api.endpoints.contact.get.*;
import io.vulpine.connectwise.api.endpoints.contact.getAll.GetAllCommunicationTypesAndDescription;
import io.vulpine.connectwise.api.endpoints.contact.getAll.GetAllContactCommunicationItems;
import io.vulpine.connectwise.api.endpoints.contact.getAll.GetAllContactNotes;
import io.vulpine.connectwise.api.endpoints.document.get.GetDocument;
import io.vulpine.connectwise.api.endpoints.invoice.get.*;
import io.vulpine.connectwise.api.endpoints.managedDevice.get.GetManagedGroup;
import io.vulpine.connectwise.api.endpoints.managedDevice.get.GetManagedServer;
import io.vulpine.connectwise.api.endpoints.managedDevice.get.GetManagedWorkstations;
import io.vulpine.connectwise.api.endpoints.managedDevice.get.GetManagementItSetupsName;
import io.vulpine.connectwise.api.endpoints.member.get.GetMemberIdByRemoteSupportPackageAuthenticationCredentials;
import io.vulpine.connectwise.api.endpoints.opportunity.get.GetOpportunity;
import io.vulpine.connectwise.api.endpoints.opportunity.get.GetOpportunityDocuments;
import io.vulpine.connectwise.api.endpoints.product.get.*;
import io.vulpine.connectwise.api.endpoints.time.get.TimeEntry;

class GetImpl extends ConnectwiseSubApi implements Get
{
  public GetImpl(
    final ConnectwiseApi api,
    final Credentials credentials,
    final XmlMapper xmlMapper
  )
  {
    super(api, credentials, xmlMapper);
  }

  public GetActivity activity()
  {
    return new GetActivity();
  }

  @Override
  public GetAddition addition( final int id )
  {
    return new GetAddition(credentials, xmlMapper, this, id);
  }

  public GetAdjustment adjustment()
  {
    return new GetAdjustment();
  }

  @Override
  public GetAgreement agreement( final int id )
  {
    return new GetAgreement(credentials, xmlMapper, this, id);
  }

  public GetAgreementSite agreementSite()
  {
    return new GetAgreementSite();
  }

  public GetAllCompanyNotes allCompanyNotes()
  {
    return new GetAllCompanyNotes();
  }

  public GetAllCommunicationTypesAndDescription allCommunicationTypesAndDescription()
  {
    return new GetAllCommunicationTypesAndDescription();
  }

  public GetAllContactCommunicationItems allContactCommunicationItems()
  {
    return new GetAllContactCommunicationItems();
  }

  public GetAllContactNotes allContactNotes()
  {
    return new GetAllContactNotes();
  }

  public GetApplyToForCompanyByType applyToForCompanyByType()
  {
    return new GetApplyToForCompanyByType();
  }

  public GetAvatarImage avatarImage()
  {
    return new GetAvatarImage();
  }

  @Override
  public GetBoardDefault boardDefault( final int id )
  {
    return new GetBoardDefault(credentials, xmlMapper, this, id);
  }

  @Override
  public GetCompany company( final int id )
  {
    return new GetCompany(credentials, xmlMapper, this, id);
  }

  public GetCompanyNote companyNote()
  {
    return new GetCompanyNote();
  }

  public GetCompanyProfile companyProfile()
  {
    return new GetCompanyProfile();
  }

  public GetCompanyTeam companyTeam()
  {
    return new GetCompanyTeam();
  }

  @Override
  public GetConfiguration configuration( final int id )
  {
    return new GetConfiguration(credentials, xmlMapper, this, id);
  }

  @Override
  public GetConfigurationType configurationType( final int id )
  {
    return new GetConfigurationType(credentials, xmlMapper, this, id);
  }

  @Override
  public Contact contact( final int id )
  {
    return new Contact(credentials, xmlMapper, this, id);
  }

  public GetContactCommunicationItem contactCommunicationItem()
  {
    return new GetContactCommunicationItem();
  }

  @Override
  public ContactNote contactNote( final int id )
  {
    return new ContactNote(credentials, xmlMapper, this, id);
  }

  public GetDocument document()
  {
    return new GetDocument();
  }

  public GetInvoice invoice()
  {
    return new GetInvoice();
  }

  public GetInvoiceByInvoiceNumber invoiceByInvoiceNumber()
  {
    return new GetInvoiceByInvoiceNumber();
  }

  public GetInvoicePdf invoicePdf()
  {
    return new GetInvoicePdf();
  }

  public GetManagedGroup managedGroup()
  {
    return new GetManagedGroup();
  }

  public GetManagedServer managedServer()
  {
    return new GetManagedServer();
  }

  public GetManagedWorkstations managedWorkstations()
  {
    return new GetManagedWorkstations();
  }

  public GetManagementItSetupsName managementItSetupsName()
  {
    return new GetManagementItSetupsName();
  }

  public GetMemberIdByRemoteSupportPackageAuthenticationCredentials memberIdByRemoteSupportPackageAuthenticationCredentials()
  {
    return new GetMemberIdByRemoteSupportPackageAuthenticationCredentials();
  }

  public GetOpportunity opportunity()
  {
    return new GetOpportunity();
  }

  public GetOpportunityDocuments opportunityDocuments()
  {
    return new GetOpportunityDocuments();
  }

  public GetPortalConfigSettings portalConfigSettings()
  {
    return new GetPortalConfigSettings();
  }

  public GetPortalSecurity portalSecurity()
  {
    return new GetPortalSecurity();
  }

  public GetPresenceStatus presenceStatus()
  {
    return new GetPresenceStatus();
  }

  public GetPriceBreak priceBreak()
  {
    return new GetPriceBreak();
  }

  public GetPricingDetail pricingDetail()
  {
    return new GetPricingDetail();
  }

  public GetPricingSchedule pricingSchedule()
  {
    return new GetPricingSchedule();
  }

  @Override
  public GetProduct product( final int id )
  {
    return new GetProduct(credentials, xmlMapper, this, id);
  }

  public GetProductPickedAndShipped productPickedAndShipped()
  {
    return new GetProductPickedAndShipped();
  }

  public GetQuantityOnHand quantityOnHand()
  {
    return new GetQuantityOnHand();
  }

  public GetSpecialInvoice specialInvoice()
  {
    return new GetSpecialInvoice();
  }

  public GetSpecialInvoiceByInvoiceNumber specialInvoiceByInvoiceNumber()
  {
    return new GetSpecialInvoiceByInvoiceNumber();
  }

  @Override
  public TimeEntry timeEntry( final int id )
  {
    return new TimeEntry(credentials, xmlMapper, this, id);
  }

  public GetWorkRole workRole()
  {
    return new GetWorkRole();
  }

  public GetWorkType workType()
  {
    return new GetWorkType();
  }
}
