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
        int num = 1 ;

        storePickupModalPage = new StorePickupModalPage(getDriver());
        storePickupModalPage.clickOnSelectAStoreModalButton();
        storePickupModalPage.clickOnAnyStore(store);
        storePickupModalPage.clickOnEditLink();
        storePickupModalPage.clickOnAnyStore(storeSecondSelected);
        cateringPage = storePickupModalPage.clickOnNextBtn();
        //Assert :  The store selected is displayed on top page
        Assert.assertTrue(cateringPage.verifySuperMarketSelected(storeSecondSelected), "The Store Second selected is not displayed");

        cateringPage.selectQuantity(num);
        shoppingCardModalPage = cateringPage.clickOnAddBtn();
        //Asserts :  The Product selected is displayed
        Assert.assertTrue(shoppingCardModalPage.sauceIsDisplayed(), "The sauce is not displayed");

        shoppingCardModalPage.clickOnCheckout();

    }
}