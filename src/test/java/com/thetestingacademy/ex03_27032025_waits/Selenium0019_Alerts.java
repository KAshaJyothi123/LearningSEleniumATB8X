package com.thetestingacademy.ex03_27032025_waits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Selenium0019_Alerts
{
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();


        //Alerts
        //1.Alert
        //2.Confirmation
        //3.Promot

        //Alert
//        WebElement element=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
//        element.click();
//        Alert alert=driver.switchTo().alert();
//        alert.accept();
//
//        String result=driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(result,"You successfully clicked an alert");


        //Confirmation Alert
//        WebElement confirmation= driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
//        confirmation.click();
//
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        //alert.dismiss();
//
//        String result=driver.findElement(By.id("result")).getText();
//            Assert.assertEquals(result,"You clicked: Ok");
        //Assert.assertEquals(result,"You clicked: Cancel");


        //Prompt Alert
        WebElement element=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        element.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert=driver.switchTo().alert();
        alert.sendKeys("asha");
        alert.accept();

        String result= driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You entered: asha");

        driver.quit();


    }

}
