package com.ecommerce.com.tests;

import com.ecommerce.com.utils.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class productBrowsingTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverSetup.getDriver();
        driver.get("https://www.demoblaze.com/");
    }

    @Test
    public void verifyProductsDisplayed() {
        // Assert that products are displayed on the homepage
        Assert.assertTrue(driver.findElement(By.className("hrefch")).isDisplayed());
    }

    @Test
    public void verifyProductCategories() {
        driver.findElement(By.linkText("Phones")).click();
        Assert.assertTrue(driver.findElement(By.className("hrefch")).isDisplayed());

        driver.findElement(By.linkText("Laptops")).click();
        Assert.assertTrue(driver.findElement(By.className("hrefch")).isDisplayed());

        driver.findElement(By.linkText("Monitors")).click();
        Assert.assertTrue(driver.findElement(By.className("hrefch")).isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        WebDriverSetup.closeDriver();
    }
}

