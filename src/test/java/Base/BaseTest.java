package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    protected void SetUp() {

        driver = new ChromeDriver();
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
