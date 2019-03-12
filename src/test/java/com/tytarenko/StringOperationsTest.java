package com.tytarenko;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringOperationsTest {

    @Test
    public void addStringsShouldAnswerTrue() {
        String a = "First";
        String b = "Second";

        Operations operations = new StringOperations(a, b);
        assertEquals(operations.add(), a + b);
        assertEquals(operations.add(), a.concat(b));
    }
}
