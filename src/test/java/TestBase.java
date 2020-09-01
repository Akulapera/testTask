import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class TestBase {
    static  WebDriver driver;

    @BeforeMethod
     public  void setUp(){
     driver= new ChromeDriver();

     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     }

    @AfterMethod
    public  void  tearDown(){
       driver.quit();
   }

    protected void logout() {
       click(By.xpath("//span[@class='icon-user_menu ProfileButton__userMenuIco--oNkIZ colors__profileButtonColorClassName--1_oSF']"));
       click(By.xpath("//li[8]"));
    }

    public boolean isElementPresent (By locator){
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

    public void openOurSite(String url){
           driver.get(url);
       }

    public  boolean isMenuPresent(By locator){
       return  isElementPresent(locator);
        }
}
