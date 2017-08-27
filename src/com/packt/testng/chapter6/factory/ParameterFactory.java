package com.packt.testng.chapter6.factory;

import com.packt.testng.chapter6.classes.ParameterTest;
import org.testng.annotations.Factory;

public class ParameterFactory {
    @Factory
    public Object[] factoryMethod(){
        return new Object[]{new ParameterTest(0), new ParameterTest(1)};
    }
}