package com.abis.learner;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void reverseString() {
        ReverseString RS =new ReverseString();
        assertEquals("RADAR",RS.reverseString("RADAR"));
        assertEquals("AVAJ",RS.reverseString("JAVA"));
        assertEquals("ZYXWVUTSRQPONMLKJIHGFEDCBA",RS.reverseString("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }
}