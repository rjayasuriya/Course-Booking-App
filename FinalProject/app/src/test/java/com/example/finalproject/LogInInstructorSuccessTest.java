package com.example.finalproject;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LogInInstructorSuccessTest {

    @Test
    public void setCourseHelperMethod1() {
        String classC = "";
        String Days = "";
        String act = LogInInstructorSuccess.setCourseHelperMethod(classC,Days);
        //String expect = "pass";
        String expect = "fail";
        assertSame("Expecting fail",expect,act);
    }
    @Test
    public void setCourseHelperMethod2() {
        String classC = "mat1";
        String Days = "";
        String act = LogInInstructorSuccess.setCourseHelperMethod(classC,Days);
        //String expect = "pass";
        String expect = "fail";
        assertSame("Expecting pass",expect,act);
    }
    @Test
    public void setCourseHelperMethod3() {
        String classC = "mat1";
        String Days = "m";
        String act = LogInInstructorSuccess.setCourseHelperMethod(classC,Days);
        //String expect = "pass";
        String expect = "fail";
        assertSame("Expecting pass",expect,act);
    }
    @Test
    public void setCourseHelperMethod4() {
        String classC = "mat1";
        String Days = "monday friday";
        String act = LogInInstructorSuccess.setCourseHelperMethod(classC,Days);
        //String expect = "pass";
        String expect = "fail";
        assertSame("Expecting pass",expect,act);
    }
    @Test
    public void setCourseHelperMethod5() {
        String classC = "mat1";
        String Days = "monday,friday";
        String act = LogInInstructorSuccess.setCourseHelperMethod(classC,Days);
        String expect = "pass";
        //String expect = "fail";
        assertSame("Expecting pass",expect,act);
    }
}