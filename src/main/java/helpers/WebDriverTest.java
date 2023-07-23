package helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void closeBrowser() {
//        if (getDriver() != null) {
//            getDriver().quit();
//            driver.quit();
//        }
//    }
    }
}
