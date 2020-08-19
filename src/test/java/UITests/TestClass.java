package UITests;

import base.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.StorePickupModalPage;
import org.testng.Assert;
import utils.TestDataProvider;

public class TestClass extends BaseTest {

    TestDataProvider testDataProvider = new TestDataProvider();

    @Test
    public void openCatering() throws InterruptedException {


        storePickupModalPage = new StorePickupModalPage(getDriver());
        storePickupModalPage.clickOnSelectAStoreModalButton();
        storePickupModalPage.clickOnAnyStore(testDataProvider.store);
        storePickupModalPage.clickOnEditLink();
        storePickupModalPage.clickOnAnyStore(testDataProvider.storeSecondSelected);
        cateringPage = storePickupModalPage.clickOnNextBtn();

        //Asserts
        Assert.assertTrue(cateringPage.verifySuperMarketSelected(testDataProvider.storeSecondSelected), "The Store Second selected is not displayed");
        
        //Assert :  The store selected is displayed on top page
        Assert.assertTrue(cateringPage.verifySuperMarketSelected(storeSecondSelected), "The Store Second selected is not displayed");

        cateringPage.selectQuantity(num);
        shoppingCardModalPage = cateringPage.clickOnAddBtn();
        //Asserts :  The Product selected is displayed
        Assert.assertTrue(shoppingCardModalPage.sauceIsDisplayed(), "The sauce is not displayed");

        shoppingCardModalPage.clickOnCheckout();

    }
}