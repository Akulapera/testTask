import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import java.util.concurrent.TimeUnit;

public class AppManager {

    WebDriver driver;

    protected void init() {
        String browser= System.getProperty("browser", BrowserType.EDGE);
        if(browser.equals(BrowserType.CHROME)){
            driver= new ChromeDriver();
        } else if (browser.equals(BrowserType.FIREFOX)) {
            driver = new FirefoxDriver();
        } else  if(browser.equals(BrowserType.EDGE)) {
            System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    protected void finish() {
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
