package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

    @FindBy(id = "user-name")
    private WebElement username;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement loginbutton;

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginbutton() {
        return loginbutton;
    }

}
