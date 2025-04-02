package com.thetestingacademy.ex05_11032025_Actions_Windows.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium0032_draganddrop
{

    @Test
    public void test_method()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();


        WebElement a= driver.findElement(By.id("column-a"));
        WebElement b= driver.findElement(By.id("column-b"));

        Actions action = new Actions(driver);
        action.dragAndDrop(a,b).build().perform();


        driver.quit();
    }
}
