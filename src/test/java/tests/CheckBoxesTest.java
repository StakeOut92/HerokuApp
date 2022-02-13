package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class CheckBoxesTest extends BaseTest {

    @Test
    public void firstCheckboxIsNotSelectedTest() {
        //Open start page
        driver.get(WebUrls.HEROKUAPP_CHECKBOX_PAGE);
        //Find 1st checkbox
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
        Assert.assertFalse(checkbox1.isSelected(),"Checkbox 1 is selected");
    }

    @Test
    public void firstCheckBoxSelectedAndNotSelectedTest() {
        //Open start page
        driver.get(WebUrls.HEROKUAPP_CHECKBOX_PAGE);
        //Find 1st checkbox and click on them
        driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]")).click();
        //Check that 1st checkbox is selected
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
        Assert.assertTrue(checkbox1.isSelected(), "checkbox is not selected");
    }

    @Test
    public void secondCheckBoxIsSelectedTest() {
        //Open start page
        driver.get(WebUrls.HEROKUAPP_CHECKBOX_PAGE);
        //Find second checkbox and check is it selected
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
        Assert.assertTrue(checkbox2.isSelected(), "checkbox is not selected");
    }

    @Test
    public void secondCheckBoxUnselectAndSelectTest() {
        //Open start page
        driver.get(WebUrls.HEROKUAPP_CHECKBOX_PAGE);
        //Find second checkbox and click on them
        driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]")).click();
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
        Assert.assertFalse(checkbox2.isSelected(),"Checkbox is selected");
    }
}
