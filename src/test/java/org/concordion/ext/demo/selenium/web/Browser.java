package org.concordion.ext.demo.selenium.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Manages the browser session. 
 */
public class Browser {
    static {
        WebDriverManager.chromedriver().setup();
    }

    private WebDriver driver;
    
    public Browser() {
        ChromeOptions options = new ChromeOptions();
        if (("true").equals(System.getenv("HEADLESS_CHROME"))) {
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
        }
        driver = new ChromeDriver(options);
    }
    
    public void close() {
        driver.close();
    }
    
    public WebDriver getDriver() {
        return driver;
    }
}
