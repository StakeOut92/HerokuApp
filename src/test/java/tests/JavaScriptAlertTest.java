package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.JavaScriptAlertPage;

public class JavaScriptAlertTest extends BaseTest{
    JavaScriptAlertPage javaScriptAlertPage;

    @Test
    public void jsAlertClickTest(){
        javaScriptAlertPage = new JavaScriptAlertPage(driver);
        Assert.assertEquals(javaScriptAlertPage.clickJsAlertAndGetTextFrom(),"I am a JS Alert");
    }

    @Test
    public void jsConfirmDismissTest(){
        javaScriptAlertPage = new JavaScriptAlertPage(driver);
        Assert.assertEquals(javaScriptAlertPage.clickJsConfirmAndGetTextFrom(),"I am a JS Confirm");
    }

    @Test
    public void jsPromptTextIsEnableTest(){
        javaScriptAlertPage = new JavaScriptAlertPage(driver);
        Assert.assertTrue(javaScriptAlertPage.clickJsPromptAndConfirmIsTextEnable(),"Result message is not enable");
    }
}
