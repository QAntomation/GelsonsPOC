package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CateringStoreModalPage extends BasePage {

    WebElement selectAStoreButton = driver.findElement(By.xpath("//a[@class='btn btn-secondary']"));

    public void clickOnSelectAStoreButton(){
        clickButton(selectAStoreButton);
    }

}
