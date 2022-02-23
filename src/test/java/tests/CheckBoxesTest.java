package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.CheckBoxesPage;

public class CheckBoxesTest extends BaseTest {
    CheckBoxesPage checkBoxesPage;

    @Test
    public void firstCheckboxIsNotSelectedTest() {
        checkBoxesPage = new CheckBoxesPage(driver);
        Assert.assertFalse(checkBoxesPage.firstCheckBoxIsNotSelected(), "Selected");
    }

    @Test
    public void firstCheckBoxSelectedAndNotSelectedTest() {
        checkBoxesPage = new CheckBoxesPage(driver);
        Assert.assertTrue(checkBoxesPage.firstCheckBoxSelectedAndNotSelected(), "Checkbox1 is not selected");
    }

    @Test
    public void secondCheckBoxIsSelectedTest() {
        checkBoxesPage = new CheckBoxesPage(driver);
        Assert.assertTrue(checkBoxesPage.secondCheckBoxIsSelected(), "Checkbox2 is not selected");
    }

    @Test
    public void secondCheckBoxUnselectAndSelectTest() {
        checkBoxesPage = new CheckBoxesPage(driver);
        Assert.assertFalse(checkBoxesPage.secondCheckBoxUnselectAndSelect(), "Checkbox2 is selected");
    }
}
