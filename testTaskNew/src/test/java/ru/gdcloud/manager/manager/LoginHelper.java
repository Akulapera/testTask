package ru.gdcloud.manager.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.gdcloud.manager.model.LoginPasswordData;

public class LoginHelper extends BaseHelper {

    public LoginHelper(WebDriver driver) {
        super(driver);
    }

    public void logout() {
      //click(By.xpath("//span[@class='icon-user_menu ProfileButton__userMenuIco--oNkIZ colors__profileButtonColorClassName--1_oSF']"));
       //click(By.xpath("//*[name()='path' and contains(@class,'svg-bg-pat')]"));
        click(By.id("userName"));
        click(By.xpath("//li[8]"));
    }

    public  boolean isMenuPresent(){
        return  isElementPresent(By.xpath("//*[@class='flex-auto page-name-wrapper']"));
    }

    public  void fillLoginForm(LoginPasswordData loginPasswordData){
        type(By.id("username"), loginPasswordData.getLogin());
        type(By.id("password"), loginPasswordData.getPassword());
    }

    public void submit() {
        click(By.id("login_button"));
    }
}
