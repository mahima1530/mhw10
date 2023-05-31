package TestSuite_1;

import Browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPassword extends BaseTest {
    String baseUrl = " https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void test1() {
        //forgotPassword
    WebElement forgotButton=driver.findElement(By.linkText("forgotPassword"));
        forgotButton.click();


        //xpath----//tagname[@attribute='value']
        driver.findElement(By.xpath("//input[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"))
                .sendKeys("forgotPassword");
}
    @After
    public void tearDown() {
        CloseBrowser();
    }


}
