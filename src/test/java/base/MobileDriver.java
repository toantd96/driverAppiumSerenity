package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileDriver implements DriverSource {

  @Override
  public WebDriver newDriver() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("deviceName", "RFCR71CE5AM");
    capabilities.setCapability("appPackage", "com.sec.android.app.launcher");
    capabilities.setCapability("appActivity", "com.sec.android.app.launcher.activities.LauncherActivity");
    capabilities.setCapability("autoGrantPermissions", "true");
    capabilities.setCapability("noReset", true);
      WebDriver driver;
      try {
          driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
      } catch (MalformedURLException e) {
          throw new RuntimeException(e);
      }
   System.out.println("driver la "+driver);
      return driver;
  }

  @Override
  public boolean takesScreenshots() {
      return true;
  }
}
