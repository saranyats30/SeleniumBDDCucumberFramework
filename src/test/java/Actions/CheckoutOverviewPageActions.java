package Actions;


import Pages.CheckoutOverviewPageObjects;
import Pages.CheckoutPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPageActions {

    WebDriver driver;
    CheckoutOverviewPageObjects checkoutOverviewPageObjects;
    public CheckoutOverviewPageActions(WebDriver driver){
        this.driver = driver;
        checkoutOverviewPageObjects = new CheckoutOverviewPageObjects();
        PageFactory.initElements(driver, checkoutOverviewPageObjects);
    }
    public void checkoutContinueButton(){
        checkoutOverviewPageObjects.getContinueButton().click();
    }
    public String validateTotalAmount(){
        return checkoutOverviewPageObjects.getTotalAmnount().getText();
    }
    public void clickFinishButton(){
        checkoutOverviewPageObjects.getFinishButton().click();
    }

}
