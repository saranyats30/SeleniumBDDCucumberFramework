package Actions;

import Pages.LoginPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;

public class LoginActionPage {

    WebDriver driver;
    LoginPageObjects pageObjects;


    public LoginActionPage(WebDriver driver) {
        this.driver = driver;
        pageObjects = new LoginPageObjects();
        PageFactory.initElements(driver, pageObjects);
    }

    public void openLoginPage() {
        driver.get(ConfigReader.getProperty("baseUrl"));
    }

    public void enterUsername(String user) {
        pageObjects.getUsername().sendKeys(user);
    }

    public void enterPassword(String pass) {
        pageObjects.getPassword().sendKeys(pass);
    }

    public void clickLogin() {
        pageObjects.getLoginbutton().click();
    }
}
