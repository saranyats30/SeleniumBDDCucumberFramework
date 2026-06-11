package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageObjects {
    @FindBy (xpath = "//*[@id='shopping_cart_container']/a")
    private WebElement cartIcon;
    @FindBy (xpath = "//*[@id='item_4_title_link']/div")
    private WebElement cartItemName;

    public WebElement getCartIcon() {return cartIcon;}
    public WebElement getCartItemName() {return cartItemName;}
}

