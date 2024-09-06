package batchTesting;

import org.testng.annotations.Test;

public class PaymentsTest {
	@Test
	public void paymentInDollars() {
		System.out.println("Payment is made in Dollars.");
	}
	@Test
	public void paymentInRupees() {
		System.out.println("Payment is made in Rupees.");
	}
}
