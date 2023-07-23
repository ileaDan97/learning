package helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollUtils {
    public static void scrollInToView(WebElement webElement) {
        JavascriptExecutor jsExec = (JavascriptExecutor) WebDriverTest.getDriver();
        jsExec.executeScript("arguments[0].scrollIntoView(true)", webElement);
    }
}
