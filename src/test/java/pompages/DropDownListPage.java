package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import staticdata.WebUrls;

public class DropDownListPage extends BasePage {

    @FindBy(xpath = "//select[@id='dropdown']")
    WebElement selectPath;

    @FindBy(xpath = "//select[@id='dropdown']//option[@value='1']")
    WebElement optionOne;

    @FindBy(xpath = "//select[@id='dropdown']//option[@value='2']")
    WebElement optionTwo;

    public boolean selectOptionOne(){
        driver.get(WebUrls.DROP_DOWN_LIST_PAGE);
        Select select = new Select(selectPath);
        select.selectByValue("1");
        boolean isSelectedValue1 = optionOne.isSelected();
        return isSelectedValue1;
    }

    public boolean selectOptionTwo(){
        driver.get(WebUrls.DROP_DOWN_LIST_PAGE);
        Select select = new Select(selectPath);
        select.selectByValue("2");
        boolean isSelectedValue2 = optionTwo.isSelected();
        return isSelectedValue2;
    }

    public int selectOption() {
        driver.get(WebUrls.DROP_DOWN_LIST_PAGE);
        Select select = new Select(selectPath);
        int selectFieldsValue = select.getOptions().size();
        return selectFieldsValue;
    }


    public DropDownListPage(WebDriver driver) {
        super(driver);
    }
}
