package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPageObjects {
    @FindBy (id = "continue")
    private WebElement continueButton;
    @FindBy (className = "summary_total_label")
    private WebElement totalAmnount;
    @FindBy (id = "finish")
    private WebElement finishButton;
    public WebElement getContinueButton(){return continueButton;}
    public WebElement getTotalAmnount(){return totalAmnount;}
    public WebElement getFinishButton(){return finishButton;}
}
