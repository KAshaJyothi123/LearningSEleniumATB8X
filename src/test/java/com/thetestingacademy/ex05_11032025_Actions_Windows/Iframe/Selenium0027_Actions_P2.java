package com.thetestingacademy.ex05_11032025_Actions_Windows.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class Selenium0027_Actions_P2 {
    WebDriver driver;

    @Test
    public void test_Actions_p2() {
        driver = new ChromeDriver();
        String url = "https://www.spicejet.com/";
        driver.get(url);
        driver.manage().window().maximize();


        WebElement source = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));
        Actions action = new Actions(driver);
        //action.moveToElement(source).click().build().perform();
        action.moveToElement(source).click().sendKeys("BLR").build().perform();
    }

    @AfterTest
    public void close_browser()
    {
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
