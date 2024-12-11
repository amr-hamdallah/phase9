package t;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;


public class T extends BaseTest {

    @Test
    public void t1() {

        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        String actualresult = driver.findElement(By.id("flash")).getText();
        String expectedresult = " You logged into a secure area!";
        Assert.assertFalse(actualresult.contains(expectedresult));

    }


    @Test
    public void t2() {

        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("amr");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        String actualresult = driver.findElement(By.id("flash")).getText();
        String expectedresult = "Your username is invalid!";
        assertTrue(actualresult.contains(expectedresult));


    }

    @Test
    public void t3() {

        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("Super");
        driver.findElement(By.className("radius")).click();
        String actualresult = driver.findElement(By.id("flash")).getText();
        String expectedresult = "Your password is invalid!";
        assertTrue(actualresult.contains(expectedresult));

    }
}


