package tests;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

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
        //Check that first name element is true
        String firstName = driver.findElement(By.xpath("//*[@id='table1']//td[text()='Frank']")).getText();
        Assert.assertEquals(firstName, "Frank");
        //Check that second name element is true
        String secondName = driver.findElement(By.xpath("//*[@id='table1']//td[text()='Bach']")).getText();
        Assert.assertEquals(secondName, "Bach");
    }

    @Test
    public void checkDueAndWebSiteDataIsTrueTest() {
        //Open start page
        driver.get(WebUrls.HEROKUAPP_DATATABLE_PAGE);

        List<WebElement> trs = driver.findElements(By.xpath("//*[@id='table2']//tr"));

        for (Integer i = 0; i < trs.size(); i++) {
            String email = trs.get(i).findElement(By.xpath("//td[@class='email']")).getText();
            if (email == "fbach@yahoo.com") {
                String dues = trs.get(i).findElement(By.xpath("//td[@class='dues']")).getText();
                String website = trs.get(i).findElement(By.xpath("//td[@class='web-site']")).getText();
                Assert.assertEquals(dues, "$51.00");
                Assert.assertEquals(website, "http://www.frank.com");
            }
        }
    }
}
