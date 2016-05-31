package unittest;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ase.ro.Comment;

public class TestComment {
	
	private final static String MESSAGE="Confirm cele spuse mai sus.";
	private final static Date DATE = new Date();
	private final static String ID_STUDENT = "S74456722";
	private Comment myComment;
	
	@Before
	public void setUp() throws Exception {
		myComment = new Comment(MESSAGE, DATE, ID_STUDENT);
	}

	@After
	public void tearDown() throws Exception {
	}

		
	//message
	
		@Test
		public void testSetAndGetMessageNormalValue() {
			String message = "Nu cred ca se poate face aceasta metoda.";
			try {
				myComment.setMessage(message);
				assertEquals("Set message normal values", message, myComment.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		@Test
		public void testSetMessageWhiteSpaceString() {
			String message = "      ";
			try {
				myComment.setMessage(message);
				fail("There is no exception if message has just white spaces");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void testSetMessageEmptyString() {
			String message = "";
			try {
				myComment.setMessage(message);
				fail("There is no exception if message is empty");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void testSetMessageNullString() {
			String message = null;
			try {
				myComment.setMessage(message);
				fail("There is no exception if message is null");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void testSetMessageStringTooShort() {
			String message = "1";
			try {
				myComment.setMessage(message);
				fail("There is no exception if message is too short");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void testSetMessageStringTooLong() {
			String message = "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong"
					+ "longlonglonglonglonglonglonglonglonglonglonglonglonglong";
			try {
				myComment.setMessage(message);
				fail("There is no exception if message is too long");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//id student
		
		@Test
		public void testSetAndGetIdStudentNormalValue() {
			String idStudent = "S88424775";
			try {
				myComment.setIdStudent(idStudent);
				assertEquals("Set id student normal values", idStudent, myComment.getIdStudent());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void testSetIdStudentWhiteSpace() {
			String idStudent = "   S88424 \n  775    ";
			try {
				myComment.setIdStudent(idStudent);
				fail("There is no exception if id student has 2 words");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void testSetIdStudentWhiteSpaceString() {
			String idStudent = "      ";
			try {
				myComment.setIdStudent(idStudent);
				fail("There is no exception if id student has just white spaces");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void testSetIdStudentEmptyString() {
			String idStudent = "";
			try {
				myComment.setIdStudent(idStudent);
				fail("There is no exception if id student is empty");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void testSetIdStudentNullString() {
			String idStudent = null;
			try {
				myComment.setIdStudent(idStudent);
				fail("There is no exception if id student is null");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void testSetIdStudentStringTooShort() {
			String idStudent = "S1321";
			try {
				myComment.setIdStudent(idStudent);
				fail("There is no exception if id student is too short");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void testSetIdStudentStringTooLong() {
			String idStudent = "S777777788884441222225515866";
			try {
				myComment.setIdStudent(idStudent);
				fail("There is no exception if id student is too long");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//date
		
		@Test
		public void testSetAndGetDateNormalValue() {
			Date today = new Date();
			try {
				myComment.setDate(today);
				assertEquals("Set date normal values", today, myComment.getDate());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void testSetAndGetDateWrongValue() {
			
			try {
				SimpleDateFormat myFormat = new SimpleDateFormat("dd MM YYYY");
				String dateString = "14 25 2041";
				Date today = (Date)myFormat.parse(dateString);
				myComment.setDate(today);
				fail("There is no exception if the date is from future");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
