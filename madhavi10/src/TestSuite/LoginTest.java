package TestSuite;
//BaseUrl = https://demo.nopcommerce.com/

import Browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void test1() {

        //Classname
        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();


        //Id
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("codebuster@gmail.com");

        //Name
        WebElement passwordField = driver.findElement(By.name("Password"));
        //driver.findElement(By.name("Password"));
        passwordField.sendKeys("123456");

        //linkTest
        WebElement loginButton = driver.findElement(By.linkText("Log in"));
        loginButton.click();


        WebElement logoutButton = driver.findElement(By.linkText("Log out"));
        logoutButton.click();

        WebElement loginlink = driver.findElement(By.className("ico-login"));
        loginlink.click();

        //Id
        WebElement emailfield = driver.findElement(By.id("Email"));
        emailfield.sendKeys("codebusterrr@gmail.com");

        //Name
        WebElement passwordfield = driver.findElement(By.name("Password"));
        //driver.findElement(By.name("Password"));
        passwordfield.sendKeys("5678910");

        //login error
        WebElement loginerror = driver.findElement(By.linkText("Log in"));
        loginerror.click();

    }


    @After
    public void tearDown() {
        CloseBrowser();
    }


}






