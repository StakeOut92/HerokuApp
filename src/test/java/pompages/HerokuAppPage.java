package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

public class HerokuAppPage extends BasePage {
    @FindBy(xpath = "//button[@onclick='addElement()']")
    WebElement addElementButton;

    @FindBy(xpath = "//button[@onclick='deleteElement()']")
    WebElement deleteElementButton;

    public String findEmailText() {
        driver.get(WebUrls.HEROKUAPP_DATATABLE_PAGE);
        String email = driver.findElement(By.xpath("//table[@id='table1']//tr//td[text()='fbach@yahoo.com']")).getText();
        return email;
    }

    public String findDueText() {
        String due = driver.findElement(By.xpath("(//table[@id='table1']//tr//td[text()='fbach@yahoo.com']//following-sibling::td)[1]")).getText();
        return due;
    }

    public String findWebSiteText() {
        String website = driver.findElement(By.xpath("(//table[@id='table1']//tr//td[text()='fbach@yahoo.com']//following-sibling::td)[2]")).getText();
        return website;
    }

    public int addAndRemoveElements() {
        driver.get(WebUrls.HEROKUAPP_ADD_REMOVE_ELEMENTS_PAGE);
        addElementButton.click();
        addElementButton.click();
        deleteElementButton.click();
        int value = driver.findElements(By.xpath("//button[@onclick='deleteElement()' and contains (text(),'Delete')]")).size();
        return value;
    }

    public String getEmail() {
        driver.get(WebUrls.HEROKUAPP_DATATABLE_PAGE);
        String emailText = driver.findElement(By.xpath("//table[@id='table1']//tr//td[text()='fbach@yahoo.com']")).getText();
        return emailText;
    }

    public String getFirstName() {
        String firstNameText = driver.findElement(By.xpath("(//table[@id='table1']//tr//td[text()='fbach@yahoo.com']//preceding-sibling::td)[2]")).getText();
        return firstNameText;
    }

    public String getSecondName() {
        String secondNameText = driver.findElement(By.xpath("(//table[@id='table1']//tr//td[text()='fbach@yahoo.com']//preceding-sibling::td)[1]")).getText();
        return secondNameText;
    }

    public HerokuAppPage(WebDriver driver) {
        super(driver);
    }
}
