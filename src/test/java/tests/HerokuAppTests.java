package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.HerokuAppPage;
import staticdata.WebUrls;

import java.util.List;

public class HerokuAppTests extends BaseTest {
    HerokuAppPage herokuAppPage;

    @Test
    public void addAndRemoveElementsTest() {
        herokuAppPage = new HerokuAppPage(driver);
        Assert.assertTrue(herokuAppPage.addAndRemoveElements() > 0, "No any elements on page is displayed");
    }

    @Test
    public void checkFirstNameAndSecondNameIsTrueTest() {
        herokuAppPage = new HerokuAppPage(driver);
        Assert.assertEquals(herokuAppPage.getEmail(), "fbach@yahoo.com");
        Assert.assertEquals(herokuAppPage.getFirstName(), "Frank");
        Assert.assertEquals(herokuAppPage.getSecondName(), "Bach");
    }

    @Test
    public void checkDueAndWebSiteDataIsTrueTest() {
        herokuAppPage = new HerokuAppPage(driver);
        Assert.assertEquals(herokuAppPage.findEmailText(), "fbach@yahoo.com");
        Assert.assertEquals(herokuAppPage.findDueText(), "$51.00");
        Assert.assertEquals(herokuAppPage.findWebSiteText(), "http://www.frank.com");
    }
}


