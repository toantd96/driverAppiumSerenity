package screens;

import base.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverHelper;
import utils.EnvironmentConfig;

import java.util.List;

public class HomeScreen extends BaseScreen {

    @AndroidFindBy(id = "flipboard.app:id/bottom_nav_view_icon")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='START A REPAIR']")
    public List<WebElement> bottomNavigation;
    private WebDriver mobileDriver;

    public HomeScreen() {
        mobileDriver = DriverHelper.appiumDriver(EnvironmentConfig.DEVICE_NAME,
                EnvironmentConfig.APP_PACKAGE, EnvironmentConfig.APP_ACTIVITY,
                EnvironmentConfig.PLATFORM_NAME, EnvironmentConfig.AUTOMATION_NAME,
                EnvironmentConfig.URL_APPIUM);
    }
    public void selectBottomPainel(int screenNumber){
        bottomNavigation.get(screenNumber-1).click();
    }
}
