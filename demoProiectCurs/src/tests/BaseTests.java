package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.InventoryPage;
import pages.LoginPage;
import testdata.URL;

import java.time.Duration;

public class BaseTests {
    static WebDriver driver;
    public static InventoryPage inventoryPage;
    public static LoginPage loginPage;

    @BeforeClass
    public static void setUp() {
    }
    @AfterClass
    public static void tearDown() {
    }
    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProjects\\demoProiectCurs\\src\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);

        driver.navigate().to(URL.LoginPage);


    }
    @After
    public void after() {
      //  driver.close();
    }
}



