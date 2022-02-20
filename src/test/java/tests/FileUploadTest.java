package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.FileUploadPage;

public class FileUploadTest extends BaseTest {
    FileUploadPage fileUploadPage;

    @Test
    public void fileUploadTest() {
        fileUploadPage = new FileUploadPage(driver);
        Assert.assertEquals(fileUploadPage.uploadFileAndCheckName(), "upload.txt", "File name is invalid");
    }
}
