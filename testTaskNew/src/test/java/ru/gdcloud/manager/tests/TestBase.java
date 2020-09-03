package ru.gdcloud.manager.tests;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.gdcloud.manager.manager.AppManager;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestBase {

    public static AppManager app = new AppManager();

    Logger logger= LoggerFactory.getLogger(TestBase.class);

    @BeforeMethod
    public  void startTestLog(Method m, Object[] parameter)
    {
      logger.info("Start test " + m.getName()+ " with parameters " + Arrays.asList(parameter));
    }
    @BeforeMethod
    public void setUp() {
        app.init();
    }

    @AfterMethod
    public  void stopTestLog(Method m){
        logger.info("Stop test ");
    }

    @AfterMethod
    public void tearDown() {
        app.finish();
    }
}
