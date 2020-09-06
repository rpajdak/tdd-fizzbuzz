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

    @Test
    public void shouldReturnArrayWith1and2whenGiven2() {
        String[] myStringArray = {"1", "2"};
        assertArrayEquals(fizzBuzz.convert(2),myStringArray);
    }

    @Test
    public void shouldReturnArryaWithFizzOnLastElementWhenGiven3(){
        String [][] frames  =  {{"X",""},{""}};



        String[] myStringArray = {"1", "2","Fizz"};
        assertArrayEquals(fizzBuzz.convert(3),myStringArray);
    }

}
