package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import utils.DriverFactory;
import Pages.Loginpage;
import org.openqa.selenium.WebDriver;

public class Loginsteps {

    WebDriver driver;
    Loginpage login;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver = DriverFactory.getDriver(); // GET DRIVER HERE
        login = new Loginpage(driver);
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
        System.out.println("Login executed");
    }

}