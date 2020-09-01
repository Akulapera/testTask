import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

  @BeforeMethod
    public  void ensurePreconditions(){
    if(app.getLoginHelper().isMenuPresent(By.xpath("//*[@class='flex-auto page-name-wrapper']"))){
     app.getLoginHelper().logout();
    }
}

    @Test
    public void loginOurSiteTest() throws InterruptedException {
      // app.getLoginHelper().openOurSite("https://gdcloud.ru/release-17/auth/login#/?_k=wosph0");

        app.getLoginHelper().type(By.id("username"), "tester");
        app.getLoginHelper().type(By.id("password"), "K35G3U");

        app.getLoginHelper().click(By.id("login_button"));

        Assert.assertTrue(app.getLoginHelper().isMenuPresent(By.xpath(
         "//i[@class='fa fa-bars sidebar-control-button Navbar__sidebarControlButton--SReuB colors__navbarColorClassName--24u4a']")));
    }

    @Test
    public void NegativeloginOurSiteTest() {
        app.getLoginHelper().openOurSite("https://gdcloud.ru/release-17/auth/login#/?_k=wosph0");

        app.getLoginHelper().type(By.id("username"), "tester");
        app.getLoginHelper().type(By.id("password"), "123456789011121314");

        app.getLoginHelper().click(By.id("login_button"));

        Assert.assertTrue(!app.getLoginHelper().isMenuPresent(By.xpath(
        "//i[@class='fa fa-bars sidebar-control-button Navbar__sidebarControlButton--SReuB colors__navbarColorClassName--24u4a']")));
    }
}

