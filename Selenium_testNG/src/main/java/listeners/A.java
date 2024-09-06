package listeners;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class A {
	/**
	 * A TC may
	 * pass
	 * fail
	 * skip
	 * 
	 * after performing TC we may do some actions called post actions like
	 * screenshot, == failed
	 * update results into report, == passed
	 * 
	 * ITestListener == pre-defined interface/default
	 * contains methods like
	 * ontestskip
	 * ontestfail
	 * ontestsuccess=pass
	 * we don't call them, they automatically triggers
	 * and performs post actions
	 */

	WebDriver driver;

	@BeforeClass
	@Parameters({"browser"}) //here browser is from Params.xml file
	// we can achieve cross browser execution
	void setup(String br) {
		switch(br.toLowerCase()) {
		case "chrome" : driver=new ChromeDriver(); break;
		case "edge" : driver=new EdgeDriver(); break;
		case "firefox" : driver=new FirefoxDriver(); break;
		default : System.out.println("Invalid Browser"); return; //this don't allow executing below codes
		}

		driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void testLogo() {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true); //above is boolean so true/false
	}
	@Test(priority=2)
	void testTitle() {
		Assert.assertEquals(driver.getTitle(),"OrangeHrm"); // here we comparing two strings
	}
	@Test(priority=3, dependsOnMethods= {"testTitle"})
	void testUrl() {
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com");
		// here we comparing two strings
	}
	@AfterClass
	void tearDown() {
		driver.quit();
	}

}
