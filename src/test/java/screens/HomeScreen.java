package screens;

import base.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeScreen extends BaseScreen {

    @AndroidFindBy(id = "flipboard.app:id/bottom_nav_view_icon")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='START A REPAIR']")
    public List<WebElement> bottomNavigation;

    public void selectBottomPainel(int screenNumber){
        bottomNavigation.get(screenNumber-1).click();
    }
}
