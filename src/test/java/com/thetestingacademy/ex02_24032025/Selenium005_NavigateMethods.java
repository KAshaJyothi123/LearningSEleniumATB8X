package com.thetestingacademy.ex02_24032025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium005_NavigateMethods
{
    public static void main(String[] args) {




        WebDriver driver= new FirefoxDriver();

        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.navigate().to("https://google.com");

        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().refresh();

        driver.quit();


        //driver.close();
    }
}
