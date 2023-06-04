package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.LoginPage;
import testdata.User;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginTest extends BaseTests {
    @Test
    public void loginStandard() {
        User user = new User("user");
        LoginPage page = new LoginPage(driver);
        page.fillUsername(user.getUsername());
        page.fillPassword(user.getPassword());
        page.clickLogin();
        assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

    @Test
    public void loginFailed() {
        User user = new User("userInvalid");
        LoginPage page = new LoginPage(driver);
        page.fillUsername(user.getUsername());
        page.fillPassword(user.getPassword());
        page.clickLogin();
        String error = "Epic sadface: Username and password do not match any user in this service";
        assertEquals(error, page.getErrorMessage());
    }

    @Test
    public void missingData() {
        LoginPage page = new LoginPage(driver);
        page.clickLogin();
        String error = "Epic sadface: Username is required";
        assertEquals(error, page.getErrorMessage());
    }
    @Test
    public void lockedOutUser() {
        User user = new User("lockedOutUser");
        LoginPage page = new LoginPage(driver);
        page.fillUsername(user.getUsername());
        page.fillPassword(user.getPassword());
        page.clickLogin();
        String error = "Epic sadface: Sorry, this user has been locked out.";
        assertEquals(error, page.getErrorMessage());

    }

    @Test
    public void logOut() {
        User user = new User("user");
        LoginPage page = new LoginPage(driver);
        page.fillUsername(user.getUsername());
        page.fillPassword(user.getPassword());
        page.clickLogin();
        assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        page.clickBurgerMenu();
        page.clickLogout();
        assertTrue("Login button is displayed", page.checkLoginButton());
    }

}
