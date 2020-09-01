import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends AppManager{

    protected   static  AppManager app=new AppManager();

    @BeforeMethod
     public  void setUp(){
        init();
    }

    @AfterMethod
    public  void  tearDown(){
       finish();
   }
}
