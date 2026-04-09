class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int cnt = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == 0)
                cnt++;
        }
        return cnt;
    }
}