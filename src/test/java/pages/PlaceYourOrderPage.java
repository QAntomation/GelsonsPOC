package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PlaceYourOrderPage extends BasePage {
    public PlaceYourOrderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//button[@type='submit']")
    WebElement nextButtonLocator;
    @FindBy(xpath="//a[contains(text(),'Next')]")
    WebElement nextSummaryButtonLocator;
    // Customer Information
    @FindBy(id="firstName")
    WebElement firstNameLocator;

    @FindBy(id="lastName")
    WebElement lastNameLocator;

    @FindBy(name = "billingAddress[phone]")
    WebElement phoneLocator;

    @FindBy(id="address1")
    WebElement addressLocator;

    @FindBy(id="address2")
    WebElement unitSuiteLocator;

    @FindBy(id="city")
    WebElement cityLocator;

    @FindBy(id="zip")
    WebElement zipLocator;

    @FindBy(id="email")
    WebElement emailLocator;

    public void clickOnNextButton() {
        waitForElementVisible(nextButtonLocator);
        clickButton(nextButtonLocator);
    }
    public void clickOnNextSummaryButton() {
        waitForElementVisible(nextSummaryButtonLocator);
        clickButton(nextSummaryButtonLocator);
    }
    public void typeCostumerInformation(String firstName,String lastName, String phone, String address, String unitSuite, String city, String zip, String email, String time, String state) {
        Select quantityDropdown = new Select(getDriver().findElement(By.id("timetoreach")));
        Select stateDropdown = new Select(getDriver().findElement(By.id("state")));
        //Type of Costumer Information
        waitForElementVisible(firstNameLocator);
        typeOnElement(firstNameLocator, firstName);
        typeOnElement(lastNameLocator, lastName);
        waitForElementVisible(phoneLocator);
        typeOnElement(phoneLocator, phone);
        quantityDropdown.selectByValue(time);
        typeOnElement(addressLocator, address);
        typeOnElement(unitSuiteLocator, unitSuite);
        typeOnElement(cityLocator, city);
        stateDropdown.selectByValue(state);
        typeOnElement(zipLocator, zip);
        typeOnElement(emailLocator, email);

    }

}
