package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;
import java.util.concurrent.TimeUnit;

public class NotificationMessageTest extends BaseTest {

    @Test
    public void notificationMessageIsCorrectTest() {
        //Open start page
        driver.get(WebUrls.HEROKUAPP_NOTIFICATIONMESSAGE_PAGE);
        //Find linked text and click on them
        driver.findElement(By.xpath("//div[@class='example']//a[text()='Click here']")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        //Find notification message and check that it correct
        String noteMessage = driver.findElement(By.id("flash-messages")).getText();
        Assert.assertEquals(noteMessage, "Action successful\n" + "×");
    }
}
