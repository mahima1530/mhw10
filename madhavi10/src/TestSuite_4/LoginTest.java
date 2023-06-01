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
        driver.findElement(By.xpath("//a[text()='sign-in']")).click();
        //welcome page
        WebElement welcomelink = driver.findElement(By.xpath("//li[@class='header__nav-item header__nav-sign-in']artical/h2"));
        welcomelink.click();


        //Id invalid email
        WebElement emailField = driver.findElement(By.xpath("//input[@id='user[email]']"));
        emailField.sendKeys("codebuster@gmail.com");

        //pw invalid password
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='user[password]']"));
        //driver.findElement(By.name("Password"));
        passwordField.sendKeys("123456");

        //linkTest
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='submit']"));
        loginButton.click();

        //error massage
                //Invalid email or password.
        WebElement loginerror = driver.findElement(By.xpath("//input[@class=sign-in-page ]div[7]/ul/li"));
        loginerror.click();

    }
    @After
    public void tearDown() {
        CloseBrowser();
    }
}


