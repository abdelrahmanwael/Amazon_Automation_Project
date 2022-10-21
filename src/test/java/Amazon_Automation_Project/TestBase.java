package Amazon_Automation_Project;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import java.util.concurrent.TimeUnit;

import static org.testng.TestNGAntTask.Mode.junit;

/**
 * Unit test for simple pageBase.
 */
public class TestBase
{
    public static WebDriver driver;

    @BeforeSuite
    @org.testng.annotations.Parameters ({"browser"})

    public void startDriver(@Optional("chrome") String browser)
    {
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Webdrivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.navigate().to("https://www.amazon.eg");
    }

    @AfterSuite
    public void stopDriver()
    {
        driver.quit();
    }

}
