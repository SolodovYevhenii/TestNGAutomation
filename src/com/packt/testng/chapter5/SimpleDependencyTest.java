package com.packt.testng.chapter5;

import org.testng.annotations.Test;

public class SimpleDependencyTest {
    @Test(dependsOnMethods={"testTwo"})
    public void testOne(){
        System.out.println("Test method one");
    }
    @Test
    public void testTwo(){
        System.out.println("Test method two");
    }
}