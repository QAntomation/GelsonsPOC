package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends PageObjects {

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickButton(WebElement element) {
        element.click();
    }
    public void typeElements(WebElement element) {
        element.sendKeys();
    }
    public void isDisplayed(WebElement element) {
        element.isDisplayed();
    }

}
