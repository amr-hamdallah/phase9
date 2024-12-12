package checkBox;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkBoxTests extends BaseTest {



    @Test(priority = 2)
    public void TestCheckBoxIsSelected(){

        driver.findElement(By.linkText("Checkboxes")).click();
        driver.findElement(By.id("checkboxes")).isSelected();
        Assert.assertTrue(true);

    }
    @Test(priority = 1)
    public void TestCheckBoxIsUnSelected(){
        driver.findElement(By.linkText("Checkboxes")).click();
        driver.findElement(By.id("checkboxes")).isSelected();
        Assert.assertFalse(false);



    }


}
