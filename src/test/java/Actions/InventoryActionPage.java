package Actions;

import Pages.InventoryPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InventoryActionPage {
    WebDriver driver;
    InventoryPageObjects inventoryPageObjects;

    public InventoryActionPage(WebDriver driver) {
        this.driver = driver;
        inventoryPageObjects = new InventoryPageObjects();
        PageFactory.initElements(driver, inventoryPageObjects);
    }

    public String getBackpackName() {
        return inventoryPageObjects.getBackpackName().getText();
    }
    public void clickAddProductButton()
    {
        inventoryPageObjects.getAddToCart().click();
    }

    public String getCartBadgeCount() {
        return inventoryPageObjects.getCartQuantity().getText();
    }
    public void clickCartIcon(){
        inventoryPageObjects.getClickCartIcon().click();
    }

}
