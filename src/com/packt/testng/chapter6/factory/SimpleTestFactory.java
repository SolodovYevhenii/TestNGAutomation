package com.packt.testng.chapter6.factory;

import com.packt.testng.chapter6.classes.SimpleTest;
import org.testng.annotations.Factory;

public class SimpleTestFactory {
    @Factory
    public Object[] factoryMethod(){
        return new Object[]{new SimpleTest(), new SimpleTest()};
    }
}