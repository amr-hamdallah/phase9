package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class secureAreaPage {
    WebDriver driver;


    public secureAreaPage(WebDriver driver) {

        this.driver=driver;
    }

    private final By validationMassage= By.id("flash");

public String getValidationMassage (){

  return  driver.findElement(validationMassage).getText();

}
}
