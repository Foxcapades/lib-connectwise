package io.vulpine.connectwise.type.agreement;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class AbstractSubAgreementTest
{
  private static Field prop;
  private AbstractSubAgreement agreement;

  @BeforeClass
  public static void setUpClass() throws Exception
  {
    prop = AbstractSubAgreement.class.getDeclaredField("agreementId");
  }

  @Before
  public void setUp()
  {
    agreement = new AbstractSubAgreement() {};
  }

  @After
  public void tearDown()
  {
    agreement = null;
  }


  @Test
  public void getAgreementId () throws Exception
  {
    final int test = 136546;
    prop.set(agreement, test);
    assertEquals(test, agreement.getAgreementId());
  }

  @Test
  public void setAgreementId () throws Exception
  {
    final int test = 666666;
    agreement.setAgreementId(test);
    assertEquals(test, prop.get(agreement));
  }
}