package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

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
        assertArrayEquals(fizzBuzz.convert(1),myStringArray);
    }

}
