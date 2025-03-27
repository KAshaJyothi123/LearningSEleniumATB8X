package com.thetestingacademy.Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task002_Idrive
{
    @Test
    public void test_method() throws InterruptedException {
        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("--start maximize");

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.idrive360.com/enterprise/login");

        WebElement input_username=driver.findElement(By.xpath("//input[@id='username']"));
        input_username.sendKeys("augtest_040823@idrive.com");
        Thread.sleep(3000);

        WebElement input_password= driver.findElement(By.xpath("//input[contains(@id,'username')]"));
        input_password.sendKeys("123456");
        Thread.sleep(3000);

        WebElement signin= driver.findElement(By.xpath("//button[contains(text(),\"Sign in\")]"));
        signin.click();
        Thread.sleep(3000);

        WebElement text_errormessage= driver.findElement(By.xpath("//h5[text()='Your free trial has expired']"));
        Assert.assertEquals(text_errormessage.getText(),"Your free trial has expired");
    }
}
