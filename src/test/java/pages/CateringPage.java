package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CateringPage extends BasePage {
    private String superMarketLocator= "//span[contains(text(),'%s')]";

    @FindBy(xpath="(//button[@type='submit'][contains(.,'Add')])[1]")
    WebElement addBtnlocator;

    public CateringPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public boolean verifySuperMarketSelected(String superMarket ) {
        String fullXpath = String.format(superMarketLocator, superMarket);
        isDisplayed(getDriver().findElement(By.xpath(fullXpath)));
        return true;
    }

    public void selectQuantity(int num ) {
        Select dropQuantity = new Select(getDriver().findElement(By.id("productQty4440")));
        dropQuantity.selectByIndex(num);
    }
    public ShoppingCardModalPage clickOnAddBtn( ) {
        clickButton(addBtnlocator);
        return new  ShoppingCardModalPage(getDriver());
    }
}
