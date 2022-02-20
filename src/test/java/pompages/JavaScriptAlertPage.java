package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

public class JavaScriptAlertPage extends BasePage {

    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    WebElement jsAlertButton;

    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    WebElement jsConfirmButton;

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    WebElement jsPromptButton;

    @FindBy(xpath = "//p[@id='result']")
    WebElement resultText;

    public boolean clickJsPromptAndConfirmIsTextEnable() {
        driver.get(WebUrls.JAVASCRIPT_ALERT_PAGE);
        jsPromptButton.click();
        driver.switchTo().alert().sendKeys("JsPropmt message");
        driver.switchTo().alert().accept();
        return resultText.isDisplayed();
    }

    public String clickJsConfirmAndGetTextFrom() {
        driver.get(WebUrls.JAVASCRIPT_ALERT_PAGE);
        jsConfirmButton.click();
        String jsConfirmText = driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();
        return jsConfirmText;
    }

    public String clickJsAlertAndGetTextFrom() {
        driver.get(WebUrls.JAVASCRIPT_ALERT_PAGE);
        jsAlertButton.click();
        String jsAlertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return jsAlertText;
    }


    public JavaScriptAlertPage(WebDriver driver) {
        super(driver);
    }
}

