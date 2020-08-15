package base;

import manager.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest extends WebDriverManager {

    @BeforeTest
    @Parameters(("OperativeSystem"))
    public void beforeClass(String OS) {
        driverSetUp(OS);
    }

    @AfterTest
    public void afterClass() {
        driverQuit();
    }
}
