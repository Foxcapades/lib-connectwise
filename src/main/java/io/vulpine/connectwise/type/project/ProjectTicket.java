package io.vulpine.connectwise.type.project;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;

public class ProjectTicket extends _Common
{
  @JacksonXmlProperty( localName = "Summary" )
  protected String summary;

  @JacksonXmlProperty( localName = "DetailDescription" )
  protected String detailDescription;

  @JacksonXmlProperty( localName = "PhaseId" )
  protected int phaseId;

  @JacksonXmlProperty( localName = "ContactId" )
  protected int contactId;

  @JacksonXmlProperty( localName = "AddressId" )
  protected int addressId;

  @JacksonXmlProperty( localName = "SiteNameIdentifier" )
  protected String siteNameIdentifier;

  @JacksonXmlProperty( localName = "AgreementId" )
  protected int agreementId;

  @JacksonXmlProperty( localName = "OpportunityId" )
  protected int opportunityId;

  @JacksonXmlProperty( localName = "Status" )
  protected String status;

  @JacksonXmlProperty( localName = "ServiceTypeId" )
  protected int serviceTypeId;

  @JacksonXmlProperty( localName = "ServiceSubTypeId" )
  protected int serviceSubTypeId;

  @JacksonXmlProperty( localName = "ServiceItemId" )
  protected int serviceItemId;

  @JacksonXmlProperty( localName = "SourceId" )
  protected int sourceId;

  @JacksonXmlProperty( localName = "ServiceLocationId" )
  protected int serviceLocationId;

  @JacksonXmlProperty( localName = "Severity" )
  protected TicketFlag severity;

  @JacksonXmlProperty( localName = "Impact" )
  protected TicketFlag impact;

  @JacksonXmlProperty( localName = "PriorityId" )
  protected int priorityId;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty( localName = "RequiredDate" )
  protected Date requiredDate;

  @JacksonXmlProperty( localName = "Billable" )
  protected String billable;

  @JacksonXmlProperty( localName = "AssignedResources" )
  protected String assignedResources;

  @JacksonXmlProperty( localName = "ParentPhaseId" )
  protected int parentPhaseId;

  @JacksonXmlProperty( localName = "RecType" )
  protected String recType;

  @JacksonXmlProperty( localName = "BillingMethod" )
  protected String billingMethod;

  @JacksonXmlProperty( localName = "WbsCode" )
  protected String wbsCode;

  @JacksonXmlProperty( localName = "BudgetHours" )
  protected double budgetHours;

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

  public int getPhaseId()
  {
    return phaseId;
  }

  public void setPhaseId( final int phaseId )
  {
    this.phaseId = phaseId;
  }

  public int getContactId()
  {
    return contactId;
  }

  public void setContactId( final int contactId )
  {
    this.contactId = contactId;
  }

  public int getAddressId()
  {
    return addressId;
  }

  public void setAddressId( final int addressId )
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

  public int getAgreementId()
  {
    return agreementId;
  }

  public void setAgreementId( final int agreementId )
  {
    this.agreementId = agreementId;
  }

  public int getOpportunityId()
  {
    return opportunityId;
  }

  public void setOpportunityId( final int opportunityId )
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

  public int getServiceTypeId()
  {
    return serviceTypeId;
  }

  public void setServiceTypeId( final int serviceTypeId )
  {
    this.serviceTypeId = serviceTypeId;
  }

  public int getServiceSubTypeId()
  {
    return serviceSubTypeId;
  }

  public void setServiceSubTypeId( final int serviceSubTypeId )
  {
    this.serviceSubTypeId = serviceSubTypeId;
  }

  public int getServiceItemId()
  {
    return serviceItemId;
  }

  public void setServiceItemId( final int serviceItemId )
  {
    this.serviceItemId = serviceItemId;
  }

  public int getSourceId()
  {
    return sourceId;
  }

  public void setSourceId( final int sourceId )
  {
    this.sourceId = sourceId;
  }

  public int getServiceLocationId()
  {
    return serviceLocationId;
  }

  public void setServiceLocationId( final int serviceLocationId )
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

  public int getPriorityId()
  {
    return priorityId;
  }

  public void setPriorityId( final int priorityId )
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

  public int getParentPhaseId()
  {
    return parentPhaseId;
  }

  public void setParentPhaseId( final int parentPhaseId )
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

  public double getBudgetHours()
  {
    return budgetHours;
  }

  public void setBudgetHours( final double budgetHours )
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
