class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int res = Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int or = nums[i];
            for (int j = i; j < n; j++) {
                or = or | nums[j];
                if (or >= k)
                    res = Math.min(j - i + 1, res);
            } 
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }
}