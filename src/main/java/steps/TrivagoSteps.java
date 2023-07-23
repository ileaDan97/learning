package steps;

import baseTest.BaseTest;
import io.cucumber.java.en.Given;

public class TrivagoSteps extends BaseTest {
    @Given("^The user navigates to Trivago page")
    public void navigateToTrivagoPage(){
        trivagoPage.navigateToTrivagoPage();
    }
}
