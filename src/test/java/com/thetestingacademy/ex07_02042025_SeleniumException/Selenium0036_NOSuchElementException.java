package com.thetestingacademy.ex07_02042025_SeleniumException;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium0036_NOSuchElementException
{


    @Description("verify the NoSuchElementException")
    @Test
    public void test_Method1()
    {
        WebDriver driver= new ChromeDriver();
        String url="https://app.vwo.com/#/login";
        driver.get(url);
        driver.manage().window().maximize();


        WebElement username=driver.findElement(By.id("Asha"));
        username.sendKeys("Asha");
    }



}
