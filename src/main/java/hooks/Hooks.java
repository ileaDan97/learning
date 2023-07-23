package hooks;

import helpers.WebDriverTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp() {
        WebDriverTest.openBrowser();
    }

    @After
    public void teardown() {
        WebDriverTest.closeBrowser();
    }
}
