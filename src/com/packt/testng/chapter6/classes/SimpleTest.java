package com.packt.testng.chapter6.classes;

import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void simpleTest(){
        System.out.println("Simple Test Method one");
    }
    @Test
    public void simpleTestTwo(){
        System.out.println("Simple Test Method two");
    }
}