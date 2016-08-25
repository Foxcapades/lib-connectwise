package io.vulpine.connectwise.type.agreement;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class FoundAgreementTest
{
  @Test
  public void getBoardId () throws Exception
  {
    final FoundAgreement agreement = new FoundAgreement();
    final Field prop = agreement.getClass().getDeclaredField("boardId");
    final int value = 123469872;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getBoardId());
  }

  @Test
  public void setBoardId () throws Exception
  {
    final FoundAgreement agreement = new FoundAgreement();
    final Field prop = agreement.getClass().getDeclaredField("boardId");
    final int value = 12321323;

    prop.setAccessible(true);
    agreement.setBoardId(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void isBoardDefault () throws Exception
  {
    final FoundAgreement agreement = new FoundAgreement();
    final Field prop = agreement.getClass().getDeclaredField("boardDefault");
    final boolean value = true;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.isBoardDefault());
  }

  @Test
  public void setBoardDefault () throws Exception
  {
    final FoundAgreement agreement = new FoundAgreement();
    final Field prop = agreement.getClass().getDeclaredField("boardDefault");
    final boolean value = true;

    prop.setAccessible(true);
    agreement.setBoardDefault(value);

    assertEquals(value, prop.get(agreement));
  }

  @Test
  public void getServiceTypeId () throws Exception
  {
    final FoundAgreement agreement = new FoundAgreement();
    final Field prop = agreement.getClass().getDeclaredField("serviceTypeId");
    final int value = 1223;

    prop.setAccessible(true);
    prop.set(agreement, value);

    assertEquals(value, agreement.getServiceTypeId());
  }

  @Test
  public void setServiceTypeId () throws Exception
  {
    final FoundAgreement agreement = new FoundAgreement();
    final Field prop = agreement.getClass().getDeclaredField("serviceTypeId");
    final int value = 1223;

    prop.setAccessible(true);
    agreement.setServiceTypeId(value);

    assertEquals(value, prop.get(agreement));
  }

}