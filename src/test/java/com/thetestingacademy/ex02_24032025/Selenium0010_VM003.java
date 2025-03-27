package com.thetestingacademy.ex02_24032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium0010_VM003
{

    @Test
    public void test_method3()
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


        //Bussiness mail
        WebElement bussiness_mail=driver.findElement(By.id("page-v1-step1-email"));
        bussiness_mail.sendKeys("abcdef@123fkjdwv");

        //checkbox
        WebElement checkbox=driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        checkbox.click();

        //create freetrail
        List<WebElement> button_list=driver.findElements(By.tagName("button"));
        button_list.get(0).click();

        //Error Message
        WebElement error_message=driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");

        driver.quit();


    }
}
