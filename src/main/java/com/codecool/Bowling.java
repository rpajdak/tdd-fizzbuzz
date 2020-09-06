package com.codecool;

public class Bowling {

    public int calculatePoints(String[][] frames) {
        int points = 0;
        for (int i = 0; i < 10; i++) {
            if (!frames[i][0].equals("X")) {
                points += Integer.parseInt(frames[i][0]);
            } else {
                points += 30;
            }
        }
        return points;
    }
}
