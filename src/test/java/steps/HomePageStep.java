package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;
import screens.mobile.ChooseTopicsScreen;
import screens.mobile.HomeScreen;
import screens.mobile.LoginScreen;
import screens.mobile.SearchScreen;

public class HomePageStep {
    @Steps
    LoginScreen loginScreen;
    @Steps
    ChooseTopicsScreen chooseTopicsScreen;
    @Steps
    SearchScreen searchScreen;
    @Steps
    HomeScreen homeScreen;

    @When("^Click GetStarted button$")
    public void clickgetstartedbutton() {
        loginScreen.clickGetStartedButton();
    }

    @Given("Open app")
    public void openApp() {
    }

    @And("^Choose topics$")
    public void chooseTopics() {
        chooseTopicsScreen.chooseTopics(3);
    }

    @And("^Click Continue button$")
    public void clickContinueButton() {
        chooseTopicsScreen.clickContinueButton();

    }

    @And("^Search \"([^\"]*)\" in FlipBoard$")
    public void searchFlipBoard(String text) {
        chooseTopicsScreen.skipLoginButton();
        homeScreen.selectBottomPainel(3);
        searchScreen.searchFlipBoard(text);
    }

    @And("^Verify search text is \"([^\"]*)\"$")
    public void clickContinueButton(String text) {
        Assert.assertTrue(searchScreen.verifySearchText(text));
    }


}
