package batchTesting;

import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void loginByEmail() {
		System.out.println("Logged in by Email.");
	}
	@Test
	public void loginByFacebook() {
		System.out.println("Logged in by Facebook.");
	}
	@Test
	public void loginByX() {
		System.out.println("Logged in by X.");
	}
}
