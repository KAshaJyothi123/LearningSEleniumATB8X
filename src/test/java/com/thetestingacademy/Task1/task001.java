package com.thetestingacademy.Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class task001
{
     @Test
    public void test_method() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        WebElement firstname=driver.findElement(By.name("firstname"));
        firstname.sendKeys("K");
        Thread.sleep(3000);

        WebElement lastname=driver.findElement(By.name("lastname"));
        lastname.sendKeys("Asha");
         Thread.sleep(3000);

         WebElement gender=driver.findElement(By.id("sex-1"));
         gender.click();
         Thread.sleep(3000);

         WebElement experience = driver.findElement(By.id("exp-2"));
        experience.click();
         Thread.sleep(3000);

         WebElement date=driver.findElement(By.id("datepicker"));
        date.sendKeys("25/03/2025");
         Thread.sleep(3000);

         WebElement profession=driver.findElement(By.id("profession-1"));
        profession.click();
         Thread.sleep(3000);

         WebElement tool=driver.findElement(By.id("tool-2"));
        tool.click();
         Thread.sleep(3000);

         WebElement submit=driver.findElement(By.id("submit"));
         submit.click();

         driver.quit();


    }
}
