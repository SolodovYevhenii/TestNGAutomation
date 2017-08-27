package com.packt.testng.chapter3;

import org.testng.annotations.Test;

public class AnotherClassDataProvider {
    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }
}