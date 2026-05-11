class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String s = Integer.toString(nums[i]);
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                res.add(ch - '0');
            }
        }
        int ans[] = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}