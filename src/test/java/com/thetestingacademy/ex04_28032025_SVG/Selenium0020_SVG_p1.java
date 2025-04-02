package com.thetestingacademy.ex04_28032025_SVG;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.util.List;

public class Selenium0020_SVG_p1
{
  WebDriver driver;
    @Description("verify that the after search ,result are Visible")
    @Test

    public void test_flipkart_search()
    {

        driver= new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        //Step 1:Enter the Macnmini in the inputbox
        driver.findElement(By.name("q")).sendKeys("macmini");



        //step 2: click on SVG element
        List<WebElement> svgElement=driver.findElements(By.xpath(""));
        svgElement.get(0).click();

        List<WebElement> titlesResults=driver.findElements(By.xpath(""));
        for(WebElement title:titlesResults)
        {
            System.out.println(title.getText());
        }
    }

    @AfterTest
    public void closeBrowser()
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
