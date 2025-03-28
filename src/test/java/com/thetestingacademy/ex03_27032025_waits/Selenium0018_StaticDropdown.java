package com.thetestingacademy.ex03_27032025_waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selenium0018_StaticDropdown
{
    @Test
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

       WebElement dropdown=driver.findElement(By.id("dropdown"));
        Select s=new Select(dropdown);
        //s.selectByValue("0");
        s.selectByIndex(1);
        s.selectByVisibleText("Option 2");




    }
}
