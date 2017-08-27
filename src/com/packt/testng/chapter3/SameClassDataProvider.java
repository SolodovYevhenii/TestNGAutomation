package com.packt.testng.chapter3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SameClassDataProvider {
    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][] { {"data one", "data two"}, {"data three", "data four"}, {"data five", "data six"} };
    }
    @Test(dataProvider = "data-provider")
    public void testMethod(String dataOne, String dataTwo) {
        System.out.println("Data is: " + dataOne);
        System.out.println("Data is: " + dataTwo);
    }
}