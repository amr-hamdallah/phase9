package upLoad;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class upLoadTests extends BaseTest {



        @Test

        public void UpLoadTest(){

        driver.findElement(By.linkText("File Upload")).click();
        driver.findElement(By.id("file-upload")).sendKeys("C:/Users/Amr.Hamdallah/IdeaProjects/untitled1/src/test/resources/img.PNG");

        driver.findElement(By.id("file-submit")).submit();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
        driver.findElement(By.id("uploaded-files"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uploaded-files")));

        //Thread.sleep(0);
    }


}
