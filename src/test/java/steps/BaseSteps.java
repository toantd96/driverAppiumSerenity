package steps;

import base.BaseScreen;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;
import screens.HomeScreen;

public class BaseSteps {
    BaseScreen baseScreen;

    @When("^Chuyển sang \"([^\"]*)\"$")
    public void switchDriver(String driver) {
        if (driver.equals("Mobile")) {
            baseScreen.switchDriver(baseScreen.mobileDriver);
        } else if (driver.equals("Web")) {
            baseScreen.switchDriver(baseScreen.mobileDriver);
        }
    }

    @When("^Đóng trình duyệt \"([^\"]*)\"$")
    public void closeDriver(String driver) {
        if (driver.equals("Mobile")) {
            baseScreen.closeDriver(baseScreen.mobileDriver);
        } else if (driver.equals("Web")) {
            baseScreen.closeDriver(baseScreen.mobileDriver);
        }
    }
}
