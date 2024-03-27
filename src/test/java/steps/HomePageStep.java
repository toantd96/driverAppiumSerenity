package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import screens.ChooseTopicsScreen;
import screens.HomeScreen;
import screens.LoginScreen;
import screens.SearchScreen;

public class HomePageStep {
    LoginScreen loginScreen;
    ChooseTopicsScreen chooseTopicsScreen;
    SearchScreen searchScreen;
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
