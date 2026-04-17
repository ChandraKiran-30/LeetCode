class Solution {

    public int reverse(int x) {
        int ans = 0;
        while (x > 0) {
            int temp = x % 10;
            if (ans > Integer.MAX_VALUE / 10) {
                return 0;
            }
            ans = (ans * 10) + temp;
            x /= 10;
        }
        return ans;
    }

    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int rev = reverse(nums[i]);
            if (hm.containsKey(nums[i])) {
                ans = Math.min(ans, i - hm.get(nums[i]));
            }
            hm.put(rev, i);
        }
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
}