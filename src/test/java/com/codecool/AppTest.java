package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturnArrayWith1() {
        String[] myStringArray = {"1"};
        assertEquals(fizzBuzz.convert(1),myStringArray);
    }

}
