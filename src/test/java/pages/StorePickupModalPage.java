package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePickupModalPage extends BasePage {

    public StorePickupModalPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    private String selectSuperMarketLocator ="//h5[contains(text(),'%s')]";

    @FindBy(xpath="//a[@class='btn btn-secondary']")
    WebElement selectAStoreButtonLocator;

    @FindBy(xpath="//a[contains(text(),'Edit')]")
    WebElement editLinkLocator;

    @FindBy(xpath="//button[contains(text(),'Next')]")
    WebElement nextBtnLocator;

    public void clickOnSelectAStoreModalButton() {
        clickButton(selectAStoreButtonLocator); }

    public void clickOnAnyStore(String selectSuperMarket) {

        String fullXpath = String.format(selectSuperMarketLocator, selectSuperMarket);
        clickButton(getDriver().findElement(By.xpath(fullXpath)));
    }

    public void clickOnEditLink() { clickButton(editLinkLocator);}

    public CateringPage clickOnNextBtn() {
        clickButton(nextBtnLocator);
        return  new CateringPage(getDriver());
    }



}
