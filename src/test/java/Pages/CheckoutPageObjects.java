package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageObjects {
    @FindBy (xpath = "//*[@id='checkout']")
    private WebElement clickCheckoutButton;
    @FindBy(id ="first-name")
    private WebElement firstNameTextbox;
    @FindBy (id ="last-name")
    private WebElement lastNameTextbox;
    @FindBy (id ="postal-code")
    private WebElement postalCodeTextbox;
    public WebElement getClickCheckoutButton(){ return clickCheckoutButton; }
    public WebElement getFirstNameTextbox(){return firstNameTextbox;}
    public WebElement getLastNameTextbox(){return lastNameTextbox;}
    public WebElement getPostalCodeTextbox(){return postalCodeTextbox;}
}
