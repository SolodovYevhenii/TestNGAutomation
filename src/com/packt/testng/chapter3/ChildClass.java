package com.packt.testng.chapter3;

import org.testng.annotations.*;

public class ChildClass extends BaseClass{
    @BeforeClass
    public void beforeChildClass(){
        System.out.println("Child Before Class method");
    }
    @AfterClass
    public void afterChildClass(){
        System.out.println("Child After Class method");
    }
    @BeforeMethod
    public void beforeChildMethod(){
        System.out.println("Child Before method");
    }
    @AfterMethod
    public void afterChildMethod(){
        System.out.println("Child After method");
    }
    @Test
    public void testMethod(){
        System.out.println("Test method under ChildClass");
    }
}