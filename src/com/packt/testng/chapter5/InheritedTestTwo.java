package com.packt.testng.chapter5;

import org.testng.annotations.Test;

public class InheritedTestTwo extends SimpleDependencyTestTwo{
    @Test(dependsOnMethods={"testTwo"})
    public void testThree(){
        System.out.println("Test three method in InheritedTestTwo class");
    }
    @Test
    public void testTwo(){
        System.out.println("Test two method in InheritedTestTwo class");
    }
}