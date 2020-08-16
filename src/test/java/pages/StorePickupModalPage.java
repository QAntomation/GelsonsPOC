package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePickupModalPage extends BasePage {

    @FindBy(xpath="//a[contains(text(),'Click here to select a store')]")
    WebElement selectAStoreButton;

    public StorePickupModalPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnSelectAStoreModalButton() {
        clickButton(selectAStoreButton);
    }

}
