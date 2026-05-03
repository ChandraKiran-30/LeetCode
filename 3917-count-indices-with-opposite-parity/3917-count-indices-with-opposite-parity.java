class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            int x = nums[i] % 2;
            for (int j = i + 1; j < n; j++) {
                int y = nums[j] % 2;
                if (x != y)
                    cnt++;
            }
            nums[i] = cnt;
        }
        return nums;
    }
}