package com.packt.testng.chapter3;

import org.testng.annotations.Test;

@Test
public class TestClassOne {
    public void testMethodOne(){
        System.out.println("Test method one.");
    }
    public void testMethodTwo(){
        System.out.println("Test method two.");
    }
    private void testMethodThree(){
        System.out.println("Test method three.");
    }
}