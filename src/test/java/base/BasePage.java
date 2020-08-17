package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class BasePage extends indexPages {

    WebDriverWait wait = new WebDriverWait(getDriver(), 20);

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton(WebElement element){
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

    public void waitForElementToLoad(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForPageToLoad(){
        ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
            }
        };
        wait.until(pageLoadCondition);
    }
}
