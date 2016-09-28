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
package io.vulpine.connectwise.type.invoice;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Date;

public class FoundSpecialInvoice
{
  private Integer     id;
  private String  invoiceNumber;
  private Date    invoiceDate;
  private Integer     companyId;
  private Integer     billToCompanyId;
  private Integer     addressId;
  private String  applyToType;
  private Integer     applyToId;
  private Double  total;
  private Double  invoiceTotal;
  private Double  remainingDownpayment;
  private Date    dueDate;
  private String  customerPO;
  private String  invoiceTypeIdentifier;
  private String  invoiceType;
  private Integer     billingStatusId;
  private String  billingStatus;
  private Boolean closed;
  private Integer     billingTermsId;
  private String  billingTerms;
  private Boolean taxable;
  private String  attention;

  @JsonGetter( "AddressId" )
  public Integer addressId()
  {
    return this.addressId;
  }

  @JsonSetter( "AddressId" )
  public void addressId( final Integer addressId )
  {
    this.addressId = addressId;
  }

  @JsonGetter( "ApplyToId" )
  public Integer applyToId()
  {
    return this.applyToId;
  }

  @JsonSetter( "ApplyToId" )
  public void applyToId( final Integer applyToId )
  {
    this.applyToId = applyToId;
  }

  @JsonGetter( "ApplyToType" )
  public String applyToType()
  {
    return this.applyToType;
  }

  @JsonSetter( "ApplyToType" )
  public void applyToType( final String applyToType )
  {
    this.applyToType = applyToType;
  }

  @JsonGetter( "Attention" )
  public String attention()
  {
    return this.attention;
  }

  @JsonSetter( "Attention" )
  public void attention( final String attention )
  {
    this.attention = attention;
  }

  @JsonGetter( "BillToCompanyId" )
  public Integer billToCompanyId()
  {
    return this.billToCompanyId;
  }

  @JsonSetter( "BillToCompanyId" )
  public void billToCompanyId( final Integer billToCompanyId )
  {
    this.billToCompanyId = billToCompanyId;
  }

  @JsonGetter( "BillingStatus" )
  public String billingStatus()
  {
    return this.billingStatus;
  }

  @JsonSetter( "BillingStatus" )
  public void billingStatus( final String billingStatus )
  {
    this.billingStatus = billingStatus;
  }

  @JsonGetter( "BillingStatusId" )
  public Integer billingStatusId()
  {
    return this.billingStatusId;
  }

  @JsonSetter( "BillingStatusId" )
  public void billingStatusId( final Integer billingStatusId )
  {
    this.billingStatusId = billingStatusId;
  }

  @JsonGetter( "BillingTerms" )
  public String billingTerms()
  {
    return this.billingTerms;
  }

  @JsonSetter( "BillingTerms" )
  public void billingTerms( final String billingTerms )
  {
    this.billingTerms = billingTerms;
  }

  @JsonGetter( "BillingTermsId" )
  public Integer billingTermsId()
  {
    return this.billingTermsId;
  }

  @JsonSetter( "BillingTermsId" )
  public void billingTermsId( final Integer billingTermsId )
  {
    this.billingTermsId = billingTermsId;
  }

  @JsonGetter( "Closed" )
  public Boolean closed()
  {
    return this.closed;
  }

  @JsonSetter( "Closed" )
  public void closed( final Boolean closed )
  {
    this.closed = closed;
  }

  @JsonGetter( "CompanyId" )
  public Integer companyId()
  {
    return this.companyId;
  }

  @JsonSetter( "CompanyId" )
  public void companyId( final Integer companyId )
  {
    this.companyId = companyId;
  }

  @JsonGetter( "CustomerPO" )
  public String customerPO()
  {
    return this.customerPO;
  }

  @JsonSetter( "CustomerPO" )
  public void customerPO( final String customerPO )
  {
    this.customerPO = customerPO;
  }

  @JsonGetter( "DueDate" )
  public Date dueDate()
  {
    return this.dueDate;
  }

  @JsonSetter( "DueDate" )
  public void dueDate( final Date dueDate )
  {
    this.dueDate = dueDate;
  }

  @JsonGetter( "Id" )
  public Integer id()
  {
    return this.id;
  }

  @JsonSetter( "Id" )
  public void id( final Integer id )
  {
    this.id = id;
  }

  @JsonGetter( "InvoiceDate" )
  public Date invoiceDate()
  {
    return this.invoiceDate;
  }

  @JsonSetter( "InvoiceDate" )
  public void invoiceDate( final Date invoiceDate )
  {
    this.invoiceDate = invoiceDate;
  }

  @JsonGetter( "InvoiceNumber" )
  public String invoiceNumber()
  {
    return this.invoiceNumber;
  }

  @JsonSetter( "InvoiceNumber" )
  public void invoiceNumber( final String invoiceNumber )
  {
    this.invoiceNumber = invoiceNumber;
  }

  @JsonGetter( "InvoiceTotal" )
  public Double invoiceTotal()
  {
    return this.invoiceTotal;
  }

  @JsonSetter( "InvoiceTotal" )
  public void invoiceTotal( final Double invoiceTotal )
  {
    this.invoiceTotal = invoiceTotal;
  }

  @JsonGetter( "InvoiceType" )
  public String invoiceType()
  {
    return this.invoiceType;
  }

  @JsonSetter( "InvoiceType" )
  public void invoiceType( final String invoiceType )
  {
    this.invoiceType = invoiceType;
  }

  @JsonGetter( "InvoiceTypeIdentifier" )
  public String invoiceTypeIdentifier()
  {
    return this.invoiceTypeIdentifier;
  }

  @JsonSetter( "InvoiceTypeIdentifier" )
  public void invoiceTypeIdentifier( final String invoiceTypeIdentifier )
  {
    this.invoiceTypeIdentifier = invoiceTypeIdentifier;
  }

  @JsonGetter( "RemainingDownpayment" )
  public Double remainingDownpayment()
  {
    return this.remainingDownpayment;
  }

  @JsonSetter( "RemainingDownpayment" )
  public void remainingDownpayment( final Double remainingDownpayment )
  {
    this.remainingDownpayment = remainingDownpayment;
  }

  @JsonGetter( "Taxable" )
  public Boolean taxable()
  {
    return this.taxable;
  }

  @JsonSetter( "Taxable" )
  public void taxable( final Boolean taxable )
  {
    this.taxable = taxable;
  }

  @JsonGetter( "Total" )
  public Double total()
  {
    return this.total;
  }

  @JsonSetter( "Total" )
  public void total( final Double total )
  {
    this.total = total;
  }

}
