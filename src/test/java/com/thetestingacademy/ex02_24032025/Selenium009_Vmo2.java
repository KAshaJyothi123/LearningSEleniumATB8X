package com.thetestingacademy.ex02_24032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium009_Vmo2
{


    @Test
    public void test_method2()
    {


        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://app.vwo.com");

        //LinkText()
       // WebElement next_page=driver.findElement(By.linkText("Start a free trial"));
        //next_page.click();

        //partialLinkText
        WebElement next_page=driver.findElement(By.partialLinkText(" free trial"));
        next_page.click();


        //Free trial



        driver.quit();


    }
}
