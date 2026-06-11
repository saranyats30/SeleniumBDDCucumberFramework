package stepdefinitions;

import Pages.InventoryPageObjects;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.DriverFactory;
import Actions.LoginActionPage;
import org.openqa.selenium.WebDriver;

public class Loginsteps {

    WebDriver driver;
    LoginActionPage login;
    InventoryPageObjects inventoryPageObjects;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver = DriverFactory.getDriver(); // GET DRIVER HERE
        login = new LoginActionPage(driver);
        inventoryPageObjects = new InventoryPageObjects();
        PageFactory.initElements(driver, inventoryPageObjects);
        login.openLoginPage();
    }

    @When("user enters username {string}and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickLogin();
    }

    @Then("user should be logged in")
    public void user_should_be_logged_in() {
        Assert.assertTrue(inventoryPageObjects.getAppLogo().isDisplayed());
    }

}