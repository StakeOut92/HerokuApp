package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

public class TyposPage extends BasePage {

    @FindBy(xpath = "//div[@class='example']//p[2]")
    WebElement typosText;

    public String findTyposText() {
        driver.get(WebUrls.HEROKUAPP_TYPOS_PAGE);
        String typosTypesText = "";
        for (int i = 0; i <= 5; i++) {
            driver.navigate().refresh();
            typosTypesText = typosText.getText();
        }
        return typosTypesText;
    }

    public TyposPage(WebDriver driver) {
        super(driver);
    }
}
