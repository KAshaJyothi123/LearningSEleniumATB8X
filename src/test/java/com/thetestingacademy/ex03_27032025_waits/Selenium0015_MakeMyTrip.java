package com.thetestingacademy.ex03_27032025_waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class Selenium0015_MakeMyTrip {

  @Test
    public void test_method1() throws InterruptedException {

            WebDriver driver = new EdgeDriver();
            driver.get("https://www.makemytrip.com/");
            driver.manage().window().maximize();

            WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(3000));
    WebElement close_modal=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

//WebElement close_modal= driver.findElement(By.xpath("//span[@class='commonModal__close']"));
close_modal.click();

            driver.quit();
        }
    }

