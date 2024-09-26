package org.example.testNg_annotations_attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependsOnEx {
    //Based on dependsOnMethods
    @Test
    public void serverStartedOk() {
        System.out.println("I will run first");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void method1() {
        System.out.println("method1");
    }
}
