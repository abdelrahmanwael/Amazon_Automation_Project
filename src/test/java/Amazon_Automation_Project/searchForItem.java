package Amazon_Automation_Project;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchForItem extends TestBase{
    homePage homePageObject;
    searchResultPage searchResultObject;

    @Test(priority = 1)
    public void userSearchForProduct() throws InterruptedException {
        homePageObject = new homePage(driver);
        searchResultObject = new searchResultPage(driver);
        homePageObject.changeLanguageintoEnglish();
        Thread.sleep(3000);
        homePageObject.searchForItem("Mobile");
        homePageObject.clickSearchBtn();
        Assert.assertTrue(homePageObject.searchResult.getText().contains("RESULTS"));
    }
    @Test(dependsOnMethods = "userSearchForProduct")
    public void userNarrowDownSearchResults()  {
        searchResultObject = new searchResultPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,400)");
        searchResultObject.selectMobileBrand();
        searchResultObject.setPriceRange("3500","5000");
        searchResultObject.clickOnPriceFilterBtn();
    }
}
