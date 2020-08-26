package UITests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.StorePickupModalPage;
import org.testng.Assert;
import utils.TestData;

public class TestClass extends BaseTest {
    TestData testData = new TestData();

    @Test
    public void openCatering() throws InterruptedException {

        storePickupModalPage = new StorePickupModalPage(getDriver());
        storePickupModalPage.clickOnSelectAStoreModalButton();
        storePickupModalPage.clickOnAnyStore(testData.store);
        storePickupModalPage.clickOnEditLink();
        storePickupModalPage.clickOnAnyStore(testData.storeSecondSelected);
        cateringPage = storePickupModalPage.clickOnNextBtn();

        //Asserts
        Assert.assertTrue(cateringPage.verifySuperMarketSelected(testData.storeSecondSelected), "The Store Second selected is not displayed");
        
        //Assert :  The store selected is displayed on top page
        Assert.assertTrue(cateringPage.verifySuperMarketSelected(testData.storeSecondSelected), "The Store Second selected is not displayed");

        cateringPage.selectQuantity(testData.quantity);
        shoppingCardModalPage = cateringPage.clickOnAddBtn();
        //Asserts :  The Product selected is displayed
        Assert.assertTrue(shoppingCardModalPage.sauceIsDisplayed(), "The sauce is not displayed");

        placeYourOrderPage = shoppingCardModalPage.clickOnCheckout();
        //Need to Add ASSERTS
        placeYourOrderPage.clickOnNextSummaryButton();
        //Need to Add ASSERTS
        placeYourOrderPage.clickOnNextButton();
        // Type Costumer Information
        placeYourOrderPage.typeCostumerInformation("Justin","Salas","2222222222","10th street",
                "2","Florida","20001","jssegura@gmail.com","8 am to NOON","31");
        placeYourOrderPage.clickOnNextButton();
        // Need to Add ASSERTS Asserts
        placeYourOrderPage.clickOnNextButton();
    }
}