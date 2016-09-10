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

package io.vulpine.connectwise.type.contact;

import de.bechte.junit.runners.context.HierarchicalContextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

@RunWith( HierarchicalContextRunner.class )
public class ContactTest
{
  private static final String TEST_STRING = "Test string value.";

  private static final int TEST_INT = 666;

  private static final Date TEST_DATE = new Date();

  private Contact contact;

  @Before
  public void setUp() throws Exception
  {
    contact = new Contact();
  }

  public class FirstName
  {
    private final Field field;

    public FirstName() throws Exception
    {
      field = Contact.class.getDeclaredField("firstName");
      field.setAccessible(true);
    }

    @Test
    public void getFirstName() throws Exception
    {
      field.set(contact, TEST_STRING);
      assertEquals(TEST_STRING, contact.getFirstName());
    }

    @Test
    public void setFirstName() throws Exception
    {
      contact.setFirstName(TEST_STRING);
      assertEquals(TEST_STRING, field.get(contact));
    }
  }

  public class LastName
  {
    private final Field field;

    public LastName() throws Exception
    {
      field = Contact.class.getDeclaredField("lastName");
      field.setAccessible(true);
    }

    @Test
    public void getLastName() throws Exception
    {
      field.set(contact, TEST_STRING);
      assertEquals(TEST_STRING, contact.getLastName());
    }

    @Test
    public void setLastName() throws Exception
    {
      contact.setLastName(TEST_STRING);
      assertEquals(TEST_STRING, field.get(contact));
    }
  }

  public class Email
  {
    private final Field field;

    public Email() throws Exception
    {
      field = Contact.class.getDeclaredField("email");
      field.setAccessible(true);
    }

    @Test
    public void getEmail() throws Exception
    {
      field.set(contact, TEST_STRING);
      assertEquals(TEST_STRING, contact.getEmail());
    }

    @Test
    public void setEmail() throws Exception
    {
      contact.setEmail(TEST_STRING);
      assertEquals(TEST_STRING, field.get(contact));
    }
  }

  public class CompanyIdentifier
  {
    private final Field field;

    public CompanyIdentifier() throws Exception
    {
      field = Contact.class.getDeclaredField("companyIdentifier");
      field.setAccessible(true);
    }

    @Test
    public void getCompanyIdentifier() throws Exception
    {
      field.set(contact, TEST_STRING);
      assertEquals(TEST_STRING, contact.getCompanyIdentifier());
    }

    @Test
    public void setCompanyIdentifier() throws Exception
    {
      contact.setCompanyIdentifier(TEST_STRING);
      assertEquals(TEST_STRING, field.get(contact));
    }
  }

  public class Inactive
  {
    private final Field field;

    public Inactive() throws Exception
    {
      field = Contact.class.getDeclaredField("inactive");
      field.setAccessible(true);
    }

    @Test
    public void isInactive() throws Exception
    {

    }

    @Test
    public void setInactive() throws Exception
    {

    }
  }

  public class SID
  {
    private final Field field;

    public SID() throws Exception
    {
      field = Contact.class.getDeclaredField("sID");
      field.setAccessible(true);
    }

    @Test
    public void getsID() throws Exception
    {
      field.set(contact, TEST_STRING);
      assertEquals(TEST_STRING, contact.getsID());
    }

    @Test
    public void setsID() throws Exception
    {
      contact.setsID(TEST_STRING);
      assertEquals(TEST_STRING, field.get(contact));
    }
  }

  public class ManagerId
  {
    private final Field field;

    public ManagerId() throws Exception
    {
      field = Contact.class.getDeclaredField("managerId");
      field.setAccessible(true);
    }

    @Test
    public void getManagerId() throws Exception
    {
      field.set(contact, TEST_INT);
      assertEquals(TEST_INT, contact.getManagerId());
    }

    @Test
    public void setManagerId() throws Exception
    {
      contact.setManagerId(TEST_INT);
      assertEquals(TEST_INT, field.get(contact));
    }
  }

  public class AssistantId
  {
    private final Field field;

    public AssistantId() throws Exception
    {
      field = Contact.class.getDeclaredField("assistantId");
      field.setAccessible(true);
    }

    @Test
    public void getAssistantId() throws Exception
    {
      field.set(contact, TEST_INT);
      assertEquals(TEST_INT, contact.getAssistantId());
    }

    @Test
    public void setAssistantId() throws Exception
    {
      contact.setAssistantId(TEST_INT);
      assertEquals(TEST_INT, field.get(contact));
    }
  }

  public class Relationship
  {
    private final Field field;

    public Relationship() throws Exception
    {
      field = Contact.class.getDeclaredField("relationship");
      field.setAccessible(true);
    }

    @Test
    public void getRelationship() throws Exception
    {
      field.set(contact, TEST_STRING);
      assertEquals(TEST_STRING, contact.getRelationship());
    }

    @Test
    public void setRelationship() throws Exception
    {
      contact.setRelationship(TEST_STRING);
      assertEquals(TEST_STRING, field.get(contact));
    }
  }

  public class Type
  {
    private final Field field;

    public Type() throws Exception
    {
      field = Contact.class.getDeclaredField("type");
      field.setAccessible(true);
    }

    @Test
    public void getType() throws Exception
    {
      field.set(contact, TEST_STRING);
      assertEquals(TEST_STRING, contact.getType());
    }

    @Test
    public void setType() throws Exception
    {
      contact.setType(TEST_STRING);
      assertEquals(TEST_STRING, field.get(contact));
    }
  }

  public class Phone
  {
    private final Field field;

    public Phone() throws Exception
    {
      field = Contact.class.getDeclaredField("phone");
      field.setAccessible(true);
    }

    @Test
    public void getPhone() throws Exception
    {
      field.set(contact, TEST_STRING);
      assertEquals(TEST_STRING, contact.getPhone());
    }

    @Test
    public void setPhone() throws Exception
    {
      contact.setPhone(TEST_STRING);
      assertEquals(TEST_STRING, field.get(contact));
    }
  }

  public class PhoneExt
  {
    private final Field field;

    public PhoneExt() throws Exception
    {
      field = Contact.class.getDeclaredField("phoneExt");
      field.setAccessible(true);
    }

    @Test
    public void getPhoneExt() throws Exception
    {
      field.set(contact, TEST_STRING);
      assertEquals(TEST_STRING, contact.getPhoneExt());
    }

    @Test
    public void setPhoneExt() throws Exception
    {
      contact.setPhoneExt(TEST_STRING);
      assertEquals(TEST_STRING, field.get(contact));
    }
  }

  public class Fax
  {
    private final Field field;

    public Fax() throws Exception
    {
      field = Contact.class.getDeclaredField("fax");
      field.setAccessible(true);
    }

    @Test
    public void getFax() throws Exception
    {
      field.set(contact, TEST_STRING);
      assertEquals(TEST_STRING, contact.getFax());
    }

    @Test
    public void setFax() throws Exception
    {
      contact.setFax(TEST_STRING);
      assertEquals(TEST_STRING, field.get(contact));
    }
  }

  public class FaxExt
  {
    private final Field field;

    public FaxExt() throws Exception
    {
      field = Contact.class.getDeclaredField("faxExt");
      field.setAccessible(true);
    }

    @Test
    public void getFaxExt() throws Exception
    {
      field.set(contact, TEST_STRING);
      assertEquals(TEST_STRING, contact.getFaxExt());
    }

    @Test
    public void setFaxExt() throws Exception
    {
      contact.setFaxExt(TEST_STRING);
      assertEquals(TEST_STRING, field.get(contact));
    }
  }

  public class Title
  {
    private final Field field;

    public Title() throws Exception
    {
      field = Contact.class.getDeclaredField("title");
      field.setAccessible(true);
    }

    @Test
    public void getTitle() throws Exception
    {
      field.set(contact, TEST_STRING);
      assertEquals(TEST_STRING, contact.getTitle());
    }

    @Test
    public void setTitle() throws Exception
    {
      contact.setTitle(TEST_STRING);
      assertEquals(TEST_STRING, field.get(contact));
    }
  }

  public class School
  {
    private final Field field;

    public School() throws Exception
    {
      field = Contact.class.getDeclaredField("school");
      field.setAccessible(true);
    }

    @Test
    public void getSchool() throws Exception
    {
      field.set(contact, TEST_STRING);
      assertEquals(TEST_STRING, contact.getSchool());
    }

    @Test
    public void setSchool() throws Exception
    {
      contact.setSchool(TEST_STRING);
      assertEquals(TEST_STRING, field.get(contact));
    }
  }

  public class NickName
  {
    private final Field field;

    public NickName() throws Exception
    {
      field = Contact.class.getDeclaredField("nickName");
      field.setAccessible(true);
    }

    @Test
    public void getNickName() throws Exception
    {
      field.set(contact, TEST_STRING);
      assertEquals(TEST_STRING, contact.getNickName());
    }

    @Test
    public void setNickName() throws Exception
    {
      contact.setNickName(TEST_STRING);
      assertEquals(TEST_STRING, field.get(contact));
    }
  }

  public class Married
  {
    private final Field field;

    public Married() throws Exception
    {
      field = Contact.class.getDeclaredField("married");
      field.setAccessible(true);
    }

    @Test
    public void isMarried() throws Exception
    {

    }

    @Test
    public void setMarried() throws Exception
    {

    }
  }

  public class Children
  {
    private final Field field;

    public Children() throws Exception
    {
      field = Contact.class.getDeclaredField("children");
      field.setAccessible(true);
    }

    @Test
    public void isChildren() throws Exception
    {

    }

    @Test
    public void setChildren() throws Exception
    {

    }
  }

  public class SignificantOther
  {
    private final Field field;

    public SignificantOther() throws Exception
    {
      field = Contact.class.getDeclaredField("significantOther");
      field.setAccessible(true);
    }

    @Test
    public void getSignificantOther() throws Exception
    {
      field.set(contact, TEST_STRING);
      assertEquals(TEST_STRING, contact.getSignificantOther());
    }

    @Test
    public void setSignificantOther() throws Exception
    {
      contact.setSignificantOther(TEST_STRING);
      assertEquals(TEST_STRING, field.get(contact));
    }
  }

  public class PortalSecurityLevel
  {
    private final Field field;

    private final short testShort = 666;

    public PortalSecurityLevel() throws Exception
    {
      field = Contact.class.getDeclaredField("portalSecurityLevel");
      field.setAccessible(true);
    }

    @Test
    public void getPortalSecurityLevel() throws Exception
    {
      field.set(contact, testShort);
      assertEquals(testShort, contact.getPortalSecurityLevel());
    }

    @Test
    public void setPortalSecurityLevel() throws Exception
    {
      contact.setPortalSecurityLevel(testShort);
      assertEquals(testShort, field.get(contact));
    }
  }

  public class DisablePortalLogin
  {
    private final boolean testBoolean = true;

    private final Field field;

    public DisablePortalLogin() throws Exception
    {
      field = Contact.class.getDeclaredField("disablePortalLogin");
      field.setAccessible(true);
    }

    @Test
    public void isDisablePortalLogin() throws Exception
    {
      field.set(contact, testBoolean);
      assertEquals(testBoolean, contact.isDisablePortalLogin());
    }

    @Test
    public void setDisablePortalLogin() throws Exception
    {
      contact.setDisablePortalLogin(testBoolean);
      assertEquals(testBoolean, field.get(contact));
    }
  }

  public class UnsubscribeFlag
  {
    private final Field field;

    public UnsubscribeFlag() throws Exception
    {
      field = Contact.class.getDeclaredField("unsubscribeFlag");
      field.setAccessible(true);
    }

    @Test
    public void isUnsubscribeFlag() throws Exception
    {

    }

    @Test
    public void setUnsubscribeFlag() throws Exception
    {

    }
  }

  public class PersonalAddressFlag
  {
    private final Field field;

    public PersonalAddressFlag() throws Exception
    {
      field = Contact.class.getDeclaredField("personalAddressFlag");
      field.setAccessible(true);
    }

    @Test
    public void isPersonalAddressFlag() throws Exception
    {

    }

    @Test
    public void setPersonalAddressFlag() throws Exception
    {

    }
  }

  public class Gender
  {
    private final Field field;

    private final Contact.Gender testGender = Contact.Gender.Unspecified;

    public Gender() throws Exception
    {
      field = Contact.class.getDeclaredField("gender");
      field.setAccessible(true);
    }

    @Test
    public void getGender() throws Exception
    {
      field.set(contact, testGender);
      assertEquals(testGender, contact.getGender());
    }

    @Test
    public void setGender() throws Exception
    {
      contact.setGender(testGender);
      assertEquals(testGender, field.get(contact));
    }
  }

  public class BirthDay
  {
    private final Field field;

    public BirthDay() throws Exception
    {
      field = Contact.class.getDeclaredField("birthDay");
      field.setAccessible(true);
    }

    @Test
    public void getBirthDay() throws Exception
    {
      field.set(contact, TEST_DATE);
      assertEquals(TEST_DATE, contact.getBirthDay());
    }

    @Test
    public void setBirthDay() throws Exception
    {
      contact.setBirthDay(TEST_DATE);
      assertEquals(TEST_DATE, field.get(contact));
    }
  }

  public class Anniversary
  {
    private final Field field;

    public Anniversary() throws Exception
    {
      field = Contact.class.getDeclaredField("anniversary");
      field.setAccessible(true);
    }

    @Test
    public void getAnniversary() throws Exception
    {
      field.set(contact, TEST_DATE);
      assertEquals(TEST_DATE, contact.getAnniversary());
    }

    @Test
    public void setAnniversary() throws Exception
    {
      contact.setAnniversary(TEST_DATE);
      assertEquals(TEST_DATE, field.get(contact));
    }
  }

  public class AddressId
  {
    private final Field field;

    public AddressId() throws Exception
    {
      field = Contact.class.getDeclaredField("addressId");
      field.setAccessible(true);
    }

    @Test
    public void getAddressId() throws Exception
    {
      field.set(contact, TEST_INT);
      assertEquals(TEST_INT, contact.getAddressId());
    }

    @Test
    public void setAddressId() throws Exception
    {
      contact.setAddressId(TEST_INT);
      assertEquals(TEST_INT, field.get(contact));
    }
  }

  public class SiteName
  {
    private final Field field;

    public SiteName() throws Exception
    {
      field = Contact.class.getDeclaredField("siteName");
      field.setAccessible(true);
    }

    @Test
    public void getSiteName() throws Exception
    {
      field.set(contact, TEST_STRING);
      assertEquals(TEST_STRING, contact.getSiteName());
    }

    @Test
    public void setSiteName() throws Exception
    {
      contact.setSiteName(TEST_STRING);
      assertEquals(TEST_STRING, field.get(contact));
    }
  }

  public class CompanyAddressInfo
  {
    private final Field field;

    private final io.vulpine.connectwise.type.contact.CompanyAddressInfo addressInfo = new io.vulpine.connectwise.type.contact.CompanyAddressInfo();

    public CompanyAddressInfo() throws Exception
    {
      field = Contact.class.getDeclaredField("companyAddressInfo");
      field.setAccessible(true);
    }

    @Test
    public void getCompanyAddressInfo() throws Exception
    {
      field.set(contact, addressInfo);
      assertSame(addressInfo, contact.getCompanyAddressInfo());
    }

    @Test
    public void setCompanyAddressInfo() throws Exception
    {
      contact.setCompanyAddressInfo(addressInfo);
      assertSame(addressInfo, field.get(contact));
    }
  }

  public class Phones
  {
    private final Field field;

    private final List < ContactCommunicationItem > testList = new ArrayList < ContactCommunicationItem > ();

    public Phones() throws Exception
    {
      field = Contact.class.getDeclaredField("phones");
      field.setAccessible(true);
      testList.add(new ContactCommunicationItem());
      testList.add(new ContactCommunicationItem());
      testList.add(new ContactCommunicationItem());
    }

    @Test
    public void getPhones() throws Exception
    {
      field.set(contact, testList);
      assertEquals(testList, contact.getPhones());
    }

    @Test
    public void setPhones() throws Exception
    {
      contact.setPhones(testList);
      assertEquals(testList, field.get(contact));
    }
  }

  public class Emails
  {
    private final Field field;

    private final List < ContactCommunicationItem > testList = new ArrayList < ContactCommunicationItem >();

    public Emails() throws Exception
    {
      field = Contact.class.getDeclaredField("emails");
      field.setAccessible(true);
      testList.add(new ContactCommunicationItem());
      testList.add(new ContactCommunicationItem());
      testList.add(new ContactCommunicationItem());
    }

    @Test
    public void getEmails() throws Exception
    {
      field.set(contact, testList);
      assertSame(testList, contact.getEmails());
    }

    @Test
    public void setEmails() throws Exception
    {
      contact.setEmails(testList);
      assertSame(testList, field.get(contact));
    }
  }

  public class Faxes
  {
    private final Field field;

    private final List < ContactCommunicationItem > testList = new ArrayList < ContactCommunicationItem >();

    public Faxes() throws Exception
    {
      field = Contact.class.getDeclaredField("faxes");
      field.setAccessible(true);
      testList.add(new ContactCommunicationItem());
      testList.add(new ContactCommunicationItem());
      testList.add(new ContactCommunicationItem());
    }

    @Test
    public void getFaxes() throws Exception
    {
      field.set(contact, testList);
      assertSame(testList, contact.getFaxes());
    }

    @Test
    public void setFaxes() throws Exception
    {
      contact.setFaxes(testList);
      assertSame(testList, field.get(contact));
    }
  }
}
