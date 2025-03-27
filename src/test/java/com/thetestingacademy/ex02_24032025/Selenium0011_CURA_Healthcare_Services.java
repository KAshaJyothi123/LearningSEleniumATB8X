package com.thetestingacademy.ex02_24032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium0011_CURA_Healthcare_Services
{
    @Test
    public void test_method()
    {
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.manage().window().maximize();

        //Make Appionment
        WebElement appoinment=driver.findElement(By.id("btn-make-appointment"));
        appoinment.click();

        //username
        WebElement username=driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        //password
        WebElement password=driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        //login
        WebElement login=driver.findElement(By.id("btn-login"));
        login.click();

        //WebElement verify_currenturl=driver.findElement(By.xpath("//h2[text()='Make Appointment']"));
        //Verify the current url

        String currentUrl= driver.getCurrentUrl();
        String expectedurl="https://katalon-demo-cura.herokuapp.com/#appointment";

        Assert.assertEquals(currentUrl,expectedurl,"https://katalon-demo-cura.herokuapp.com/#appointment");

    }
}
