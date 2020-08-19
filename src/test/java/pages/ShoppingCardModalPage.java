package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCardModalPage extends BasePage {

    @FindBy(xpath="//a[contains(.,'Checkout')]")
    WebElement checkoutLocator;
    @FindBy(xpath="(//h5[contains(.,'Crostini: Mozzarella, Tomato, and Basil')])[2]")
    WebElement sauce;
    @FindBy(css="cart-subtotal")
    WebElement subtotalLocator;

    public ShoppingCardModalPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public PlaceYourOrderPage clickOnCheckout ()  {
        clickButton(checkoutLocator);
        return  new PlaceYourOrderPage(getDriver());
    }
    public boolean sauceIsDisplayed(){
        isDisplayed(sauce);
        return true;
    }
}
