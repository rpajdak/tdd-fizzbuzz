package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingTest {
    private Bowling bowling;

    @BeforeEach
    public void setup() {
        bowling = new Bowling();
    }

    @Test
    void shouldReturn300WhenAllStrikes() {
        String[][] frames = {{"X"}, {"X"}, {"X"}, {"X"}, {"X"}, {"X"}, {"X"}, {"X"}, {"X"}, {"X"}, {"X"}, {"X"}};
        assertEquals(300, bowling.calculatePoints(frames));
    }
}