package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


//Generally We don't execute POClass, we just execute TC. ie - LoginTest
public class PageFactoryPOM {
	WebDriver driver;
	
	PageFactoryPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); //mandatory
	}
	//locators
	/*By txt_userName_loc = By.xpath("//input[@placeholder='Username']");
	By txt_password_loc = By.xpath("//input[@placeholder='Password']");
	By btn_login_loc = By.xpath("//button[normalize-space()='Login']");
	*/
	
	//By.xpath("//input[@placeholder='Username']")
//	@FindBy(xpath="//input[@placeholder='Username']") WebElement txt_Username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_Password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_Login;
	
	@FindBy(how=How.XPATH, using= "//input[@placeholder='Username']") WebElement txt_Username;
	
	//for group of elements
	@FindBy(tagName="a") // case-sensitive. we have using, how, id, name, className, xpath, linkText, partialLinkText, tagName and css
	List<WebElement> links;
	
	//action methods
	/*public void setUserName(String user) {
		driver.findElement(txt_userName_loc).sendKeys(user);
	}
	public void setPassword(String user) {
		driver.findElement(txt_password_loc).sendKeys(user);
	}
	public void clickLogin() {
		driver.findElement(btn_login_loc).click();
	}
	*/
	public void setUserName(String user) {
		txt_Username.sendKeys(user);
	}
	public void setPassword(String user) {
		txt_Password.sendKeys(user);
	}
	public void clickLogin() {
		btn_Login.click();
	}
	
	
}

