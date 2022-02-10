package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class TyposTest extends BaseTest {

    @Test
    public void typosTest() {
        driver.get(WebUrls.HEROKUAPP_TYPOS_PAGE);
        for (int i = 0; i <= 10; i++) {
            driver.navigate().refresh();
            String typosTypesText = driver.findElement(By.xpath("//div[@class='example']//p[2]")).getText();
            Assert.assertEquals(typosTypesText, "Sometimes you'll see a typo, other times you won't.", "This message has a mistake");
        }
    }
}
