package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.NotificationMessagePage;
import staticdata.WebUrls;

import java.util.concurrent.TimeUnit;

public class NotificationMessageTest extends BaseTest {
    NotificationMessagePage notificationMessagePage;

    @Test
    public void notificationMessageIsCorrectTest() {
        notificationMessagePage = new NotificationMessagePage(driver);
        Assert.assertEquals(notificationMessagePage.notificationMessageIsCorrect(), "Action successful\n" + "×");
    }
}
