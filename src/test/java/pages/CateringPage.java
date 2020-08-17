package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CateringPage extends BasePage {
    private String superMarketLocator= "//span[contains(text(),'%s')]";

    public CateringPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public boolean verifySuperMarketSelected(String superMarket ) {
        String fullXpath = String.format(superMarketLocator, superMarket);
        isDisplayed(getDriver().findElement(By.xpath(fullXpath)));
        return true;
    }
}
