package UITests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.StorePickupModalPage;
import org.testng.Assert;

public class TestClass extends BaseTest {

    @Test
    public void openCatering() throws InterruptedException {
        String store= "Calabasas";
        String storeSecondSelected = "Century City";

        storePickupModalPage = new StorePickupModalPage(getDriver());
        storePickupModalPage.clickOnSelectAStoreModalButton();
        storePickupModalPage.clickOnAnyStore(store);
        storePickupModalPage.clickOnEditLink();
        storePickupModalPage.clickOnAnyStore(storeSecondSelected);
        cateringPage = storePickupModalPage.clickOnNextBtn();
        //Asserts
        Assert.assertTrue(cateringPage.verifySuperMarketSelected(storeSecondSelected), "The Store Second selected is not displayed");
        
    }
}