class Solution {
    public int[][] generateMatrix(int n) {
        int spiral[][] = new int[n][n];
        int val = 1;
        int top = 0, down = n - 1, left = 0, right = n - 1;
        while (top <= down && left <= right) {
            for (int i = left; i <= right; i++) {
                spiral[top][i] = val++;
            }
            top++;
            for (int i = top; i <= down; i++) {
                spiral[i][right] = val++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                spiral[down][i] = val++;
            }
            down--;
            for (int i = down; i >= top; i--) {
                spiral[i][left] = val++;
            }
            left++;
        }
        return spiral;
    }
}