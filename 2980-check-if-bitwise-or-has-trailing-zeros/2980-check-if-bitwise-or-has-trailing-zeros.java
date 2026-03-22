class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        boolean even = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (even == false)
                    even = true;
                else
                    return true;
            }
        }
        return false;
    }
}