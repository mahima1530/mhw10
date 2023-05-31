package TestSuite;

import Browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

        @Test
        public void test1() {
            // css selector----tagname[attribute='value']
            // driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("mobile");

            //tagname#id
            //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("mobile");

            //tagname.class
            driver.findElement(By.cssSelector("a.ico-register")).click();


        }

        @After
        public void tearDown() {
            CloseBrowser();
        }
    }




