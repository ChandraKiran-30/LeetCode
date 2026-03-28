class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n];
        pre[0] = nums[0];
        int min = nums[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + nums[i];
            min = Math.min(pre[i], min);
        }
        if (min > 0)
            return 1;
        else
            return Math.abs(min) + 1;
    }
}