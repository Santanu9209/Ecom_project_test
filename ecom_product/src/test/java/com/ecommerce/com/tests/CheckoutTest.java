package com.ecommerce.com.tests;


import com.ecommerce.com.utils.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckoutTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverSetup.getDriver();
        driver.get("https://www.demoblaze.com/");
    }

    @Test
    public void successfulCheckout() {
        // Add product to cart first
        driver.findElement(By.linkText("Next")).click();
        driver.findElement(By.xpath("(//a[@class='hrefch'])[last()]")).click();
        driver.findElement(By.xpath("//a[text()='Add to cart']")).click();

        // Proceed to cart and checkout
        driver.findElement(By.id("cartur")).click();
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();

        // Fill in checkout details and confirm
        driver.findElement(By.id("name")).sendKeys("Test User");
        driver.findElement(By.id("country")).sendKeys("Country");
        driver.findElement(By.id("city")).sendKeys("City");
        driver.findElement(By.id("card")).sendKeys("123456789");
        driver.findElement(By.id("month")).sendKeys("12");
        driver.findElement(By.id("year")).sendKeys("2024");
        driver.findElement(By.xpath("//button[text()='Purchase']")).click();

        // Assert checkout success
    }

    @Test
    public void checkoutWithoutAddingProduct() {
        driver.findElement(By.id("cartur")).click();
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();

        // Assert error or unsuccessful checkout
    }

    @AfterMethod
    public void tearDown() {
        WebDriverSetup.closeDriver();
    }
}

