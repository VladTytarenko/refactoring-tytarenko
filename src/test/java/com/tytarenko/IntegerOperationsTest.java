package com.tytarenko;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for IntegerOperation
 */
public class IntegerOperationsTest {

    @Test(expected = ArithmeticException.class)
    public void divisionIntegersTestShouldAnswerTrue()
    {
        Integer a1 = 6;
        Integer b1 = 3;

        NumberOperations numberOperations1 = new IntegerOperation(a1, b1);
        assertEquals(numberOperations1.division(), a1 / b1);

        NumberOperations numberOperations2 = new IntegerOperation(b1, a1);
        assertEquals(numberOperations2.division(), b1 / a1);

        NumberOperations numberOperations = new IntegerOperation(4, 0);
        numberOperations.division();
    }

    @Test
    public void addIntegersTestShouldAnswerTrue() {
        Integer a = 140;
        Integer b = 4320;

        Operations operations1 = new IntegerOperation(a, b);
        assertEquals(operations1.add(), a + b);

        Operations operations2 = new IntegerOperation(b, a);
        assertEquals(operations2.add(), a + b);
    }

    @Test
    public void subtractionIntegersTestShouldAnswerTrue() {
        Integer a = 140;
        Integer b = 4320;

        NumberOperations operations1 = new IntegerOperation(a, b);
        assertEquals(operations1.subtraction(), a - b);

        NumberOperations operations2 = new IntegerOperation(b, a);
        assertEquals(operations2.subtraction(), b - a);
    }

    @Test
    public void multiplicationIntegerTestShouldAnswerTrue() {
        Integer a = 140;
        Integer b = 4320;

        NumberOperations operations1 = new IntegerOperation(a, b);
        assertEquals(operations1.multiplication(), a * b);

        NumberOperations operations2 = new IntegerOperation(b, a);
        assertEquals(operations2.multiplication(), a * b);

        NumberOperations operations3 = new IntegerOperation(4, 0);
        assertEquals(operations3.multiplication(), 0);
    }

}
