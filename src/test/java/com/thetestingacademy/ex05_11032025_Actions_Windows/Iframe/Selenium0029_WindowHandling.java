package com.thetestingacademy.ex05_11032025_Actions_Windows.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Selenium0029_WindowHandling {


    @Test
    public void test_WindowHandling()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        //Get windowHandle
        String parentWindow= driver.getWindowHandle();
        System.out.println("Parent window Handling:" +parentWindow);

        //Get windowHandling
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> getwindowHandles=driver.getWindowHandles();
        System.out.println(getwindowHandles);
        for(String handle :getwindowHandles)
        {
           driver.switchTo().window(handle);
           if(driver.getPageSource().contains("New Window"))
           {
               System.out.println("Testcase Passed");
           }
        }

     driver.quit();

    }
}
