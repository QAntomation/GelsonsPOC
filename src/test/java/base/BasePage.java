package base;

import org.openqa.selenium.WebElement;

public class BasePage extends PageObjects {

    public void clickButton(WebElement element){
        element.click();
    }

}
