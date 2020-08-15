package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    public WebDriver driver;

    public void openUrl(String url){
        driver.get(url);
    }

    public void driverSetUp(String OS){
        if(OS.equals("macOS")){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/mac/chromedriver");
        }else if(OS.equals("windows")){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/windows/chromedriver.exe");
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void driverQuit(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }


}
