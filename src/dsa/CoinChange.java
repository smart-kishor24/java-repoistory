package dsa;

import java.util.Arrays;

public class CoinChange {

    static int coinChange(int[] coins, int amount) {

        // dp[i] = minimum number of coins needed to make amount i
        int[] dp = new int[amount + 1];

        // Fill with a value greater than the maximum possible answer
        Arrays.fill(dp, amount + 1);

        // Base case
        dp[0] = 0;

        // Calculate minimum coins for every amount from 1 to amount
        for (int i = 1; i <= amount; i++) {

            for (int coin : coins) {

                if (coin <= i) {

                    dp[i] = Math.min(
                            dp[i],
                            1 + dp[i - coin]
                    );
                }
            }
        }

        // If amount cannot be formed, return -1
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int amount = 11;

        System.out.println(
                "Minimum coins = " + coinChange(coins, amount)
        );
    }
}