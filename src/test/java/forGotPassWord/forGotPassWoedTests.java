package forGotPassWord;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class forGotPassWoedTests extends BaseTest {




   @Test
    public void ForgotPassword(){

        driver.findElement(By.linkText("Forgot Password")).click();
        driver.findElement(By.id("email")).sendKeys("admin");
        driver.findElement(By.id("form_submit")).click();
        String actualresult =driver.findElement(By.xpath("/html/body/h1")).getText();
        String expectedresult="Internal Server Error";
        Assert.assertTrue(actualresult.contains(expectedresult));
    }


}
