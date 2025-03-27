package com.thetestingacademy.ex01_24032025;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium001
{


    @Test
    public void test_selenium()
    {
        //Selenium 3
        //System.getProperty("WebDriver.gecko.driver","path/to/Firefoxdriver");

        //Selneium 4
        //FireFoxDriver
        FirefoxDriver driver= new FirefoxDriver();
        driver.get("https://app.vwo.com");

        //EdgeDriver
        EdgeDriver driver1 = new EdgeDriver();
        driver1.get("https://google.com");
    }
}
