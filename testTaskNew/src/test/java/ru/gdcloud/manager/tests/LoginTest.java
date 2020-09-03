package ru.gdcloud.manager.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.gdcloud.manager.model.LoginPasswordData;


public class LoginTest extends TestBase {

  //@BeforeMethod
    //public  void ensurePreconditions(){
     // if(app.getLoginHelper().isMenuPresent());{

    //if(app.getLoginHelper().isMenuPresent(By.xpath("//*[@class='flex-auto page-name-wrapper']"))){
     //.app.getLoginHelper().logout();
   // }
//}


    @Test
    public void loginTest() throws InterruptedException {
     app.getLoginHelper().fillLoginForm(new LoginPasswordData()
             .setLogin("tester")
             .setPassword("K35G3U"));
     app.getLoginHelper().submit();
        Assert.assertTrue(app.getLoginHelper().isMenuPresent());
    }

    @Test
    public void NegativeLoginTest() { ;
      app.getLoginHelper().fillLoginForm(new LoginPasswordData()
              .setLogin("tester")
              .setPassword("1234567890"));
      app.getLoginHelper().submit();
        Assert.assertTrue(!app.getLoginHelper().isMenuPresent());
    }
}

