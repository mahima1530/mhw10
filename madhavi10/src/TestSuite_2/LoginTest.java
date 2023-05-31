package TestSuite_2;
//Project-3 - ProjectName : com-herokuapp-sw-2
//BaseUrl = http://the-internet.herokuapp.com/login

import Browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginTest extends BaseTest {
    String baseUrl = "http://the-internet.herokuapp.com/login ";

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
        usernameField.sendKeys("tomsmith");

        //Name
        WebElement passwordField=driver.findElement(By.name("password"));
        //driver.findElement(By.name("Password"));
        passwordField.sendKeys("SuperSecretPassword!");

        //linkTest
        WebElement loginButton=driver.findElement(By.linkText(" Login"));
        loginButton.click();


        WebElement usernamefield = driver.findElement(By.id("username"));
        usernamefield.sendKeys("tomsmithl");

        //Name
        WebElement passwordfield=driver.findElement(By.name("password"));
        //driver.findElement(By.name("Password"));
        passwordfield.sendKeys("SuperSecretPassword!");
        //login error
        WebElement loginerror = driver.findElement(By.linkText("your username invalid"));
        loginerror.click();

        WebElement Usernamefield = driver.findElement(By.id("username"));
        Usernamefield.sendKeys("tomsmithl");

        //Name
        WebElement Passwordfield=driver.findElement(By.name("password"));
        //driver.findElement(By.name("Password"));
        Passwordfield.sendKeys("SuperSecretPassword!");
        //login error
        WebElement Loginerror = driver.findElement(By.linkText("your password is incorrect"));
        Loginerror.click();


    }
    @After
    public void tearDown() {
        CloseBrowser();
    }

}






