package com.ecommerce.com.tests;

import com.ecommerce.com.utils.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverSetup.getDriver();
        driver.get("https://www.demoblaze.com/");
    }

    @Test
    public void addProductToCart() {
        // Navigate to the last page by clicking next
        driver.findElement(By.linkText("Next")).click();
        // Select the last product
        driver.findElement(By.xpath("(//a[@class='hrefch'])[last()]")).click();
        // Add the product to the cart
        driver.findElement(By.xpath("//a[text()='Add to cart']")).click();

        // Add a wait here to handle any delays
        // Assert product added to the cart
    }

    @AfterMethod
    public void tearDown() {
        WebDriverSetup.closeDriver();
    }
}

