class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum = 0;
        for (int i = 0; i < k; i++) 
            lsum += cardPoints[i];
        int r = n - 1, rsum = 0;
        int maxSum = lsum;
        for (int i = k - 1; i >= 0; i--) {
            lsum -= cardPoints[i];
            rsum += cardPoints[r--];
            maxSum = Math.max(maxSum, lsum + rsum);
        }
        return maxSum;
    }
}