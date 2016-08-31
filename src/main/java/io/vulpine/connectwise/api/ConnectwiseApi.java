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
 *
 */
package io.vulpine.connectwise.api;

import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vulpine.connectwise.EmptyFilter;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.def.ConnectwiseInterface;
import io.vulpine.connectwise.util.http.HttpRequest;
import io.vulpine.connectwise.util.logging.LoggerInterface;
import io.vulpine.connectwise.util.logging.LoggerManager;

import java.io.IOException;
import java.util.regex.Pattern;

/**
 * Fluent API Wrapper for the Connectwise SOAP API v2.0
 */
public final class ConnectwiseApi implements ConnectwiseInterface
{
  // Jackson-DataFormat-XML v2.7.5 has issues parsing xsi:nil on primitives.
  // This is to filter those elements out of the responses.
  private final static Pattern nilFilter = Pattern.compile("<[\\w -]+xsi:nil=\"true\"[\\w -]+/>");

  public final AccountingApi accountingApi;

  public final ActivityApi activityApi;

  public final AgreementApi agreementApi;

  public final CompanyApi companyApi;

  public final ConfigurationApi configurationApi;

  public final ContactApi contactApi;

  public final DocumentApi documentApi;

  public final InvoiceApi invoiceApi;

  public final ManagedDeviceApi managedDeviceApi;

  public final MarketingApi marketingApi;

  public final MemberApi memberApi;

  public final OpportunityApi opportunityApi;

  public final OpportunityConversionApi opportunityConversionApi;

  public final ProductApi productApi;

  public final ProjectApi projectApi;

  public final PurchasingApi purchasingApi;

  public final ReportingApi reportingApi;

  public final SchedulingApi schedulingApi;

  public final ServiceApi serviceApi;

  public final SystemApi systemApi;

  public final TimeApi timeApi;

  private final Credentials credentials;

  private final XmlMapper xmlMapper;

  private final LoggerInterface logger;

  public ConnectwiseApi( final String company, final String username, final String password, final String apiPath )
  {
    this.xmlMapper = new XmlMapper();
    this.credentials = new Credentials()
      .setCompanyId(company)
      .setIntegratorLoginId(username)
      .setIntegratorPassword(password);

    this.xmlMapper.setFilterProvider(new SimpleFilterProvider().addFilter("filter-empty", new EmptyFilter()));

    this.logger = LoggerManager.getLogger("lib-connectwise");

    this.accountingApi = new AccountingApi(this, credentials, xmlMapper, apiPath);
    this.activityApi = new ActivityApi(this, credentials, xmlMapper, apiPath);
    this.agreementApi = new AgreementApi(this, credentials, xmlMapper, apiPath);
    this.companyApi = new CompanyApi(this, credentials, xmlMapper, apiPath);
    this.configurationApi = new ConfigurationApi(this, credentials, xmlMapper, apiPath);
    this.contactApi = new ContactApi(this, credentials, xmlMapper, apiPath);
    this.documentApi = new DocumentApi(this, credentials, xmlMapper, apiPath);
    this.invoiceApi = new InvoiceApi(this, credentials, xmlMapper, apiPath);
    this.managedDeviceApi = new ManagedDeviceApi(this, credentials, xmlMapper, apiPath);
    this.marketingApi = new MarketingApi(this, credentials, xmlMapper, apiPath);
    this.memberApi = new MemberApi(this, credentials, xmlMapper, apiPath);
    this.opportunityApi = new OpportunityApi(this, credentials, xmlMapper, apiPath);
    this.opportunityConversionApi = new OpportunityConversionApi(this, credentials, xmlMapper, apiPath);
    this.productApi = new ProductApi(this, credentials, xmlMapper, apiPath);
    this.projectApi = new ProjectApi(this, credentials, xmlMapper, apiPath);
    this.purchasingApi = new PurchasingApi(this, credentials, xmlMapper, apiPath);
    this.reportingApi = new ReportingApi(this, credentials, xmlMapper, apiPath);
    this.schedulingApi = new SchedulingApi(this, credentials, xmlMapper, apiPath);
    this.serviceApi = new ServiceApi(this, credentials, xmlMapper, apiPath);
    this.systemApi = new SystemApi(this, credentials, xmlMapper, apiPath);
    this.timeApi = new TimeApi(this, credentials, xmlMapper, apiPath);
  }

  @Override
  public final String send( final String url, final String xml ) throws IOException
  {
    final LoggerInterface log = this.logger;
    final String response;

    log.trace(ConnectwiseApi.class, url, xml);
    log.debug("Connectwise Request: {}", xml);

    response = HttpRequest.post(url)
      .setHeader("Content-Type", "text/xml", "charset=utf-8")
      .setHeader("Content-Length", String.valueOf(xml.getBytes("UTF-8").length))
      .appendToBody(xml)
      .send()
      .getBody();

    log.debug("Connectwise Response: {}", response);

    return nilFilter.matcher(response).replaceAll("");
  }
}
