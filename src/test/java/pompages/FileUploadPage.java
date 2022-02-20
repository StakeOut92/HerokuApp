package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

import java.util.concurrent.TimeUnit;

public class FileUploadPage extends BasePage {

    @FindBy(xpath = "//input[@id='file-upload']")
    WebElement uploadFilePath;

    @FindBy(xpath = "//input[@value='Upload']")
    WebElement uploadFileButton;

    @FindBy(xpath = "//div[@id='uploaded-files']")
    WebElement pathToUploadFileName;

    public String uploadFileAndCheckName() {
        driver.get(WebUrls.UPLOAD_FILE_PAGE);
        String filePath = "D:\\IdeaProjects\\HerokuApp\\src\\test\\resources\\upload.txt";
        uploadFilePath.sendKeys(filePath);
        uploadFileButton.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String fileName = pathToUploadFileName.getText();
        return fileName;
    }

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }
}
