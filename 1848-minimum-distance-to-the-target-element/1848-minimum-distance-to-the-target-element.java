class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int i = start, j = start;
        int n = nums.length;
        while (i >= 0 && j < n) {
            if (nums[i] == target)
                return Math.abs(i - start);
            else if (nums[j] == target)
                return j - start;
            i--;
            j++;
        }
        while (i >= 0) {
            if (nums[i] == target)
                return Math.abs(i - start);
            i--;
        }
        while (j < n) {
            if (nums[j] == target)
                return j - start;
            j++;
        }
        return 0;
    }
}