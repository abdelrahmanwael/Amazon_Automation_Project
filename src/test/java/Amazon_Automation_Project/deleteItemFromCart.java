package Amazon_Automation_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class deleteItemFromCart extends TestBase{
    shoppingCartPage shoppingCartobject;

    @Test(priority = 1)
    public void userDeleteItemFromCart()  {
        shoppingCartobject = new shoppingCartPage(driver);
        shoppingCartobject.deleteItemFromCart();
        Assert.assertTrue(shoppingCartobject.emptyCartMsg.getText().contains("Subtotal (0 items):"));
    }
}
