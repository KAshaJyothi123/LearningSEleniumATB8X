package com.thetestingacademy.ex03_27032025_waits;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class Selenium0017 {
}

//{
//
//    @Test
//    public void CheckingVisibility(WebDriver driver, By Locator)
//    {
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
//
//    }
//
//    public static WebElement checkingVisibilityFluentWait(WebDriver driver, By locator)
//   // {
//        FluentWait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(2))
//                .ignoring(NoSuchElementException.class);
//
//        WebElement error_message = wait.until(new Function<WebDriver, WebElement>() {
//            @Override
//            public WebElement apply(WebDriver webDriver) {
//                return driver.findElement(locator);
//            }
//        });

       // WebElement error_message = checkingVisibilityFluentWait(driver, By.className("notification-box-description"));

       // Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");
    //}

//}
