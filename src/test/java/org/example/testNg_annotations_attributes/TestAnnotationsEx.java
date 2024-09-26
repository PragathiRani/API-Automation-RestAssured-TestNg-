package org.example.testNg_annotations_attributes;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestAnnotationsEx {
    //alwaysRun- This testcase will always run even if previous ones are failed.
    @Test
    public void test01(){
        Assert.assertTrue(true);
        System.out.println("test 01");
    }
    @Test(enabled = false)
    public void test02(){
        Assert.assertTrue(false);
        System.out.println("test 02");
    }
    @Test(alwaysRun = true)
    public void test03(){
        Assert.assertTrue(true);
        System.out.println("test 03");
    }

    @BeforeSuite
    void demo1()
    {
        System.out.println("Read the data from the MySQL");
    }

    @BeforeTest
    void demo2(){
        System.out.println("Data in Matrix, TC Before");
    }

    @BeforeClass
    void demo3(){
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    void demo4(){
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    void demo6(){
        System.out.println("AfterMethod");
    }

    @AfterClass
    void demo7(){
        System.out.println("AfterClass");
    }

    @AfterTest
    void demo8(){
        System.out.println("AfterTest");
    }
    @AfterSuite
    void demo9(){
        System.out.println("AfterSuite");
        System.out.println("Close everything, Delete all the temp files");
    }
}

//Parallel

//invocationCount** - How many times you want to run
//@Test(invocationCount = 5) // This will run the test method 5 times

//Data Driven

