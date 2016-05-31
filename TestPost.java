package unittest;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ase.ro.BuilderPost;
import ase.ro.Comment;
import ase.ro.Post;

public class TestPost {
	
	private final static String SUBJECT="CTS";
	private final static String MESSAGE="S-au afisat rezultatele la test.";
	private final static Date DATE = new Date();
	private final static String ID_STUDENT = "S38261945";
	private Post myPost;
	
	@Before
	public void setUp() throws Exception {
		myPost = new BuilderPost(SUBJECT, ID_STUDENT)
				.setDate(DATE)
				.setMessage(MESSAGE)
				.build();
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	//subject
	
	@Test
	public void testSetAndGetSubjectNormalValue() {
		String subject = "Structuri de date";
		try {
			myPost.setSubject(subject);
			assertEquals("Set subject normal values", subject, myPost.getSubject());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testSetSubjectWhiteSpaceString() {
		String subject = "    ";
		try {
			myPost.setSubject(subject);
			fail("There is no exception if subject has just white spaces");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetSubjectEmptyString() {
		String subject = "";
		try {
			myPost.setSubject(subject);
			fail("There is no exception if subject is empty");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetSubjectNullString() {
		String subject = null;
		try {
			myPost.setSubject(subject);
			fail("There is no exception if subject is null");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetSubjectStringTooShort() {
		String subject = "a";
		try {
			myPost.setSubject(subject);
			fail("There is no exception if subject is too short");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetSubjectStringTooLong() {
		String subject = "longlonglonglonglonglonglonglonglonglonglonglong"
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
			myPost.setSubject(subject);
			fail("There is no exception if subject is too long");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//message
	
	@Test
	public void testSetAndGetMessageNormalValue() {
		String message = "Seminarul de Engleza nu se mai tine astazi.";
		try {
			myPost.setMessage(message);
			assertEquals("Set message normal values", message, myPost.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testSetMessageWhiteSpaceString() {
		String message = "        ";
		try {
			myPost.setMessage(message);
			fail("There is no exception if message has just white spaces");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetMessageEmptyString() {
		String message = "";
		try {
			myPost.setMessage(message);
			fail("There is no exception if message is empty");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetMessageNullString() {
		String message = null;
		try {
			myPost.setMessage(message);
			fail("There is no exception if message is null");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetMessageStringTooShort() {
		String message = "0";
		try {
			myPost.setMessage(message);
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
			myPost.setMessage(message);
			fail("There is no exception if message is too long");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//id student
	
	@Test
	public void testSetAndGetIdStudentNormalValue() {
		String idStudent = "S44444945";
		try {
			myPost.setIdStudent(idStudent);
			assertEquals("Set id student normal values", idStudent, myPost.getIdStudent());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdStudentWhiteSpace() {
		String idStudent = "   S444 \n  44945    ";
		try {
			myPost.setIdStudent(idStudent);
			fail("There is no exception if id student has 2 words");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdStudentWhiteSpaceString() {
		String idStudent = "    ";
		try {
			myPost.setIdStudent(idStudent);
			fail("There is no exception if id student has just white spaces");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdStudentEmptyString() {
		String idStudent = "";
		try {
			myPost.setIdStudent(idStudent);
			fail("There is no exception if id student is empty");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdStudentNullString() {
		String idStudent = null;
		try {
			myPost.setIdStudent(idStudent);
			fail("There is no exception if id student is null");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdStudentStringTooShort() {
		String idStudent = "S3232";
		try {
			myPost.setIdStudent(idStudent);
			fail("There is no exception if id student is too short");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetIdStudentStringTooLong() {
		String idStudent = "S1238237218734000723";
		try {
			myPost.setIdStudent(idStudent);
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
			myPost.setDate(today);
			assertEquals("Set date normal values", today, myPost.getDate());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetAndGetDateWrongValue() {
		
		try {
			SimpleDateFormat myFormat = new SimpleDateFormat("dd MM YYYY");
			String dateString = "20 01 2030";
			Date today = (Date)myFormat.parse(dateString);
			myPost.setDate(today);
			fail("There is no exception if the date is from future");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//comments
	
	@Test
	public void testAddCommentNormalValue() {
		Comment myComment = new Comment(MESSAGE, DATE, ID_STUDENT);
		
		try {

			myPost.addComment(myComment);
			assertEquals("Add comment normal value", myComment, myPost.getComments().get(0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAddCommentNullValue() {
		Comment myComment = null;
		
		try {
			myPost.addComment(myComment);
			fail("There is no exception if comment is null");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
