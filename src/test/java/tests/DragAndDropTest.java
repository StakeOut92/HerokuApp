package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.DragAndDropPage;

public class DragAndDropTest extends BaseTest{
    DragAndDropPage dragAndDropPage;

    @Test
    public void dragAndDropElementTest(){
        dragAndDropPage = new DragAndDropPage(driver);
        Assert.assertEquals(dragAndDropPage.DragAndDropElement(),"Dropped!","Element is not dropped or message is incorrect");
    }
}
