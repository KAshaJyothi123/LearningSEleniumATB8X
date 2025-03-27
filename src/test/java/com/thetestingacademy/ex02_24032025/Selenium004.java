package com.thetestingacademy.ex02_24032025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium004
{
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        //Get
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        //getTitle()
        System.out.println(driver.getTitle());

        //getCurrentURL()
        System.out.println(driver.getCurrentUrl());

        //getpagesource
        System.out.println(driver.getPageSource());



        driver.close();
       // driver.quit();



    }
}
