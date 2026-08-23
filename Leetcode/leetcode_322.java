package Leetcode;

public class leetcode_322 {
    public int coinChange(int[] coins, int amount) {
        int count = 0;
        int sum = 0;
        int i = coins.length - 1;
        while (sum != amount) {
            sum += coins[i];
            count++;
            if (sum == amount) {
                return count;
            }
        }

        return count;
    }
}
