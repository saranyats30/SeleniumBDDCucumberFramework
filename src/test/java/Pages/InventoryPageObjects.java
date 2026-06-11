package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPageObjects {

    @FindBy(className = "app_logo")
    private WebElement appLogo;
    @FindBy (id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCart;
    @FindBy (css ="[data-test='shopping-cart-link']")
    private WebElement clickCartIcon;
    @FindBy (css = "[data-test='shopping-cart-badge']")
    private WebElement  cartQuantity;
    @FindBy (id ="item_4_title_link")
    private WebElement backpackName;


    public WebElement getAppLogo(){
        return appLogo;
    }
    public WebElement getAddToCart(){ return addToCart;}
    public WebElement getClickCartIcon(){return clickCartIcon;}
    public WebElement getCartQuantity(){return cartQuantity;}
    public WebElement getBackpackName(){return backpackName;}

}
