package steps;

import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import screens.mobile.LoginScreen;
import screens.web.HomePage;

public class HomePageWebStep {
    @Steps
    HomePage homePage;
    @When("^Go to google$")
    public void goToGoogle() {
        homePage.gotoGoogle();
    }

    @When("^Search \"([^\"]*)\" in google$")
    public void search(String text) {
        homePage.search(text);
    }
}
