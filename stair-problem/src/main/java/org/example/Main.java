package org.example;

public class Main {
    public static void main(String[] args) {
        int stairsCount = 4;
        System.out.println(countVariants(stairsCount));
    }

    public static int countVariants(int stairsCount) {
        if (stairsCount <= 1) {
            return 1;
        } else {
            return countVariants(stairsCount - 1) + countVariants(stairsCount - 2);
        }
    }
}