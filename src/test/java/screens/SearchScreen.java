package screens;

import base.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

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

    public void searchFlipBoard(String searchText){
        searchBox.click();
        waitFor(searchInput).sendKeys(searchText);
        enter();
    }

    public boolean verifySearchText(String text){
        return waitFor(searchTitleText).getText().contains(text);
    }

}
