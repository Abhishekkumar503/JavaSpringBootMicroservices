package com.abis.learner;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class AsserArrayEqualsExeTest {
    AsserArrayEqualsExe aAEE=new AsserArrayEqualsExe();
    @Test
    void testArrayAssertionByForloop() {
        assertArrayEquals(aAEE.testArrayAssertionByWhileloop(99),aAEE.testArrayAssertionByForloop(99),()->"Both loop not matched.Please check!!");
    }

    @Test
    void testArrayAssertionByWhileloop() {
        assertArrayEquals(aAEE.testArrayAssertionByForloop(199),aAEE.testArrayAssertionByWhileloop(199),()->"Both loop not matched.Please check!!");
    }

    @Test
    void sortTheArray() {
        int[] unsorted={2,3,1,3};
        assertThrows(IndexOutOfBoundsException.class,()->Array.getShort(unsorted,6));
    }

    @Test
    void TimeoutAssert()
    {
        ReverseString rS=new ReverseString();
        assertTimeout(Duration.ZERO,()-> rS.reverseString("ASASASASASASASASASASASASASASASASASASASAS"));
    }

}