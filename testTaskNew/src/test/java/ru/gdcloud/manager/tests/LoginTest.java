package ru.gdcloud.manager.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.gdcloud.manager.tests.TestBase;

public class LoginTest extends TestBase {

  @BeforeMethod
    public  void ensurePreconditions(){
    if(TestBase.app.getLoginHelper().isMenuPresent(By.xpath("//*[@class='flex-auto page-name-wrapper']"))){
     TestBase.app.getLoginHelper().logout();
    }
}

    @Test
    public void loginOurSiteTest() throws InterruptedException {
      // app.getLoginHelper().openOurSite("https://gdcloud.ru/release-17/auth/login#/?_k=wosph0");

        TestBase.app.getLoginHelper().type(By.id("username"), "tester");
        TestBase.app.getLoginHelper().type(By.id("password"), "K35G3U");

        TestBase.app.getLoginHelper().click(By.id("login_button"));

        Assert.assertTrue(TestBase.app.getLoginHelper().isMenuPresent(By.xpath(
         "//i[@class='fa fa-bars sidebar-control-button Navbar__sidebarControlButton--SReuB colors__navbarColorClassName--24u4a']")));
    }

    @Test
    public void NegativeloginOurSiteTest() {
        TestBase.app.getLoginHelper().openOurSite("https://gdcloud.ru/release-17/auth/login#/?_k=wosph0");

        TestBase.app.getLoginHelper().type(By.id("username"), "tester");
        TestBase.app.getLoginHelper().type(By.id("password"), "123456789011121314");

        TestBase.app.getLoginHelper().click(By.id("login_button"));

        Assert.assertTrue(!TestBase.app.getLoginHelper().isMenuPresent(By.xpath(
        "//i[@class='fa fa-bars sidebar-control-button Navbar__sidebarControlButton--SReuB colors__navbarColorClassName--24u4a']")));
    }
}

