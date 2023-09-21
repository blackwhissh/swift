package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 1, 2, 7, 4};
        int result = notContains(array);

        System.out.println(result);
    }

    public static int notContains(int[] array) {
        // Create a set to store the unique positive integers from the array
        Set<Integer> set = new HashSet<>();

        // Populate the set with unique positive integers from the array
        for (int num : array) {
            if (num > 0) {
                set.add(num);
            }
        }

        // Start from 1 and check if each positive integer is in the set
        int minimalInteger = 1;
        while (set.contains(minimalInteger)) {
            minimalInteger++;
        }

        return minimalInteger;
    }
}