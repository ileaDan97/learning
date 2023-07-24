package steps;

import baseTest.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class TrivagoSteps extends BaseTest {
    @Given("^The user navigates to Trivago page")
    public void navigateToTrivagoPage(){
        trivagoPage.navigateToTrivagoPage();
    }
    @And("^Accept cookies on Trivago page")
    public void acceptCookies() throws InterruptedException {
        trivagoPage.acceptCookies();
    }
    @And("^Click on search filed")
    public void clickOnSearchPlace(){
        trivagoPage.clickOnSearchPlace();
    }
    @And("^Search for a city and check if the city was selected")
    public void searchForRome(){
        trivagoPage.searchForRome();
    }
    @And("^Select a day from calendar")
    public void SelectDateFromCalendar(){
        trivagoPage.SelectDateFromCalendar();
    }
    @And("^Select 2 children from guest and room option")
    public void select2ChildrenFromOptionGuestAndRooms(){
        trivagoPage.select2ChildrenFromOptionGuestAndRooms();
    }
    @And("^Select age for the children")
    public void selectChildAge(){
        trivagoPage.selectChildAge();
    }
    @And("^Click on apply button")
    public void clickOnApplyButton(){
        trivagoPage.clickOnApplyButton();
    }

}
