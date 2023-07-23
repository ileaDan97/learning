package helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WebDriverTest {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void openBrowser() {

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
    }

    public static void closeBrowser() {
//        if (getDriver() != null) {
//            getDriver().quit();
//            driver.quit();
//        }
//    }
    }
}
