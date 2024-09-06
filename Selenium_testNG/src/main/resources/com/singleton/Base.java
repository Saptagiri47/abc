package com.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
    private static WebDriver driver;
    private Base() {
    	// Private constructor to prevent instantiation from outside the class
    }
    public static WebDriver getDriver() {
        if (driver==null) {
            driver = new EdgeDriver();
        }else if(driver.toString().contains("null")) {
        	driver = new EdgeDriver();
        }
        return driver;
    }  
}
