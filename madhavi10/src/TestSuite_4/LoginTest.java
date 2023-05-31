package TestSuite_4;
//Project-5 - ProjectName : com-utimateqa-sw-2
//BaseUrl = https://courses.ultimateqa.com/

import Browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://courses.ultimateqa.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void test1() {

        //Classname
        WebElement signinLink = driver.findElement(By.className("sign-in"));
        signinLink.click();


        //Id invalid email
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("codebuster@gmail.com");

        //pw invalid password
        WebElement passwordField = driver.findElement(By.name("Password"));
        //driver.findElement(By.name("Password"));
        passwordField.sendKeys("123456");

        //linkTest
        WebElement loginButton = driver.findElement(By.linkText("Log in"));
        loginButton.click();



    }
    @After
    public void tearDown() {
        CloseBrowser();
    }
}


