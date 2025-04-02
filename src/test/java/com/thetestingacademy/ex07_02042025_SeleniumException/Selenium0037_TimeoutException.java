package com.thetestingacademy.ex07_02042025_SeleniumException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium0037_TimeoutException
{


    @Test
    public void test_method2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='abc']")));

        WebElement Search_inputbox= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

         Search_inputbox.sendKeys("thetestingacademcy"+ Keys.SHIFT);

    }
}
