package screens.web;

import base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class HomePage extends BasePage {
    @FindBy(name= "q")
    public WebElementFacade searchBox;
    public void gotoGoogle() {
        setDriver(webDriver);
        getDriver().get("https://www.google.com/");
    }
    public void search(String text) {
        setDriver(webDriver);
        searchBox.waitUntilVisible().sendKeys(text);
    }
}
