package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.TyposPage;

public class TyposTest extends BaseTest {
    TyposPage typosPage;

    @Test
    public void typosTest() {
         typosPage = new TyposPage(driver);
         Assert.assertEquals(typosPage.findTyposText(),"Sometimes you'll see a typo, other times you won't.","This message has a mistake");
    }
}
