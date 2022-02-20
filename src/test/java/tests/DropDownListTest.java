package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.DropDownListPage;

public class DropDownListTest extends BaseTest {
    DropDownListPage dropDownListPage;

    @Test
    public void dropDownListValueTest() {
        dropDownListPage = new DropDownListPage(driver);
        Assert.assertTrue(dropDownListPage.selectOption() == 3, "Value of DropDown list is incorrect");
    }

    @Test
    public void valueOneIsSelectedTest() {
        dropDownListPage = new DropDownListPage(driver);
        Assert.assertTrue(dropDownListPage.selectOptionOne());
    }

    @Test
    public void valueTwoIsSelectedTest() {
        dropDownListPage = new DropDownListPage(driver);
        Assert.assertTrue(dropDownListPage.selectOptionTwo());
    }
}
