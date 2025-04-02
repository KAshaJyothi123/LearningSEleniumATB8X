package com.thetestingacademy.ex04_28032025_SVG;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium0025_WebTables_Dynamic
{

    WebDriver driver;
    @Description("Verify the Dynamic webtables")
    @Test
    public void test_sample_dynamic() {
        driver = new ChromeDriver();
        String url = "https://awesomeqa.com/webtable1.html";
        driver.get(url);
        driver.manage().window().maximize();

        //Find the xpath for webTable
        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']"));

        //Find out rows and columns in webTable
        List<WebElement> rows_table = table.findElements(By.tagName("tr"));
        for (int i = 0; i < rows_table.size(); i++) {
            List<WebElement> columns_tables = rows_table.get(i).findElements(By.tagName("td"));
            for (WebElement c : columns_tables) {
                System.out.println(c.getText());
            }
        }
    }

        @AfterTest
                public void open_browser()
        {
            try
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            driver.quit();
        }



}
