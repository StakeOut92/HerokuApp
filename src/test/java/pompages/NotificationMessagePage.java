package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

import java.util.concurrent.TimeUnit;

public class NotificationMessagePage extends BasePage {

    @FindBy(xpath = "//div[@class='example']//a[text()='Click here']")
    WebElement linkedText;

    @FindBy(id = "flash-messages")
    WebElement notificationMessage;

    public String notificationMessageIsCorrect(){
        driver.get(WebUrls.HEROKUAPP_NOTIFICATIONMESSAGE_PAGE);
        linkedText.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String noteMessage = notificationMessage.getText();
        return noteMessage;
    }

    public NotificationMessagePage(WebDriver driver) {
        super(driver);
    }
}
