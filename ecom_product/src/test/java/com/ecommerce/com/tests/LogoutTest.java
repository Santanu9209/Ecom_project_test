package com.ecommerce.com.tests;


import com.ecommerce.com.utils.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverSetup.getDriver();
        driver.get("https://www.demoblaze.com/");
        // Assume login here for logout testing
        driver.findElement(By.id("login2")).click();
        driver.findElement(By.id("loginusername")).sendKeys("validUser");
        driver.findElement(By.id("loginpassword")).sendKeys("validPass");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }

    @Test
    public void successfulLogout() {
        // Perform logout
        driver.findElement(By.id("logout2")).click();

        // Assert logout success
    }

    @AfterMethod
    public void tearDown() {
        WebDriverSetup.closeDriver();
    }
}

