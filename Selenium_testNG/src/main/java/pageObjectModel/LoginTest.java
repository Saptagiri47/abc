package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	void testLogin() {
		//call actions from POM_LoginPage
		//So we need to create an object for POM_LoginPage
		POM_LoginPage lp = new POM_LoginPage(driver); // linking to constructor driver in poclass
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		
		//validations
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		
	}
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	
}
