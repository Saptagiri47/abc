package batchTesting;

import org.testng.annotations.Test;

public class SignUpTest {
	@Test
	public void signUpByEmail() {
		System.out.println("signup by Email.");
	}
	@Test
	public void signUpByFacebook() {
		System.out.println("signup by Facebook.");
	}
	@Test
	public void signUpByX() {
		System.out.println("signup by X.");
	}
}
