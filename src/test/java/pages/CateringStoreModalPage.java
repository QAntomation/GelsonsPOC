package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class CateringStoreModalPage extends BasePage {

    public WebElement selectAStoreButton = getDriver().findElement(By.xpath("//*[@id='__BVID__26']/div/div/a"));

    public CateringStoreModalPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnSelectAStoreModalButton(){
        clickButton(selectAStoreButton);
    }

}
