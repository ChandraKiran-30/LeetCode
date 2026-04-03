class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int n = ranges.length;
        for (int x = left; x <= right; x++) {
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if (x >= ranges[i][0] && x <= ranges[i][1]) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return false;
        }
        return true;
    }
}