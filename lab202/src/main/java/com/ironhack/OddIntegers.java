package com.ironhack;

import java.util.ArrayList;
import java.util.List;

public class OddIntegers {

    public List<Integer> getOddIntegers(int n) {
        List<Integer> result = new ArrayList<>();

        if (n <= 0) {
            return result;
        }

        for (int i = 1; i <= n; i+=2) {
            result.add(i);
        }

        return result;
    }
}
