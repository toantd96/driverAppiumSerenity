package screens.mobile;

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

    public void clickGetStartedButton(){
        setDriver(mobileDriver);
        getStartedButton.click();
    }

}
