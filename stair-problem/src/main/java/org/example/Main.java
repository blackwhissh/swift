package org.example;

public class Main {
    public static void main(String[] args) {
        int stairsCount = 4;
        System.out.println(countVariants(stairsCount));
    }

    public static int countVariants(int stairsCount) {
        validate(stairsCount);
        if (stairsCount <= 1) {
            return 1;
        } else {
            return countVariants(stairsCount - 1) + countVariants(stairsCount - 2);
        }
    }
    public static void validate(int stairsCount){
        if(stairsCount < 0){
            throw new IllegalArgumentException("Input should be a positive Integer");
        }
    }
}