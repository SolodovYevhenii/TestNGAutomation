package com.packt.testng.chapter6.classes;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExampleTest {
    private String param="";
    public ExampleTest(String param){
        this.param=param;
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class executed.");
    }
    @Test
    public void testMethodOne(){
        System.out.println("The parameter value is: " + param);
    }
    @Test
    public void testMethodTwo(){
        System.out.println("The parameter value is: " + param);
    }
}