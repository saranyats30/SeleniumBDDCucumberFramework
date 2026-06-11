package Actions;

import Pages.CartPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CartPageActions {
    WebDriver driver;
    CartPageObjects cartPageObjects;
    public CartPageActions(WebDriver driver){
        this.driver = driver;
        cartPageObjects = new CartPageObjects();
        PageFactory.initElements(driver, cartPageObjects);
    }

    public void clickCartIcon(){
        cartPageObjects.getCartIcon().click();
    }
    public String getCartProductName(){
        return cartPageObjects.getCartItemName().getText();
    }
}
