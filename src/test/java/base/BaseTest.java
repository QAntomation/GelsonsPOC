package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest extends indexPages {

    @BeforeTest
    @Parameters({"OperativeSystem", "url"})
    public void beforeClass(String OS, String url) {
        driverSetUp(OS);
        openUrl(url);
    }

    @AfterTest
    public void afterClass() {
        driverQuit();
    }
}
