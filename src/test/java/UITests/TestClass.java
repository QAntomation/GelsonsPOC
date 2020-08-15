package UITests;

import base.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {

    @Test
    @Parameters(("url"))
    public void openCatering(String url) {
        openUrl(url);
        cateringStoreModalPage.clickOnSelectAStoreButton();
    }
}