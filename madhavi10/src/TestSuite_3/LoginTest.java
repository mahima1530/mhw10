package TestSuite_3;
//Project-4 - ProjectName : com-saucedemo-sw-2
//
//BaseUrl = https://www.saucedemo.com/
import Browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://www.saucedemo.com/ ";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void test1() {
        //Classname
        WebElement loginlink = driver.findElement(By.className("ico-login"));
        loginlink.click();


        //Id
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("standard_user");

        //Name
        WebElement passwordField = driver.findElement(By.name("password"));
        //driver.findElement(By.name("Password"));
        passwordField.sendKeys("secret_sauce");

        //linkTest
        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();


    }

    @After
public void tearDown() {
    CloseBrowser();
}
}
