package org.concordion.ext.demo.selenium.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Manages the browser session. 
 */
public class Browser {
    private WebDriver driver;
    
    public Browser() {
        driver = new ChromeDriver();
    }
    
    public void close() {
        driver.close();
    }
    
    public WebDriver getDriver() {
        return driver;
    }
}
