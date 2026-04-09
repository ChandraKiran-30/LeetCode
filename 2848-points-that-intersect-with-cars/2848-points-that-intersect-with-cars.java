class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer> hs = new HashSet<>();
        int n = nums.size();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int l = nums.get(i).get(0);
            int r = nums.get(i).get(1);
            while (l <= r) {
                if (!hs.contains(l)) {
                    cnt++;
                    hs.add(l);
                }
                l++;
            }
        }
        return cnt;
    }
}