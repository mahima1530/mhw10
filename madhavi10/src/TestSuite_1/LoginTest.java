package TestSuite_1;

import Browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Project-2 - ProjectName : com-orangehrmlive-sw-2
//BaseUrl = https://opensource-demo.orangehrmlive.com/
public class LoginTest extends BaseTest {
    String baseUrl = " https://opensource-demo.orangehrmlive.com/";

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
        usernameField.sendKeys("Admin");

        //Name
        WebElement passwordField=driver.findElement(By.name("Password"));
        //driver.findElement(By.name("Password"));
        passwordField.sendKeys("admin123");

        //linkTest
        WebElement loginButton=driver.findElement(By.linkText("log in"));
        loginButton.click();
    }
    @After
    public void tearDown() {
        CloseBrowser();
    }

}




