package stepdefinitions;

import Actions.OrderConfirmationPageActions;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.DriverFactory;

public class OrderConfirmationSteps {
    WebDriver driver;
    OrderConfirmationPageActions orderConfirmationPageActions;

    @Then("user verify the order confirmation message {string}")
    public void userVerifyTheOrderConfirmationMessage(String message) {
        driver= DriverFactory.getDriver();
        orderConfirmationPageActions = new OrderConfirmationPageActions(driver);
        PageFactory.initElements(driver,orderConfirmationPageActions);
        String actualMessage = orderConfirmationPageActions.verifyConfirmationMessage();
        Assert.assertEquals(actualMessage,message,"Confirmation message is matched");
    }
}
