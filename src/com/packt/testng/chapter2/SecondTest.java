package com.packt.testng.chapter2;

import org.testng.annotations.Test;

public class SecondTest {
    @Test
    public void firstTest() {
        System.out.println("First test method from SecondTest class");
    }
    @Test
    public void secondTest() {
        System.out.println("Second test method from SecondTest class");
    }
}