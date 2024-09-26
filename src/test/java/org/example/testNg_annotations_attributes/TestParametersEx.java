package org.example.testNg_annotations_attributes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametersEx {
    //Based on Parameters

    @Parameters("browser")
    @Test
    void demo1(String value){
        System.out.println("Browser is " +value);
        // Open the Browser and select dadadada

    }

}
