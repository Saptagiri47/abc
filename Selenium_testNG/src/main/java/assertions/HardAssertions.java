package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertions {
	 SoftAssert sa; // variable
	
// these can be directly accessed from Assert class called hard assertions
	//problem with hard assertions
	/*
	 * if any assertion got failed, rest of the assertion won't execute
	 * so we place at last
	 * mostly use hard assert only
	 */
	
	@Test
	void test_hardAssertions() {
		System.out.println("testng...");
		System.out.println("testng...");
		
		Assert.assertEquals(1, 1);
//		Assert.assertEquals(1, 2); // if we make fail by this way we can't execute below asserts

		System.out.println("testng...");
		System.out.println("testng...");
		
		//in TC last point is validation. likewise we keep assert at last
		//to overcome the issue we generally place the Assert at bottom of test i.e: last in any method
	}
	
	@Test
	void test_softAssertions() {
		System.out.println("testng...");
		System.out.println("testng...");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2); // soft assert making false to see behavior in output
		
		System.out.println("testng...");
		System.out.println("testng..."); // below statemetents are executes
		
		sa.assertAll(); //mandatory. by default soft assertions pass like hard assert
		// by using above assertAll method we can make fail
		// in class level also we can create Soft assert but we can't make object out of it in class level
	}
	
	@Test
	void test() {
		Assert.assertEquals("xyz", "xy");//compares two values
		Assert.assertEquals(123, 123);
		Assert.assertEquals("xyz", 123);
		
		Assert.assertNotEquals("xyz", "xy"); // pass
		Assert.assertNotEquals("xyz", "xyz"); // failed
		
		Assert.assertTrue(true); //pass
		Assert.assertTrue(false); //failed
		
		Assert.assertTrue(1==2); //failed
		Assert.assertTrue(1==1); //pass
		
		Assert.assertFalse(1==2); //pass
		Assert.assertFalse(1==1); //failed
		
		Assert.fail(); // no validations nothing just failed TC
	}
}
