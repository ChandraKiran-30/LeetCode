class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE, i = 0, j = 0, n = nums.length;
        while (i < n && j < n) {
            int size = j - i + 1;
            if (size == k) {
                res = Math.min(res, nums[j] - nums[i]);
                j++;
            }
            else if (size < k) 
                j++;
            else 
                i++;
        }
        return res;
    }
}