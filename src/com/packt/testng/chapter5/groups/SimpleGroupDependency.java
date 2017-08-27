package com.packt.testng.chapter5.groups;

import org.testng.annotations.Test;

public class SimpleGroupDependency {
    @Test(dependsOnGroups={"test-group", "test-group-two"})
    public void groupTestOne(){
        System.out.println("Test method one");
    }
    @Test(groups={"test-group"})
    public void groupTestTwo(){
        System.out.println("Group test method two");
    }
    @Test(groups={"test-group"})
    public void groupTestThree(){
        System.out.println("Group test method three");
    }
    @Test(groups={"test-group-two"})
    public void groupTestFour(){
        System.out.println("Group test method four");
    }
}