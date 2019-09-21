package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class commonApi {
    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url){
        System.setProperty("webdriver.chrome.driver", "/Users/Babacar/IdeaProjects/salenium123/driver/chromedriver");
        driver = new ChromeDriver();
        driver. manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }
    @Test
    public void test1(){
        String title = driver.getTitle();
        Assert.assertEquals("Amazon search suggestions", title);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pizza", Keys.ENTER);
        driver.findElement(By.cssSelector(".nav-input")).click();
    }

    @Test
    public void test2(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Honey");
        driver.findElement(By.cssSelector(".nav-input")).click();
    }
    @AfterMethod
    public void cleanUp(){
        driver.close();
    }


}
