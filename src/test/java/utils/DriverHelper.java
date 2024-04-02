package utils;


import io.appium.java_client.AppiumDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverHelper {
    public static WebDriver chromeDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver appiumDriver(String deviceName, String appPackage, String appActivity,
                                         String platformName, String automationName, String urlAppium) {
        WebDriver driver;
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName", deviceName);
        dc.setCapability("appPackage", appPackage);
        dc.setCapability("appActivity", appActivity);
        dc.setCapability("platformName", platformName);
        dc.setCapability("automationName", automationName);
//        dc.setCapability("app","");
        try {
            URL url = new URL("http://" + urlAppium + "/wd/hub");
            driver = new AppiumDriver(url, dc);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return driver;
    }
}
