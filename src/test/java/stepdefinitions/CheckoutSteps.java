package stepdefinitions;

import Actions.CheckoutPageActions;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

public class CheckoutSteps {
    WebDriver driver;
    CheckoutPageActions checkoutPageActions;

    @When("user clicks checkout button")
    public void userClicksCheckoutButton() {
        driver = DriverFactory.getDriver();
        checkoutPageActions = new CheckoutPageActions(driver);
        checkoutPageActions.clickCheckoutButton();

    }

    @And("user enters checkout information {string},{string},{string}")
    public void userEntersCheckoutInformation(String firstname, String lastname, String postalcode) {
        checkoutPageActions.fillYourInformation(firstname,lastname,postalcode);
    }
}
