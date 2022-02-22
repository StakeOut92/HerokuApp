package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.InputTestPage;
import staticdata.WebUrls;

public class InputTest extends BaseTest {
    InputTestPage inputTestPage;

    @Test
    public void sendKeysArrowUpTest() {
        inputTestPage = new InputTestPage(driver);
        Assert.assertEquals(inputTestPage.sendKeysArrowUp(), "1");
    }

    @Test
    public void sendKeysArrowDownTest() {
        inputTestPage = new InputTestPage(driver);
        Assert.assertEquals(inputTestPage.sendKeysArrowDown(), "-1");
    }
}
