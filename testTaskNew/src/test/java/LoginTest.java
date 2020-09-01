import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

   @BeforeMethod
    public  void ensurePreconditions(){
    if(isMenuPresent(By.xpath("//i[@class='fa fa-bars sidebar-control-button Navbar__sidebarControlButton--SReuB colors__navbarColorClassName--24u4a']"))){
     logout();
}
}

    @Test
    public void loginOurSiteTest() {
        openOurSite("https://gdcloud.ru/release-17/auth/login#/?_k=wosph0");

        type(By.id("username"), "tester");
        type(By.id("password"), "K35G3U");

        click(By.id("login_button"));

        Assert.assertTrue(isMenuPresent(By.xpath("//i[@class='fa fa-bars sidebar-control-button Navbar__sidebarControlButton--SReuB colors__navbarColorClassName--24u4a']")));
    }

    @Test
    public void NegativeloginOurSiteTest() {
        openOurSite("https://gdcloud.ru/release-17/auth/login#/?_k=wosph0");

        type(By.id("username"), "tester");
        type(By.id("password"), "123456789011121314");

        click(By.id("login_button"));

        Assert.assertTrue(!isMenuPresent(By.xpath("//i[@class='fa fa-bars sidebar-control-button Navbar__sidebarControlButton--SReuB colors__navbarColorClassName--24u4a']")));
    }

}

