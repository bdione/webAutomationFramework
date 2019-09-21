package home;


import Common.commonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testHome extends commonApi {
    @Test
    public void test(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Honey");
        driver.findElement(By.cssSelector(".nav-input")).click();
    }
}
