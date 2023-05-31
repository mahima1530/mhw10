package TestSuite;

import Browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

//4. Write down the following test into ‘TopMenuTest’ class
public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void test1() {
        //chained xpath
        driver.findElement(By.xpath(" //ul[@class'top-menu notmobile'//li//a[text()=' computers']"))
                .click();

        //chained xpath
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'//li[2]//a[text() =' electronics']"))
        .click();

        //chained xpath
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'//li[3]//a[text()='Apparel ']"))
                .click();
        //chained xpath
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'//li[4]//a[text()='Digital downloads ']"))
                .click();
        //chained xpath
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'//li[5]//a[text()='Books ']"))
                .click();
        //chained xpath
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'//li[6]/a[text()='Jewelry ']"))
                .click();
        //chained xpath
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile'//li[7]//a[text()='Gift Cards ']"))
                .click();
    }

    @After
    public void tearDown() {
        CloseBrowser();
    }

    }
