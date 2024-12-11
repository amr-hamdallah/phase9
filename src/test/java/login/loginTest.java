package login;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;


public class loginTest extends BaseTest {

    @Test
    public void testSuccssfull() {

        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        String actualresult = driver.findElement(By.id("flash")).getText();
        String expectedresult = " You logged into a secure area!";
        Assert.assertFalse(actualresult.contains(expectedresult));

    }


    @Test
    public void testInvaliadUserName() {

        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("amr");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        String actualresult = driver.findElement(By.id("flash")).getText();
        String expectedresult = "Your username is invalid!";
        assertTrue(actualresult.contains(expectedresult));


    }

    @Test
    public void testInvaliadPassWord() {

        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("Super");
        driver.findElement(By.className("radius")).click();
        String actualresult = driver.findElement(By.id("flash")).getText();
        String expectedresult = "Your password is invalid!";
        assertTrue(actualresult.contains(expectedresult));

    }
}


