package com.thetestingacademy.ex07_02042025_SeleniumException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium0037_StaleElementReferenceException
{


    @Test
    public void test_method2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        WebElement Search_inputbox= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        driver.navigate().refresh();

        //if you want to fix the stateElementException refind the element after DOM Changes.
         Search_inputbox= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));


        Search_inputbox.sendKeys("thetestingacademcy"+ Keys.SHIFT);

    }
}
