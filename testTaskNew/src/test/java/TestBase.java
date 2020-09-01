import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

   public   static  AppManager app=new AppManager();

    @BeforeMethod
     public  void setUp(){
        app.init();
    }

    @AfterMethod
    public  void  tearDown(){
       app.finish();
   }
}
