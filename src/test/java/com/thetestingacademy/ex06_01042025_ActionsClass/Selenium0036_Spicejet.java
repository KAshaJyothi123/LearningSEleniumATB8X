package com.thetestingacademy.ex06_01042025_ActionsClass;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium0036_Spicejet
{


    EdgeDriver driver;

    @BeforeTest
    public void open_browser()
    {
        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("guest");
        driver =new EdgeDriver(edgeOptions);
    }


    @Description("verify the speicejet")
    @Test
    public void test_actions()
    {
        String url="https://www.spicejet.com/";
        driver.get(url);
        driver.manage().window().maximize();

        WebElement source=driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));

        Actions action = new Actions(driver);
        action.moveToElement(source).click().sendKeys("BLR").build().perform();
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
        driver.quit();
    }
}
