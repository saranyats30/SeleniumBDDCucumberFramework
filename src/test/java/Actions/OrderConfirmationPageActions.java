package Actions;

import Pages.OrderConfirmationPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPageActions {
    WebDriver driver;
    OrderConfirmationPageObjects orderConfirmationPageObjects;
    public OrderConfirmationPageActions(WebDriver driver){
        this.driver = driver;
        orderConfirmationPageObjects = new OrderConfirmationPageObjects();
        PageFactory.initElements(driver, orderConfirmationPageObjects);
    }
    public String verifyConfirmationMessage(){
        return orderConfirmationPageObjects.getConfirmationMessage().getText();

    }
}
