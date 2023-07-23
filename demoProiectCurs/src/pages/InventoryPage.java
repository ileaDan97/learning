package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InventoryPage {
    WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    //locator
    private By firstButton = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    private By removeButton = By.xpath("//button[@id='remove-sauce-labs-backpack']");
    private By firstContainer = By.xpath("//a[@id='item_4_img_link']");

    private By priceItem = By.xpath("//div[@class='inventory_details_price']");
    private By cart = By.xpath("//div[@id='shopping_cart_container']");

    private By cartItem = By.xpath("//a[@id='item_4_title_link']");

    private By checkoutButton = By.xpath("//button[@id='checkout']");

    private By firstNameCheckout = By.xpath("//input[@id='first-name']");
    private By lastNameCheckout = By.xpath("//input[@id='last-name']");

    private By zipCodeCheckout = By.xpath("//input[@id='postal-code']");

    private By continueButton = By.xpath("//input[@id='continue']");

    private By labelValues = By.xpath("//div[@class='summary_value_label']");

    private By finishButton = By.xpath("//button[@id='finish']");

    private By checkOrderText = By.xpath("//h2[@class='complete-header']");
    private By backHomeButton = By.xpath("//button[@id='back-to-products']");

    private By filterDropdown = By.xpath("//select[@class='product_sort_container']");

    private By azElements = By.xpath("//div[@class='inventory_item']");

    private By fragmentTitle = By.xpath(".//div[@class='inventory_item_name']");
    private By containerItem = By.xpath("//div[@class='inventory_item']");
    private By titleItem = By.xpath(".//div[@class='inventory_item_name']");
    private By imgItem = By.xpath(".//img[@class='inventory_item_img']");

    public void addToCartItems() {
        driver.findElement(firstButton).click();
    }

    public void clickOnFirstContainer() {
        driver.findElement(firstContainer).click();
    }

    public void removeItem() {
        driver.findElement(removeButton).click();
    }

    public void clickOnCart() {
        driver.findElement(cart).click();
    }

    public String getDescription() {
        return driver.findElement(priceItem).getText();
    }

    public String getCartItemText() {
        return driver.findElement(cartItem).getText();
    }

    public void clickOnCheckoutButton() {
        driver.findElement(checkoutButton).click();
    }

    public void firstNameField() {
        driver.findElement(firstNameCheckout).sendKeys("abcde");
    }

    public void lastNameField() {
        driver.findElement(lastNameCheckout).sendKeys("qwerty");
    }

    public void postalCode() {
        driver.findElement(zipCodeCheckout).sendKeys("12345");
    }

    public void clickOnContinueButton() {
        driver.findElement(continueButton).click();
    }

    public String getElement(int index) {
        List<WebElement> elements = driver.findElements(labelValues);
        return elements.get(index).getText();
    }

    public void clickOnFinishButton() {
        driver.findElement(finishButton).click();
    }

    public String checkConfirmationOrder() {
        return driver.findElement(checkOrderText).getText();
    }

    public void clickOnBackHome() {
        driver.findElement(backHomeButton).click();
    }

    public void selectBy(String name) {
        Select select = new Select(driver.findElement(filterDropdown));
        select.selectByValue(name);
    }

    public String getNameByIndex(int index) {
        List<WebElement> elements = driver.findElements(azElements);
        WebElement item = elements.get(index);
        WebElement title = item.findElement(fragmentTitle);
        return title.getText();
    }

    public void selectItem(){
        List<WebElement> elements = driver.findElements(containerItem);
        for (WebElement element:elements){
            WebElement title = element.findElement(titleItem);
            if(title.getText().contains("Sauce Labs Fleece Jacket")){
                WebElement img = element.findElement(imgItem);
                System.out.println(img);
                img.click();
                break;
            }
        }
    }
}
