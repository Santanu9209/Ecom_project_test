package com.ecommerce.com.tests;

import com.ecommerce.com.utils.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class signUpTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverSetup.getDriver();
        driver.get("https://www.demoblaze.com/");
    }

    @Test
    public void positiveSignUpTest() {
        // Implement the positive sign-up test case
    }

    @Test
    public void negativeSignUpTest() {
        // Implement the negative sign-up test case
    }

    @AfterMethod
    public void tearDown() {
        WebDriverSetup.closeDriver();
    }
}
