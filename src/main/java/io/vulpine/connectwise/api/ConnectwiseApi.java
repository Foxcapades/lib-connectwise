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
import io.vulpine.connectwise.api.def.ConnectwiseInterface;
import io.vulpine.connectwise.api.common.Credentials;
import io.vulpine.connectwise.api.common.SoapConfig;
import io.vulpine.http.Request;

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

  /**
   * Accounting API Container
   * <p>
   * Instantiated On Demand
   */
  private AccountingApi accountingApi = null;

  /**
   * Activity API Container
   * <p>
   * Instantiated On Demand
   */
  private ActivityApi activityApi = null;

  /**
   * Agreement API Container
   * <p>
   * Instantiated On Demand
   */
  private AgreementApi agreementApi = null;

  /**
   * Company API Container
   * <p>
   * Instantiated On Demand
   */
  private CompanyApi companyApi = null;

  /**
   * Configuration API Container
   * <p>
   * Instantiated On Demand
   */
  private ConfigurationApi configurationApi = null;

  /**
   * Contact API Container
   * <p>
   * Instantiated On Demand
   */
  private ContactApi contactApi = null;

  /**
   * Document API Container
   * <p>
   * Instantiated On Demand
   */
  private DocumentApi documentApi = null;

  /**
   * Invoice API Container
   * <p>
   * Instantiated On Demand
   */
  private InvoiceApi invoiceApi = null;

  /**
   * Managed Device API Container
   * <p>
   * Instantiated On Demand
   */
  private ManagedDeviceApi managedDeviceApi = null;

  /**
   * Marketing API Container
   * <p>
   * Instantiated On Demand
   */
  private MarketingApi marketingApi = null;

  /**
   * Member API Container
   * <p>
   * Instantiated On Demand
   */
  private MemberApi memberApi = null;

  /**
   * Opportunity API Container
   * <p>
   * Instantiated On Demand
   */
  private OpportunityApi opportunityApi = null;

  /**
   * Opportunity Conversion API Container
   * <p>
   * Instantiated On Demand
   */
  private OpportunityConversionApi opportunityConversionApi = null;

  /**
   * Product API Container
   * <p>
   * Instantiated On Demand
   */
  private ProductApi productApi = null;

  /**
   * Project API Container
   * <p>
   * Instantiated On Demand
   */
  private ProjectApi projectApi = null;

  /**
   * Purchasing API Container
   * <p>
   * Instantiated On Demand
   */
  private PurchasingApi purchasingApi = null;

  /**
   * Reporting API Container
   * <p>
   * Instantiated On Demand
   */
  private ReportingApi reportingApi = null;

  /**
   * Scheduling API Container
   * <p>
   * Instantiated On Demand
   */
  private SchedulingApi schedulingApi = null;

  /**
   * Service API Container
   * <p>
   * Instantiated On Demand
   */
  private ServiceApi serviceApi = null;

  /**
   * System API Container
   * <p>
   * Instantiated On Demand
   */
  private SystemApi systemApi = null;

  /**
   * Time API Container
   * <p>
   * Instantiated On Demand
   */
  private TimeApi timeApi = null;

  private final Credentials credentials;

  private final String apiPath;

  private final XmlMapper xmlMapper;

  public ConnectwiseApi( final SoapConfig config )
  {
    this.apiPath = config.getApiPath();
    this.xmlMapper = new XmlMapper();
    this.credentials = new Credentials()
      .setCompanyId(config.getCompany())
      .setIntegratorLoginId(config.getApiUsername())
      .setIntegratorPassword(config.getApiPassword());

    xmlMapper.setFilterProvider(new SimpleFilterProvider().addFilter("filter-empty", new EmptyFilter()));

  }

  /**
   * @return Accounting API Container
   */
  @Override
  public final AccountingApi accounting()
  {
    if (null == accountingApi) {
      accountingApi = new AccountingApi(this, credentials, xmlMapper, apiPath);
    }
    return accountingApi;
  }

  /**
   * @return Activity API Container
   */
  @Override
  public final ActivityApi activity()
  {
    if (null == activityApi) {
      activityApi = new ActivityApi(this, credentials, xmlMapper, apiPath);
    }
    return activityApi;
  }

  /**
   * @return Agreement API Container
   */
  @Override
  public final AgreementApi agreement()
  {
    if (null == agreementApi) {
      agreementApi = new AgreementApi(this, credentials, xmlMapper, apiPath);
    }
    return agreementApi;
  }

  /**
   * @return Company API Container
   */
  @Override
  public final CompanyApi company()
  {
    if (null == companyApi) {
      companyApi = new CompanyApi(this, credentials, xmlMapper, apiPath);
    }
    return companyApi;
  }

  /**
   * @return Configuration API Container
   */
  @Override
  public final ConfigurationApi configuration()
  {
    if (null == configurationApi) {
      configurationApi = new ConfigurationApi(this, credentials, xmlMapper, apiPath);
    }
    return configurationApi;
  }

  /**
   * @return Contact API Container
   */
  @Override
  public final ContactApi contact()
  {
    if (null == contactApi) {
      contactApi = new ContactApi(this, credentials, xmlMapper, apiPath);
    }
    return contactApi;
  }

  /**
   * @return Document API Container
   */
  @Override
  public final DocumentApi document()
  {
    if (null == documentApi) {
      documentApi = new DocumentApi(this, credentials, xmlMapper, apiPath);
    }
    return documentApi;
  }

  /**
   * @return Invoice API Container
   */
  @Override
  public final InvoiceApi invoice()
  {
    if (null == invoiceApi) {
      invoiceApi = new InvoiceApi(this, credentials, xmlMapper, apiPath);
    }
    return invoiceApi;
  }

  /**
   * @return ManagedDevice API Container
   */
  @Override
  public final ManagedDeviceApi managedDevice()
  {
    if (null == managedDeviceApi) {
      managedDeviceApi = new ManagedDeviceApi(this, credentials, xmlMapper, apiPath);
    }
    return managedDeviceApi;
  }

  /**
   * @return Marketing API Container
   */
  @Override
  public final MarketingApi marketing()
  {
    if (null == marketingApi) {
      marketingApi = new MarketingApi(this, credentials, xmlMapper, apiPath);
    }
    return marketingApi;
  }

  /**
   * @return Member API Container
   */
  @Override
  public final MemberApi member()
  {
    if (null == memberApi) {
      memberApi = new MemberApi(this, credentials, xmlMapper, apiPath);
    }
    return memberApi;
  }

  /**
   * @return Opportunity API Container
   */
  @Override
  public final OpportunityApi opportunity()
  {
    if (null == opportunityApi) {
      opportunityApi = new OpportunityApi(this, credentials, xmlMapper, apiPath);
    }
    return opportunityApi;
  }

  /**
   * @return OpportunityConversion API Container
   */
  @Override
  public final OpportunityConversionApi opportunityConversion()
  {
    if (null == opportunityConversionApi) {
      opportunityConversionApi = new OpportunityConversionApi(this, credentials, xmlMapper, apiPath);
    }
    return opportunityConversionApi;
  }

  /**
   * @return Product API Container
   */
  @Override
  public final ProductApi product()
  {
    if (null == productApi) {
      productApi = new ProductApi(this, credentials, xmlMapper, apiPath);
    }
    return productApi;
  }

  /**
   * @return Project API Container
   */
  @Override
  public final ProjectApi project()
  {
    if (null == projectApi) {
      projectApi = new ProjectApi(this, credentials, xmlMapper, apiPath);
    }
    return projectApi;
  }

  /**
   * @return Purchasing API Container
   */
  @Override
  public final PurchasingApi purchasing()
  {
    if (null == purchasingApi) {
      purchasingApi = new PurchasingApi(this, credentials, xmlMapper, apiPath);
    }
    return purchasingApi;
  }

  /**
   * @return Reporting API Container
   */
  @Override
  public final ReportingApi reporting()
  {
    if (null == reportingApi) {
      reportingApi = new ReportingApi(this, credentials, xmlMapper, apiPath);
    }
    return reportingApi;
  }

  /**
   * @return Scheduling API Container
   */
  @Override
  public final SchedulingApi scheduling()
  {
    if (null == schedulingApi) {
      schedulingApi = new SchedulingApi(this, credentials, xmlMapper, apiPath);
    }
    return schedulingApi;
  }

  /**
   * @return Service API Container
   */
  @Override
  public final ServiceApi service()
  {
    if (null == serviceApi) {
      serviceApi = new ServiceApi(this, credentials, xmlMapper, apiPath);
    }
    return serviceApi;
  }

  /**
   * @return System API Container
   */
  @Override
  public final SystemApi system()
  {
    if (null == systemApi) {
      systemApi = new SystemApi(this, credentials, xmlMapper, apiPath);
    }
    return systemApi;
  }

  /**
   * @return Time API Container
   */
  @Override
  public final TimeApi time()
  {
    if (null == timeApi) {
      timeApi = new TimeApi(this, credentials, xmlMapper, apiPath);
    }
    return timeApi;
  }

  @Override
  public final String send( final String url, final String xml ) throws IOException
  {
    return nilFilter.matcher(
      new Request()
        .url(url)
        .post()
        .setHeader("Content-Type", "text/xml; charset=utf-8")
        .setHeader("Content-Length", String.valueOf(xml.getBytes("UTF-8").length))
        .addErrorHandler(( s, r ) -> System.out.println(s))
        .requestBody(xml)
        .submit()
        .getBody()
    ).replaceAll("");
  }
}
