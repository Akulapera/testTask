import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    //private final TestBase app = new TestBase();

    @BeforeMethod
    public  void ensurePreconditions(){
    if(app.isMenuPresent(By.xpath("//i[@class='fa fa-bars sidebar-control-button Navbar__sidebarControlButton--SReuB colors__navbarColorClassName--24u4a']"))){
     app.logout();
    }
}

    @Test
    public void loginOurSiteTest() {
        app.openOurSite("https://gdcloud.ru/release-17/auth/login#/?_k=wosph0");

        app.type(By.id("username"), "tester");
        app.type(By.id("password"), "K35G3U");

        app.click(By.id("login_button"));

        Assert.assertTrue(app.isMenuPresent(By.xpath("//i[@class='fa fa-bars sidebar-control-button Navbar__sidebarControlButton--SReuB colors__navbarColorClassName--24u4a']")));
    }

    @Test
    public void NegativeloginOurSiteTest() {
        app.openOurSite("https://gdcloud.ru/release-17/auth/login#/?_k=wosph0");

        app.type(By.id("username"), "tester");
        app.type(By.id("password"), "123456789011121314");

        app.click(By.id("login_button"));

        Assert.assertTrue(!app.isMenuPresent(By.xpath("//i[@class='fa fa-bars sidebar-control-button Navbar__sidebarControlButton--SReuB colors__navbarColorClassName--24u4a']")));
    }

}

