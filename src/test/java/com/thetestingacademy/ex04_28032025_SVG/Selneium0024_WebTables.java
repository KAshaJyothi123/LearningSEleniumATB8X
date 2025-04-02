package com.thetestingacademy.ex04_28032025_SVG;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Selneium0024_WebTables
{
    WebDriver driver;
    @Description("verify the webTable")
    @Test
            public void Test_WebTable() {
        driver = new ChromeDriver();
        String url = "https://awesomeqa.com/webtable.html";
        driver.get(url);
        driver.manage().window().maximize();


        //Print all rows and colums
        int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        System.out.println(rows);
        System.out.println(columns);


        String  first_path="//table[@id='customers']/tbody/tr[";
        String second_path="]/td[";
        String third_path="]";

        for(int i=2;i<=rows;i++)
        {
            for (int j=1;j<=columns;j++)
            {
                String dynamic_path=first_path+i+second_path+j+third_path;
                String data=driver.findElement(By.xpath(dynamic_path)).getText();
                System.out.println(data);
            }
        }


    }
        @AfterTest
                public void close_browser()
        {
            try
            {
               Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();

        }



}
