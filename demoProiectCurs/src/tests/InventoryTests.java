package tests;

import com.beust.ah.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import pages.InventoryPage;
import pages.LoginPage;
import testdata.User;

import java.util.List;

public class InventoryTests extends BaseTests{

    private void login (){
        User user = new User("user");
        LoginPage page = new LoginPage(driver);
        page.fillUsername(user.getUsername());
        page.fillPassword(user.getPassword());
        page.clickLogin();
    }

    @Test
    public void addToCart (){
        login();
        InventoryPage inventorypage = new InventoryPage(driver);
        inventorypage.addToCartItems();
        inventorypage.removeItem();
    }

    @Test
    public void bookingTest(){
        login();
        InventoryPage inventorypage = new InventoryPage(driver);
        inventorypage.clickOnFirstContainer();
        String price = "$29.99";
        Assert.assertEquals(price,inventorypage.getDescription());
        inventorypage.addToCartItems();
        inventorypage.clickOnCart();
        String itemText ="Sauce Labs Backpack";
        Assert.assertEquals(itemText, inventorypage.getCartItemText());
        inventorypage.clickOnCheckoutButton();
        inventorypage.firstNameField();
        inventorypage.lastNameField();
        inventorypage.postalCode();
        inventorypage.clickOnContinueButton();
        String firstLabel = "SauceCard #31337";
        String secondLabel = "Free Pony Express Delivery!";
        Assert.assertEquals(firstLabel, inventorypage.getElement(0));
        Assert.assertEquals(secondLabel, inventorypage.getElement(1));
        inventorypage.clickOnFinishButton();
        String checkConfirmationOrder = "Thank you for your order!";
        Assert.assertEquals(checkConfirmationOrder,inventorypage.checkConfirmationOrder());
        inventorypage.clickOnBackHome();
    }

    @Test
    public void filtersZA(){
        login();
        InventoryPage inventorypage = new InventoryPage(driver);
        inventorypage.selectBy("za");
        String titles[] = {"Test.allTheThings() T-Shirt (Red)", "Sauce Labs Onesie", "Sauce Labs Fleece Jacket", "Sauce Labs Bolt T-Shirt", "Sauce Labs Bike Light", "Sauce Labs Backpack"};
        for(int i = 0; i < titles.length; i++) {
            Assert.assertEquals(titles[i], inventorypage.getNameByIndex(i));
        }
    }
    @Test
    public void filtersAZ(){
        login();
        InventoryPage inventorypage = new InventoryPage(driver);
        inventorypage.selectBy("az");
        String titles[] = {"Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt", "Sauce Labs Fleece Jacket", "Sauce Labs Onesie", "Test.allTheThings() T-Shirt (Red)"};
        for(int i = 0; i < titles.length; i++) {
            Assert.assertEquals(titles[i], inventorypage.getNameByIndex(i));
        }
    }
    @Test
    public void filtersPriceLowToHigh(){
        login();
        InventoryPage inventorypage = new InventoryPage(driver);
        inventorypage.selectBy("lohi");
        String titles[] = {"Sauce Labs Onesie", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt", "Test.allTheThings() T-Shirt (Red)", "Sauce Labs Backpack", "Sauce Labs Fleece Jacket"};
        for(int i = 0; i < titles.length; i++) {
            Assert.assertEquals(titles[i], inventorypage.getNameByIndex(i));
        }
    }
    @Test
    public void filtersHighToLow(){
        login();
        InventoryPage inventorypage = new InventoryPage(driver);
        inventorypage.selectBy("hilo");
        String titles[] = {"Sauce Labs Fleece Jacket", "Sauce Labs Backpack", "Sauce Labs Bolt T-Shirt", "Test.allTheThings() T-Shirt (Red)", "Sauce Labs Bike Light", "Sauce Labs Onesie"};
        for(int i = 0; i < titles.length; i++) {
            Assert.assertEquals(titles[i], inventorypage.getNameByIndex(i));
        }
    }
    @Test
    public void clickOnSauceLabsFleeceJacket (){
        login();
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.selectItem();
    }

}
