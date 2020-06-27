import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class UserStory1TestRunner {
	   public static void main(String[] args) {
		   
		   System.out.println("              . --- .");
		   System.out.println("            /        \\");
		   System.out.println("           |  O  _  O |");
		   System.out.println("           |  ./   \\. |");
		   System.out.println("           /  `-._.-'  \\");
		   System.out.println("         .' /         \\ `.");
		   System.out.println("     .-~.-~/           \\~-.~-.");
		   System.out.println(" .-~ ~    |             |    ~ ~-.");
		   System.out.println(" `- .     |             |     . -'");
		   System.out.println("      ~ - |             | - ~");
		   System.out.println("          \\             / ");
		   System.out.println("        ___\\           /___");
		   System.out.println("        ~;_  >- . . -<  _i~");
		   System.out.println("           `'         `'");
		   System.out.println("");
	      Result result = JUnitCore.runClasses(UserStory1Test.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println("Testing Pins Function:");
	      System.out.println(result.wasSuccessful());
	   }
}