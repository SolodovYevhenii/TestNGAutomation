package com.packt.testng.chapter7;

import org.testng.annotations.Test;

public class IndependentTestThreading {
    @Test(threadPoolSize = 3, invocationCount = 6, timeOut = 1000)
    public void testMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("Sample test-method executing on thread with id: " + id);
    }
}