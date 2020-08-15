package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CateringHomePage extends BasePage {


    public CateringHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
