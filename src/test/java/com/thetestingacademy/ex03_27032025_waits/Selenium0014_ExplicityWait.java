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

public class Selenium0014_ExplicityWait {

  @Test
    public void test_method1() throws InterruptedException {

            WebDriver driver = new EdgeDriver();
            driver.get("https://app.vwo.com");
            driver.manage().window().maximize();

            WebElement inputEmailAddress = driver.findElement(By.id("login-username"));
            inputEmailAddress.sendKeys("asha75k@gmail.com");

            WebElement inputPassword = driver.findElement(By.name("password"));
            inputPassword.sendKeys("Asha@87");

            WebElement signin = driver.findElement(By.id("js-login-btn"));
            signin.click();

            Thread.sleep(3000);

      WebElement error_message = driver.findElement(By.className("notification-box-description"));

      WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(3000));
      wait.until(ExpectedConditions.visibilityOf(error_message));
      wait.until(ExpectedConditions.textToBePresentInElement(error_message,"Your email, password, IP address or location did not match"));

            //WebElement error_message = driver.findElement(By.className("notification-box-description"));
            Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

            assertThat(error_message.getText()).isNotEmpty().isNotBlank().isEqualTo("Your email, password, IP address or location did not match");

            driver.quit();
        }
    }

