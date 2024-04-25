package steps;


import base.MobileDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

import screens.mobile.HomeScreen;
import screens.mobile.LoginScreen;


public class HomePageStep extends MobileDriver {
    LoginScreen loginScreen;
    HomeScreen homeScreen;

    @When("^Click GetStarted Ipay$")
    @When("^Mở app vietinBank iPay$")
    public void clickGetStartedIpay() {
        loginScreen.clickGetStartedIpay();
    }

    @Given("Open app")
    public void openApp() {
        newDriver();
    }

    @And("User transfer in bank")
    @And("Người dùng vào chức năng chuyển tiền")
    public void userTransferInBank() throws InterruptedException {
        homeScreen.userTransferInBank();
    }

    @And("Choose Account To")
    public void chooseAccountTo() throws InterruptedException {
        homeScreen.chooseAccountTo();
    }

    @And("Choose amount money to transfer {string}")
    public void chooseAmountMoneyToTransfer(String text) throws InterruptedException {
        homeScreen.chooseAmountMoneyToTransfer(text);
    }

    @And("Confirm Transaction")
    public void confirmTransaction() throws InterruptedException {
        homeScreen.confirmTransaction();
    }

    @And("User transfer in Vietinbank")
    public void userTransferInVietinbank() throws InterruptedException {
        homeScreen.userTransferInBank();
    }
}
