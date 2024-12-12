package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;

    }

    // this is locator
    private final By formAuthenticationlink = By.partialLinkText("Form ");


    // action
    public LoginPage clickOnFormAuthenticationlink() {

        driver.findElement(formAuthenticationlink).click();


        return new LoginPage (driver);


    }



}
