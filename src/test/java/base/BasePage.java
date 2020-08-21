package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class BasePage extends indexPages {

    public BasePage(WebDriver driver) {
        this.driver = driver;

    }

    public void clickButton(WebElement element){
        element.click();
    }

    public boolean typeOnElement(WebElement element, String text) {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(),10);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.clear();
            element.sendKeys(text);
            wait(5000);
            return true;
        } catch (Exception e) {
            getMessages(e);
            return false;
        }
    }

    public void isDisplayed(WebElement element)  {
        element.isDisplayed();
    }

    public void getText(WebElement element)  {
        element.getText();
    }

    public void waitForElementToLoad(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForPageToLoad(){
        ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
            }
        };
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(pageLoadCondition);
    }
    public boolean waitForElementVisible(WebElement element)  {

        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), 15);
            wait.until(ExpectedConditions.visibilityOf(element));
            Thread.sleep(2000);
            return true;
        } catch (Exception e) {
            getMessages(e);
            return false;
        }finally {
            System.out.print("");
        }
    }

    public void getMessages(Exception e){
        System.out.print(e.getMessage());
        System.out.print(e.getStackTrace());
    }
}
