package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//Generally We don't execute POClass, we just execute TC. ie - LoginTest
public class POM_LoginPage {
	WebDriver driver;
	
	POM_LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	//locators
	By txt_userName_loc = By.xpath("//input[@placeholder='Username']");
	By txt_password_loc = By.xpath("//input[@placeholder='Password']");
	By btn_login_loc = By.xpath("//button[normalize-space()='Login']");
	
	//action methods
	public void setUserName(String user) {
		driver.findElement(txt_userName_loc).sendKeys(user);
	}
	public void setPassword(String user) {
		driver.findElement(txt_password_loc).sendKeys(user);
	}
	public void clickLogin() {
		driver.findElement(btn_login_loc).click();
	}
	
}
