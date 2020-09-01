package ru.gdcloud.manager.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class AppManager{
    LoginHelper loginHelper;
    WebDriver driver;

    public LoginHelper getLoginHelper() {
        return loginHelper;
    }

    public  void init() {
        String browser= System.getProperty("browser", BrowserType.CHROME);
        if(browser.equals(BrowserType.CHROME)){
            driver= new ChromeDriver();
        } else if (browser.equals(BrowserType.FIREFOX)) {
            driver = new FirefoxDriver();
        } else  if(browser.equals(BrowserType.EDGE)) {
            System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://gdcloud.ru/release-17/auth/login#/?_k=wosph0");
        //getLoginHelper().openOurSite("https://gdcloud.ru/release-17/auth/login#/?_k=wosph0");
        loginHelper= new LoginHelper(driver);
    }

    public void finish() {
        driver.quit();
    }
}
