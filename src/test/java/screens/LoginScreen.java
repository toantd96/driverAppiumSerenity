package screens;

import base.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverHelper;
import utils.EnvironmentConfig;

public class LoginScreen extends BaseScreen {

    @AndroidFindBy(id = "flipboard.app:id/first_launch_cover_continue")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='START A REPAIR']")
    public WebElement getStartedButton;
    private WebDriver mobileDriver;

    public LoginScreen() {
        mobileDriver = DriverHelper.appiumDriver(EnvironmentConfig.DEVICE_NAME,
                EnvironmentConfig.APP_PACKAGE, EnvironmentConfig.APP_ACTIVITY,
                EnvironmentConfig.PLATFORM_NAME, EnvironmentConfig.AUTOMATION_NAME,
                EnvironmentConfig.URL_APPIUM);
    }
    public void clickGetStartedButton(){
        getStartedButton.click();
    }

}
