class Solution {
    public List<Integer> findValidElements(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || i == nums.length - 1) {
                res.add(nums[i]);
                continue;
            }
            boolean flag = true;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] >= nums[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res.add(nums[i]);
                continue;
            }
            flag = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] >= nums[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                res.add(nums[i]);
        }
        return res;
    }
}