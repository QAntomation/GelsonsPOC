package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PlaceYourOrderPage extends BasePage {
    public PlaceYourOrderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
