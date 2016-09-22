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

package io.vulpine.connectwise.type.project;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;

public class ProjectTicket extends ProjectCommon
{
  @JacksonXmlProperty( localName = "Summary" )
  protected String summary;

  @JacksonXmlProperty( localName = "DetailDescription" )
  protected String detailDescription;

  @JacksonXmlProperty( localName = "PhaseId" )
  protected Integer phaseId;

  @JacksonXmlProperty( localName = "ContactId" )
  protected Integer contactId;

  @JacksonXmlProperty( localName = "AddressId" )
  protected Integer addressId;

  @JacksonXmlProperty( localName = "SiteNameIdentifier" )
  protected String siteNameIdentifier;

  @JacksonXmlProperty( localName = "AgreementId" )
  protected Integer agreementId;

  @JacksonXmlProperty( localName = "OpportunityId" )
  protected Integer opportunityId;

  @JacksonXmlProperty( localName = "Status" )
  protected String status;

  @JacksonXmlProperty( localName = "ServiceTypeId" )
  protected Integer serviceTypeId;

  @JacksonXmlProperty( localName = "ServiceSubTypeId" )
  protected Integer serviceSubTypeId;

  @JacksonXmlProperty( localName = "ServiceItemId" )
  protected Integer serviceItemId;

  @JacksonXmlProperty( localName = "SourceId" )
  protected Integer sourceId;

  @JacksonXmlProperty( localName = "ServiceLocationId" )
  protected Integer serviceLocationId;

  @JacksonXmlProperty( localName = "Severity" )
  protected TicketFlag severity;

  @JacksonXmlProperty( localName = "Impact" )
  protected TicketFlag impact;

  @JacksonXmlProperty( localName = "PriorityId" )
  protected Integer priorityId;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty( localName = "RequiredDate" )
  protected Date requiredDate;

  @JacksonXmlProperty( localName = "Billable" )
  protected String billable;

  @JacksonXmlProperty( localName = "AssignedResources" )
  protected String assignedResources;

  @JacksonXmlProperty( localName = "ParentPhaseId" )
  protected Integer parentPhaseId;

  @JacksonXmlProperty( localName = "RecType" )
  protected String recType;

  @JacksonXmlProperty( localName = "BillingMethod" )
  protected String billingMethod;

  @JacksonXmlProperty( localName = "WbsCode" )
  protected String wbsCode;

  @JacksonXmlProperty( localName = "BudgetHours" )
  protected Double budgetHours;

  @JacksonXmlProperty( localName = "ProjectTicketSummaryInfo" )
  protected String projectTicketSummaryInfo;

  public String getSummary()
  {
    return summary;
  }

  public void setSummary( final String summary )
  {
    this.summary = summary;
  }

  public String getDetailDescription()
  {
    return detailDescription;
  }

  public void setDetailDescription( final String detailDescription )
  {
    this.detailDescription = detailDescription;
  }

  public Integer getPhaseId()
  {
    return phaseId;
  }

  public void setPhaseId( final Integer phaseId )
  {
    this.phaseId = phaseId;
  }

  public Integer getContactId()
  {
    return contactId;
  }

  public void setContactId( final Integer contactId )
  {
    this.contactId = contactId;
  }

  public Integer getAddressId()
  {
    return addressId;
  }

  public void setAddressId( final Integer addressId )
  {
    this.addressId = addressId;
  }

  public String getSiteNameIdentifier()
  {
    return siteNameIdentifier;
  }

  public void setSiteNameIdentifier( final String siteNameIdentifier )
  {
    this.siteNameIdentifier = siteNameIdentifier;
  }

  public Integer getAgreementId()
  {
    return agreementId;
  }

  public void setAgreementId( final Integer agreementId )
  {
    this.agreementId = agreementId;
  }

  public Integer getOpportunityId()
  {
    return opportunityId;
  }

  public void setOpportunityId( final Integer opportunityId )
  {
    this.opportunityId = opportunityId;
  }

  public String getStatus()
  {
    return status;
  }

  public void setStatus( final String status )
  {
    this.status = status;
  }

  public Integer getServiceTypeId()
  {
    return serviceTypeId;
  }

  public void setServiceTypeId( final Integer serviceTypeId )
  {
    this.serviceTypeId = serviceTypeId;
  }

  public Integer getServiceSubTypeId()
  {
    return serviceSubTypeId;
  }

  public void setServiceSubTypeId( final Integer serviceSubTypeId )
  {
    this.serviceSubTypeId = serviceSubTypeId;
  }

  public Integer getServiceItemId()
  {
    return serviceItemId;
  }

  public void setServiceItemId( final Integer serviceItemId )
  {
    this.serviceItemId = serviceItemId;
  }

  public Integer getSourceId()
  {
    return sourceId;
  }

  public void setSourceId( final Integer sourceId )
  {
    this.sourceId = sourceId;
  }

  public Integer getServiceLocationId()
  {
    return serviceLocationId;
  }

  public void setServiceLocationId( final Integer serviceLocationId )
  {
    this.serviceLocationId = serviceLocationId;
  }

  public TicketFlag getSeverity()
  {
    return severity;
  }

  public void setSeverity( final TicketFlag severity )
  {
    this.severity = severity;
  }

  public TicketFlag getImpact()
  {
    return impact;
  }

  public void setImpact( final TicketFlag impact )
  {
    this.impact = impact;
  }

  public Integer getPriorityId()
  {
    return priorityId;
  }

  public void setPriorityId( final Integer priorityId )
  {
    this.priorityId = priorityId;
  }

  public Date getRequiredDate()
  {
    return requiredDate;
  }

  public void setRequiredDate( final Date requiredDate )
  {
    this.requiredDate = requiredDate;
  }

  public String getBillable()
  {
    return billable;
  }

  public void setBillable( final String billable )
  {
    this.billable = billable;
  }

  public String getAssignedResources()
  {
    return assignedResources;
  }

  public void setAssignedResources( final String assignedResources )
  {
    this.assignedResources = assignedResources;
  }

  public Integer getParentPhaseId()
  {
    return parentPhaseId;
  }

  public void setParentPhaseId( final Integer parentPhaseId )
  {
    this.parentPhaseId = parentPhaseId;
  }

  public String getRecType()
  {
    return recType;
  }

  public void setRecType( final String recType )
  {
    this.recType = recType;
  }

  public String getBillingMethod()
  {
    return billingMethod;
  }

  public void setBillingMethod( final String billingMethod )
  {
    this.billingMethod = billingMethod;
  }

  public String getWbsCode()
  {
    return wbsCode;
  }

  public void setWbsCode( final String wbsCode )
  {
    this.wbsCode = wbsCode;
  }

  public Double getBudgetHours()
  {
    return budgetHours;
  }

  public void setBudgetHours( final Double budgetHours )
  {
    this.budgetHours = budgetHours;
  }

  public String getProjectTicketSummaryInfo()
  {
    return projectTicketSummaryInfo;
  }

  public void setProjectTicketSummaryInfo( final String projectTicketSummaryInfo )
  {
    this.projectTicketSummaryInfo = projectTicketSummaryInfo;
  }
}
