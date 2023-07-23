package pages;

import helpers.WebDriverTest;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TrivagoPage {
    final WebDriver driver = WebDriverTest.getDriver();

    @FindBy(css = "input[id='input-auto-complete']")
    private WebElement searchPlace;
    @FindBy(css = "div[class='flex items-center h-14']")
    private List<WebElement> cityLocations;
    @FindBy(css = "input[id=input-auto-complete]")
    private WebElement checkCity;
    @FindBy(css = "button[data-testid=search-form-calendar-checkin]")
    private WebElement checkInDate;

    public void navigateToTrivagoPage() {
        driver.get("https://www.trivago.com/");
    }

    public void acceptCookies() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);
//        //js.executeScript("return document.querySelector(\"button[data-testid='uc-accept-all-button']\").shadowRoot.querySelector(\"button[data-testid='uc-accept-all-button']\")");
        WebElement element = (WebElement) js.executeScript("return document.querySelector(\"#usercentrics-root\").shadowRoot.querySelector(\"button[data-testid='uc-accept-all-button']\")");
        //WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#usercentrics-root"));
//        //shadowRoot.findElement(acceptCookie).click();
        element.click();
    }

    public void clickOnSearchPlace() {
        searchPlace.click();
    }

    public void searchForRome() {
        searchPlace.sendKeys("ROME");
        cityLocations.get(0).click();
        Assert.assertTrue("The city is not ROME", checkCity.isDisplayed());
    }
    public void SelectDateFromCalendar(){
       // asdas
    }
}
