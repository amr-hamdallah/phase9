

package t;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


    public class T {





        //  using vaild credincials   the  test case  passed when we used assert false
        @Test
        public void t1() {

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/");
            driver.findElement(By.linkText("Form Authentication")).click();
            driver.findElement(By.id("username")).sendKeys("tomsmith");
            driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
            driver.findElement(By.className("radius")).click();
            String actualresult = driver.findElement(By.id("flash")).getText();
            String expectedresult = " You logged into a secure area!";
            Assert.assertFalse(actualresult.contains(expectedresult));
            driver.quit();


        }


        @Test
        public void t2() {
// invalid user name  the test case pass  when we used assert true
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/");
            driver.findElement(By.linkText("Form Authentication")).click();
            driver.findElement(By.id("username")).sendKeys("amr");
            driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
            driver.findElement(By.className("radius")).click();
            String actualresult = driver.findElement(By.id("flash")).getText();
            String expectedresult = "Your username is invalid!";
            assertTrue(actualresult.contains(expectedresult));

            driver.quit();
        }

        @Test
        public void t3() {
// invalid password  the test case pass when we used assert true
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/");
            driver.findElement(By.linkText("Form Authentication")).click();
            driver.findElement(By.id("username")).sendKeys("tomsmith");
            driver.findElement(By.id("password")).sendKeys("Super");
            driver.findElement(By.className("radius")).click();
            String actualresult = driver.findElement(By.id("flash")).getText();
            String expectedresult = "Your password is invalid!";
            assertTrue(actualresult.contains(expectedresult));
            driver.quit();
        }



    }













