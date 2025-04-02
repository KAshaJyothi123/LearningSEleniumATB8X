package com.thetestingacademy.ex05_11032025_Actions_Windows.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium0031_fileuploading
{

    @Test
    public void verify_Fileupload()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");
        driver.manage().window().maximize();

        WebElement uploadFileInput =driver.findElement(By.id("fileToUpload"));

        String  dir=System.getProperty("user.dir");
        System.out.println(dir);

        uploadFileInput.sendKeys("C:\\Users\\ashajk\\IdeaProjects\\LearningSEleniumATB8X\\src\\test\\java\\com\\thetestingacademy\\ex05_11032025_Actions_Windows\\Iframe\\Hello.txt");
        driver.findElement(By.name("submit")).click();
    }
}
