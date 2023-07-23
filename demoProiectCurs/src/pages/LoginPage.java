package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    static WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By usernameField = By.xpath("//input[@id='user-name']");
    private By passwordFiled = By.xpath("//input[@id='password']");
    private By loginClick = By.xpath("//input[@id='login-button']");

    private By errorInvalidUser = By.xpath("//h3[@data-test='error']");

    private By burgerMenu = By.xpath("//button[@id='react-burger-menu-btn']");
    private By logoutButton = By.xpath("//a[@id='logout_sidebar_link']");



    public void fillUsername(String nume) {
        driver.findElement(usernameField).sendKeys(nume);
    }

    public void fillPassword(String pass) {
        driver.findElement(passwordFiled).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginClick).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorInvalidUser).getText();
    }

    public void clickBurgerMenu() {
        driver.findElement(burgerMenu).click();
    }

    public void clickLogout() {
        driver.findElement(logoutButton).click();
    }

    public boolean checkLoginButton(){
       return driver.findElement(loginClick).isDisplayed();
    }


}
