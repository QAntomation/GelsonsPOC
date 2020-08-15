package UITests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CateringStoreModalPage;

public class TestClass extends BaseTest {

    @Test
    public void openCatering() {
        cateringStoreModalPage = new CateringStoreModalPage(getDriver());
        cateringStoreModalPage.clickOnSelectAStoreModalButton();
    }
}