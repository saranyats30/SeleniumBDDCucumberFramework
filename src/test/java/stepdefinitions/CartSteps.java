package stepdefinitions;

import Actions.CartPageActions;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.DriverFactory;

public class CartSteps {
    WebDriver driver;
    CartPageActions cartPageActions;
    @And("user clicks cart Icon")
    public void userClicksCartIcon() {
        driver = DriverFactory.getDriver();
        cartPageActions = new CartPageActions(driver);
        cartPageActions.clickCartIcon();
    }

    @Then("cart Page should display item {string}")
    public void cartPageShouldDisplayItem(String product) {
        String actualProduct = cartPageActions.getCartProductName();
        Assert.assertEquals(actualProduct,product,"Cart Product Matched");

    }
}
