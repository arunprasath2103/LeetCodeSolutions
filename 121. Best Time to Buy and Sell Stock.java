class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for(int i : prices) {
            if(min > i) {
                min = i;
            }
            if(profit < i - min) {
                profit = i - min;
            }
        }
        return profit;
    }
}