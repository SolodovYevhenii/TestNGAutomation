package com.packt.testng.chapter6.factory;


import com.packt.testng.chapter6.classes.DependencyTest;
import org.testng.annotations.Factory;

public class DependencyFactory {
    @Factory
    public Object[] factoryMethod(){
        return new Object[]{
                new DependencyTest(1),
                new DependencyTest(2)
        };
    }
}