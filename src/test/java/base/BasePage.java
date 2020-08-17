package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends indexPages {

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton(WebElement element) {
        element.click();
    }

    public void typeOnElement(WebElement element) {
        element.sendKeys();
    }

    public void isDisplayed(WebElement element)  {
        element.isDisplayed();
    }

    public void getText(WebElement element)  {
        element.getText();
    }

}
