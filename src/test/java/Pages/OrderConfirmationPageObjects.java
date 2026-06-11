package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPageObjects {
    @FindBy (xpath = "//*[@id='checkout_complete_container']/h2")
    private WebElement confirmationMessage;
    public WebElement getConfirmationMessage(){return confirmationMessage;}
}
