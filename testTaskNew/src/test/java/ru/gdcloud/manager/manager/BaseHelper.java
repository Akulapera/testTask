package ru.gdcloud.manager.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseHelper {
     WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    public  boolean isElementPresent (By locator){
        return driver.findElements(locator).size()>0;
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void type(By locator, String login){
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(login);
    }
}
