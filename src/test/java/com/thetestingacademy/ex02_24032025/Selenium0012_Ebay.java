package com.thetestingacademy.ex02_24032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium0012_Ebay
{
    public void test_method()
    {
        EdgeOptions edgeoption = new EdgeOptions();
        edgeoption.addArguments("--start maximize");

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

        WebElement searchTitle=driver.findElement(By.id("gh-ac"));
    }


}
