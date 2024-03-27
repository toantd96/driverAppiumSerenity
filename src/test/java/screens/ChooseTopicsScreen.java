package screens;

import base.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.*;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;
import java.util.List;

public class ChooseTopicsScreen extends BaseScreen {

    @AndroidFindBy(id = "flipboard.app:id/topic_picker_topic_row_topic_tag")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='START A REPAIR']")
    public List<WebElementFacade> topic;

    @AndroidFindBy(id = "flipboard.app:id/topic_picker_continue_button")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='START A REPAIR']")
    public WebElementFacade continueButton;

    @AndroidFindBy(id = "flipboard.app:id/icon_button_text")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='START A REPAIR']")
    public WebElementFacade skipLoginButton;

    public void chooseTopics(int topicsCount){
        for (int i = 0; i < topicsCount; i++) {
           (topic.get(i)).withTimeoutOf(Duration.ofSeconds(20)).waitUntilVisible().click();
        }
    }

    public void clickContinueButton(){
        continueButton.click();
    }

    public void skipLoginButton(){
        skipLoginButton.click();
    }

}
