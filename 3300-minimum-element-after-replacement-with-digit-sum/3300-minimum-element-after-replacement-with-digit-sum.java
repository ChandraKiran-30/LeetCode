class Solution {

    public int solve(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }

    public int minElement(int[] nums) {
        int n = nums.length;
        int minEle = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            nums[i] = solve(nums[i]);
            minEle = Math.min(minEle, nums[i]);
        }
        return minEle;
    }
}