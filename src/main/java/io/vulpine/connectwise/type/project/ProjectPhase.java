package io.vulpine.connectwise.type.project;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;
import java.util.List;

public class ProjectPhase extends AbstractSubProject
{
  @JacksonXmlProperty(localName = "Description")
  protected String description;

  @JacksonXmlProperty(localName = "ProjectBoardId")
  protected int projectBoardId;

  @JacksonXmlProperty(localName = "AgreementId")
  protected int agreementId;

  @JacksonXmlProperty(localName = "ParentPhaseId")
  protected int parentPhaseId;

  @JacksonXmlProperty(localName = "WbsCode")
  protected String wbsCode;

  @JacksonXmlProperty(localName = "BillingMethodIdentifier")
  protected BillMethod billingMethodIdentifier;

  @JacksonXmlProperty(localName = "PhaseBillTime")
  protected BillFlag phaseBillTime;

  @JacksonXmlProperty(localName = "PhaseBillExpenses")
  protected BillFlag phaseBillExpenses;

  @JacksonXmlProperty(localName = "BillableTimeInvoice")
  protected boolean billableTimeInvoice;

  @JacksonXmlProperty(localName = "BillableExpenseInvoice")
  protected boolean billableExpenseInvoice;

  @JacksonXmlProperty(localName = "MarkAsMilestone")
  protected boolean markAsMilestone;

  @JacksonXmlProperty(localName = "BillSeparately")
  protected boolean billSeparately;

  @JacksonXmlProperty(localName = "Notes")
  protected String notes;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty(localName = "DateDeadline")
  protected Date dateDeadline;

  @JacksonXmlProperty(localName = "ParentPhase")
  protected List < ProjectPhase > parentPhase;
}
