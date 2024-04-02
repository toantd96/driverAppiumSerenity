package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.AppiumServer;

public class BaseTest {

    @Before()
    public static void setUp(){
//        AppiumServer.startServer();
    }

    @After()
    public static void tearDown(){
//        AppiumServer.stopServer();
    }
}
