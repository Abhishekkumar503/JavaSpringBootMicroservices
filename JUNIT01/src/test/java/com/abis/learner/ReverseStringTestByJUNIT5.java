package com.abis.learner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTestByJUNIT5  {

    @Test
    void test() {
        ReverseString RS =new ReverseString();
        assertEquals("RADAR",RS.reverseString("RADAR"));
        assertEquals("AVAJ",RS.reverseString("JAVA"));
        assertEquals("ZYXWVUTSRQPONMLKJIHGFEDCBA",RS.reverseString("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        System.out.println("Success");
    }
}