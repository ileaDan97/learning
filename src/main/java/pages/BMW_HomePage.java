package pages;

import helpers.ScrollUtils;
import helpers.WebDriverTest;
import io.cucumber.java.zh_cn.假如;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.Element;
import java.util.List;

public class BMW_HomePage {
    final WebDriver driver = WebDriverTest.getDriver();

    @FindBy(xpath = "//div[@class='columns large-12 medium-12']/ul/li[@data-series='BMW i']")
    private WebElement clickOnI;
    @FindBy(xpath = "//div[@class='ds2-model-cars clearfix']")
    private WebElement clickOnCar;
    @FindBy(xpath = "//div[@data-component-path='ds2-showroom-multicontent']")
    private WebElement containerFinder;

    @FindBy(xpath = "//div[@class='ds2-cms-output']")
    private List<WebElement> Text;

    @FindBy(xpath = "/html/body/div[1]/main/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/div/ul/li/a/span")
    private WebElement firstButton;

    @FindBy(xpath = "//button[@data-tooltip-id='tooltip--131024511']")
    private WebElement toolTip;

    @FindBy(xpath = "//button[@data-tooltip-id='tooltip--131024511']")
    private WebElement toolTipButton;

    @FindBy(xpath = "//div[@class='qtip-content']//button[@class='ds2-tooltip-element--close-button']")
    private WebElement closeToolTip;

    @FindBy(xpath = "//div[@id='qtip-187-content']")
    private WebElement tooltipContainerClosed;

    @FindBy(xpath = "//button[@class='button expand ds2-dropdown-js-area ds2-font-s']")
    private WebElement dropdown;

    @FindBy(xpath = "//li[@class='ds2-dropdown-list__item ds2-dropdown__js-item ']")
    private List<WebElement> carModels;

    @FindBy(xpath = "/html/body/div[1]/main/div[1]/div[9]/div/div/div/div[3]/div[2]/a")
    private WebElement clickOnNewvagenButton;

    @FindBy(xpath = "/html/body/div[5]/main/div[1]/div/div[1]/div/div/div[2]/div[2]/div[1]/section[1]/div[2]/div/div[2]/div/div/div/div/div/div/div/div/div[1]/ul/span/li[3]")
    private WebElement checkLabel;

    @FindBy(xpath = "//li[@data-id='2']")
    private WebElement designButton;

    @FindBy(xpath = "//div[@class='ds2-model-card-electricIcon']")
    private WebElement priza;

    @FindBy(xpath = "//div[@class='ds2-model-card ds2-disclaimer--asterix-on car-visible']")
    private List<WebElement> carDesigns;


    public void navigateToBmwHomePage() {
        driver.get("https://www.bmw.de/de/index.html");
    }

//    public void scrollDown (){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,350)", "");
//        js.executeScript("arguments[0].scrollIntoView();", clickOnI);
//    }

//    public void scrollDown()
//
//    {
//        //to perform scroll on an application using Selenium
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//
//    }

    public void acceptCookies() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,250)", "");

        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement cookies = (WebElement) jse.executeScript("return document.querySelector(\"body > epaas-consent-drawer-shell\").shadowRoot.querySelector(\"body > div > div > section > div.actions > div > div.buttons > button.accept-button.button-primary\")");
        jse.executeScript("arguments[0].click()", cookies);
    }

    public void iModel() throws InterruptedException {
        Thread.sleep(1000);
//       // scrollDown();
//        clickOnI.click();
    }

    public void iXCar() throws InterruptedException {
        Thread.sleep(1000);
//        clickOnCar.click();
    }

    public void iXPage() throws InterruptedException {
        Thread.sleep(1000);
    }

//    public void scrollToTeaser() {
//        ScrollUtils.scrollInToView(containerFinder);
//    }
//
//    public void listContainer (){
//        for (int i = 0; i <Text.size() ; i++) {
//            String item = Text.get(i).getText();
//            System.out.println(item);
//        }
//    }

//    public void clickOnSecondTeaser(){
//        Text.get(1).click();
//    }
//
//    public void clickSpecificTextTeaser(String text) {
//        boolean elementFound = false;
//        for (WebElement option : Text) {
//            if (option.getText().contains(text)) {
//                option.click();
//                elementFound = true;
//                break;
//            }
//        }
//        Assert.assertTrue("Teaser text not found", elementFound);
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

//    public void clickOnFirstButton() throws InterruptedException {
//        Thread.sleep(2000);
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        WebElement jetztButton = (WebElement) jse.executeScript("return document.querySelector(\"body > div.ds2-mobilepreview.ds2-page--wrapper > main > div.ds2-main-wrapper.ds2-page--row-expanded > div:nth-child(3) > div > div > div.ds2-slider--main.ds2-stage-teaser--grid-layout.ds2-img-min-sizing-xxl > div.ds2-stage-teaser-item.ds2-stage-teaser-grid-mode.ds2-disclaimer--asterix-on.ds2-stage-teaser-number-0.ds2-stage-teaser-number-0.ds2-branded-bmwi.ds2-stage-teaser-item--link > div.partial-buttons.dark.hide-for-large-up.ds2-stage-teaser-secondary-button-white > div > ul > li > a > span\")");
//        jse.executeScript("arguments[0].click()", jetztButton);
//        //firstButton.click();
//    }

//    public void checkUrl (){
//        String url = "https://www.bmw.de/de/neufahrzeuge/bmw-i/i5/2023/bmw-i5.html";
//        Assert.assertTrue(url,true);
//    }


    public void scrollToTooltip() {
        ScrollUtils.scrollInToView(toolTip);
    }

//    public void clickOnTooltipInPage(){
//        toolTipButton.click();
//    }

//    public void checkTextToolTip(){
//        String infoText = "Abbildungen zeigen Sonderausstattung gegen Mehrpreis. Bei den Preisangaben handelt es sich um unverbindliche Empfehlungen des Herstellers inkl. 19% MwSt. und exklusive Überführungskosten. Änderungen und Irrtümer vorbehalten. Verbindliche Preisauskünfte gibt Ihnen gern Ihr BMW Partner.";
//        Assert.assertTrue(infoText, true);
//    }

//    public void closeToolTip() throws InterruptedException {
//        Thread.sleep(2000);
////        JavascriptExecutor jse = (JavascriptExecutor) driver;
////        WebElement closeToolTip = (WebElement) jse.executeScript("return document.querySelector(\"#qtip-187-content > div > div.ds2-tooltip-element--close > button > span\")");
////        jse.executeScript("arguments[0].click()", closeToolTip);
//        closeToolTip.click();
//    }

//    public void checkTooltipClosed (){
//        Assert.assertFalse(tooltipContainerClosed.isDisplayed());
//    }

    public void clickOnDropdown() throws InterruptedException {
        Thread.sleep(2000);
        dropdown.click();
    }

    public void selectBmwX5() throws InterruptedException {
        Thread.sleep(1000);

        for(WebElement element:carModels){
            if (element.getText().contains("BMW X5")){
                element.click();

                break;
            }
        }
    }

//    public void clickOnSearchButton() throws InterruptedException {
//        Thread.sleep(1000);
//        clickOnNewvagenButton.click();
//    }

//    public void checkTheLabel() throws InterruptedException {
//        Thread.sleep(1000);
//        Assert.assertTrue("checkLabel", true);
//    }

//    public void scrollToDesign() {
//        ScrollUtils.scrollInToView(designButton);
//    }
//
//    public void clickOnDesignButton() throws InterruptedException {
//        Thread.sleep(1000);
//        designButton.click();
//    }
//
//    public void clickOn3rdCar() throws InterruptedException {
//        Thread.sleep(2000);
//        boolean carElement = false;
//        for (WebElement element : carDesigns) {
//            if (element.equals(priza)) {
//                element.click();
//                carElement = true;
//                break;
//            }
//        }
//    }
}



