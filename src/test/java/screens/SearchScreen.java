package screens;

import base.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverHelper;
import utils.EnvironmentConfig;

public class SearchScreen extends BaseScreen {

    @AndroidFindBy(id= "flipboard.app:id/search_box_place_holder")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='START A REPAIR']")
    public WebElement searchBox;

    @AndroidFindBy(id="flipboard.app:id/search_view_input")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='START A REPAIR']")
    public WebElement searchInput;

    @AndroidFindBy(id="flipboard.app:id/search_result_topic_tag")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='START A REPAIR']")
    public WebElement searchTitleText;
    private WebDriver mobileDriver;

    public SearchScreen() {
        mobileDriver = DriverHelper.appiumDriver(EnvironmentConfig.DEVICE_NAME,
                EnvironmentConfig.APP_PACKAGE, EnvironmentConfig.APP_ACTIVITY,
                EnvironmentConfig.PLATFORM_NAME, EnvironmentConfig.AUTOMATION_NAME,
                EnvironmentConfig.URL_APPIUM);
    }
    public void searchFlipBoard(String searchText){
        searchBox.click();
        waitFor(searchInput).sendKeys(searchText);
        enter();
    }

    public boolean verifySearchText(String text){
        return waitFor(searchTitleText).getText().contains(text);
    }

}
