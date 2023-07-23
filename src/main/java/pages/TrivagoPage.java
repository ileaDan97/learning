package pages;

import helpers.WebDriverTest;
import org.openqa.selenium.WebDriver;

public class TrivagoPage {
    final WebDriver driver = WebDriverTest.getDriver();

    public void navigateToTrivagoPage(){
        driver.get("https://www.trivago.com/");
    }
}
