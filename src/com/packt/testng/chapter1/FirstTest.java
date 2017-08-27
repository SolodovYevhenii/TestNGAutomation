package com.packt.testng.chapter1;

import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void testMethod() {
        System.out.println("First TestNG test from FirstTest class");
    }
    @Test
    public void testMethodTwo() {
        System.out.println("Second TestNG test from FirstTest class");
    }
}