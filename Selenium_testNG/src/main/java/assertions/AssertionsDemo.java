package assertions;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	@Test
	void testTitle() {
		String exp_title="Opencart";
		String act_title="Openshop";
		
//		if(exp_title.equals(act_title))
//		{
//			System.out.println("Test passed");
//		} else
//		{
//			System.out.println("Test failed");
//		}
		// by using if condition TC wrong also passed
		Assert.assertEquals(exp_title, act_title); // mostly we use
		
		//we can even use conditional statements with Assert class
		if(exp_title.equals(act_title))
			{
				System.out.println("Test passed");
				Assert.assertTrue(true); //Assert with boolean conditions
			} else
			{
				System.out.println("Test failed");
				Assert.assertTrue(false);
			} // this conditional statements results don't display in reports so less preference
	}
}
