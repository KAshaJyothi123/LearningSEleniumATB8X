package com.thetestingacademy.ex02_24032025;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium006_Dimension
{

    public static void main(String[] args) {

        //Open the browser
        //Delete all cookies
        //Set size of the window
        //set position of the window
        //maximize the window
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        driver.manage().deleteAllCookies();

        Dimension d= new Dimension(500,500);
        driver.manage().window().getSize();

        Point p = new Point(250,250);
        driver.manage().window().getPosition();

        driver.manage().window().maximize();


    }
}
