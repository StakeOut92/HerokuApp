package tests;

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
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //Click on 'Add element' button
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //Delete one element
        driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
        //Test that one element is enable
        int countElements = driver.findElements(By.xpath("//button[@onclick='deleteElement()' and contains (text(),'Delete')]")).size();
        Assert.assertTrue(countElements > 0, "No any elements is displayed");
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

    @Test
    public void findElementsWithIterationTest() {
        driver.get(WebUrls.HEROKUAPP_DATATABLE_PAGE);
        List<WebElement> trs = driver.findElements(By.xpath("//*[@id='table2']//tr"));
        String dues = "";
        String website = "";
        for (int i = 0; i < trs.size(); i++) {
            String email = trs.get(i).findElement(By.className("email")).getText();
            if (email.equals("fbach@yahoo.com")) {
                dues = trs.get(i).findElement(By.className("dues")).getText();
                website = trs.get(i).findElement(By.className("web-site")).getText();
            }
        }
        Assert.assertEquals(dues, "$51.00");
        Assert.assertEquals(website, "http://www.frank.com");
    }

    @Test
    public void someoneTest() {
        driver.get(WebUrls.HEROKUAPP_DATATABLE_PAGE);
        List<WebElement> trs = driver.findElements(By.xpath("//*[@id='table2']//tr"));
        String dues = "";
        String website = "";
        for (WebElement element : trs) {
            String email = element.findElement(By.className("email")).getText();
            if (email.equals("fbach@yahoo.com")) {
                dues = element.findElement(By.className("dues")).getText();
                website = element.findElement(By.className("web-site")).getText();
            }
        }
        Assert.assertEquals(dues, "$51.00");
        Assert.assertEquals(website, "http://www.frank.com");
    }
}


