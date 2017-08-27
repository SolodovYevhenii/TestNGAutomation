package com.packt.testng.chapter3;

import org.testng.annotations.Test;

public class TimeMethodTwo {
    @Test(timeOut=700)
    public void timeTestOne() throws InterruptedException {
        Thread.sleep(600);
        System.out.println("Time test method one");
    }
    @Test
    public void timeTestTwo() throws InterruptedException {
        Thread.sleep(400);
        System.out.println("Time test method two");
    }
}