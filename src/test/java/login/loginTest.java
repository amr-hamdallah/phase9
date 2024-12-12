package login;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.secureAreaPage;

import static org.testng.Assert.assertTrue;


public class loginTest extends BaseTest {

    @Test(priority = 1)
    public void testSuccssfullLogin() {
// اللى عليه كومنت دى الطريقه القديمه قبل استخدام تيست و مين


        // driver.findElement(By.linkText("Form Authentication")).click();
        // driver.findElement(By.id("username")).sendKeys("tomsmith");
        //  driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        //  driver.findElement(By.className("radius")).click();
        // String actualresult = driver.findElement(By.id("flash")).getText();

        // دى الطريقه الجديده
        LoginPage loginPage = homepage.clickOnFormAuthenticationlink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("SuperSecretPassword!");
        secureAreaPage secureareapage = loginPage.clickOnLoginButton();
        String actualresult = secureareapage.getValidationMassage();
        String expectedresult = " You logged into a secure area!";
        Assert.assertFalse(actualresult.contains(expectedresult));

    }

    @Test(priority = 2)
    public void testInvaliadUserName() {

        LoginPage loginPage = homepage.clickOnFormAuthenticationlink();
        loginPage.insertUsername("amr");
        loginPage.insertPassword("SuperSecretPassword!");
      secureAreaPage secureAreaPage=  loginPage.clickOnLoginButton();
        String actualresult = secureAreaPage.getValidationMassage();
        String expectedresult = "Your username is invalid!";
        assertTrue(actualresult.contains(expectedresult));

    }

    @Test(priority = 3)
    public void testInvaliadPassWord() {

        LoginPage loginPage = homepage.clickOnFormAuthenticationlink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("Super");
        secureAreaPage secureAreaPage=  loginPage.clickOnLoginButton();
        String actualresult = secureAreaPage.getValidationMassage();
        String expectedresult = "Your password is invalid!";
        assertTrue(actualresult.contains(expectedresult));

    }
}


