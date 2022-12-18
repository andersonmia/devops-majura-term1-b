package rca.ac.majuraterm1b;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEndTest {

    static WebDriver webDriver;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/mia/Downloads/installations/chromedriver-mac-arm64/chromedriver");
        webDriver = new ChromeDriver();
    }




    @Test
    public void testDoMath() {

        webDriver.get("http://localhost:8090/");

        webDriver.findElement(By.id("operand1")).sendKeys("1");
        webDriver.findElement(By.id("operand2")).sendKeys("2");

        Select operationDropdown = new Select(webDriver.findElement(By.id("operation")));
        operationDropdown.selectByValue("add");

        webDriver.findElement(By.name("calculate")).click();
        String result = webDriver.findElement(By.id("result")).getText();
        assert result.equals("3.0");
    }


    @AfterClass
    public static void tearDown(){
        webDriver.quit();
    }








}
