package com.thetestingacademy.ex02_24032025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Selenium007
{
    public static void main(String[] args) {

        EdgeOptions edge= new EdgeOptions();
        edge.addArguments("--start maximize");

        WebDriver driver = new EdgeDriver(edge);

        // driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        //TestNG Assertions
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");

        //Assertj Assertion
       // assertThat(driver.getTitle().isNotBlank())
    }
}
