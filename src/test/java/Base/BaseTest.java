package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;


public class BaseTest {

    protected WebDriver driver;
   protected HomePage homepage;

    @BeforeMethod
    protected void SetUp() {
        // create object from start page of main


        driver = new ChromeDriver();
        homepage =new HomePage(driver);
        driver.manage().window().maximize();

    }


    @BeforeMethod
    public void goHome() {

        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
