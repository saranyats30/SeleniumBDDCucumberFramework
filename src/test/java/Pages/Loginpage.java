package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;

public class Loginpage {

    WebDriver driver;

    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    public Loginpage(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage() {
        driver.get(ConfigReader.getProperty("baseUrl"));
    }

    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }
}
