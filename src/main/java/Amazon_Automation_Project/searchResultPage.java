package Amazon_Automation_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class searchResultPage extends pageBase{

    public searchResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "icp-nav-link-inner")
    WebElement currentLanguage;

    @FindBy(xpath = "(//*[@class='a-icon a-icon-checkbox'])[6]")
    WebElement mobileBrand;

    @FindBy(id="low-price")
    WebElement minPrice;
    @FindBy(id="high-price")
    WebElement maxPrice;

    @FindBy(className = "a-button-input")
    WebElement priceFilterBtn;

    @FindBy(xpath = "(//*[@class='a-size-base-plus a-color-base a-text-normal'])")
    List<WebElement> mobileResults;
    
    @FindBy(id = "attachSiNoCoverage-announce")
    WebElement removeOverlayPageBtn;

    @FindBy(id="breadcrumb-back-link")
    WebElement backToResultsBtn;

    @FindBy(name = "submit.add-to-cart")
    WebElement addItemToCartBtn;

    @FindBy(xpath = "(//*[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold'])")
    WebElement addedToCartSuccessMsg;

    @FindBy(id="nav-cart")
    WebElement cartPage;

    @FindBy(xpath = "(//*[@class='a-row sc-cart-header sc-compact-bottom'])")
    WebElement shoppingCartPageTitle;



    public void selectMobileBrand()
    {
        clickButton(mobileBrand);
    }
    public void setPriceRange(String minimumPrice, String maximumPrice)
    {
        setTxtElementTxt(minPrice, minimumPrice);
        setTxtElementTxt(maxPrice, maximumPrice);
    }
    public void clickOnPriceFilterBtn()
    {
        clickButton(priceFilterBtn);
    }

    public void selectLastItemInSearchResults()
    {
        clickButton(mobileResults.get(mobileResults.size()-1));
    }

    public void clickOnThanksBtnToRemoveOverlay()
    {
    	boolean overlayDisplayed = removeOverlayPageBtn.isDisplayed();
    	if(overlayDisplayed == true)
    	{
        clickButton(removeOverlayPageBtn);
    	}
    	
    }
    
    public void addItemToCart()
    {
        clickButton(addItemToCartBtn);
    }

    public void navigateToCartPage()
    {
        clickButton(cartPage);
    }
}
