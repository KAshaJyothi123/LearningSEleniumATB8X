package com.thetestingacademy.ex04_28032025_SVG;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium0023_js_Demo
{

    @Test
    public void test_js_Demo()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;


        WebElement div_scroll=driver.findElement(By.xpath("//div[@id='userName']"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",div_scroll);

    }
}
