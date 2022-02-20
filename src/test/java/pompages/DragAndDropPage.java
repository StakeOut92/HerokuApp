package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

import java.util.concurrent.TimeUnit;

public class DragAndDropPage extends BasePage {

    @FindBy(xpath = "//div[@id='draggable']")
    WebElement dragElement;

    @FindBy(xpath = "//div[@id='droppable']")
    WebElement dropElement;

    @FindBy(xpath = "//iframe[@class='demo-frame']")
    WebElement iFramePath;

    public String DragAndDropElement() {
        Actions action = new Actions(driver);
        driver.get(WebUrls.DRAG_AND_DROP_PAGE);
        driver.switchTo().frame(iFramePath);
        action.dragAndDrop(dragElement, dropElement).build().perform();
        String dropElementText = driver.findElement(By.xpath("//div[@id='droppable']")).getText();
        return dropElementText;
    }

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }
}
