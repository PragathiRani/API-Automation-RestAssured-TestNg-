package org.example.testNg_assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_Soft_Hard_Testng {

    //TestNG - Hard Assertion
    @Test
    public void hardAssertExample() {
        Assert.assertTrue(false); // This will throw an AssertionError and stop execution.
        System.out.println("This line will not be executed.");
    }

    //TestNG - Soft Assertion
    @Test
    public void softAssertExample() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false); // This will not stop execution.
        System.out.println("This line will be executed.");
        softAssert.assertAll(); // This will report all collected errors.
    }
}
