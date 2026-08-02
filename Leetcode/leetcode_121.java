package Leetcode;

public class leetcode_121 {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int max = Integer.MIN_VALUE;
        while (i < prices.length && j < prices.length && i < j) {
            if (prices[j] < prices[i]) {
                i = j;
                j++;
                continue;
            }
            int price = prices[j]-prices[i];
            if (price>max) {
                max=price;
            }
            j++;
        }
        if(max>0){
            return max;
        }
        return 0;
    }
}
