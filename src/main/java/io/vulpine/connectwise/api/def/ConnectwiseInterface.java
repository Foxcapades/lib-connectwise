package io.vulpine.connectwise.api.def;

import io.vulpine.connectwise.api.*;

import java.io.IOException;

public interface ConnectwiseInterface
{
  AccountingApi accounting();

  ActivityApi activity();

  AgreementApi agreement();

  CompanyApi company();

  ConfigurationApi configuration();

  ContactApi contact();

  DocumentApi document();

  InvoiceApi invoice();

  ManagedDeviceApi managedDevice();

  MarketingApi marketing();

  MemberApi member();

  OpportunityApi opportunity();

  OpportunityConversionApi opportunityConversion();

  ProductApi product();

  ProjectApi project();

  PurchasingApi purchasing();

  ReportingApi reporting();

  SchedulingApi scheduling();

  ServiceApi service();

  SystemApi system();

  TimeApi time();

  String send( String url, String xml ) throws IOException;
}
