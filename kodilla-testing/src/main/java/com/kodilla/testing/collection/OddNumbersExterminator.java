package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> onlyEven = new ArrayList<>();
        int range = numbers.size();
        for (int i = 0; i < range; i++) {
            int temporary = numbers.get(i);
            if (temporary % 2 == 0) {
                onlyEven.add(temporary);
            }

        }
    return onlyEven;
    }
}
