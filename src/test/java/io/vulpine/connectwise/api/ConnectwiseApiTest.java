package io.vulpine.connectwise.api;

import io.vulpine.connectwise.api.def.ConnectwiseInterface;
import io.vulpine.connectwise.api.request.SoapConfig;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConnectwiseApiTest
{
  private static final SoapConfig config = new SoapConfig("", "", "", "");

  @Test
  public void activityDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.activity() != null);
  }

  @Test
  public void activityReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.activity() == connectwise.activity());
  }

  @Test
  public void accountingDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.accounting() != null);
  }

  @Test
  public void accountingReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.accounting() == connectwise.accounting());
  }

  @Test
  public void agreementDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.agreement() != null);
  }

  @Test
  public void agreementReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.agreement() == connectwise.agreement());
  }

  @Test
  public void companyDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.accounting() != null);
  }

  @Test
  public void companyReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.accounting() == connectwise.accounting());
  }

  @Test
  public void configurationDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.configuration() != null);
  }

  @Test
  public void configurationReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.configuration() == connectwise.configuration());
  }

  @Test
  public void contactDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.contact() != null);
  }

  @Test
  public void contactReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.contact() == connectwise.contact());
  }

  @Test
  public void documentDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.document() != null);
  }

  @Test
  public void documentReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.document() == connectwise.document());
  }

  @Test
  public void invoiceDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.invoice() != null);
  }

  @Test
  public void invoiceReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.invoice() == connectwise.invoice());
  }

  @Test
  public void managedDeviceDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.managedDevice() != null);
  }

  @Test
  public void managedDeviceReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.managedDevice() == connectwise.managedDevice());
  }

  @Test
  public void marketingDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.marketing() != null);
  }

  @Test
  public void marketingReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.marketing() == connectwise.marketing());
  }

  @Test
  public void memberDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.member() != null);
  }

  @Test
  public void memberReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.member() == connectwise.member());
  }

  @Test
  public void opportunityDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.opportunity() != null);
  }

  @Test
  public void opportunityReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.opportunity() == connectwise.opportunity());
  }

  @Test
  public void opportunityConversionDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.opportunityConversion() != null);
  }

  @Test
  public void opportunityConversionReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.opportunityConversion() == connectwise.opportunityConversion());
  }

  @Test
  public void productDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.product() != null);
  }

  @Test
  public void productReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.product() == connectwise.product());
  }

  @Test
  public void projectDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.project() != null);
  }

  @Test
  public void projectReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.project() == connectwise.project());
  }

  @Test
  public void purchasingDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.purchasing() != null);
  }

  @Test
  public void purchasingReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.purchasing() == connectwise.purchasing());
  }

  @Test
  public void reportingDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.reporting() != null);
  }

  @Test
  public void reportingReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.reporting() == connectwise.reporting());
  }

  @Test
  public void schedulingDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.scheduling() != null);
  }

  @Test
  public void schedulingReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.scheduling() == connectwise.scheduling());
  }

  @Test
  public void serviceDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.service() != null);
  }

  @Test
  public void serviceReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.service() == connectwise.service());
  }

  @Test
  public void systemDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.system() != null);
  }

  @Test
  public void systemReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.system() == connectwise.system());
  }

  @Test
  public void timeDoesNotReturnNull()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.time() != null);
  }

  @Test
  public void timeReturnsOnlyOneInstance()
  {
    final ConnectwiseInterface connectwise = new ConnectwiseApi(config);
    assertTrue(connectwise.time() == connectwise.time());
  }
}
