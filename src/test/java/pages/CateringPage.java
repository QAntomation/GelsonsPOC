package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CateringPage extends BasePage {


    public CateringPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
