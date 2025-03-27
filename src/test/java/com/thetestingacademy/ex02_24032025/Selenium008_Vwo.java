package com.thetestingacademy.ex02_24032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium008_Vwo {

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
            Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

            assertThat(error_message.getText()).isNotEmpty().isNotBlank().isEqualTo("Your email, password, IP address or location did not match");

            driver.quit();
        }
    }

