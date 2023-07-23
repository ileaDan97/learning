package baseTest;

import helpers.WebDriverTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BMW_HomePage;
import pages.TrivagoPage;



public class BaseTest {

    public BaseTest() {
        initPages(WebDriverTest.getDriver());
    }

    protected BMW_HomePage bmwHomePage;
    protected TrivagoPage trivagoPage;

    public void initPages(WebDriver driver) {
        bmwHomePage = new BMW_HomePage();
        PageFactory.initElements(driver, bmwHomePage);
        trivagoPage = new TrivagoPage();
        PageFactory.initElements(driver, trivagoPage);
    }
}

