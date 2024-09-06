package parameterization.dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	WebDriver driver;
	EdgeOptions options;
	
	@BeforeMethod
	void setup(){
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tutorialsninja.com/demo/index.php?route=account/login");
//		options = new EdgeOptions();
//		options.setCDPVersion("128"); // Replace with the correct CDP version
	}
	
	@Test(dataProvider="dp") //dataProvider is one of the attribute of the @Test annotation
	void testLogin(String email, String pwd) throws InterruptedException {
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(pwd);//input[@class='btn btn-primary']
		driver.findElement(By.xpath("//form[@method='post']/child::input[@class='btn btn-primary']")).click();
		boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status==true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}
	}
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	@DataProvider(name="dp") // DataProvider is testNG annotation and name is attribute and should be unique for every data provider
	//@DataProvider(name="dp", indices={0,3,4}) for specific data below array
	Object[][] loginData() {
		
		Object data[][] = {
//				{"abc@gmail.com","test123"},
//				{"xyz@gmail.com","test023"},
//				{"john@gmail.com","test@123"},
				{"pavanol123@gmail.com","test@123"},
				{"johncanedy@gmail.com","test"}
		};
		return data;
	}
	
}
