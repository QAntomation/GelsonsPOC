package UITests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.StorePickupModalPage;

public class TestClass extends BaseTest {

    @Test
    public void openCatering() {
        storePickupModalPage = new StorePickupModalPage(getDriver());
        storePickupModalPage.clickOnSelectAStoreModalButton();

    }
}