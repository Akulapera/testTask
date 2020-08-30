import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FirstClass  extends TestBase{

    @Test
    public void  openOurSiteTest(){
       openOurSite("https://gdcloud.ru/release-17/auth/login#/?_k=wosph0");

        type(By.id("username"),"tester");
        type(By.id("password"),"K35G3U");

        driver.findElement(By.id("login_button")).click();


    }

    private void type(By locator, String login) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(login);
    }

    private void openOurSite(String url) {
        driver.get(url);
    }


}
