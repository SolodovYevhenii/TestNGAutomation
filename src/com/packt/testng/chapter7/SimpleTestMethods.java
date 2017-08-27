package com.packt.testng.chapter7;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleTestMethods {
    @BeforeClass
    public void beforeClass(){
        long id = Thread.currentThread().getId();
        System.out.println("Before class method. Thread id is: " + id);
    }
    @Test
    public void testMethodsOne() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method One. Thread id is: " + id);
    }
    @Test
    public void testMethodsTwo() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method Two. Thread id is: " + id);
    }
    @AfterClass
    public void afterClass(){
        long id = Thread.currentThread().getId();
        System.out.println("After class method. Thread id is: " + id);
    }
}