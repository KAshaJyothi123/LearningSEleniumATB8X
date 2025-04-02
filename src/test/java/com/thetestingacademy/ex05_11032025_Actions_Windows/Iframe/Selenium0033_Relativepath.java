package com.thetestingacademy.ex05_11032025_Actions_Windows.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Selenium0033_Relativepath

{


    @Test
    public  void test_verify()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        //toRightOf
        //LeftOf
        //AboveOf
        //below
        //near

        WebElement span_element=driver.findElement(By.xpath("//span[text()='Years of Experience']"));
        driver.findElement(with(By.id("exp-2")).toRightOf(span_element)).click();



    }


}
