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

    @Test
    void shouldReturn90When10PairOf9() {
        String[][] frames = {{"9","-"},{"9","-"},{"9","-"},{"9","-"},{"9","-"},{"9","-"},{"9","-"},{"9","-"},{"9","-"},{"9","-"}};
        assertEquals(90, bowling.calculatePoints(frames));
    }

    @Test
    void shouldReturn50When10PairsOf2and3() {
        String[][] frames = {{"2","3"}, {"2","3"}, {"2","3"}, {"2","3"}, {"2","3"}, {"2","3"}, {"2","3"}, {"2","3"}, {"2","3"}, {"2","3"}};
        assertEquals(50, bowling.calculatePoints(frames));
    }
}