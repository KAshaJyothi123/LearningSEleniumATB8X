package com.thetestingacademy.ex02_24032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium0013_cdpn
{

    @Test
    public void test_methods() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://cdpn.io/AbdullahSajjad/fullpage/LYGVRgK?anon=true&view=fullpage");
        driver.manage().window().maximize();


        driver.switchTo().frame("result");
        WebElement submit= driver.findElement(By.xpath("//button[text()='Submit']"));
        submit.click();

        Thread.sleep(3000);

        //error message
        String input_username="//input[@id='username']";
        String small_path=input_username+"/following-sibling::small";
        String label_path=input_username+"/preceding-sibling::label";

        WebElement error_message_tag=driver.findElement(By.xpath(small_path));
        WebElement label_tage= driver.findElement(By.xpath(label_path));

        Assert.assertEquals(error_message_tag.getText(),"Username must be at least 3 characters");



    }
}
