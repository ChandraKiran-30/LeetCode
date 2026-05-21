class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length, preSum = 0, cnt = 0;
        hm.put(0, 1);
        for (int i = 0; i < n; i++) {
            preSum += nums[i];
            int diff = preSum - k;
            if (hm.containsKey(diff))
                cnt += hm.get(diff);
            hm.put(preSum, hm.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
}