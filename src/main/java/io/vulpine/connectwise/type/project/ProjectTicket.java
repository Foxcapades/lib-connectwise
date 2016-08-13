package io.vulpine.connectwise.type.project;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;

public class ProjectTicket extends AbstractSubProject
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
}
