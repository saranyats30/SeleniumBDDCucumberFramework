package stepdefinitions;


import Actions.CheckoutOverviewPageActions;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.DriverFactory;

public class CheckoutOverviewPageSteps {

    WebDriver driver;
    CheckoutOverviewPageActions checkoutOverviewPageActions;

    @Then("user clicks continue button")
    public void userClicksContinueButton() {
        driver = DriverFactory.getDriver();
        checkoutOverviewPageActions = new CheckoutOverviewPageActions(driver);
        checkoutOverviewPageActions.checkoutContinueButton();

    }

    @Then("user validated the total amount {string}")
    public void userValidatedTheTotalAmount(String total) {
        String totalAmount = checkoutOverviewPageActions.validateTotalAmount();
        Assert.assertEquals(totalAmount, total, "Total Matched");

    }

    @Then("user clicks finish button")
    public void userClicksFinishButton() {
        checkoutOverviewPageActions.clickFinishButton();
    }
}
