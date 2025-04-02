package com.thetestingacademy.ex06_01042025_ActionsClass;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium0035
{

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser()
    {
        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver=new EdgeDriver(edgeOptions);
    }

    @Description("Verify the Action Class")
    @Test
    public void test_verify()
    {
      String url="https://awesomeqa.com/practice.html";
      driver.get(url);
      driver.manage().window().maximize();

        WebElement firstname=driver.findElement(By.name("firstname"));
        WebElement lastname=driver.findElement(By.name("lastname"));

        Actions action = new Actions(driver);
        action.click(firstname).
                keyDown(Keys.SHIFT)
                .sendKeys("Karri")
                .keyUp(Keys.SHIFT).build().perform();


        action.click(lastname).
                keyDown(Keys.SHIFT)
                .sendKeys("jyothi")
                .keyUp(Keys.SHIFT).build().perform();
    }

    @AfterTest
    public void close_browser()
    {
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
       // driver.quit();
    }


}
