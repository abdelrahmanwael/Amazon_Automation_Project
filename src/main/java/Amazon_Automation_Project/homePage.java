package Amazon_Automation_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class homePage extends pageBase{

    public homePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "icp-nav-link-inner")
    WebElement currentLanguage;

    @FindBy(xpath = "(//*[@class='a-icon a-icon-radio'])[2]")
    WebElement EnglishLanguage;

    @FindBy(className = "a-button-input")
    WebElement saveLanguageChanges;

    @FindBy(id="twotabsearchtextbox")
    WebElement searchBarField;
    @FindBy(id="nav-search-submit-button")
    WebElement searchBtn;

    @FindBy(className = "s-no-outline")
    WebElement searchResult;


    public void changeLanguageintoEnglish()
    {
        clickButton(currentLanguage);
        clickButton(EnglishLanguage);
        clickButton(saveLanguageChanges);
    }

    public void searchForItem(String searchItem)
    {
        setTxtElementTxt(searchBarField, searchItem);
    }

    public void clickSearchBtn()
    {
        clickButton(searchBtn);
    }
}
