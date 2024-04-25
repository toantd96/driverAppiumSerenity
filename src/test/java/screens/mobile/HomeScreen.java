package screens.mobile;

import base.BaseScreen;
import base.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Dimension;

import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class HomeScreen extends MobileDriver {

    @AndroidFindBy(id = "flipboard.app:id/bottom_nav_view_icon")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='START A REPAIR']")
    public List<WebElementFacade> bottomNavigation;

    @FindBy(xpath = "(//android.widget.LinearLayout[@resource-id='com.vietinbank.ipay:id/viewMain'])[1]")
//    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='START A REPAIR']")
    public WebElementFacade clickDangNhap;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.vietinbank.ipay:id/ivSelect'])[1]")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='START A REPAIR']")
    public WebElementFacade accountTo;

    @AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id='com.vietinbank.ipay:id/liContent'])[1]")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='START A REPAIR']")
    public WebElementFacade chooseAccountTo;

    @AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id='com.vietinbank.ipay:id/llTextView'])[1]/android.widget.LinearLayout[1]")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='START A REPAIR']")
    public WebElementFacade selectMoney;

    @AndroidFindBy(id = "com.vietinbank.ipay:id/layButton")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='START A REPAIR']")
    public WebElementFacade buttonContinue;

    @AndroidFindBy(id = "com.vietinbank.ipay:id/otp_container")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='START A REPAIR']")
    public WebElementFacade clickOTP;

    public void selectBottomPainel(int screenNumber){
        bottomNavigation.get(screenNumber-1).click();
    }

    public void userTransferInBank() throws InterruptedException {
        setDriver(newDriver());
        Thread.sleep(1000);
        clickDangNhap.waitUntilVisible().click();
    }

    public void chooseAccountTo() throws InterruptedException {
        accountTo.waitUntilVisible().click();
        Thread.sleep(1000);
        chooseAccountTo.waitUntilVisible().click();
    }

    public void clickNotiApprovedTransaction(int a, int b) {
        Dimension size = getDriver().manage().window().getSize();
        int deviceHeight = size.getHeight();
        int deviceWidth = size.getWidth();
        TouchAction action = new TouchAction(getProxiedDriver());
        action.tap(PointOption.point(a, b))
                .release().perform();
//        System.out.println("size " + size);
//        System.out.println("deviceHeight " + deviceHeight);
//        System.out.println("deviceWidth " + deviceWidth);
    }

    public void chooseAmountMoneyToTransfer(String text) throws InterruptedException {
        selectMoney.waitUntilVisible().click();
        Thread.sleep(1500);
        clickNotiApprovedTransaction(412,1810);
        clickNotiApprovedTransaction(412,2161);
        clickNotiApprovedTransaction(412,2161);
        clickNotiApprovedTransaction(412,2161);
        clickNotiApprovedTransaction(800,300);
        Thread.sleep(1500);
    }

    public void confirmTransaction() throws InterruptedException {
        buttonContinue.waitUntilVisible().click();
        clickOTP.waitUntilVisible().click();
        Thread.sleep(2000);
        clickNotiApprovedTransaction(512,1460);
        Thread.sleep(1000);
        clickNotiApprovedTransaction(548,1283);
        Thread.sleep(3000);
    }
}
