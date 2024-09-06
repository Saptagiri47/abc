import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CDPExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sapth\\eclipse-workspace\\Selenium_testNG\\drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-debugging-port=9222");

        WebDriver driver = new ChromeDriver(options);

        // Navigate to a website
        driver.get("https://www.example.com");

        // Example of interacting with CDP
        RemoteWebDriver remoteDriver = (RemoteWebDriver) driver;
        Object response = remoteDriver.executeAsyncScript("Network.enable", new HashMap<>());
        System.out.println(response);

        // Clean up
        driver.quit();
    }
}
