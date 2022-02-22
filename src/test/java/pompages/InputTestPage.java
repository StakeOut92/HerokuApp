package pompages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

public class InputTestPage extends BasePage {

    @FindBy(xpath = "//input[@type='number']")
    WebElement inputField;

    public String sendKeysArrowUp() {
        driver.get(WebUrls.HEROKUAPP_INPUTS_PAGE);
        inputField.sendKeys(Keys.ARROW_UP);
        String inputFieldDataArrowUp = inputField.getAttribute("value");
        return inputFieldDataArrowUp;
    }

    public String sendKeysArrowDown() {
        driver.get(WebUrls.HEROKUAPP_INPUTS_PAGE);
        inputField.sendKeys(Keys.ARROW_DOWN);
        String inputFieldDataArrowDown = inputField.getAttribute("value");
        return inputFieldDataArrowDown;
    }

    public InputTestPage(WebDriver driver) {
        super(driver);
    }
}
