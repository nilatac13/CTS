package unittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestStudent.class, TestTeacher.class, TestNoticeBoard.class, TestPost.class, TestComment.class})
public class TestSuite {



}
