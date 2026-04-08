class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length, m = queries.length;
        int mod = 1000000007;
        for (int i = 0; i < m; i++) {
            int idx = queries[i][0];
            int r = queries[i][1];
            int k = queries[i][2];
            int v = queries[i][3];
            while (idx <= r) {
                long x = (1L * nums[idx] * v) % mod;
                nums[idx] = (int)(x);
                idx += k;
            }
        }
        int res = nums[0];
        for (int i = 1; i < n; i++)
            res ^= nums[i];
        return res;
    }
}