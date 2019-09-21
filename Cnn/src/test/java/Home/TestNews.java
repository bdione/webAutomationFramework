package Home;

import Common.commonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNews  extends commonApi {
    @Test
    public void test(){
        //driver.findElement(By.id("")).sendKeys(");
        driver.findElement(By.xpath("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[4]/a")).click();
    }

}
