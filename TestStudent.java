package unittest;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ase.ro.BuilderStudent;
import ase.ro.Student;
import enums.Series;
import enums.Subject;
import enums.Year;
import exceptions.ExceptionStringHasWhiteSpace;
import exceptions.ExceptionStringLengthTooLong;
import exceptions.ExceptionStringLengthTooShort;

public class TestStudent {

	private Student myStudent;
    private static final String LAST_NAME = "Mocanita";
    private static final  String SECOND_NAME = "Catalin";
    private static final  String EMAIL_ADDRESS ="moc.catalin@yahoo.com";
    private static final  String ID = "S38261945";
    private static final  int PHONE_NUMBER = 764242156;
    private static final  int GROUP = 1070;
    private static final  Series SERIES = Series.B;
    private static final  Year YEAR = Year.III;
    private Map<Subject, Integer> grades;
    
	@Before
	public void setUp() throws Exception {
		grades = new HashMap<Subject, Integer>();
		
		grades.put(Subject.ALGEBRA, 5);
		grades.put(Subject.ANALIZA, 8);
		grades.put(Subject.CTS, 10);
		
		

		myStudent = new BuilderStudent(LAST_NAME, SECOND_NAME, ID)
				.setEmailAddress(EMAIL_ADDRESS)
				.setGroup(GROUP)
				.setPhoneNumber(PHONE_NUMBER)
				.setSeries(SERIES)
				.setYear(YEAR)
				.setGrades(grades)
				.build();
	}

	@After
	public void tearDown() throws Exception {
	}

	//last name
	
	@Test
	public void testSetAndGetLastNameNormalValue() {
		String lastName = "Gheorghe";
		try {
			myStudent.setLastName(lastName);
			assertEquals("Set last name normal values", lastName, myStudent.getLastName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetLastNameWhiteSpace() {
		String lastName = "    Catalin    \n Mocanita";
		try {
			myStudent.setLastName(lastName);
			fail("There is no exception if last name has 2 words");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetLastNameWhiteSpaceString() {
		String lastName = "    ";
		try {
			myStudent.setLastName(lastName);
			fail("There is no exception if last name has just white spaces");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetLastNameEmptyString() {
		String lastName = "";
		try {
			myStudent.setLastName(lastName);
			fail("There is no exception if last name is empty");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetLastNameNullString() {
		String lastName = null;
		try {
			myStudent.setLastName(lastName);
			fail("There is no exception if last name is null");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetLastNameStringTooShort() {
		String lastName = "ab";
		try {
			myStudent.setLastName(lastName);
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
			myStudent.setLastName(lastName);
			fail("There is no exception if last name is too long");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//second name
	
	@Test
	public void testSetAndGetSecondNameNormalValue() {
		String secondName = "Valentin";
		try {
			myStudent.setSecondName(secondName);
			assertEquals("Set second name normal values", secondName, myStudent.getSecondName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetSecondNameWhiteSpace() {
		String secondName = "    Adrian    \n Ivascu";
		try {
			myStudent.setSecondName(secondName);
			fail("There is no exception if second name has 2 words");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetSecondNameWhiteSpaceString() {
		String secondName = "    ";
		try {
			myStudent.setSecondName(secondName);
			fail("There is no exception if second name has just white spaces");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetSecondNameEmptyString() {
		String secondName = "";
		try {
			myStudent.setSecondName(secondName);
			fail("There is no exception if second name is empty");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetSecondNameNullString() {
		String secondName = null;
		try {
			myStudent.setSecondName(secondName);
			fail("There is no exception if second name is null");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetSecondNameStringTooShort() {
		String secondName = "vc";
		try {
			myStudent.setSecondName(secondName);
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
			myStudent.setLastName(secondName);
			fail("There is no exception if second name is too long");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//emai addeess
	
	@Test
	public void testSetEmailAddressIncorrectValue1() {
		String emailAddress = "gigilhotmailcom";
		try {
			myStudent.setEmailAddress(emailAddress);
			fail("There is no exception if email address hasn't @ .");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetEmailAddressIncorrectValue2() {
		String emailAddress = "gigil@hotmailcom";
		try {
			myStudent.setEmailAddress(emailAddress);
			fail("There is no exception if email address hasn't @ .");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetEmailAddressIncorrectValue3() {
		String emailAddress = "gigilhotmail.com";
		try {
			myStudent.setEmailAddress(emailAddress);
			fail("There is no exception if email address hasn't @ .");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSetAndGetEmailAddressNormalValue() {
		String emailAddress = "gigil@hotmail.com";
		try {
			myStudent.setEmailAddress(emailAddress);
			assertEquals("Set email address normal values", 
					emailAddress, myStudent.getEmailAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetEmailAddressWhiteSpace() {
		String emailAddress = "gi  gil@ho \n  tmail.com";
		try {
			myStudent.setEmailAddress(emailAddress);
			fail("There is no exception if email address has white spaces");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetEmailAddressWhiteSpaceString() {
		String emailAddress = "      ";
		try {
			myStudent.setEmailAddress(emailAddress);
			fail("There is no exception if email address has just white spaces");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetEmailAddressEmptyString() {
		String emailAddress = "";
		try {
			myStudent.setEmailAddress(emailAddress);
			fail("There is no exception if email address is empty");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetEmailAddressNullString() {
		String emailAddress = null;
		try {
			myStudent.setEmailAddress(emailAddress);
			fail("There is no exception if email address is null");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetEmailAddressStringTooShort() {
		String emailAddress = "@.om";
		try {
			myStudent.setEmailAddress(emailAddress);
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
			myStudent.setEmailAddress(emailAddress);
			fail("There is no exception if email address is too long");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//id

	@Test
	public void testSetAndGetIdNormalValue() {
		String id = "S38785458";
		try {
			myStudent.setId(id);
			assertEquals("Set id normal values", id, myStudent.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdWhiteSpace() {
		String id = " S5555 \n";
		try {
			myStudent.setId(id);
			fail("There is no exception if id has 2 words");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdWhiteSpaceString() {
		String id = "         ";
		try {
			myStudent.setId(id);
			fail("There is no exception if id has just white spaces");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdEmptyString() {
		String id = "";
		try {
			myStudent.setId(id);
			fail("There is no exception if id is empty");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdNullString() {
		String id = null;
		try {
			myStudent.setId(id);
			fail("There is no exception if id is null");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdStringTooShort() {
		String id = "S87";
		try {
			myStudent.setId(id);
			fail("There is no exception if id is too short");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdStringTooLong() {
		String id = "G232327888532236537752342";
		try {
			myStudent.setId(id);
			fail("There is no exception if id is too long");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//check phone number
	
	@Test
	public void testCheckPhoneNumberNormalValues() {
		int phoneNumber = 752212378;
		try {
			myStudent.checkPhoneNumber(phoneNumber);
			assertEquals("Check phone number normal values",
					true, myStudent.checkPhoneNumber(phoneNumber));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//set phone number
	
	@Test
	public void testSetAndGetPhoneNumberNormalValues() {
		int phoneNumber = 712547856;
		try {
			myStudent.setPhoneNumber(phoneNumber);
			assertEquals("Set phone number normal values",
					phoneNumber, myStudent.getPhoneNumber());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetPhoneNumberWrongValues() {
		int phoneNumber = 412547856;
		try {
			myStudent.setPhoneNumber(phoneNumber);
			fail("There is no exception if phone number is wrong");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetPhoneNumberShortValues() {
		int phoneNumber = 745789;
		try {
			myStudent.setPhoneNumber(phoneNumber);
			fail("There is no exception if phone number is too short");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetPhoneNumberLongValues() {
		int phoneNumber = 1000000000;
		try {
			myStudent.setPhoneNumber(phoneNumber);
			fail("There is no exception if phone number is too long");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//set group
	
	@Test
	public void testSetAndGetGroupNormalValue() {
		int group = 1045;
		try {
			myStudent.setGroup(group);
			assertEquals("Set group normal values",
					group, myStudent.getGroup());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetGroupNegativeValue() {
		int group = -1;
		try {
			myStudent.setGroup(group);
			fail("There is no exception if group is negative");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetGroupZeroValue() {
		int group = 0;
		try {
			myStudent.setGroup(group);
			fail("There is no exception if group is 0");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetGroupTooBigValue() {
		int group = 999999;
		try {
			myStudent.setGroup(group);
			fail("There is no exception if group is too big");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Series
	
	@Test
	public void testSetAndGetSeriesNormalValue() {
		Series mySeries = Series.A;
		try {
			myStudent.setSeries(mySeries);
			assertEquals("Set series normal values",
					mySeries, myStudent.getSeries());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Year
	
	@Test
	public void testSetAndGetYearNormalValue() {
		Year myYear = Year.II;
		try {
			myStudent.setYear(myYear);
			assertEquals("Set year normal values",
					myYear, myStudent.getYear());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//add grade
	
	@Test
	public void testAddGradeNormalValue() {
		Subject subject = Subject.ANALIZA;
		int grade = 8;
		try {
			myStudent.addGrade(subject, grade);
			int gradeAnaliza = myStudent.getGrades().get(subject);
			assertEquals("Add grade normal values",
					grade, gradeAnaliza);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAddGradeZeroValue() {
		Subject subject = Subject.SPORT;
		int grade = 0;
		try {
			myStudent.addGrade(subject, grade);
			fail("There is no exception if grade is 0");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAddGradeNegativeValue() {
		Subject subject = Subject.SPORT;
		int grade = -1;
		try {
			myStudent.addGrade(subject, grade);
			fail("There is no exception if grade is negative");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAddGradeBigValueValue() {
		Subject subject = Subject.SPORT;
		int grade = 11;
		try {
			myStudent.addGrade(subject, grade);
			fail("There is no exception if grade is bigger than 10");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//set grade
	
	@Test
	public void testSetGradesNormalValue() {
		Map<Subject, Integer> grades = new HashMap<Subject, Integer>();
		Subject subject = Subject.ANALIZA;
		int grade = 8;
		grades.put(subject, grade);
		try {
			myStudent.setGrades(grades);
			assertEquals("Set grade normal values",
					grades, myStudent.getGrades());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	


}
