package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

public class CheckBoxesPage extends BasePage {

    @FindBy(xpath = "//form[@id='checkboxes']//input[1]")
    private WebElement checkBox1;

    @FindBy(xpath = "//form[@id='checkboxes']//input[2]")
    private WebElement checkBox2;

    public boolean firstCheckBoxIsNotSelected() {
        driver.get(WebUrls.HEROKUAPP_CHECKBOX_PAGE);
        return checkBox1.isSelected();
    }

    public boolean firstCheckBoxSelectedAndNotSelected() {
        driver.get(WebUrls.HEROKUAPP_CHECKBOX_PAGE);
        checkBox1.click();
        return checkBox1.isSelected();
    }

    public boolean secondCheckBoxIsSelected(){
        driver.get(WebUrls.HEROKUAPP_CHECKBOX_PAGE);
        return checkBox2.isSelected();
    }

    public boolean secondCheckBoxUnselectAndSelect(){
        driver.get(WebUrls.HEROKUAPP_CHECKBOX_PAGE);
        checkBox2.click();
        return checkBox2.isSelected();
    }

    public CheckBoxesPage(WebDriver driver) {
        super(driver);
    }
}
