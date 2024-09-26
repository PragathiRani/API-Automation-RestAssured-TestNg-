package org.example.testNg_annotations_attributes;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllureReportingEx {
    //Allure Reporting
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that true == true")
    @Test
    public void testcase01(){
        Assert.assertEquals(true, true);
        System.out.println("TestCase1");
    }

    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify that true != true")
    @Test
    public void testcase02(){
        Assert.assertEquals(true, false);
        System.out.println("TestCase2");
    }
}
