package unittest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ase.ro.BuilderPost;
import ase.ro.NoticeBoard;
import ase.ro.Post;

public class TestNoticeBoard {

	private NoticeBoard myNotice;
	private ArrayList<Post> myPosts;
	
	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetAndConstructor() {
		String subject = "poo";
		String idStudent = "S38261945";
		String message = "Examenul se va sustine in sala 2013";
		Date date = new Date();
		Post poo;
		try {
			poo = new BuilderPost(subject, idStudent)
					.setDate(date)
					.setMessage(message)
					.build();
			myPosts = new ArrayList<Post>();
			myPosts.add(poo);
			
			myNotice = new NoticeBoard(myPosts);
			assertEquals("Get the lists of posts", myPosts, myNotice.getPosts());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
