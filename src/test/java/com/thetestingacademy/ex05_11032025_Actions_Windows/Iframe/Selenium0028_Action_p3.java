package com.thetestingacademy.ex05_11032025_Actions_Windows.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Selenium0028_Action_p3
{

    WebDriver driver;
    @Test
    public void test_Action_p3()
    {
        driver=new ChromeDriver();
        String url="https://www.makemytrip.com/";
        driver.get(url);
        driver.manage().window().maximize();

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //span[@data-cy='closeModal']")));

        driver.findElement(By.xpath(" //span[@data-cy='closeModal']")).click();

        WebElement fromCity=driver.findElement(By.xpath("//input[@id='fromCity']"));

        Actions action = new Actions(driver);
        action.moveToElement(fromCity).click().sendKeys("New Delhi").build().perform();


        List<WebElement> auto_list_Box=driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
        for(WebElement e:auto_list_Box)
        {
            if(e.getText().contains("New Delhi"))
            {
                e.click();
                break;
            }
        }


    }

    @AfterTest
    public void CloseBrowser()
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
