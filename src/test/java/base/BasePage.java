package base;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class BasePage extends PageObject {
    public final WebDriver webDriver = DriverHelper.chromeDriver();

}
