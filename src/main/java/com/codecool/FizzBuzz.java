package com.codecool;

public class FizzBuzz {

    public String[] convert(int i) {
        String[] stringArray = new String[i];
        for (int j = 0; j < i; j++) {
            stringArray[j] = String.valueOf(j + 1);
        }
        return stringArray;
    }
}
