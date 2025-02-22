package com.abis.learner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.awt.*;
import java.text.DecimalFormat;
import static org.junit.jupiter.api.Assertions.*;

class testShapes {
 shapes s;
    @BeforeEach
    void init()
    {
        new shapes();
    }
    @Test
    void computeAreaOfSquare() {
        assertEquals(4,s.computeAreaOfSquare(2),"Please check your method you logic is incorrect");
    }
    @Test
    void computeAreaOfCircle() {
        assertEquals(1133.54,s.computeAreaOfCircle(19),"Please check the method which you implemented");
    }

    @AfterEach
    void TESTEVEREXE()
    {
        System.out.println("Tested TESTCASE");
        assertEquals(2,2);
    }



}