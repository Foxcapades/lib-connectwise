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
import io.vulpine.connectwise.type.ConnectwiseCommon;

import java.util.Date;

@SuppressWarnings( "unused" )
public class Project extends ConnectwiseCommon
{

  @JacksonXmlProperty(localName = "ProjectName")
  protected String projectName;

  @JacksonXmlProperty(localName = "CompanyId")
  protected Integer companyId;

  @JacksonXmlProperty(localName = "AddressId")
  protected Integer addressId;

  @JacksonXmlProperty(localName = "OpportunityId")
  protected Integer opportunityId;

  @JacksonXmlProperty(localName = "ContactId")
  protected Integer contactId;

  @JacksonXmlProperty(localName = "ProjectManagerId")
  protected Integer projectManagerId;

  @JacksonXmlProperty(localName = "ProjectTypeId")
  protected Integer projectTypeId;

  @JacksonXmlProperty(localName = "BillingMethodIdentifier")
  protected BillMethod billingMethodIdentifier;

  @JacksonXmlProperty(localName = "EstimatedRevenue")
  protected Double estimatedRevenue;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty(localName = "EstimatedStart")
  protected Date estimatedStart;

  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
  @JacksonXmlProperty(localName = "EstimatedEnd")
  protected Date estimatedEnd;

  @JacksonXmlProperty(localName = "EstimatedHours")
  protected Double estimatedHours;

  @JacksonXmlProperty(localName = "Status")
  protected String status;

  @JacksonXmlProperty(localName = "TimeApproverId")
  protected Integer timeApproverId;

  @JacksonXmlProperty(localName = "ExpenseApproverId")
  protected Integer expenseApproverId;

  @JacksonXmlProperty(localName = "BudgetFlag")
  protected Boolean budgetFlag;

  @JacksonXmlProperty(localName = "BillingRateOption")
  protected String billingRateOption;

  @JacksonXmlProperty(localName = "HourlyRate")
  protected Double hourlyRate;

  @JacksonXmlProperty(localName = "BillingAmount")
  protected Double billingAmount;

  @JacksonXmlProperty(localName = "BillTime")
  protected BillFlag billTime;

  @JacksonXmlProperty(localName = "BillExpenses")
  protected BillFlag billExpenses;

  @JacksonXmlProperty(localName = "BillProducts")
  protected BillFlag billProducts;

  @JacksonXmlProperty(localName = "BillableTimeInvoice")
  protected Boolean billableTimeInvoice;

  @JacksonXmlProperty(localName = "BillableExpenseInvoice")
  protected Boolean billableExpenseInvoice;

  @JacksonXmlProperty(localName = "BillableProductInvoice")
  protected Boolean billableProductInvoice;

  @JacksonXmlProperty(localName = "Downpayment")
  protected Double downpayment;

  @JacksonXmlProperty(localName = "AgreementId")
  protected Integer agreementId;

  @JacksonXmlProperty(localName = "BillingAttention")
  protected String billingAttention;

  @JacksonXmlProperty(localName = "ProjectBoardId")
  protected Integer projectBoardId;

  @JacksonXmlProperty(localName = "CustomerPO")
  protected String customerPO;

  @JacksonXmlProperty(localName = "RestrictDownPayment")
  protected Boolean restrictDownPayment;

  @JacksonXmlProperty(localName = "BillProjectAfterClosed")
  protected Boolean billProjectAfterClosed;

  @JacksonXmlProperty(localName = "BillUnapprovedTimeAndExpense")
  protected Boolean billUnapprovedTimeAndExpense;

  @JacksonXmlProperty(localName = "ProjectTemplateId")
  protected Integer projectTemplateId;

  public String getProjectName ()
  {
    return projectName;
  }

  public void setProjectName ( final String projectName )
  {
    this.projectName = projectName;
  }

  public Integer getCompanyId ()
  {
    return companyId;
  }

  public void setCompanyId ( final Integer companyId )
  {
    this.companyId = companyId;
  }

  public Integer getAddressId ()
  {
    return addressId;
  }

  public void setAddressId ( final Integer addressId )
  {
    this.addressId = addressId;
  }

  public Integer getOpportunityId ()
  {
    return opportunityId;
  }

  public void setOpportunityId ( final Integer opportunityId )
  {
    this.opportunityId = opportunityId;
  }

  public Integer getContactId ()
  {
    return contactId;
  }

  public void setContactId ( final Integer contactId )
  {
    this.contactId = contactId;
  }

  public Integer getProjectManagerId ()
  {
    return projectManagerId;
  }

  public void setProjectManagerId ( final Integer projectManagerId )
  {
    this.projectManagerId = projectManagerId;
  }

  public Integer getProjectTypeId ()
  {
    return projectTypeId;
  }

  public void setProjectTypeId ( final Integer projectTypeId )
  {
    this.projectTypeId = projectTypeId;
  }

  public BillMethod getBillingMethodIdentifier ()
  {
    return billingMethodIdentifier;
  }

  public void setBillingMethodIdentifier ( final BillMethod billingMethodIdentifier )
  {
    this.billingMethodIdentifier = billingMethodIdentifier;
  }

  public Double getEstimatedRevenue ()
  {
    return estimatedRevenue;
  }

  public void setEstimatedRevenue ( final Double estimatedRevenue )
  {
    this.estimatedRevenue = estimatedRevenue;
  }

  public Date getEstimatedStart ()
  {
    return estimatedStart;
  }

  public void setEstimatedStart ( final Date estimatedStart )
  {
    this.estimatedStart = estimatedStart;
  }

  public Date getEstimatedEnd ()
  {
    return estimatedEnd;
  }

  public void setEstimatedEnd ( final Date estimatedEnd )
  {
    this.estimatedEnd = estimatedEnd;
  }

  public Double getEstimatedHours ()
  {
    return estimatedHours;
  }

  public void setEstimatedHours ( final Double estimatedHours )
  {
    this.estimatedHours = estimatedHours;
  }

  public String getStatus ()
  {
    return status;
  }

  public void setStatus ( final String status )
  {
    this.status = status;
  }

  public Integer getTimeApproverId ()
  {
    return timeApproverId;
  }

  public void setTimeApproverId ( final Integer timeApproverId )
  {
    this.timeApproverId = timeApproverId;
  }

  public Integer getExpenseApproverId ()
  {
    return expenseApproverId;
  }

  public void setExpenseApproverId ( final Integer expenseApproverId )
  {
    this.expenseApproverId = expenseApproverId;
  }

  public Boolean isBudgetFlag ()
  {
    return budgetFlag;
  }

  public void setBudgetFlag ( final Boolean budgetFlag )
  {
    this.budgetFlag = budgetFlag;
  }

  public String getBillingRateOption ()
  {
    return billingRateOption;
  }

  public void setBillingRateOption ( final String billingRateOption )
  {
    this.billingRateOption = billingRateOption;
  }

  public Double getHourlyRate ()
  {
    return hourlyRate;
  }

  public void setHourlyRate ( final Double hourlyRate )
  {
    this.hourlyRate = hourlyRate;
  }

  public Double getBillingAmount ()
  {
    return billingAmount;
  }

  public void setBillingAmount ( final Double billingAmount )
  {
    this.billingAmount = billingAmount;
  }

  public BillFlag getBillTime ()
  {
    return billTime;
  }

  public void setBillTime ( final BillFlag billTime )
  {
    this.billTime = billTime;
  }

  public BillFlag getBillExpenses ()
  {
    return billExpenses;
  }

  public void setBillExpenses ( final BillFlag billExpenses )
  {
    this.billExpenses = billExpenses;
  }

  public BillFlag getBillProducts ()
  {
    return billProducts;
  }

  public void setBillProducts ( final BillFlag billProducts )
  {
    this.billProducts = billProducts;
  }

  public Boolean isBillableTimeInvoice ()
  {
    return billableTimeInvoice;
  }

  public void setBillableTimeInvoice ( final Boolean billableTimeInvoice )
  {
    this.billableTimeInvoice = billableTimeInvoice;
  }

  public Boolean isBillableExpenseInvoice ()
  {
    return billableExpenseInvoice;
  }

  public void setBillableExpenseInvoice ( final Boolean billableExpenseInvoice )
  {
    this.billableExpenseInvoice = billableExpenseInvoice;
  }

  public Boolean isBillableProductInvoice ()
  {
    return billableProductInvoice;
  }

  public void setBillableProductInvoice ( final Boolean billableProductInvoice )
  {
    this.billableProductInvoice = billableProductInvoice;
  }

  public Double getDownpayment ()
  {
    return downpayment;
  }

  public void setDownpayment ( final Double downpayment )
  {
    this.downpayment = downpayment;
  }

  public Integer getAgreementId ()
  {
    return agreementId;
  }

  public void setAgreementId ( final Integer agreementId )
  {
    this.agreementId = agreementId;
  }

  public String getBillingAttention ()
  {
    return billingAttention;
  }

  public void setBillingAttention ( final String billingAttention )
  {
    this.billingAttention = billingAttention;
  }

  public Integer getProjectBoardId ()
  {
    return projectBoardId;
  }

  public void setProjectBoardId ( final Integer projectBoardId )
  {
    this.projectBoardId = projectBoardId;
  }

  public String getCustomerPO ()
  {
    return customerPO;
  }

  public void setCustomerPO ( final String customerPO )
  {
    this.customerPO = customerPO;
  }

  public Boolean isRestrictDownPayment ()
  {
    return restrictDownPayment;
  }

  public void setRestrictDownPayment ( final Boolean restrictDownPayment )
  {
    this.restrictDownPayment = restrictDownPayment;
  }

  public Boolean isBillProjectAfterClosed ()
  {
    return billProjectAfterClosed;
  }

  public void setBillProjectAfterClosed ( final Boolean billProjectAfterClosed )
  {
    this.billProjectAfterClosed = billProjectAfterClosed;
  }

  public Boolean isBillUnapprovedTimeAndExpense ()
  {
    return billUnapprovedTimeAndExpense;
  }

  public void setBillUnapprovedTimeAndExpense ( final Boolean billUnapprovedTimeAndExpense )
  {
    this.billUnapprovedTimeAndExpense = billUnapprovedTimeAndExpense;
  }

  public Integer getProjectTemplateId ()
  {
    return projectTemplateId;
  }

  public void setProjectTemplateId ( final Integer projectTemplateId )
  {
    this.projectTemplateId = projectTemplateId;
  }
}
