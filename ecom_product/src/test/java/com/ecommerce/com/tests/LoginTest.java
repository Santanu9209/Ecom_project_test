package com.ecommerce.com.tests;

import com.ecommerce.com.utils.WebDriverSetup;
import com.ecommerce.com.utils.DataProviderClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverSetup.getDriver();
        driver.get("https://www.demoblaze.com/");
    }

    @Test(dataProvider = "loginData", dataProviderClass = DataProviderClass.class)
    public void loginTest(String username, String password) {
        driver.findElement(By.id("login2")).click();
        driver.findElement(By.id("loginusername")).sendKeys(username);
        driver.findElement(By.id("loginpassword")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        // Add a wait here to handle any delays
        // Assert login success or failure based on username/password
    }

    @AfterMethod
    public void tearDown() {
        WebDriverSetup.closeDriver();
    }
}

