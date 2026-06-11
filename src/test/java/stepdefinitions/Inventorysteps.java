package stepdefinitions;

import Actions.InventoryActionPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.DriverFactory;

public class Inventorysteps {
    WebDriver driver;
    InventoryActionPage inventoryActionPage;

    @When("user adds item {string} to cart")
    public void userAddsItemToCart(String product) {
        driver = DriverFactory.getDriver();
        inventoryActionPage = new InventoryActionPage(driver);
        String actualProduct = inventoryActionPage.getBackpackName();
        Assert.assertEquals(actualProduct,product,"Product Matched");
        inventoryActionPage.clickAddProductButton();
    }

    @Then("Cart badge count should be {int}")
    public void cartBadgeCountShouldBe(int count) {
        String actualCount = inventoryActionPage.getCartBadgeCount();
        Assert.assertEquals(actualCount,String.valueOf(count),"Count Matched");
    }
}
