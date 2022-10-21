package Amazon_Automation_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class shoppingCartPage extends pageBase{

    public shoppingCartPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(xpath = "(//span[@class='a-declarative'])[1]")
    WebElement deleteBtn;

    @FindBy(id="sc-subtotal-label-activecart")
    WebElement emptyCartMsg;




    public void deleteItemFromCart()
    {
        clickButton(deleteBtn);
    }
}
