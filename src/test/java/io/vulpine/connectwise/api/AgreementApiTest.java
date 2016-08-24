package io.vulpine.connectwise.api;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AgreementApiTest
{
  @Test
  public void addOrUpdateDoesNotReturnNull() throws Exception
  {
    final AgreementApi agreement = new AgreementApi(null, null, null, "");
    assertTrue(null != agreement.addOrUpdate());
  }

  @Test
  public void addOrUpdateReturnsOnlyOneInstance() throws Exception
  {
    final AgreementApi agreement = new AgreementApi(null, null, null, "");
    assertTrue(agreement.addOrUpdate() == agreement.addOrUpdate());
  }

  @Test
  public void deleteDoesNotReturnNull() throws Exception
  {
    final AgreementApi agreement = new AgreementApi(null, null, null, "");
    assertTrue(null != agreement.delete());
  }

  @Test
  public void deleteReturnsOnlyOneInstance() throws Exception
  {
    final AgreementApi agreement = new AgreementApi(null, null, null, "");
    assertTrue(agreement.delete() == agreement.delete());
  }

  @Test
  public void findDoesNotReturnNull() throws Exception
  {
    final AgreementApi agreement = new AgreementApi(null, null, null, "");
    assertTrue(null != agreement.find());
  }

  @Test
  public void findReturnsOnlyOneInstance() throws Exception
  {
    final AgreementApi agreement = new AgreementApi(null, null, null, "");
    assertTrue(agreement.find() == agreement.find());
  }

  @Test
  public void getDoesNotReturnNull() throws Exception
  {
    final AgreementApi agreement = new AgreementApi(null, null, null, "");
    assertTrue(null != agreement.get());
  }

  @Test
  public void getReturnsOnlyOneInstance() throws Exception
  {
    final AgreementApi agreement = new AgreementApi(null, null, null, "");
    assertTrue(agreement.get() == agreement.get());
  }

}
