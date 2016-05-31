package unittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ase.ro.BuilderTeacher;
import ase.ro.Teacher;
import ase.ro.Teacher;

public class TestTeacher {
	
	private Teacher myTeacher;
    private static final String LAST_NAME = "Grigorescu";
    private static final  String SECOND_NAME = "Alexandru";
    private static final  String EMAIL_ADDRESS ="grigA@yahoo.com";
    private static final  String ID = "T45136574";
    private static final  int PHONE_NUMBER = 721948552;

	@Before
	public void setUp() throws Exception {
		myTeacher = new BuilderTeacher(LAST_NAME, SECOND_NAME, ID)
		.setEmailAddress(EMAIL_ADDRESS)
		.setPhoneNumber(PHONE_NUMBER)
		.build();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	//last name
	
	@Test
	public void testSetAndGetLastNameNormalValue() {
		String lastName = "Lascu";
		try {
			myTeacher.setLastName(lastName);
			assertEquals("Set last name normal values", lastName, myTeacher.getLastName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetLastNameWhiteSpace() {
		String lastName = "    Ion    \n Lazar";
		try {
			myTeacher.setLastName(lastName);
			fail("There is no exception if last name has 2 words");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetLastNameWhiteSpaceString() {
		String lastName = "    ";
		try {
			myTeacher.setLastName(lastName);
			fail("There is no exception if last name has just white spaces");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetLastNameEmptyString() {
		String lastName = "";
		try {
			myTeacher.setLastName(lastName);
			fail("There is no exception if last name is empty");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetLastNameNullString() {
		String lastName = null;
		try {
			myTeacher.setLastName(lastName);
			fail("There is no exception if last name is null");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetLastNameStringTooShort() {
		String lastName = "xz";
		try {
			myTeacher.setLastName(lastName);
			fail("There is no exception if last name is too short");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetLastNameStringTooLong() {
		String lastName = "longlonglonglonglonglonglonglonglonglonglonglong"
				+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
				+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
				+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
				+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong";
		try {
			myTeacher.setLastName(lastName);
			fail("There is no exception if last name is too long");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//second name
	
	@Test
	public void testSetAndGetSecondNameNormalValue() {
		String secondName = "Ecaterina";
		try {
			myTeacher.setSecondName(secondName);
			assertEquals("Set second name normal values", secondName, myTeacher.getSecondName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetSecondNameWhiteSpace() {
		String secondName = "    Puiu    \n Nicolaie";
		try {
			myTeacher.setSecondName(secondName);
			fail("There is no exception if second name has 2 words");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetSecondNameWhiteSpaceString() {
		String secondName = "    ";
		try {
			myTeacher.setSecondName(secondName);
			fail("There is no exception if second name has just white spaces");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetSecondNameEmptyString() {
		String secondName = "";
		try {
			myTeacher.setSecondName(secondName);
			fail("There is no exception if second name is empty");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetSecondNameNullString() {
		String secondName = null;
		try {
			myTeacher.setSecondName(secondName);
			fail("There is no exception if second name is null");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetSecondNameStringTooShort() {
		String secondName = "po";
		try {
			myTeacher.setSecondName(secondName);
			fail("There is no exception if second name is too short");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetSecondNameStringTooLong() {
		String secondName = "loooooooooooooooooooooooooooooooooooooooooooooooo"
				+ "oooooooooooooooooooooooooooooooooooooooooooooooooooooo"
				+ "ooooooooooooooooooooooooooooooooooooooooooooooooooooooooo"
				+ "ooooooooooooooooooooooooooooooooooooooooooooooooooooooooong";
		try {
			myTeacher.setLastName(secondName);
			fail("There is no exception if second name is too long");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//emai addeess
	
	@Test
	public void testSetEmailAddressIncorrectValue1() {
		String emailAddress = "laszuhotmailcom";
		try {
			myTeacher.setEmailAddress(emailAddress);
			fail("There is no exception if email address hasn't @ .");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetEmailAddressIncorrectValue2() {
		String emailAddress = "andrei@hotmailcom";
		try {
			myTeacher.setEmailAddress(emailAddress);
			fail("There is no exception if email address hasn't @ .");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetEmailAddressIncorrectValue3() {
		String emailAddress = "gigilhotmail.com";
		try {
			myTeacher.setEmailAddress(emailAddress);
			fail("There is no exception if email address hasn't @ .");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSetAndGetEmailAddressNormalValue() {
		String emailAddress = "ion@hotmail.com";
		try {
			myTeacher.setEmailAddress(emailAddress);
			assertEquals("Set email address normal values", 
					emailAddress, myTeacher.getEmailAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetEmailAddressWhiteSpace() {
		String emailAddress = "io  n@ho \n  tmail.com";
		try {
			myTeacher.setEmailAddress(emailAddress);
			fail("There is no exception if email address has white spaces");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetEmailAddressWhiteSpaceString() {
		String emailAddress = "      ";
		try {
			myTeacher.setEmailAddress(emailAddress);
			fail("There is no exception if email address has just white spaces");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetEmailAddressEmptyString() {
		String emailAddress = "";
		try {
			myTeacher.setEmailAddress(emailAddress);
			fail("There is no exception if email address is empty");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetEmailAddressNullString() {
		String emailAddress = null;
		try {
			myTeacher.setEmailAddress(emailAddress);
			fail("There is no exception if email address is null");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetEmailAddressStringTooShort() {
		String emailAddress = "@.om";
		try {
			myTeacher.setEmailAddress(emailAddress);
			fail("There is no exception if email address is too short");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetEmailAddressStringTooLong() {
		String emailAddress = "longlonglonglonglonglonglonglonglonglonglonglong"
				+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
				+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
				+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
				+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong@yahoo.com";
		try {
			myTeacher.setEmailAddress(emailAddress);
			fail("There is no exception if email address is too long");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//id

	@Test
	public void testSetAndGetIdNormalValue() {
		String id = "T22285458";
		try {
			myTeacher.setId(id);
			assertEquals("Set id normal values", id, myTeacher.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdWhiteSpace() {
		String id = " S5255 \n";
		try {
			myTeacher.setId(id);
			fail("There is no exception if id has 2 words");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdWhiteSpaceString() {
		String id = "         ";
		try {
			myTeacher.setId(id);
			fail("There is no exception if id has just white spaces");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdEmptyString() {
		String id = "";
		try {
			myTeacher.setId(id);
			fail("There is no exception if id is empty");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdNullString() {
		String id = null;
		try {
			myTeacher.setId(id);
			fail("There is no exception if id is null");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdStringTooShort() {
		String id = "T64";
		try {
			myTeacher.setId(id);
			fail("There is no exception if id is too short");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdStringTooLong() {
		String id = "A777777777777777777777777777777";
		try {
			myTeacher.setId(id);
			fail("There is no exception if id is too long");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//check phone number
	
	@Test
	public void testCheckPhoneNumberNormalValues() {
		int phoneNumber = 789555123;
		try {
			myTeacher.checkPhoneNumber(phoneNumber);
			assertEquals("Check phone number normal values",
					true, myTeacher.checkPhoneNumber(phoneNumber));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//set phone number
	
	@Test
	public void testSetAndGetPhoneNumberNormalValues() {
		int phoneNumber = 788456222;
		try {
			myTeacher.setPhoneNumber(phoneNumber);
			assertEquals("Set phone number normal values",
					phoneNumber, myTeacher.getPhoneNumber());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetPhoneNumberWrongValues() {
		int phoneNumber = 377447856;
		try {
			myTeacher.setPhoneNumber(phoneNumber);
			fail("There is no exception if phone number is wrong");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetPhoneNumberShortValues() {
		int phoneNumber = 7566;
		try {
			myTeacher.setPhoneNumber(phoneNumber);
			fail("There is no exception if phone number is too short");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetPhoneNumberLongValues() {
		int phoneNumber = 1000000000;
		try {
			myTeacher.setPhoneNumber(phoneNumber);
			fail("There is no exception if phone number is too long");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
