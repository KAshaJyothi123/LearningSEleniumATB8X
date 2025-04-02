package com.thetestingacademy.ex05_11032025_Actions_Windows.Iframe;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Selemium0026_Actions
{

    WebDriver driver;
    @Description("Verify the Actions ")
    @Test
    public void test_Actions() throws InterruptedException {
        driver= new ChromeDriver();
        String url = "https://awesomeqa.com/practice.html";
        driver.get(url);
        driver.manage().window().maximize();

        //First name by using Action class
        WebElement firstname= driver.findElement(By.xpath("//input[@name='firstname']"));

        Actions action = new Actions((driver));
        action.keyDown(Keys.SHIFT).sendKeys(firstname,"AshaHemanth")
                .keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(3000);
    }

    @AfterTest
    public void Close_browser()
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
