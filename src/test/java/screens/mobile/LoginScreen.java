package screens.mobile;

import base.BaseScreen;
import base.MobileDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LoginScreen extends PageObject {

    MobileDriver mobileDriver =new MobileDriver();

    @AndroidFindBy(xpath = "//*[@text='VietinBank iPay']")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='START A REPAIR']")
    public WebElement getStartedIpay;

    public void clickGetStartedIpay(){
        setDriver(mobileDriver.newDriver());
        getStartedIpay.click();
    }

}
