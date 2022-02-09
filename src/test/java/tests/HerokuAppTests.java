package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

import java.util.ArrayList;
import java.util.List;

public class HerokuAppTests extends BaseTest {

    @Test
    public void addAndRemoveElementsTest() {
        //Open start page
        driver.get(WebUrls.HEROKUAPP_ADD_REMOVE_ELEMENTS_PAGE);
        //Click on 'Add element' button
        driver.findElement(By.xpath("//*[@class='example']//*[text()='Add Element']")).click();
        //Click on 'Add element' button
        driver.findElement(By.xpath("//*[@class='example']//*[text()='Add Element']")).click();
        //Delete one element
        driver.findElement(By.xpath("//*[@id='elements']//*[@class='added-manually']")).click();
        //Test that one element is enable
        boolean elementEnable = driver.findElement(By.xpath("//*[@id='elements']//*[@class='added-manually']")).isDisplayed();
        Assert.assertTrue(elementEnable, "No any elements is displayed");
    }

    @Test
    public void checkFirstNameAndSecondNameIsTrueTest() {
        //Open start page
        driver.get(WebUrls.HEROKUAPP_DATATABLE_PAGE);
        //Find email
        String email = driver.findElement(By.xpath("//table[@id='table1']//tr//td[text()='fbach@yahoo.com']")).getText();
        Assert.assertEquals(email, "fbach@yahoo.com");
        //Find first name
        String firstName = driver.findElement(By.xpath("(//table[@id='table1']//tr//td[text()='fbach@yahoo.com']//preceding-sibling::td)[2]")).getText();
        Assert.assertEquals(firstName, "Frank");
        String secondName = driver.findElement(By.xpath("(//table[@id='table1']//tr//td[text()='fbach@yahoo.com']//preceding-sibling::td)[1]")).getText();
        Assert.assertEquals(secondName, "Bach");
    }

    @Test
    public void checkDueAndWebSiteDataIsTrueTest() {
        //Open start page
        driver.get(WebUrls.HEROKUAPP_DATATABLE_PAGE);
        //Find email
        String email = driver.findElement(By.xpath("//table[@id='table1']//tr//td[text()='fbach@yahoo.com']")).getText();
        Assert.assertEquals(email, "fbach@yahoo.com");
        //Find Due
        String due = driver.findElement(By.xpath("(//table[@id='table1']//tr//td[text()='fbach@yahoo.com']//following-sibling::td)[1]")).getText();
        Assert.assertEquals(due, "$51.00");
        //Find WebSite
        String website = driver.findElement(By.xpath("(//table[@id='table1']//tr//td[text()='fbach@yahoo.com']//following-sibling::td)[2]")).getText();
        Assert.assertEquals(website, "http://www.frank.com");
    }
}

