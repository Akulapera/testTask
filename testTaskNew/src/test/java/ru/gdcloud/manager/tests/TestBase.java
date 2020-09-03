package ru.gdcloud.manager.tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.gdcloud.manager.manager.AppManager;

public class TestBase {

   public   static AppManager app=new AppManager();

    @BeforeMethod
     public  void setUp(){
        app.init();
    }

    @AfterMethod
    public  void  tearDown(){
       app.finish();
   }
}
