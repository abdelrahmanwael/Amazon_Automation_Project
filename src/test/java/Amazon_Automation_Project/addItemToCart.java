package Amazon_Automation_Project;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class addItemToCart extends TestBase{
    searchResultPage searchResultObject;

    @Test(priority = 1)
    public void userAddItemToCart()  {
        searchResultObject = new searchResultPage(driver);
        searchResultObject.selectLastItemInSearchResults();
        Assert.assertTrue(searchResultObject.backToResultsBtn.getText().contains("Back to results"));
//        boolean overlayDisplayed = searchResultObject.removeOverlayPageBtn.isDisplayed();
//        if (overlayDisplayed == true)
//        {
//        	searchResultObject.clickOnThanksBtnToRemoveOverlay();
//        	searchResultObject.addItemToCart();
//            Assert.assertTrue(searchResultObject.addedToCartSuccessMsg.getText().contains("Added to Cart"));
//        }
//        else {
        searchResultObject.addItemToCart();
        Assert.assertTrue(searchResultObject.addedToCartSuccessMsg.getText().contains("Added to Cart"));
        //}
    }
    @Test(dependsOnMethods = "userAddItemToCart")
    public void userNavigateToCartPage()  {
        searchResultObject.navigateToCartPage();
        Assert.assertTrue(searchResultObject.shoppingCartPageTitle.getText().contains("Shopping Cart"));
    }
}
