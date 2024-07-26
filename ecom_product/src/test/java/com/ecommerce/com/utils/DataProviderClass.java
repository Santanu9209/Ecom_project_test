package com.ecommerce.com.utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider(name = "loginData")
    public static Object[][] loginData() {
        return new Object[][] {
                {"validUser", "validPass"},
                {"invalidUser", "invalidPass"}
        };
    }
}

