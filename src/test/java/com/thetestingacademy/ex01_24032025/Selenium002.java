package com.thetestingacademy.ex01_24032025;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium002
{

  @Test
    public void testmethod2()
    {

            EdgeOptions edge = new EdgeOptions();
            edge.addArguments("--start maximized");
            edge.addArguments("--window-size=1920,1080");
           // edge.addArguments("--headless");
           // edge.addArguments("--incognito");

            EdgeDriver driver = new EdgeDriver(edge);
            driver.get("https://google.com");
           System.out.println(driver.getTitle());

           driver.close();
        }




}
