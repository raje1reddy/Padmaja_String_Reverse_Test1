package com.padmaja.add;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddNumbersTest {

    @Test
    public void sum() {
        AddNumbers add = new AddNumbers();
        int result = add.sum(2,4);
        int expResult = 6;
        assertEquals(expResult, result);

    }
}