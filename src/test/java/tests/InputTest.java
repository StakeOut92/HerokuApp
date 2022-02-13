package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class InputTest extends BaseTest {

    @Test
    public void sendKeysArrowUpTest() {
        driver.get(WebUrls.HEROKUAPP_INPUTS_PAGE);
        //Find inputs field and send arrowUp key
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.ARROW_UP);
        //Check dependencies in field
        String element = driver.findElement(By.xpath("//input[@type='number']")).getAttribute("value");
        Assert.assertEquals(element, "1");
    }

    @Test
    public void sendKeysArrowDownTest() {
        driver.get(WebUrls.HEROKUAPP_INPUTS_PAGE);
        //Find inputs field and send arrowUp key
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.ARROW_DOWN);
        //Check dependencies in field
        String element = driver.findElement(By.xpath("//input[@type='number']")).getAttribute("value");
        Assert.assertEquals(element, "-1");
    }
}
