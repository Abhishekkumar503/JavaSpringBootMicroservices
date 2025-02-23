package com.abis.learner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcOpTest {

    @Test
    public void divide() {
        // Add test logic here
        assertAll(() -> assertEquals(1, CalcOp.divide(2, 2)),
                () -> assertEquals(-4, CalcOp.divide(2, -2)),
                () -> assertEquals(4, CalcOp.divide(-2, -2)),
                () -> assertEquals(0, CalcOp.divide(1, 0)));
    }

    @Test
    public void multiply() {
        assertAll(() -> assertEquals(4, CalcOp.multiply(2, 2)),
                () -> assertEquals(-4, CalcOp.multiply(2, -2)),
                () -> assertEquals(4, CalcOp.multiply(-2, -2)),
                () -> assertEquals(0, CalcOp.multiply(1, 0)));
    }
}