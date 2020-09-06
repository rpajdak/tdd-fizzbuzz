package com.codecool;

public class FizzBuzz {

    public String[] convert(int i) {
        String[] stringArray = new String[i];
        for (int j = 0; j < i; j++) {
            if ((j + 1) % 3 == 0) {
                stringArray[j] = "Fizz";
            } else {
                stringArray[j] = String.valueOf(j + 1);
            }
        }
        return stringArray;
    }
}
