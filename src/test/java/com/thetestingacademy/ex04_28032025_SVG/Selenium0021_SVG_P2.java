package com.thetestingacademy.ex04_28032025_SVG;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

import java.util.List;

public class Selenium0021_SVG_P2
{

     @Description("verify that the tripura is in india  and click on it")
    @Test
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        System.out.println(driver.getTitle());


         List<WebElement> states=driver.findElements(By.xpath("//*[local-name()='svg']/*[local-name()='g'][7]/*[local-name()='g']/*[local-name()='g']/*[local-name()='path']"));
         for(WebElement state:states)
         {
             System.out.println(state.getAttribute("aria-label"));
             if (state.getAttribute("aria-label").contains("tripura"));
             state.click();
         }



    }
}
