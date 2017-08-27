package com.packt.testng.chapter6.factory;

import com.packt.testng.chapter6.classes.ExampleTest;
import org.testng.annotations.Factory;

public class ExampleFactory {
    @Factory
    public Object[] factoryMethod(){
        return new Object[]{
                new ExampleTest("one"),
                new ExampleTest("two")
        };
    }
}