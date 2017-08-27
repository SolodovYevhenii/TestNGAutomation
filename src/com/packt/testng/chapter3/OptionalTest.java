package com.packt.testng.chapter3;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalTest {
    @Parameters({"optional-value"})
    @Test
    public void optionTest(@Optional("optional value") String value) {
        System.out.println("This is: " + value);
    }
    @Parameters({"optional-value-one", "optional-value-two"})
    @Test
    public void optionTestTwo(@Optional("optional value one") String valueOne, @Optional("optional value two") String valueTwo) {
        System.out.println("This is: " + valueOne);
        System.out.println("This is: " + valueTwo);
    }
}