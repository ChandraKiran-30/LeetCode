class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length, l = 0, r = 1;
        int maxProfit = 0;
        while (r < n) {
            int currProfit = prices[r] - prices[l];
            if (currProfit < 0)
                l = r;
            maxProfit = Math.max(maxProfit, currProfit);
            r++;
        }
        return maxProfit;
    }
}