package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 3, 1, 1, 4, 4};

        validate(nums);

        System.out.println(singleNumber(nums));



    }

    public static int singleNumber(int[] nums) {

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }

        throw new IllegalArgumentException("No single number found.");
    }

    public static void validate(int[] nums){
        if(nums.length == 0){
            throw new ArrayIndexOutOfBoundsException("Array's length should not be null");
        }
    }
}