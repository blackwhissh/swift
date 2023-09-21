package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int amount = 157;

        System.out.println(minSplit(amount));


    }

    public static int minSplit(int amount) {
        int[] dp = new int[amount + 1]; // dp[i] will store the minimum coins needed for amount i

        // Initialize dp array with a large value to represent infinity
        Arrays.fill(dp, Integer.MAX_VALUE);

        // The minimum number of coins needed to make 0 is 0
        dp[0] = 0;

        int[] coins = {1, 5, 10, 20, 50}; // Coin denominations

        // Compute the minimum number of coins needed for each amount from 1 to the given amount
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount];
    }
}