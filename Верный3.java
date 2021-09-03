package Tets;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Верный3 {
    @Test
    public void Test1()
            throws InterruptedException{
        System.setProperty ("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname=aN1RFf]")).sendKeys( Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname=qCp9A]")).sendKeys( Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname=Pt8tGc]")).sendKeys( Keys.ENTER);
        TimeUnit.SECONDS.sleep(2);
        driver.quit();















    }

}