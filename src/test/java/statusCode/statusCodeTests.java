package statusCode;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class statusCodeTests extends BaseTest {

    @Test
    public void testCode200() {

        {

            driver.findElement(By.linkText("Status Codes")).click();
            driver.findElement(By.linkText("200")).click();
            String actualresult = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
            String expectedresult = "This page returned a 200 status code.\n";
            Assert.assertTrue(actualresult.contains(expectedresult));

        }
    }


@Test
    public void testCode301() {
    {
        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText("301")).getText();
        String actualresult = driver.findElement(By.className("example")).getText();
        String expectedresult = "This page returned a 301 status code.";
        Assert.assertFalse(actualresult.contains(expectedresult));

    }

}
@Test
    public void testCode404() {

        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText("404")).getText();
        String actualresult = driver.findElement(By.className("no-js")).getText();
        String expectedresult = "This page returned a 404 status code.\n";
        Assert.assertFalse(actualresult.contains(expectedresult));
    }




@Test

    public void testCode501() {
    {
        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText("500")).getText();
        String actualresult = driver.findElement(By.className("row")).getText();
        String expectedresult = "This page returned a 500 status code.\n";
        Assert.assertFalse(actualresult.contains(expectedresult));

    }

}







}
