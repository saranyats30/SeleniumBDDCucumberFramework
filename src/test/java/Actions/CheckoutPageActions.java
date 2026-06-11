package Actions;

import Pages.CheckoutPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class CheckoutPageActions {
    WebDriver driver;
    CheckoutPageObjects checkoutPageObjects;

    public CheckoutPageActions(WebDriver driver) {
        this.driver = driver;
        checkoutPageObjects = new CheckoutPageObjects();
        PageFactory.initElements(driver, checkoutPageObjects);
    }

    public void clickCheckoutButton() {
        checkoutPageObjects.getClickCheckoutButton().click();
    }

    public void fillYourInformation(String firstname, String lastname, String postcode) {
        checkoutPageObjects.getFirstNameTextbox().sendKeys(firstname);
        checkoutPageObjects.getLastNameTextbox().sendKeys(lastname);
        checkoutPageObjects.getPostalCodeTextbox().sendKeys(postcode);
    }

}
