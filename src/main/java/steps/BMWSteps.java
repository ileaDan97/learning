package steps;

import baseTest.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BMWSteps extends BaseTest {
    @Given("^The user navigates to BmwHomePage")
    public void navigateToBmwHomePage() {
        bmwHomePage.navigateToBmwHomePage();
    }

    @And("^Accept cookies BMW$")
    public void acceptCookies() throws InterruptedException {
        bmwHomePage.acceptCookies();
    }

    @And("^Click on i model")
    public void iModel() throws InterruptedException {
        bmwHomePage.iModel();
    }

    @And("^Click on iX car")
    public void IModel() throws InterruptedException {
        bmwHomePage.iXCar();
    }

    @Then("^Check bmw page")
    public void iXPage() throws InterruptedException {
        bmwHomePage.iXPage();
    }

//    @And("^Scroll down in page")
//    public void scrollToTeaser() {
//        bmwHomePage.scrollToTeaser();
//    }
//
//    @And("^Print text")
//    public void listContainer(){
//        bmwHomePage.listContainer();
//    }

//    @And("^Click on Jetzt entdecken button")
//    public void clickOnFirstButton() throws InterruptedException {
//        bmwHomePage.clickOnFirstButton();
//    }

//    @And("^Check url")
//    public void checkUrl (){
//        bmwHomePage.checkUrl();
//    }

    @And("^scroll down to tooltip")
    public void ScrollToDisclaimer() {
        bmwHomePage.scrollToTooltip();
    }

//    @And("^click on tooltip")
//    public void clickOnTooltipInPage() {
//        bmwHomePage.clickOnTooltipInPage();
//    }
//
//    @And("^check the text")
//    public void checkTextToolTip() {
//        bmwHomePage.checkTextToolTip();
//    }
//
//    @And("^close the tooltip")
//    public void closeToolTip() throws InterruptedException {
//        bmwHomePage.closeToolTip();
//    }

//    @And("^check that the tooltip is closed")
//    public void checkTooltipClosed() {
//        bmwHomePage.checkTooltipClosed();
//    }

    @And("^click on dropdown")
    public void clickOnDropdown() throws InterruptedException {
        bmwHomePage.clickOnDropdown();
    }

    @And("^click on bmwx5")
    public void selectBmwX5() throws InterruptedException {
        bmwHomePage.selectBmwX5();
    }
//
//    @And("^click on search car")
//    public void clickOnSearchButton() throws InterruptedException {
//        bmwHomePage.clickOnSearchButton();
//    }

//    @And("^check the x5 label")
//    public void checkTheLabel() throws InterruptedException {
//        bmwHomePage.checkTheLabel();
//    }

//    @And("^scroll to design button")
//    public void scrollToDesign(){
//        bmwHomePage.scrollToDesign();
//    }
//
//    @And("^click on designs")
//    public void clickOnDesignButton() throws InterruptedException {
//        bmwHomePage.clickOnDesignButton();
//    }
//
//    @And("^click on 3rd car with the charger img")
//    public void clickOn3rdCar() throws InterruptedException {
//        bmwHomePage.clickOn3rdCar();
//    }



}
