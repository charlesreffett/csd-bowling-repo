import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserStory1Test {
	static UserStory1 tester;

	  @BeforeClass
	  public static void testSetup() {
	    tester = new UserStory1();
	  }

	  @AfterClass
	  public static void testCleanup() {
	    // cleanup
	  }

	  @Test
	  public void test2Pins() {
	    assertEquals("Result", 2, tester.getPins(2));
	  }

}
