package Tets;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Верный1 {
    @Test
    public void Test1()
            throws InterruptedException{
        System.setProperty ("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname=j93WEe]")).sendKeys( Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname=N10B9]")).sendKeys( Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname=XSr6wc]")).sendKeys( Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname=lVjWed]")).sendKeys( Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname=qCp9A]")).sendKeys( Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname=YovRWb]")).sendKeys( Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname=KN1kY]")).sendKeys( Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname=pPHzQc]")).sendKeys( Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname=xAP7E]")).sendKeys( Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname=bkEvMb]")).sendKeys( Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname=WxTTNd]")).sendKeys( Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname=Ax5wH]")).sendKeys( Keys.ENTER);
        driver.findElement(By.cssSelector("div [jsname=Pt8tGc]")).sendKeys( Keys.ENTER);
        TimeUnit.SECONDS.sleep(2);
        driver.quit();















    }

}

