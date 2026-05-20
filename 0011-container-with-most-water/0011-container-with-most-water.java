class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int n = height.length, l = 0, r = n - 1;
        while (l < r) {
            int area = (r - l) * Math.min(height[r], height[l]);
            maxArea = Math.max(maxArea, area);
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxArea;
    }
}