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

    @Test(dataProvider = "invalidLoginPassword", dataProviderClass = DataProviders.class)
    public void NegativeLoginTestWithDP(String login, String password) throws InterruptedException {
        app.getLoginHelper().fillLoginForm(new LoginPasswordData()
                .setLogin(login)
                .setPassword(password));
        app.getLoginHelper().submit();
        Assert.assertTrue(!app.getLoginHelper().isMenuPresent());
    }

    @Test(dataProvider = "invalidLoginPasswordCSV", dataProviderClass = DataProviders.class)
    public void NegativeLoginTestWithCSV(LoginPasswordData loginPassword) {
        app.getLoginHelper().fillLoginForm(loginPassword);
        app.getLoginHelper().submit();
        Assert.assertTrue(!app.getLoginHelper().isMenuPresent());
    }

    @Test
    public void loginTest() throws InterruptedException {
        app.getLoginHelper().fillLoginForm(new LoginPasswordData()
                .setLogin("tester")
                .setPassword("K35G3U"));
        app.getLoginHelper().submit();
        Assert.assertTrue(app.getLoginHelper().isMenuPresent());
    }
}

