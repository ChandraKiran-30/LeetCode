class Solution {

    static Integer dp[];

    public int solve(int nums[], int n, int idx) {
        if (idx >= n)
            return 0;
        if (dp[idx] != null)
            return dp[idx];
        dp[idx] = Math.max(nums[idx] + solve(nums, n, idx + 2), solve(nums, n, idx + 1));
        return dp[idx];
    }

    public int rob(int[] nums) {
        int n = nums.length;
        dp = new Integer[n];
        solve(nums, n, 0);
        return dp[0];
    }
}